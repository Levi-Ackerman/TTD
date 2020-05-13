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
import mikasa.ackerman.ttd.host.network.SearchSuggestionService
import mikasa.ackerman.ttd.host.pojo.SearchSuggests

/**
 * description: IndexViewModel
 *
 * @see mikasa.ackerman.ttd.host.index.IndexFragment
 *
 * @date 2020/05/10
 */
class IndexViewModel(app: Application, val mSearchSuggestionService: SearchSuggestionService) : BaseViewModel(app) {
    val mSearchSuggests = MutableLiveData<List<SearchSuggests.Data.SuggestWords>>()

    var searchSuggestsText = MutableLiveData<String>()

    fun loadSearchSuggests() {
        viewModelScope.launch {
            val a = async {
                withContext(Dispatchers.IO) {
                    val response = mSearchSuggestionService.searchSuggestion().execute()
                    response
                }
            }

            mSearchSuggests.value = with(a.await()) {
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

}