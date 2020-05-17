/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.video.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import mikasa.ackerman.ttd.host.base.viewmodel.BaseViewModel
import mikasa.ackerman.ttd.host.video.model.VideoCategoryAPIService
import mikasa.ackerman.ttd.host.video.model.VideoCategoryRepo
import mikasa.ackerman.ttd.host.video.pojo.VideoCategory

/**
 * description: VideoViewModel
 *
 * @see mikasa.ackerman.ttd.host.video.VideoFragment
 *
 * @date 2020/05/15
 */
class VideoViewModel(application:Application, val mVideoCategoryRepo: VideoCategoryRepo) : BaseViewModel(application) {
    private val mCategories = MutableLiveData<List<VideoCategory>>()

    val categories get() = mCategories

    fun loadData(refresh: Boolean) {
        viewModelScope.launch {
            onLoadingState()
            val videoCategoriesResp = withContext(Dispatchers.IO){
                mVideoCategoryRepo.mVideoCategoryAPIService.getCategory().execute()
            }
            if(videoCategoriesResp.isSuccessful){
                val categories = videoCategoriesResp.body()
                if (categories?.isEmpty() != false){
                    onEmptyState()
                }else{
                    mCategories.value = categories.getContent()
                    onContentState()
                }
            }
        }
    }

    val searchSuggestsText get() = ""
}