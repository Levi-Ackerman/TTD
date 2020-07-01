/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.index

import android.util.Log
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.google.gson.Gson
import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.fragment.BaseFragment
import mikasa.ackerman.ttd.host.databinding.IndexFragmentBinding
import mikasa.ackerman.ttd.host.index.feed.FeedFragment
import mikasa.ackerman.ttd.host.index.viewmodel.IndexViewModel
import mikasa.ackerman.ttd.host.pojo.ArticleCategories
import mikasa.ackerman.ttd.host.util.ViewUtil
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * description: IndexFragment
 * @see IndexViewModel
 * @date 2020/05/10
 */
class IndexFragment : BaseFragment<IndexFragmentBinding>() {

    private val mViewModel by viewModel<IndexViewModel>()

    override fun getLayoutId(): Int = R.layout.index_fragment

    private val mAdapter: IndexPageAdapter by lazy {
        IndexPageAdapter(activity!!, mutableListOf())
    }

    override fun loadData(isRefresh: Boolean) {
        mViewModel.loadData(isRefresh)
    }

    override fun bindVm() {
        mBinding.apply {
            statusSpaceView.layoutParams.apply {
                height = ViewUtil.getStatusBarHeight(context!!)
            }
            vm = mViewModel
            indexViewPager.adapter = mAdapter
            TabLayoutMediator(articleCategoryTab, indexViewPager) { tab, position ->
                tab.text = mAdapter.getItemTitle(position)
            }.attach()
        }


        mViewModel.articleCategories.observe(this, Observer { categorys ->
            mAdapter.setCategories(categorys)
            mAdapter.notifyDataSetChanged()
        })
    }

    class IndexPageAdapter(fragmentActivity: FragmentActivity, val mCategories: MutableList<ArticleCategories.DataX.Data>) : FragmentStateAdapter(fragmentActivity) {

        fun setCategories(categories: List<ArticleCategories.DataX.Data>) {
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
            return FeedFragment().apply {
                arguments = bundleOf("item" to mCategories[position])
            }
        }
    }
}