package mikasa.ackerman.ttd.host.video.feed.pojo

import com.google.gson.*
import java.lang.reflect.Type

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
 * 2020/5/19 12:15 PM
 */
data class FeedVideoItem(
    val article_url: String,
    val comment_count: Int,
    val id: Long,
    val media_name: String,
    val middle_image: MiddleImage,
    val need_client_impr_recycle: Int,
    val play_auth_token: String,
    val play_biz_token: String,
    val pread_params: String,
    val publish_time: Int,
    val read_count: Int,
    val repin_count: Int,
    val req_id: String,
    val rid: String,
    val share_count: Int,
    val share_info: ShareInfo,
    val share_type: Int,
    val share_url: String,
    val show_dislike: Boolean,
    val show_portrait: Boolean,
    val show_portrait_article: Boolean,
    val small_image: Any,
    val source: String,
    val source_icon_style: Int,
    val source_open_url: String,
    val tag: String,
    val tip: Int,
    val title: String,
    val ugc_recommend: UgcRecommend,
    val url: String,
    val user_info: UserInfo,
    val user_repin: Int,
    val user_verified: Int,
    val verified_content: String,
    val verify_reason: String,
    val verify_status: Int,
    val video_detail_info: VideoDetailInfo,
    val video_duration: Int,
    val video_id: String,
    val video_like_count: Int,
    val video_play_info: String,
    val video_proportion_article: Double,
    val video_style: Int,
    val video_user_like: Int
)

class FeedVideoItemAdapter(private val mGson: Gson) : JsonDeserializer<FeedVideoItem> {
    @Throws(JsonParseException::class)
    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): FeedVideoItem {
        return mGson.fromJson((json as JsonObject)["content"].asString
                , FeedVideoItem::class.java)
    }

}

data class Action(
    val action: Int,
    val desc: String,
    val extra: Extra
)

data class FilterWord(
    val id: String,
    val is_selected: Boolean,
    val name: String
)

data class ForwardInfo(
    val forward_count: Int
)

data class LargeImage(
    val height: Int,
    val uri: String,
    val url: String,
    val url_list: List<Url>,
    val width: Int
)

data class LogPb(
    val author_id: String,
    val category_name: String,
    val enter_from: String,
    val group_id: String,
    val group_source: String,
    val impr_id: String,
    val impr_type: String,
    val is_following: String
)

data class MediaInfo(
    val avatar_url: String,
    val media_id: Long,
    val name: String,
    val subcribed: Int,
    val subscribed: Int,
    val user_id: Long,
    val user_verified: Boolean,
    val verified_content: String
)

data class MiddleImage(
    val height: Int,
    val uri: String,
    val url: String,
    val url_list: List<UrlX>,
    val width: Int
)

data class ShareInfo(
    val cover_image: Any,
    val description: Any,
    val hidden_url: Any,
    val on_suppress: Int,
    val share_control: ShareControl,
    val share_type: ShareType,
    val share_url: String,
    val title: String,
    val token_type: Int,
    val video_url: String,
    val weixin_cover_image: Any
)

data class UgcRecommend(
    val activity: String,
    val reason: String
)

data class UserInfo(
    val avatar_url: String,
    val description: String,
    val follow: Boolean,
    val follower_count: Int,
    val is_blocked: Boolean,
    val is_blocking: Boolean,
    val is_discipulus: Boolean,
    val is_living: Boolean,
    val name: String,
    val schema: String,
    val sec_user_id: String,
    val user_id: Long,
    val user_verified: Boolean,
    val verified_content: String
)

data class VideoDetailInfo(
    val detail_video_large_image: DetailVideoLargeImage,
    val direct_play: Int,
    val group_flags: Int,
    val last_play_duration: Int,
    val show_pgc_subscribe: Int,
    val use_last_duration: Boolean,
    val video_id: String,
    val video_preloading_flag: Int,
    val video_type: Int,
    val video_watch_count: Int
)

class Extra(
)

data class Url(
    val url: String
)

data class UrlX(
    val url: String
)

data class ShareControl(
    val image: String,
    val video: String
)

data class ShareType(
    val pyq: Int,
    val qq: Int,
    val qzone: Int,
    val wx: Int
)

data class DetailVideoLargeImage(
    val height: Int,
    val uri: String,
    val url: String,
    val url_list: List<UrlXX>,
    val width: Int
)

data class UrlXX(
    val url: String
)