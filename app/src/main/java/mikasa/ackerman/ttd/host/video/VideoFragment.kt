/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.video

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.video_fragment.*
import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.fragment.BaseFragment
import mikasa.ackerman.ttd.host.databinding.VideoFragmentBinding
import mikasa.ackerman.ttd.host.util.ViewUtil
import mikasa.ackerman.ttd.host.video.feed.FeedVideoFragment
import mikasa.ackerman.ttd.host.video.pojo.VideoCategory
import mikasa.ackerman.ttd.host.video.viewmodel.VideoViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * description: VideoFragment
 * @see VideoViewModel
 * @date 2020/05/15
 */
class VideoFragment : BaseFragment<VideoFragmentBinding>() {

    private val mViewModel by viewModel<VideoViewModel>()

    override fun getLayoutId(): Int = R.layout.video_fragment

    private val mAdapter: VideoPageAdapter by lazy {
        VideoPageAdapter(activity!!, mutableListOf())
    }

    override fun initView() {
        mBinding.apply {
            statusSpaceView.layoutParams.height = ViewUtil.getStatusBarHeight(context!!)
            videoViewPager.adapter = mAdapter
        }
        TabLayoutMediator(videoCategoryTab, videoViewPager) { tab, position ->
            tab.text = mAdapter.getItemTitle(position)
        }.attach()
        mViewModel.categories.observe(this, Observer {
            mAdapter.setCategories(it)
            mAdapter.notifyDataSetChanged()
        })
    }

    override fun loadData(isRefresh: Boolean) {
        mViewModel.loadData(isRefresh)
    }

    override fun bindVm() {
        mBinding.apply {
            vm = mViewModel
        }
    }

    class VideoPageAdapter(fragmentActivity: FragmentActivity, val mCategories: MutableList<VideoCategory>) : FragmentStateAdapter(fragmentActivity) {

        fun setCategories(categories: List<VideoCategory>) {
            mCategories.clear()
            mCategories.addAll(categories)
        }

        fun getItemTitle(position: Int): String? {
            return if (position < mCategories.size) {
                mCategories[position].name
            } else {
                ""
            }
        }

        override fun getItemCount(): Int {
            return mCategories.size
        }

        override fun createFragment(position: Int): Fragment {
            return FeedVideoFragment().apply {
                arguments = bundleOf("item" to mCategories[position])
            }
        }
    }
}
