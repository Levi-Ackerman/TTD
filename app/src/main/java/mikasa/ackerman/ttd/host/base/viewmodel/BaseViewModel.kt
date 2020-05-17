package mikasa.ackerman.ttd.host.base.viewmodel

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
 * 2020/5/8 10:11 PM
 */
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mikasa.ackerman.ttd.host.base.ui.StateView

/**
 * 页面描述：viewModel 基类
 *
 * Created by ditclear on 2017/9/28.
 */

open class BaseViewModel(app:Application) : AndroidViewModel(app) {
    private val mState = MutableLiveData<StateView.ContentState>(StateView.ContentState.CONTENT)

    val state: LiveData<StateView.ContentState> get() = mState

    protected fun onLoadingState() {
        mState.value = StateView.ContentState.LOADING
    }

    protected fun onContentState() {
        mState.value = StateView.ContentState.CONTENT
    }

    protected fun onErrorState() {
        mState.value = StateView.ContentState.ERROR
    }

    protected fun onEmptyState() {
        mState.value = StateView.ContentState.EMPTY
    }
}