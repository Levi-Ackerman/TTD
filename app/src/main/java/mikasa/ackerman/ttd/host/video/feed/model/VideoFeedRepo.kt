package mikasa.ackerman.ttd.host.video.feed.model

import com.google.gson.Gson
import mikasa.ackerman.ttd.host.video.feed.pojo.FeedVideoItem
import org.koin.core.KoinComponent
import org.koin.core.inject
import java.lang.Exception

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
 * 2020/5/17 9:32 AM
 */
class VideoFeedRepo(private val videoFeedService: VideoFeedService, private val videoFeedDao: VideoFeedDao) : KoinComponent {

    private val mGson: Gson by inject()

    fun initData(): MutableList<FeedVideoItem> {
        val listData = videoFeedDao.getList(0, 18)
        val items = mutableListOf<FeedVideoItem>()
        for (data in listData) {
            items.add(mGson.fromJson(data.data, FeedVideoItem::class.java))
        }
        return items
    }

    fun loadVideoFeedList(): List<FeedVideoItem>? {
        val result = videoFeedService.getVideoList().execute()
        return if (result.isSuccessful) {
            if (result.body()?.isEmpty() == false) {
                val content = result.body()!!.getContent()
                try {
                    videoFeedDao.insert(content.map { FeedVideoItemCache().apply { mGson.toJson(it) } })
                }catch (e:Exception){
                    e.printStackTrace()
                }
                    content
            } else {
                emptyList()
            }
        } else {
            null
        }
    }

}