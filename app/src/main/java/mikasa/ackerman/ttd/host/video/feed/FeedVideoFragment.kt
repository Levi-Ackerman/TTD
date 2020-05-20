/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.video.feed

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mikasa.ackerman.ttd.host.BR
import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.fragment.BaseFragment
import mikasa.ackerman.ttd.host.databinding.FeedVideoFragmentBinding
import mikasa.ackerman.ttd.host.databinding.ItemFeedVideoBinding
import mikasa.ackerman.ttd.host.video.feed.viewmodel.FeedVideoViewModel
import mikasa.ackerman.ttd.host.video.feed.pojo.FeedVideoItem
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * description: FeedVideoFragment
 * @see FeedVideoViewModel
 * @date 2020/05/16
 */
class FeedVideoFragment : BaseFragment<FeedVideoFragmentBinding>() {

    private val mViewModel by viewModel<FeedVideoViewModel>()

    override fun getLayoutId(): Int = R.layout.feed_video_fragment

    private val mAdapter by lazy { VideoItemAdapter() }

    override fun initView() {
        mBinding.rvVideoFeed.apply{
            adapter = mAdapter
            layoutManager = LinearLayoutManager(context)
        }
        mViewModel.initData()
    }

    override fun loadData(isRefresh: Boolean) {
        mViewModel.loadData(isRefresh)
    }

    override fun bindVm() {
        mBinding.vm = mViewModel
        mViewModel.videoItems.observe(this, Observer {
            mAdapter.update(it)
        })
    }

    class DiffCallback : DiffUtil.Callback(){
        var oldList:List<FeedVideoItem> = listOf()
        var newList:List<FeedVideoItem> = listOf()

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return true
        }

        override fun getOldListSize(): Int {
            return oldList.size
        }

        override fun getNewListSize(): Int {
            return newList.size
        }

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition].title == newList[newItemPosition].title
        }

    }


    class VideoItemAdapter(val data: MutableList<FeedVideoItem> = mutableListOf()) :RecyclerView.Adapter<VideoItemViewHolder>() {
        private val diffCallback = DiffCallback()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoItemViewHolder {
            val binding = DataBindingUtil.inflate<ItemFeedVideoBinding>(LayoutInflater.from(parent.context),R.layout.item_feed_video, parent,false)
            return VideoItemViewHolder(binding)
        }

        /**
         * 增量更新
         */
        fun update(newList: List<FeedVideoItem>){
            data.clear()
            data.addAll(0, newList)
            notifyItemRangeInserted(0,newList.size)
//            diffCallback.newList = newList
//            val diffResult = DiffUtil.calculateDiff(diffCallback, true)
//            diffResult.dispatchUpdatesTo(this)
//            diffCallback.oldList = newList
        }

        override fun getItemCount(): Int {
            return data.size
        }

        override fun onBindViewHolder(holder: VideoItemViewHolder, position: Int) {
            holder.bindData(data[position])
        }
    }
}
