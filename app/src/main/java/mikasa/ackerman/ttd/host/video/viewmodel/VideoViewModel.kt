/**
 * generate by AAMVVM: https://github.com/HeadingMobile/AAMVVM
 */
package mikasa.ackerman.ttd.host.video.viewmodel

import android.app.Application
import mikasa.ackerman.ttd.host.base.viewmodel.BaseViewModel
import mikasa.ackerman.ttd.host.video.model.VideoCategoryRepo

/**
 * description: VideoViewModel
 *
 * @see mikasa.ackerman.ttd.host.video.VideoFragment
 *
 * @date 2020/05/15
 */
class VideoViewModel(application: Application, val mVideoCategoryRepo: VideoCategoryRepo) : BaseViewModel(application) {

    val categories get() = mVideoCategoryRepo.categoryList

    fun loadData(refresh: Boolean) {
        mVideoCategoryRepo.loadVideoCategories()
    }

    val searchSuggestsText get() = ""
}