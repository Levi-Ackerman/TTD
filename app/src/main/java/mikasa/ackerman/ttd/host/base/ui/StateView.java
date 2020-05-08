package mikasa.ackerman.ttd.host.base.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import mikasa.ackerman.ttd.host.R;

/**
 * 注：
 * 新UI中，只支持显示一行描述文案了。多新增了显示button的场景（不过目前没看到有场景用）
 */
public class StateView extends FrameLayout {
    protected NGStateViewData mViewState = new NGStateViewData(ContentState.CONTENT);

    private View mContentView;
    private View mLoadingView;
    private View mErrorView;
    private View mEmptyView;

    /**
     * 持有这这个View，可以在适当的时候，去释放掉图片资源，不用一直占用。
     */
    private ImageView mEmptyImage;
    /**
     * 持有这这个View，可以在适当的时候，去释放掉图片资源，不用一直占用。
     */
    private ImageView mErrorImage;

    /**
     * 在CoordinatorLayout中使用时，是否启动StateView的联动滑动，默认是false的
     */
    private boolean mNestedScrollable = false;

    private ObjectAnimator mShowContentAinmator;

    private OnClickListener mErrorToRetryClickListener;
    private OnClickListener mEmptyViewBtnClickListener;

    public StateView(Context context) {
        this(context, null);
    }

