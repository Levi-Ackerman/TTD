package mikasa.ackerman.ttd.host.video

import androidx.room.Database
import androidx.room.RoomDatabase
import mikasa.ackerman.ttd.host.video.feed.model.FeedVideoItemCache
import mikasa.ackerman.ttd.host.video.feed.model.VideoFeedDao
import mikasa.ackerman.ttd.host.video.model.VideoCategoryDao
import mikasa.ackerman.ttd.host.video.pojo.VideoCategory

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
 * 2020/5/17 10:29 AM
 */
@Database(entities = [VideoCategory::class, FeedVideoItemCache::class], version = 2, exportSchema = false )
abstract class VideoDatabase : RoomDatabase() {
    companion object{
        const val NAME = "video_database"
    }

    abstract fun
            videoDao(): VideoCategoryDao

    abstract fun videoFeedDao(): VideoFeedDao

}