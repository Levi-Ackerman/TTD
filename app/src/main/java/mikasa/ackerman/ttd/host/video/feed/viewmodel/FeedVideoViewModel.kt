/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.video.feed.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import mikasa.ackerman.ttd.host.base.viewmodel.BaseViewModel
import mikasa.ackerman.ttd.host.video.feed.model.VideoFeedRepo
import mikasa.ackerman.ttd.host.video.feed.pojo.FeedVideoItem

/**
 * description: FeedVideoViewModel
 *
 * @see mikasa.ackerman.ttd.host.video.feed.FeedVideoFragment
 *
 * @date 2020/05/16
 */
class FeedVideoViewModel(application: Application, private val mVideoFeedRepo: VideoFeedRepo) : BaseViewModel(application) {
    val videoItems = MutableLiveData(mutableListOf<FeedVideoItem>())

    fun initData() = viewModelScope.launch(Dispatchers.IO) {
        val initData = mVideoFeedRepo.initData()
        videoItems.postValue(initData)
    }

    fun loadData(refresh: Boolean) {
        viewModelScope.launch(Dispatchers.IO) {
            val feedList = mVideoFeedRepo.loadVideoFeedList()
            if (feedList != null) {
                videoItems.postValue(videoItems.value!!.apply { addAll(feedList) })
            }
        }
    }

}