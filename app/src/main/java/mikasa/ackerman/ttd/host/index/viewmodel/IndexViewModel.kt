/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.index.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import mikasa.ackerman.ttd.host.base.viewmodel.BaseViewModel
import mikasa.ackerman.ttd.host.network.ArticleCategoryService
import mikasa.ackerman.ttd.host.network.SearchSuggestionService
import mikasa.ackerman.ttd.host.pojo.ArticleCategories
import mikasa.ackerman.ttd.host.pojo.SearchSuggests

/**
 * description: IndexViewModel
 *
 * @see mikasa.ackerman.ttd.host.index.IndexFragment
 *
 * @date 2020/05/10
 */
class IndexViewModel(app: Application, val mSearchSuggestionService: SearchSuggestionService, val mArticleCategoryService: ArticleCategoryService) : BaseViewModel(app) {
    private val mArticleCategory = MutableLiveData<List<ArticleCategories.DataX.Data>>()
    private val mSearchSuggests = MutableLiveData<List<SearchSuggests.Data.SuggestWords>>()

    var searchSuggestsText = MutableLiveData<String>()

    fun loadSearchSuggests() {
        viewModelScope.launch {
            val searchSuggestResp = async {
                withContext(Dispatchers.IO) {
                    mSearchSuggestionService.searchSuggestion().execute()
                }
            }

            val articleCategoryResp = async {
                withContext(Dispatchers.IO) {
                    mArticleCategoryService.getCategories().execute()
                }
            }

            mSearchSuggests.value = with(searchSuggestResp.await()) {
                val list = if (isSuccessful) {
                    body()?.getContent()
                } else {
                    listOf()
                }
                searchSuggestsText.value = list?.joinToString(separator = "|", transform = {
                    it.word!!
                }) ?: ""
                list
            }

            mArticleCategory.value = with(articleCategoryResp.await()) {
                if (isSuccessful) {
                    body()?.getContent()
                } else {
                    listOf()
                }
            }
        }
    }

}