/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.index.feed

import android.text.TextUtils
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.feed_fragment.*
import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.fragment.BaseFragment
import mikasa.ackerman.ttd.host.databinding.FeedFragmentBinding
import mikasa.ackerman.ttd.host.index.feed.viewmodel.FeedViewModel
import mikasa.ackerman.ttd.host.pojo.ArticleCategories
import mikasa.ackerman.ttd.host.pojo.FeedItem
import mikasa.ackerman.ttd.host.util.ViewUtil
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * description: ArticleFragment
 * @see FeedViewModel
 * @date 2020/05/13
 */
class FeedFragment : BaseFragment<FeedFragmentBinding>() {

    private val mViewModel by viewModel<FeedViewModel>()

    private val mAdapter by lazy {
        FeedAdapter()
    }

    override fun getLayoutId(): Int = R.layout.feed_fragment

    override fun initView() {
        feedListView.layoutManager = LinearLayoutManager(context)
        feedListView.adapter = mAdapter
    }

    override fun loadData(isRefresh: Boolean) {
        mViewModel.loadData(isRefresh)
    }

    override fun bindVm() {
        mViewModel.setItem(arguments!!["item"] as ArticleCategories.DataX.Data)
        mBinding.vm = mViewModel
        mViewModel.feedItems.observe(this, Observer {
            mAdapter.setDataItems(it)
        })
    }

    class FeedAdapter :RecyclerView.Adapter<FeedViewHolder>(){
        companion object{
            const val TEXT_NEWS = 0
            const val RIGHT_PIC_VIDEO_NEWS = 1
            const val CENTER_SINGLE_PIC_VIDEO_NEWS = 2
            const val THREE_PICS_NEWS = 3
            const val CENTER_SINGLE_PIC_NEWS = 4
        }

        val mDataItems = mutableListOf<FeedItem>()

        fun setDataItems(items: List<FeedItem>){
            mDataItems.clear()
            mDataItems.addAll(items)
            notifyDataSetChanged()
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedViewHolder {
            return FeedViewHolder(TextView(parent.context).apply {
                layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewUtil.dp2px(parent.context,60).toInt())
            })
        }

        override fun getItemCount(): Int {
            return mDataItems.size
        }

        override fun onBindViewHolder(holder: FeedViewHolder, position: Int) {
            holder.bindData(mDataItems[position])
        }

        override fun getItemViewType(position: Int): Int {
            val news = mDataItems[position]
            if (news.isHasVideo) {
                //如果有视频
                if (news.videoStyle == 0) {
                    //右侧视频
                    return if (news.middleImage == null || TextUtils.isEmpty(news.middleImage.url)) {
                        TEXT_NEWS
                    } else  RIGHT_PIC_VIDEO_NEWS
                } else if (news.videoStyle == 2) {
                    //居中视频
                    return CENTER_SINGLE_PIC_VIDEO_NEWS
                }
            } else {
                //非视频新闻
                return if (!news.isHasImage) {
                    //纯文字新闻
                    TEXT_NEWS
                } else {
                    if (news.imageList?.isEmpty() != false) {
                        //图片列表为空，则是右侧图片
                        return RIGHT_PIC_VIDEO_NEWS
                    }
                    if (news.gallary_image_count == 3) {
                        //图片数为3，则为三图
                        THREE_PICS_NEWS
                    } else CENTER_SINGLE_PIC_NEWS

                    //中间大图，右下角显示图数
                }
            }

            return TEXT_NEWS
        }

    }

    class FeedViewHolder(private val mRootView: TextView) : RecyclerView.ViewHolder(mRootView) {
        fun bindData(feedItem: FeedItem) {
            mRootView.text = feedItem.title;
        }

        init {

        }
    }
}

