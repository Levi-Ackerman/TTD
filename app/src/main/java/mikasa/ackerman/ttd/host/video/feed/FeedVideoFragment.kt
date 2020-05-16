/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.video.feed

import androidx.lifecycle.Observer
import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.fragment.BaseFragment
import mikasa.ackerman.ttd.host.databinding.FeedVideoFragmentBinding
import mikasa.ackerman.ttd.host.video.feed.viewmodel.FeedVideoViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * description: FeedVideoFragment
 * @see FeedVideoViewModel
 * @date 2020/05/16
 */
class FeedVideoFragment : BaseFragment<FeedVideoFragmentBinding>() {

    private val mViewModel by viewModel<FeedVideoViewModel>()

    override fun getLayoutId(): Int = R.layout.feed_video_fragment

    override fun initView() {
        mBinding.vm = mViewModel
    }

    override fun loadData(isRefresh: Boolean) {
        mViewModel.loadData(isRefresh)
    }

    override fun bindVm() {
        mViewModel.videoItems.observe(this, Observer {

        })
    }
}
