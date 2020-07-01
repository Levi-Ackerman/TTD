/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.index.feed.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import mikasa.ackerman.ttd.host.base.viewmodel.BaseViewModel
import mikasa.ackerman.ttd.host.network.FeedService
import mikasa.ackerman.ttd.host.pojo.ArticleCategories
import mikasa.ackerman.ttd.host.pojo.FeedItem
import mikasa.ackerman.ttd.host.pojo.FeedList
import java.lang.Exception

/**
 * description: ArticleViewModel
 *
 * @see mikasa.ackerman.ttd.host.index.feed.FeedFragment
 *
 * @date 2020/05/13
 */
class FeedViewModel(application: Application, val mFeedService: FeedService): BaseViewModel(application) {
    private lateinit var mTabItem:ArticleCategories.DataX.Data

    private val mFeedItems = MutableLiveData<List<FeedItem>>()

    val feedItems get() = mFeedItems

    fun setItem(tabItem: ArticleCategories.DataX.Data){
        mTabItem = tabItem
    }

    fun loadData(refresh: Boolean) {
        viewModelScope.launch(Dispatchers.Main) {
            onLoadingState()
            val feedResponse = withContext(Dispatchers.IO) {
                try {
                    mFeedService.pullFeed().execute()
                }catch (e: Exception){
                    e.printStackTrace()
                    null
                }
            }

            if (feedResponse != null && feedResponse.isSuccessful){
                if (feedResponse.body()?.isEmpty() != false){
                    updateContent(feedResponse.body()!!.getContent())
                    onContentState()
                }else{
                    onEmptyState()
                }
            }else{
                onErrorState()
            }
        }
    }

    private fun updateContent(data: List<FeedItem>) {
        mFeedItems.value = data
    }
}