/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.video.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import mikasa.ackerman.ttd.host.base.viewmodel.BaseViewModel
import mikasa.ackerman.ttd.host.video.model.VideoCategoryRepo
import mikasa.ackerman.ttd.host.video.pojo.VideoCategory

/**
 * description: VideoViewModel
 *
 * @see mikasa.ackerman.ttd.host.video.VideoFragment
 *
 * @date 2020/05/15
 */
class VideoViewModel(application: Application, val mVideoCategoryRepo: VideoCategoryRepo) : BaseViewModel(application) {

    val categories = MutableLiveData(listOf<VideoCategory>())

    fun initData(){
        viewModelScope.launch {
            val data = withContext(Dispatchers.IO) {
                mVideoCategoryRepo.initData()
            }
            categories.value = data
        }

    }

    fun loadData(refresh: Boolean) {
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) {
                mVideoCategoryRepo.loadVideoCategories()
            }
            if(result != null){

                categories.value = result
            }
        }
    }

    val searchSuggestsText get() = ""
}