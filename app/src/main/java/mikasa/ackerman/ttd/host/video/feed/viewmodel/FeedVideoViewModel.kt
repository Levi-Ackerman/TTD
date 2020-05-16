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
import mikasa.ackerman.ttd.host.video.model.VideoFeedService
import mikasa.ackerman.ttd.host.video.pojo.FeedVideoItem

/**
 * description: FeedVideoViewModel
 *
 * @see mikasa.ackerman.ttd.host.video.feed.FeedVideoFragment
 *
 * @date 2020/05/16
 */
class FeedVideoViewModel(application: Application, private val mVideoFeedService: VideoFeedService) : BaseViewModel(application) {
    private val mVideoItems = MutableLiveData<List<FeedVideoItem>>()
    val videoItems get() = mVideoItems
    fun loadData(refresh: Boolean) {
        viewModelScope.launch {
            onLoadingState()
            val videoListResp = withContext(Dispatchers.IO) {
                mVideoFeedService.getVideoList().execute()
            }
            if (videoListResp.isSuccessful) {
                if (videoListResp.body()?.isEmpty() != false) {
                    onEmptyState()
                } else {
                    val videoItems = videoListResp.body()!!.getContent()
                    mVideoItems.value = videoItems
                    onContentState()
                }
            } else {
                onErrorState()
            }
        }
    }

}