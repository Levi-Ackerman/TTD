package mikasa.ackerman.ttd.host.base.view

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ProgressBar
import mikasa.ackerman.ttd.host.common.State

/**
 * TTD
 *
 * <p>Title: </p>
 *
 * <p>Description: </p>
 * <p>
 *
 * <br>
 * 用法:
 * <pre>
 * </pre>
 * </p>
 *
 * <p>Copyright: Copyright (c) 2020</p>
 *
 * @author zhengxian.lzx@alibaba-inc.com
 * @version 1.0
 * 2020/5/7 11:33 PM
 */
class StateView : FrameLayout {
    private var mTopView: View? = null

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        init()
    }

    fun init() {

    }

    fun setState(state: State) {
        when (state) {
            State.ERROR -> addView(ErrorTopView(context))
            State.EMPTY -> addView(EmptyTopView(context))
            State.LOADING -> addView(LoadingTopView(context), LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT).apply {
                gravity = Gravity.CENTER
            })
            else -> mTopView?.apply {
                if (parent is ViewGroup) {
                    (parent as ViewGroup).removeView(this)
                }
            }
        }
    }

    class ErrorTopView(context: Context) : View(context)

    class LoadingTopView(context: Context) : ProgressBar(context)

    class EmptyTopView(context: Context) : View(context)
}