package mikasa.ackerman.ttd.host.video.pojo

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

/**
 * TTD
 *
 *
 * Title:
 *
 *
 * Description:
 *
 *
 *
 * <br></br>
 * 用法:
 * <pre>
</pre> *
 *
 *
 *
 * Copyright: Copyright (c) 2020
 *
 * @author zhengxian.lzx@alibaba-inc.com
 * @version 1.0
 * 2020/5/17 10:03 AM
 */
@Entity
@Parcelize
class VideoCategory : Parcelable {

    /**
     * category : subv_entertainment
     * category_type : 0
     * flags : 0
     * hor_immersive_category : tt_subv_landscape
     * icon_url :
     * name : 濞变箰
     * tip_new : 0
     * type : 4
     * web_url :
     */
    @PrimaryKey
    @ColumnInfo(name = "category")
    @SerializedName("category")
    var category: String? = null

    @SerializedName("category_type")
    var categoryType = 0

    @SerializedName("flags")
    var flags = 0

    @SerializedName("hor_immersive_category")
    var horImmersiveCategory: String? = null

    @SerializedName("icon_url")
    var iconUrl: String? = null

    @SerializedName("name")
    @ColumnInfo(name = "name")
    var name: String? = null

    @SerializedName("tip_new")
    var tipNew = 0

    @SerializedName("type")
    var type = 0

    @SerializedName("web_url")
    var webUrl: String? = null
}