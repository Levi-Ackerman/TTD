/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import mikasa.ackerman.ttd.host.base.ui.Tab
import mikasa.ackerman.ttd.host.base.viewmodel.BaseViewModel

/**
 * description: HomeViewModel
 *
 * @see mikasa.ackerman.ttd.host.home.HomeFragment
 *
 * @date 2020/05/08
 */
class HomeViewModel(fixTabs: List<Tab>) : BaseViewModel() {
    private val mBottomTabs = MutableLiveData(fixTabs)

    val bottomTabs: LiveData<List<Tab>> get() = mBottomTabs

    val defaultTab: Int get() = 1
}