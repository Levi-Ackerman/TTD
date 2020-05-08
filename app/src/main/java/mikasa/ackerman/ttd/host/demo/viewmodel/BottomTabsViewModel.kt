package mikasa.ackerman.ttd.host.demo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import mikasa.ackerman.ttd.host.common.State
import mikasa.ackerman.ttd.host.network.BottomTabService
import mikasa.ackerman.ttd.host.network.Retrofiter
import mikasa.ackerman.ttd.host.pojo.BottomTabs

/**
 * TTD
 *
 *
 * Title:
 *
 *
 * Description:
 *
 *
 *
 * <br></br>
 * 用法:
 * <pre>
</pre> *
 *
 *
 *
 * Copyright: Copyright (c) 2020
 *
 * @author zhengxian.lzx@alibaba-inc.com
 * @version 1.0
 * 2020/4/27 9:37 PM
 */
class BottomTabsViewModel : ViewModel() {

    private val mState = MutableLiveData<State>()
    private var mBottomTabs:BottomTabs? = null
    val bottomTabs: BottomTabs? get() = mBottomTabs

    val state: MutableLiveData<State> get() = mState

    fun requestBottomTabs() {
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                val bottomTabService = Retrofiter.create(BottomTabService::class.java)
                bottomTabService.fetchTabs().execute()
            }.apply {
                if(isSuccessful ){

                }
            }

//            mBottomTabs = bottomTabs

            mState.value = State.CONTENT
        }
    }
}