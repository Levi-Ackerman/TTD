package mikasa.ackerman.ttd.host.video.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.*
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
 * 2020/5/17 10:16 AM
 */
@Dao
interface VideoCategoryDao {
    @Query("select * from ${VideoCategory.TABLE_NAME}")
    fun getAll(): LiveData<List<VideoCategory>>

    @Query("delete from ${VideoCategory.TABLE_NAME}")
    fun deleteAll()

    @Insert
    fun insert(categories: List<VideoCategory>)

}