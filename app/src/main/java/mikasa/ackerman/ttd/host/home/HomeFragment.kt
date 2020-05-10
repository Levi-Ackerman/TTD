/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.home

import android.widget.RadioGroup
import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.fragment.BaseFragment
import mikasa.ackerman.ttd.host.databinding.HomeFragmentBinding
import mikasa.ackerman.ttd.host.home.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * description: HomeFragment
 * @see HomeViewModel
 * @date 2020/05/08
 */
class HomeFragment : BaseFragment<HomeFragmentBinding>(), RadioGroup.OnCheckedChangeListener {

    private val mViewModel: HomeViewModel by viewModel()

    override fun getLayoutId(): Int = R.layout.home_fragment

    override fun bindVm() {
        mBinding.let {
            it.vm = mViewModel
            it.presenter = this
        }
    }

    override fun loadData(isRefresh: Boolean) {
        mViewModel.requestDynamicTabs()
    }

    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {

    }


}
