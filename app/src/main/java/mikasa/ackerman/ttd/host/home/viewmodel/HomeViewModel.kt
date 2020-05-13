/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.home.viewmodel

import android.app.Application
import android.graphics.drawable.BitmapDrawable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.squareup.picasso.Picasso
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.ui.LocalRBTab
import mikasa.ackerman.ttd.host.base.ui.RBTab
import mikasa.ackerman.ttd.host.base.viewmodel.BaseViewModel
import mikasa.ackerman.ttd.host.network.BottomTabService
import mikasa.ackerman.ttd.host.pojo.BottomTabs

/**
 * description: HomeViewModel
 *
 * @see mikasa.ackerman.ttd.host.home.HomeFragment
 *
 * @date 2020/05/08
 */
class HomeViewModel(app: Application, private val mFixTabs: List<RBTab>, private val mBottomTabService: BottomTabService) : BaseViewModel(app) {

    private val mBottomTabs = MutableLiveData<List<RBTab>>()

    val bottomTabs get() = mBottomTabs

    private val mCheckedTabIndex = MutableLiveData(-1)

    val checkedTabIndex get() = mCheckedTabIndex

    /**
     * 请求底部的动态tab列表
     */
    fun requestDynamicTabs() {
        viewModelScope.launch(Dispatchers.Main) {
            onLoadingState()
            val response = withContext(Dispatchers.IO) {
                mBottomTabService.fetchTabs().execute()
            }
            if (response.isSuccessful) {
                val bottomTabs = response.body()
                if (bottomTabs?.isEmpty() != false) {
                    // != false 等价于 左边为null或者true，都是空返回的情况
                    onEmptyState()
                } else {
                    updateTabs(bottomTabs.getContent())
                    onContentState()
                }
            } else {
                onErrorState()
            }
        }
    }

    private suspend fun updateTabs(content: List<BottomTabs.Data.NormalList>) {
        val resources = getApplication<Application>().resources
        val size = resources.getDimension(R.dimen.bottom_bar_icon_size).toInt()
        val tabs: List<RBTab> = content.map {
            val normalBmp = withContext(Dispatchers.IO) {
                Picasso.with(getApplication()).load(it.newTabIconUrlNormal).resize(size, size).get()
            }
            val pressBmp = withContext(Dispatchers.IO) {
                Picasso.with(getApplication()).load(it.newTabIconUrlPressed).resize(size, size).get()
            }
            LocalRBTab(BitmapDrawable(resources, normalBmp), BitmapDrawable(resources, pressBmp), it.tabName, it.tabId.hashCode())
        }
        mBottomTabs.value = tabs.toMutableList().apply {
            add(0, mFixTabs[0])
            for (i in 1 until mFixTabs.size) {
                add(mFixTabs[i])
            }
        }
    }

    /**
     * tab被点击
     */
    fun onTabClicked(checkedId: Int) {
        var checkedIndex = -1
        for (i in mBottomTabs.value!!.indices) {
            if (mBottomTabs.value!![i].tabId == checkedId) {
                checkedIndex = i
                break
            }
        }
        mCheckedTabIndex.value = checkedIndex
    }
}