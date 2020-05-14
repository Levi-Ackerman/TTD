/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.index.feed

import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.fragment.BaseFragment
import mikasa.ackerman.ttd.host.databinding.FeedFragmentBinding
import mikasa.ackerman.ttd.host.index.feed.viewmodel.FeedViewModel
import mikasa.ackerman.ttd.host.pojo.ArticleCategories
import mikasa.ackerman.ttd.host.pojo.FeedItem
import mikasa.ackerman.ttd.host.pojo.FeedList
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

        val mDataItems = mutableListOf<FeedItem>()

        fun setDataItems(items: List<FeedItem>){
            mDataItems.clear()
            mDataItems.addAll(items)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedViewHolder {
            return FeedViewHolder(parent)
        }

        override fun getItemCount(): Int {
            return mDataItems.size
        }

        override fun onBindViewHolder(holder: FeedViewHolder, position: Int) {

        }

    }

    class FeedViewHolder : RecyclerView.ViewHolder {
        constructor(view:View):super(view){

        }
    }
}
