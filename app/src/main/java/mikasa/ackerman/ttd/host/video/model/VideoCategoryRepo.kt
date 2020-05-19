package mikasa.ackerman.ttd.host.video.model

import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import mikasa.ackerman.ttd.host.pojo.FeedItem
import mikasa.ackerman.ttd.host.video.pojo.VideoCategories
import mikasa.ackerman.ttd.host.video.pojo.VideoCategory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * TTD
 *
 * <p>Title: </p>
 *
 * <p>Description: </p>
 * <p>
 *
 * <br>
 * 用法:
 * <pre>
 * </pre>
 * </p>
 *
 * <p>Copyright: Copyright (c) 2020</p>
 *
 * @author zhengxian.lzx@alibaba-inc.com
 * @version 1.0
 * 2020/5/17 10:15 AM
 */
class VideoCategoryRepo(private val mVideoCategoryAPIService: VideoCategoryAPIService, private val mVideoCategoryDao: VideoCategoryDao) {

    fun initData():List<VideoCategory>{
        return mVideoCategoryDao.getAll()
    }

    fun loadVideoCategories():List<VideoCategory>? {
        val result = mVideoCategoryAPIService.getCategory().execute()
        if(result.isSuccessful && result.body()?.isEmpty() == false){
            mVideoCategoryDao.deleteAll()
            mVideoCategoryDao.insert(result.body()!!.getContent())
        }
        return result.body()?.getContent()
    }
}