/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.home

import androidx.lifecycle.ViewModelProvider
import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.fragment.BaseFragment
import mikasa.ackerman.ttd.host.base.ui.BottomTabBar
import mikasa.ackerman.ttd.host.databinding.HomeFragmentBinding
import mikasa.ackerman.ttd.host.home.viewmodel.HomeViewModel

/**
 * description: HomeFragment
 * @see HomeViewModel
 * @date 2020/05/08
 */
class HomeFragment : BaseFragment<HomeFragmentBinding>() {

    private lateinit var mViewModel: HomeViewModel

    override fun getLayoutId(): Int = R.layout.home_fragment

    override fun initView() {
        mViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        mBinding.let {
            it.vm = mViewModel
            it.presenter = this
            it.bottomBar.setTabList(listOf(BottomTabBar.Tab(resources.getDrawable(R.drawable.tab_home_normal),
                    resources.getDrawable(R.drawable.tab_home_selected),
                    "Home")))
        }
        lazyLoad = true
    }

    override fun lazyLoad() {
        super.lazyLoad()
//        mViewModel.
    }

    override fun loadData(isRefresh: Boolean) {

    }
}
