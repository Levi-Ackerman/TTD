package mikasa.ackerman.ttd.host.demo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import mikasa.ackerman.ttd.host.base.ui.StateView
import mikasa.ackerman.ttd.host.network.BottomTabService
import mikasa.ackerman.ttd.host.network.Retrofiter
import mikasa.ackerman.ttd.host.pojo.BottomTabs
import retrofit2.Response
import java.lang.Exception

/**
 * TTD
 *
 *
 * Copyright: Copyright (c) 2020
 *
 * @author zhengxian.lzx@alibaba-inc.com
 * @version 1.0
 * 2020/4/27 9:37 PM
 */
class BottomTabsViewModel : ViewModel() {

    private val mState = MutableLiveData<StateView.ContentState>()
    private var mBottomTabs:BottomTabs? = null
    val bottomTabs: BottomTabs? get() = mBottomTabs

    val state: MutableLiveData<StateView.ContentState> get() = mState

    fun requestBottomTabs() {
        mState.value = StateView.ContentState.LOADING
        viewModelScope.launch(Dispatchers.Main) {
            mState.value = StateView.ContentState.LOADING

            val response = withContext(Dispatchers.IO){
                Retrofiter.create(BottomTabService::class.java).fetchTabs().execute()
            }

            if (response.isSuccessful){
                mBottomTabs = response.body()
                mState.value = StateView.ContentState.CONTENT
            }else{
                mState.value = StateView.ContentState.ERROR
            }
        }
    }
}