    public StateView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public StateView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (attrs != null) {
            parseAttrs(context, attrs);
        } else {
            setDefaultAttrs(context);
        }
    }

    private void setDefaultAttrs(Context context) {
        setLoadingLayoutResourceId(R.layout.view_state_loading);
        setErrorLayoutResourceId(R.layout.view_state_error);
        setEmptyLayoutResourceId(R.layout.view_state_empty);
        setState(ContentState.CONTENT.nativeInt);
    }

    private void parseAttrs(Context context, AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.NGStateView, 0, 0);

        try {
            setLoadingLayoutResourceId(
                a.getResourceId(R.styleable.NGStateView_svLoadingLayout, R.layout.view_state_loading));
            setErrorLayoutResourceId(a.getResourceId(R.styleable.NGStateView_svErrorLayout, R.layout.view_state_error));
            setEmptyLayoutResourceId(a.getResourceId(R.styleable.NGStateView_svEmptyLayout, R.layout.view_state_empty));
            mNestedScrollable = a.getBoolean(R.styleable.NGStateView_nestedScrollable, false);
            setState(ContentState.CONTENT);
        } finally {
            a.recycle();
        }
    }

    public void setLoadingLayoutResourceId(int loadingLayout) {
        this.mViewState.loadingLayoutResId = loadingLayout;
    }

    public void setErrorLayoutResourceId(int resourceId) {
        mViewState.errorLayoutResId = resourceId;
    }

    public void setEmptyLayoutResourceId(int resourceId) {
        mViewState.emptyLayoutResId = resourceId;
    }

    /**
     * 对外接口
     */
    public ContentState getState() {
        return mViewState.state != null ? mViewState.state : ContentState.CONTENT;
    }

    private void setState(int nativeInt) {
        ContentState contentState = ContentState.getState(nativeInt);
        setState(contentState);
    }

    /**
     * 对外接口
     * Configures the view to be in the given state, hiding and showing internally maintained-views as needed
     *
     * @param state
     */
    public void setState(@Nullable final ContentState state) {
        if (state == mViewState.state) {
            //当前状态等于原来的状态，直接返回。
            return;
        }

        final ContentState previousState = mViewState.state;
        hidePreviousState(previousState);
        mViewState.state = state;
        View newStateView = getStateView(state);
        if (newStateView != null) {
            showCurrentState(newStateView);
        }

    }

    private void showCurrentState(final View view) {
        if (mViewState.state == ContentState.CONTENT) {
            if (mShowContentAinmator == null) {
                mShowContentAinmator = ObjectAnimator.ofFloat(view, "alpha", 0, 1);
                mShowContentAinmator.setDuration(300);
                mShowContentAinmator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        view.setVisibility(VISIBLE);
                        view.setAlpha(0);
                    }
                });
            }
            mShowContentAinmator.start();
        } else {
            view.setVisibility(VISIBLE);
        }
    }

    private void hidePreviousState(ContentState previousState) {
        View previousView = getStateView(previousState);
        if (previousView != null) {
            previousView.setVisibility(previousView == mContentView ? INVISIBLE : GONE);
        }
    }

    @Nullable
    private View getStateView(ContentState state) {
        if (state != null) {
            switch (state) {
                case ERROR:
                    return getErrorView();

                case LOADING:
                    return getLoadingView();

                case EMPTY:
                    return getEmptyView();

                case CONTENT:
                    return getContentView();
            }
        }
        return null;
    }

    @Override
    public void setNestedScrollingEnabled(boolean flag) {
        this.mNestedScrollable = flag;
    }

    protected View inflateView(ContentState viewState, @LayoutRes int layoutId) {
        if (mNestedScrollable) {
            View stateView = View.inflate(getContext(), layoutId, null);
            NestedScrollView nestedScrollView = new NestedScrollView(getContext());
            nestedScrollView.addView(stateView,
                new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            nestedScrollView.setLayoutParams(
                new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            nestedScrollView.setFillViewport(true);
            return nestedScrollView;
        } else {
            return View.inflate(getContext(), layoutId, null);
        }
    }

    private View getErrorView() {
        if (mErrorView == null) {
            mErrorView = inflateView(ContentState.ERROR, mViewState.errorLayoutResId);
            mErrorImage = mErrorView.findViewById(R.id.uikit_error_icon);
            if (mErrorImage != null) {
                mErrorImage.setOnClickListener(mErrorToRetryClickListener);
            }
            View text = mErrorView.findViewById(R.id.uikit_sub_error_txt);
            if (text != null) {
                text.setOnClickListener(mErrorToRetryClickListener);
            }
            View btn = mErrorView.findViewById(R.id.uikit_error_button);
            if (btn != null) {
                btn.setOnClickListener(mErrorToRetryClickListener);
            }
            addView(mErrorView);
        }

        return mErrorView;
    }

    private View getLoadingView() {
        if (mLoadingView == null) {
            mLoadingView = inflateView(ContentState.LOADING, mViewState.loadingLayoutResId);
            addView(mLoadingView);
        }
        return mLoadingView;
    }

    private View getEmptyView() {
        if (mEmptyView == null) {
            mEmptyView = inflateView(ContentState.EMPTY, mViewState.emptyLayoutResId);
            mEmptyImage = mEmptyView.findViewById(R.id.uikit_empty_icon);
            if (mEmptyImage != null) {
                mEmptyImage.setOnClickListener(mEmptyViewBtnClickListener);
            }
            View text = mEmptyView.findViewById(R.id.uikit_sub_empty_txt);
            if (text != null) {
                text.setOnClickListener(mEmptyViewBtnClickListener);
            }
            View btn = mEmptyView.findViewById(R.id.uikit_empty_button);
            if (btn != null) {
                btn.setOnClickListener(mEmptyViewBtnClickListener);
            }
            addView(mEmptyView);
        }
        return mEmptyView;
    }

    /**
     * 设置Error时的点击
     *
     * @param listener
     */
    public void setOnErrorToRetryClickListener(OnClickListener listener) {
        mErrorToRetryClickListener = listener;
        if (mErrorView != null) {
            mErrorView.findViewById(R.id.uikit_error_icon).setOnClickListener(mErrorToRetryClickListener);
            mErrorView.findViewById(R.id.uikit_error_button).setOnClickListener(mErrorToRetryClickListener);
            mErrorView.findViewById(R.id.uikit_sub_error_txt).setOnClickListener(mErrorToRetryClickListener);
        }
    }

    /**
     * 设置Empty时的点击
     *
     * @param listener
     */
    public void setOnEmptyViewBtnClickListener(OnClickListener listener) {
        mEmptyViewBtnClickListener = listener;
        if (mEmptyView != null) {
            mEmptyView.findViewById(R.id.uikit_empty_icon).setOnClickListener(mEmptyViewBtnClickListener);
            mEmptyView.findViewById(R.id.uikit_empty_button).setOnClickListener(mEmptyViewBtnClickListener);
            mEmptyView.findViewById(R.id.uikit_sub_empty_txt).setOnClickListener(mEmptyViewBtnClickListener);
        }
    }

    private void addContentView(View contentView) {
        if (mContentView != null && mContentView != contentView) {
            throw new IllegalStateException("Can't add more than one view to NGStateView");
        }
        setContentView(contentView);
    }

    public View getContentView() {
        return mContentView;
    }

    private void setContentView(View contentView) {
        mContentView = contentView;
        setState(mViewState.state);
    }

    private boolean isViewInternal(View view) {
        return view == mErrorView || view == mLoadingView || view == mEmptyView;
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (mShowContentAinmator != null) {
            mShowContentAinmator.end();
            mContentView.setAlpha(1f);
        }
    }

    @Override
    public void addView(View child) {
        if (!isViewInternal(child)) {
            addContentView(child);
        }

        super.addView(child);
    }

    @Override
    public void addView(View child, int index) {
        if (!isViewInternal(child)) {
            addContentView(child);
        }

        super.addView(child, index);
    }

    @Override
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (!isViewInternal(child)) {
            addContentView(child);
        }

        super.addView(child, index, params);
    }

    @Override
    public void addView(View child, int width, int height) {
        if (!isViewInternal(child)) {
            addContentView(child);
        }

        super.addView(child, width, height);
    }

    @Override
    public void addView(View child, ViewGroup.LayoutParams params) {
        if (!isViewInternal(child)) {
            addContentView(child);
        }

        super.addView(child, params);
    }

    public void setErrorImage(@DrawableRes int resId) {
        if (mErrorView != null) {
            mErrorImage = (ImageView)mErrorView.findViewById(R.id.uikit_error_icon);
            mErrorImage.setImageResource(resId);
        }
    }

    private void setErrorImage(Drawable drawable) {
        if (mErrorView != null) {
            mErrorImage = (ImageView)mErrorView.findViewById(R.id.uikit_error_icon);
            mErrorImage.setImageDrawable(drawable);
        }
    }

    public void setErrorTxt(CharSequence title) {
        if (mErrorView != null) {
            ((TextView)mErrorView.findViewById(R.id.uikit_sub_error_txt)).setText(title);

        }
    }

    ////////////////自定义页面样式的方法 BEGIN ////////////////

    public void setErrorButton(CharSequence msg) {
        if (mErrorView != null) {
            ((TextView)mErrorView.findViewById(R.id.uikit_error_button)).setText(msg);
            mErrorView.findViewById(R.id.uikit_error_button).setVisibility(VISIBLE);
        }
    }

    public void setEmptyImage(@DrawableRes int resId) {
        if (mEmptyView != null) {
            mEmptyImage = (ImageView)mEmptyView.findViewById(R.id.uikit_empty_icon);
            mEmptyImage.setImageResource(resId);
        }
    }

    public void setEmptyImage(Drawable drawable) {
        if (mEmptyView != null) {
            mEmptyImage = (ImageView)mEmptyView.findViewById(R.id.uikit_empty_icon);
            mEmptyImage.setImageDrawable(drawable);
        }
    }

    public void setEmptyTxt(CharSequence title) {
        if (mEmptyView != null) {
            ((TextView)mEmptyView.findViewById(R.id.uikit_sub_empty_txt)).setText(title);
        }
    }

    public void setEmptyButton(CharSequence msg) {
        if (mEmptyView != null) {
            ((TextView)mEmptyView.findViewById(R.id.uikit_empty_button)).setText(msg);
            mEmptyView.findViewById(R.id.uikit_empty_button).setVisibility(null == msg ? GONE : VISIBLE);
        }
    }

    /**
     * 设置页面状态
     */
    public void setViewState(StateView.ContentState state, String message) {
        setViewState(state, message, 0);
    }

    /**
     * 设置页面状态
     */
    public void setViewState(StateView.ContentState state, String message, @DrawableRes int drawableId) {
        setViewState(state, null, message, drawableId);
    }

    /**
     * 设置页面状态
     */
    public void setViewState(StateView.ContentState state, String message, Drawable drawable) {
        setViewState(state, null, message, drawable);
    }

    /**
     * 设置页面状态
     */
    public void setViewState(StateView.ContentState state, String title, String message, @DrawableRes int drawableId) {
        setState(state);

        setNGStateViewTextByState(state, title, message);
        if (drawableId != 0) {
            setNGStateViewImage(state, drawableId);
        }
    }

    /**
     * 设置页面状态
     */
    public void setViewState(StateView.ContentState state, String title, String message, Drawable drawable) {
        setState(state);

        setNGStateViewTextByState(state, title, message);
        if (drawable != null) {
            setNGStateViewImage(state, drawable);
        }
    }

    /**
     * 根据状态设置标题
     *
     * @param state state
     * @param title title
     */
    private void setNGStateViewTextByState(StateView.ContentState state, String title, String subTitle) {
        String msg = TextUtils.isEmpty(title) ? subTitle : title;
        switch (state) {
            case EMPTY:
                setEmptyTxt(msg);
                break;
            case ERROR:
                setErrorTxt(msg);
                break;
            default:
                break;
        }
    }

    /**
     * 根据状态设置提示图片
     *
     * @param state      state
     * @param drawableId image drawable
     */
    private void setNGStateViewImage(StateView.ContentState state, @DrawableRes int drawableId) {
        switch (state) {
            case EMPTY:
                setEmptyImage(drawableId);
                break;
            case ERROR:
                setErrorImage(drawableId);
                break;
            default:
                break;
        }
    }

    /**
     * 根据状态设置提示图片
     *
     * @param state    state
     * @param drawable drawable
     */
    private void setNGStateViewImage(StateView.ContentState state, Drawable drawable) {
        switch (state) {
            case EMPTY:
                setEmptyImage(drawable);
                break;
            case ERROR:
                setErrorImage(drawable);
                break;
            default:
                break;
        }
    }

    /**
     * States of the NGStateView
     */
    public enum ContentState {

        CONTENT(0x00),
        LOADING(0x01),
        ERROR(0x02),
        EMPTY(0x04);

        private final static SparseArray<ContentState> sStates = new SparseArray<ContentState>();

        static {
            for (ContentState scaleType : values()) {
                sStates.put(scaleType.nativeInt, scaleType);
            }
        }

        public final int nativeInt;

        private ContentState(int nativeValue) {
            this.nativeInt = nativeValue;
        }

        public static ContentState getState(int nativeInt) {
            if (nativeInt >= 0) {
                return sStates.get(nativeInt);
            }

            return null;
        }
    }

    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            @Override
            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in);
            }

            @Override
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };
        NGStateViewData state;

        public SavedState(Parcelable superState) {
            super(superState);
        }

        private SavedState(Parcel in) {
            super(in);
            state = (NGStateViewData)in.readParcelable(NGStateViewData.class.getClassLoader());
        }

        @Override
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeParcelable(state, flags);
        }
    }

    public static class NGStateViewData implements Parcelable {
        public static final Creator<NGStateViewData> CREATOR = new Creator<NGStateViewData>() {
            @Override
            public NGStateViewData createFromParcel(Parcel in) {
                return new NGStateViewData(in);
            }

            @Override
            public NGStateViewData[] newArray(int size) {
                return new NGStateViewData[size];
            }
        };
        public int loadingLayoutResId;
        public int errorLayoutResId;
        public int emptyLayoutResId;
        public ContentState state;

        public NGStateViewData(ContentState contentState) {
            state = contentState;
        }

        private NGStateViewData(Parcel in) {
            loadingLayoutResId = in.readInt();
            errorLayoutResId = in.readInt();
            emptyLayoutResId = in.readInt();

            state = ContentState.valueOf(in.readString());
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(loadingLayoutResId);
            dest.writeInt(errorLayoutResId);
            dest.writeInt(emptyLayoutResId);

            dest.writeString(state.name());
        }
    }

}
