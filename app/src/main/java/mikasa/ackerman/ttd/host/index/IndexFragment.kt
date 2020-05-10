/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.index

import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.fragment.BaseFragment
import mikasa.ackerman.ttd.host.databinding.IndexFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import mikasa.ackerman.ttd.host.index.viewmodel.IndexViewModel

/**
 * description: IndexFragment
 * @see IndexViewModel
 * @date 2020/05/10
 */
class IndexFragment : BaseFragment<IndexFragmentBinding>() {

    private val mViewModel by viewModel<IndexViewModel>()

    override fun getLayoutId(): Int = R.layout.index_fragment

    override fun loadData(isRefresh: Boolean) {

    }

    override fun bindVm() {
        mBinding.apply {
            vm = mViewModel
        }
    }
}
