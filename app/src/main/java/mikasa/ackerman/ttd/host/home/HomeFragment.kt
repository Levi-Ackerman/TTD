/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.home

import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.fragment.BaseFragment
import mikasa.ackerman.ttd.host.databinding.HomeFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import mikasa.ackerman.ttd.host.home.viewmodel.HomeViewModel

/**
 * description: HomeFragment
 * @see HomeViewModel
 * @date 2020/05/08
 */
class HomeFragment : BaseFragment<HomeFragmentBinding>() {

    private val mViewModel by viewModel<HomeViewModel>()

    override fun getLayoutId(): Int = R.layout.home_fragment

    override fun initView() {
        mBinding.vm = mViewModel
    }

    override fun loadData(isRefresh: Boolean) {

    }
}
