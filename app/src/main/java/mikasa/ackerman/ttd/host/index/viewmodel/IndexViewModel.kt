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
class IndexViewModel(app: Application, private val mSearchSuggestionService: SearchSuggestionService, private val mArticleCategoryService: ArticleCategoryService) : BaseViewModel(app) {
    private val mArticleCategory = MutableLiveData<List<ArticleCategories.DataX.Data>>()
    private val mSearchSuggests = MutableLiveData<List<SearchSuggests.Data.SuggestWords>>()

    var searchSuggestsText = MutableLiveData<String>()
    val articleCategories get() = mArticleCategory

    suspend fun loadArticleTabs() {
        val articleCategoryResp = mArticleCategoryService.getCategories().execute()

        withContext(Dispatchers.Main) {
            mArticleCategory.value = with(articleCategoryResp) {
                if (isSuccessful) {
                    body()?.getContent()
                } else {
                    listOf()
                }
            }
        }
    }

    suspend fun loadSearchSuggests() {
        val searchSuggestResp = mSearchSuggestionService.searchSuggestion().execute()
        withContext(Dispatchers.Main) {
            mSearchSuggests.value = with(searchSuggestResp) {
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
        }
    }

    fun loadData(refresh: Boolean) {
            viewModelScope.launch(Dispatchers.IO) {
                try {
                    loadSearchSuggests()
                    loadArticleTabs()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
    }

}