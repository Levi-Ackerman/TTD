/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.index.article

import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.fragment.BaseFragment
import mikasa.ackerman.ttd.host.databinding.ArticleFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import mikasa.ackerman.ttd.host.index.article.viewmodel.ArticleViewModel

/**
 * description: ArticleFragment
 * @see ArticleViewModel
 * @date 2020/05/13
 */
class ArticleFragment : BaseFragment<ArticleFragmentBinding>() {

    private val mViewModel by viewModel<ArticleViewModel>()

    override fun getLayoutId(): Int = R.layout.article_fragment

    override fun initView() {
        mBinding.vm = mViewModel
    }

    override fun loadData(isRefresh: Boolean) {

    }

    override fun bindVm() {

    }
}
