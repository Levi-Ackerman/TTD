package mikasa.ackerman.ttd.host.video.feed.model

import androidx.room.*

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
 * 2020/5/17 9:33 AM
 */
@Dao
interface VideoFeedDao {
    @Query("select * from ${FeedVideoItemCache.TABLE_NAME} limit :from, :count")
    fun getList(from: Int, count: Int): List<FeedVideoItemCache>

    @Insert
    fun insert(list: List<FeedVideoItemCache>)
}

@Entity(tableName = FeedVideoItemCache.TABLE_NAME)
class FeedVideoItemCache {
    companion object {
        const val TABLE_NAME = "feed_video_item_cache"
        const val COLUMN_NAME_DATA = "data"
    }

    @ColumnInfo(name = COLUMN_NAME_DATA)
    @PrimaryKey
    var data: String = ""
}