package mikasa.ackerman.ttd.host.video.feed.pojo

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.*
import com.google.gson.annotations.SerializedName
import java.lang.reflect.Type

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
 * 2020/5/16 4:53 PM
 */
class FeedVideoItem {
    class FeedVideoItemAdapter(private val mGson: Gson) : JsonDeserializer<FeedVideoItem> {
        @Throws(JsonParseException::class)
        override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): FeedVideoItem {
            return mGson.fromJson((json as JsonObject)["content"].asString
                    .replace("\\\"", "\"")
                    .replace("}\"", "}")
                    .replace("\"{", "{")
                    , FeedVideoItem::class.java)
        }

    }

    /**
     * abstract : 一群人站棺材旁正为亲人举办葬礼 接下来发生诡异一幕
     * action_extra : {"channel_id":3431225546}
     * action_list : [{"action":1,"desc":"","extra":{}},{"action":3,"desc":"","extra":{}},{"action":7,"desc":"",
     * "extra":{}},{"action":9,"desc":"","extra":{}}]
     * aggr_type : 1
     * allow_download : false
     * article_sub_type : 0
     * article_type : 0
     * article_url : http://toutiao.com/group/6827330514471354894/
     * ban_comment : 0
     * ban_danmaku : 0
     * ban_danmaku_send : 0
     * ban_immersive : 0
     * behot_time : 1589617488
     * bury_count : 0
     * can_comment_level : 0
     * categories : ["video_domestic/other","video_domestic","video_movie"]
     * cell_flag : 262155
     * cell_layout_style : 1
     * cell_type : 0
     * comment_count : 0
     * composition : 256
     * content_decoration :
     * cursor : 1589617488000
     * danmaku_count : 0
     * data_type : 1
     * default_danmaku : 0
     * digg_count : 0
     * display_url : http://toutiao.com/group/6827330514471354894/
     * filter_words : [{"id":"8:0","is_selected":false,"name":"看过了"},{"id":"9:1","is_selected":false,"name":"内容太水"},{
     * "id":"5:2802236875","is_selected":false,"name":"拉黑作者:南北资讯站"},{"id":"6:21201","is_selected":false,
     * "name":"不想看:葬礼"}]
     * followers_count : 0
     * forward_info : {"forward_count":0}
     * group_flags : 32832
     * group_id : 6827330514471354894
     * group_source : 2
     * has_m3u8_video : false
     * has_mp4_video : 0
     * has_video : true
     * hot : 0
     * id : 6827330514471354894
     * ignore_web_transform : 0
     * impression_count : 10
     * interaction_data :
     * is_original : false
     * is_subject : false
     * is_subscribe : false
     * item_id : 6827330514471354894
     * item_version : 0
     * large_image_list : [{"height":486,"uri":"img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486
     * .webp","url":"http://p9-tt-ipv6.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486
     * .webp","url_list":[{"url":"http://p9-tt-ipv6.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be
     * ~c5_q75_864x486.webp"},{"url":"http://p9-tt-ipv6.byteimg
     * .com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486.webp"},{"url":"http://p9-tt-ipv6
     * .byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486.webp"}],"width":864}]
     * level : 0
     * log_pb : {"author_id":"3966676636019549","category_name":"video","enter_from":"click_category",
     * "group_id":"6827330514471354894","group_source":"2","impr_id":"2020051616471801001404813003F24DBD",
     * "impr_type":"__channel__","is_following":"0"}
     * lynx_server : null
     * media_info : {"avatar_url":"http://p6-tt-ipv6.byteimg
     * .com/img/pgc-image/e9acbf4ecb7b4c84b790c5a6c7cb8267~tplv-resize:120:120.webp?from=xigua",
     * "media_id":1666749920870403,"name":"南北资讯站","subcribed":0,"subscribed":0,"user_id":3966676636019549,
     * "user_verified":false,"verified_content":""}
     * media_name : 南北资讯站
     * middle_image : {"height":324,"uri":"img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_576x324.webp",
     * "url":"http://p26-tt.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_576x324.webp",
     * "url_list":[{"url":"http://p26-tt.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be
     * ~c5_q75_576x324.webp"},{"url":"http://p26-tt.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be
     * ~c5_q75_576x324.webp"},{"url":"http://p26-tt.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be
     * ~c5_q75_576x324.webp"}],"width":576}
     * need_client_impr_recycle : 1
     * play_auth_token : HMAC-SHA1:2.0:1589791639019654183:bab42eac5b9e4a8eb25a91fc371ad533:eaNQW83i9LkYgLMbYBieLvoUL2Q=
     * play_biz_token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9
     * .eyJleHAiOjE1ODk3OTE2MzksInZlciI6InYxIiwiYWsiOiJiYWI0MmVhYzViOWU0YThlYjI1YTkxZmMzNzFhZDUzMyIsInN1YiI6InBnY18xMDgwcCJ9.a5xHqPTuw_4x_ivbelPYQygTC8ooZKbcp6h7CSvZI_0
     * pread_params : {"group_id":6827330514471354894,"item_id":6827330514471354894,"media_id":1666749920870403,
     * "channel_id":3431225546,"category_tag":"video_domestic","from_category":"video","is_gov_article":false,
     * "display_flags":0,"review_comment_mode":0,"group_source":2,"categories":["video_domestic/other",
     * "video_domestic","video_movie"],"video_duration":46,"rec_quality":0}
     * publish_time : 1589611758
     * read_count : 8
     * repin_count : 0
     * req_id : 2020051616471801001404813003F24DBD
     * rid : 2020051616471801001404813003F24DBD
     * share_count : 0
     * share_info : {"cover_image":null,"description":null,"hidden_url":null,"on_suppress":0,"share_control":{"image
     * ":"false","video":"false"},"share_type":{"pyq":0,"qq":0,"qzone":0,"wx":0},"share_url":"https://m.toutiaoimg
     * .cn/a6827330514471354894/?app=news_article&is_hit_share_recommend=0","title":"一群人站棺材旁正为亲人举办葬礼 接下来发生诡异一幕 -
     * 今日头条","token_type":1,"video_url":"","weixin_cover_image":null}
     * share_type : 2
     * share_url : https://m.toutiaoimg.cn/a6827330514471354894/?app=news_article&is_hit_share_recommend=0
     * show_dislike : true
     * show_portrait : false
     * show_portrait_article : false
     * small_image : null
     * source : 南北资讯站
     * source_icon_style : 6
     * source_open_url : sslocal://profile?refer=video&uid=3966676636019549
     * tag : video_domestic
     * tip : 0
     * title : 一群人站棺材旁正为亲人举办葬礼 接下来发生诡异一幕
     * ugc_recommend : {"activity":"","reason":""}
     * url : http://toutiao.com/group/6827330514471354894/
     * user_info : {"avatar_url":"http://p6-tt-ipv6.byteimg
     * .com/img/pgc-image/e9acbf4ecb7b4c84b790c5a6c7cb8267~tplv-resize:120:120.webp?from=xigua",
     * "description":"南北资讯站，看南来北往的资讯","follow":false,"follower_count":0,"is_blocked":false,"is_blocking":false,
     * "is_discipulus":false,"is_living":false,"name":"南北资讯站",
     * "schema":"sslocal://profile?uid=3966676636019549&refer=video",
     * "sec_user_id":"MS4wLjABAAAAleuAkFmwNq1D-XfnFZBzP-CHYW9ivuIzgcvol02IPAXmXNrgIhAoXnSlpvEz1q_8",
     * "user_id":3966676636019549,"user_verified":false,"verified_content":""}
     * user_repin : 0
     * user_verified : 0
     * verified_content :
     * verify_reason :
     * verify_status : 0
     * video_detail_info : {"detail_video_large_image":{"height":326,"uri":"video1609/tos-cn-p-0026
     * /ab7b8f22d679e1ac5fb5c7a6637a05be","url":"http://p8.pstatp
     * .com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be","url_list":[{"url":"http://p8.pstatp
     * .com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be"},{"url":"http://pb3.pstatp
     * .com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be"},{"url":"http://pb3.pstatp
     * .com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be"}],"width":580},"direct_play":1,
     * "group_flags":32832,"last_play_duration":0,"show_pgc_subscribe":1,"use_last_duration":false,
     * "video_id":"v02004ba0000bqvopc51mik4saba10l0","video_preloading_flag":1,"video_type":0,"video_watch_count":0}
     * video_duration : 46
     * video_id : v02004ba0000bqvopc51mik4saba10l0
     * video_like_count : 0
     * video_play_info : {"status":10,"message":"success","enable_ssl":true,
     * "video_id":"v02004ba0000bqvopc51mik4saba10l0","video_duration":46.042,"media_type":"video","big_thumbs":[{
     * "img_num":46,"uri":"30917000335262f143bfa","img_url":"http://p3.pstatp.com/origin/30917000335262f143bfa",
     * "img_x_size":236,"img_y_size":136,"img_x_len":10,"img_y_len":5,"duration":46.041667,"interval":1,"fext":"jpg"}
     * ],"fallback_api":"https://vas-lf-x.snssdk
     * .com/video/fplay/1/b13293b46a1f4a3d1ebbba1b8210a847/v02004ba0000bqvopc51mik4saba10l0?aid=13\\u0026key_seed
     * =raPC%2FhzgyOTWmJMosNYC%2BBApROQiBc8Q8oWjc%2FuqNrw%3D\\u0026logo_type=default\\u0026ptoken=pgc_1080p
     * \\u0026stream_type=normal","key_seed":"raPC/hzgyOTWmJMosNYC+BApROQiBc8Q8oWjc/uqNrw=","video_list":{"video_1":{
     * "definition":"360p","quality":"normal","vtype":"mp4","vwidth":626,"vheight":360,"bitrate":318177,
     * "codec_type":"h264","size":1831191,
     * "main_url
     * ":"aHR0cDovL3YyNi10dC5peGlndWEuY29tL2IwMzk0OTFmYjFkYTBhNjYxYTFkOTQ0N2RkZjI2MjE4LzVlYmZiNmQ1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC9hMGIzZjYwOTFhMzY0ZGZmODE2ZGE3ZTMwMzY3YjZmOC8/YT0xMyZicj05MzAmYnQ9MzEwJmNyPTAmY3M9MCZkcj0wJmRzPTEmZXI9MCZsPTIwMjAwNTE2MTY0NzE4MDEwMDE0MDQ4MTMwMDNGMjREQkQmbHI9ZGVmYXVsdCZxcz0wJnJjPU16TmtaRGRzTkdaeWRETXpaRGN6TTBBcFpUa3pORE5vTXp4bE4yZzVhV1pvTkdkcExsOXdhR295YlhOZkxTMWZMUzl6Y3pSZ05pNHdZREV4WHpVMkxURXVNeTQ2WXclM0QlM0Qmdmw9JnZyPQ==","backup_url_1":"aHR0cDovL3YyNy10dC5peGlndWEuY29tLzQ1NTgyYjBmNGIxOTE1NmZiOTM0MTVhZTEwNjRkZjJlLzVlYmZiNmQ1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC9hMGIzZjYwOTFhMzY0ZGZmODE2ZGE3ZTMwMzY3YjZmOC8/YT0xMyZicj05MzAmYnQ9MzEwJmNyPTAmY3M9MCZkcj0wJmRzPTEmZXI9MCZsPTIwMjAwNTE2MTY0NzE4MDEwMDE0MDQ4MTMwMDNGMjREQkQmbHI9ZGVmYXVsdCZxcz0wJnJjPU16TmtaRGRzTkdaeWRETXpaRGN6TTBBcFpUa3pORE5vTXp4bE4yZzVhV1pvTkdkcExsOXdhR295YlhOZkxTMWZMUzl6Y3pSZ05pNHdZREV4WHpVMkxURXVNeTQ2WXclM0QlM0Qmdmw9JnZyPQ==","url_expire":1589622485,"preload_size":327680,"preload_interval":45,"preload_min_step":5,"preload_max_step":10,"file_hash":"aa1c712641c71e1ad83a477ff6300a8f","file_id":"11e6c1f460e948bb9404ec0311096cb7","p2p_verify_url":"aHR0cDovL3YyNi10dC5peGlndWEuY29tL2Y1MDU0MTk3YzAxYzY0NmQ3MTU2OGI1N2VjZWY2YjhiLzVlYmZiNmQ1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC8xNjNkNmU1OTY3Y2M0OTI4OTExY2QzYjc4MTA0OTEzYi8=","encrypt":false},"video_2":{"definition":"480p","quality":"normal","vtype":"mp4","vwidth":640,"vheight":368,"bitrate":332990,"codec_type":"h264","size":1916441,"main_url":"aHR0cDovL3YyNi10dC5peGlndWEuY29tLzE4NmJjNDhlZGY2YTVkOGFmNGZlOTY5ZTcyY2FjYzI0LzVlYmZiNmQ1L3ZpZGVvL24vdG9zZWRnZS10b3MtYWdzeS12ZS0wMDAwL2M0ZTJkMDY0NjZiODQyZjg5OGM5M2ZiMDZhOGUxNWI2Lz9hPTEzJmJyPTk3NSZidD0zMjUmY3I9MCZjcz0wJmRyPTAmZHM9MiZlcj0wJmw9MjAyMDA1MTYxNjQ3MTgwMTAwMTQwNDgxMzAwM0YyNERCRCZscj1kZWZhdWx0JnFzPTAmcmM9TXpOa1pEZHNOR1p5ZERNelpEY3pNMEFwT21sbFpEcG9OR1ZwTnp4a05EWnBOMmRwTGw5d2FHb3liWE5mTFMxZkxTOXpjekExTUM5ZU1EWTFOREJqWVM0dUxpODZZdyUzRCUzRCZ2bD0mdnI9","backup_url_1":"aHR0cDovL3YyNy10dC5peGlndWEuY29tLzRkMTdjZjYyMjM1ZGM0ODI3ZTUyYjU0ODUxZDNlY2RjLzVlYmZiNmQ1L3ZpZGVvL24vdG9zZWRnZS10b3MtYWdzeS12ZS0wMDAwL2M0ZTJkMDY0NjZiODQyZjg5OGM5M2ZiMDZhOGUxNWI2Lz9hPTEzJmJyPTk3NSZidD0zMjUmY3I9MCZjcz0wJmRyPTAmZHM9MiZlcj0wJmw9MjAyMDA1MTYxNjQ3MTgwMTAwMTQwNDgxMzAwM0YyNERCRCZscj1kZWZhdWx0JnFzPTAmcmM9TXpOa1pEZHNOR1p5ZERNelpEY3pNMEFwT21sbFpEcG9OR1ZwTnp4a05EWnBOMmRwTGw5d2FHb3liWE5mTFMxZkxTOXpjekExTUM5ZU1EWTFOREJqWVM0dUxpODZZdyUzRCUzRCZ2bD0mdnI9","url_expire":1589622485,"preload_size":327680,"preload_interval":45,"preload_min_step":5,"preload_max_step":10,"file_hash":"698606f51168c6fe712e95d7adab178c","file_id":"42f13111ad9f43f7b819e37aa2b3f873","p2p_verify_url":"aHR0cDovL3YyNi10dC5peGlndWEuY29tLzU3YWRmYjRlNGM2Yzg5MTRlMGYyZjYyODA5ZTc1NDQ4LzVlYmZiNmQ1L3ZpZGVvL24vdG9zZWRnZS10b3MtYWdzeS12ZS0wMDAwLzM2ZGE1NTQ0ZGY5ZDQxYzE4ZGI3OTBiMWQ1ZTcxYjdjLw==","encrypt":false}}}
     * video_proportion_article : 1.738888888888889
     * video_style : 12
     * video_user_like : 0
     */
    @SerializedName("abstract")
    var abstractX: String? = null

    @SerializedName("action_extra")
    var actionExtra: ActionExtra? = null

    @SerializedName("aggr_type")
    var aggrType = 0

    @SerializedName("allow_download")
    var isAllowDownload = false

    @SerializedName("article_sub_type")
    var articleSubType = 0

    @SerializedName("article_type")
    var articleType = 0

    @SerializedName("article_url")
    var articleUrl: String? = null

    @SerializedName("ban_comment")
    var banComment = 0

    //public int getBanDanmaku() { return banDanmaku;}
    //public void setBanDanmaku(int banDanmaku) { this.banDanmaku = banDanmaku;}
    //@SerializedName("ban_danmaku")
    //private int banDanmaku;
    @SerializedName("ban_danmaku_send")
    var banDanmakuSend = 0

    @SerializedName("ban_immersive")
    var banImmersive = 0

    @SerializedName("behot_time")
    var behotTime = 0

    @SerializedName("bury_count")
    var buryCount = 0

    @SerializedName("can_comment_level")
    var canCommentLevel = 0

    @SerializedName("cell_flag")
    var cellFlag = 0

    @SerializedName("cell_layout_style")
    var cellLayoutStyle = 0

    @SerializedName("cell_type")
    var cellType = 0

    @SerializedName("comment_count")
    var commentCount = 0

    @SerializedName("composition")
    var composition = 0

    @SerializedName("content_decoration")
    var contentDecoration: String? = null

    @SerializedName("cursor")
    var cursor: Long = 0

    @SerializedName("danmaku_count")
    var danmakuCount = 0

    @SerializedName("data_type")
    var dataType = 0

    @SerializedName("default_danmaku")
    var defaultDanmaku = 0

    @SerializedName("digg_count")
    var diggCount = 0

    @SerializedName("display_url")
    var displayUrl: String? = null

    @SerializedName("followers_count")
    var followersCount = 0

    @SerializedName("forward_info")
    var forwardInfo: ForwardInfo? = null

    @SerializedName("group_flags")
    var groupFlags = 0

    @SerializedName("group_id")
    var groupId: Long = 0

    @SerializedName("group_source")
    var groupSource = 0

    @SerializedName("has_m3u8_video")
    var isHasM3u8Video = false

    @SerializedName("has_mp4_video")
    var hasMp4Video = 0

    @SerializedName("has_video")
    var isHasVideo = false

    @SerializedName("hot")
    var hot = 0

    @SerializedName("id")
    var id: Long = 0

    @SerializedName("ignore_web_transform")
    var ignoreWebTransform = 0

    @SerializedName("impression_count")
    var impressionCount = 0

    @SerializedName("interaction_data")
    var interactionData: String? = null

    @SerializedName("is_original")
    var isIsOriginal = false
        private set

    @SerializedName("is_subject")
    var isIsSubject = false
        private set

    @SerializedName("is_subscribe")
    var isIsSubscribe = false
        private set

    @SerializedName("item_id")
    var itemId: Long = 0

    @SerializedName("item_version")
    var itemVersion = 0

    @SerializedName("level")
    var level = 0

    @SerializedName("log_pb")
    var logPb: LogPb? = null

    @SerializedName("lynx_server")
    var lynxServer: Any? = null

    @SerializedName("media_info")
    var mediaInfo: MediaInfo? = null

    @SerializedName("media_name")
    var mediaName: String? = null

    @SerializedName("middle_image")
    var middleImage: MiddleImage? = null

    @SerializedName("need_client_impr_recycle")
    var needClientImprRecycle = 0

    @SerializedName("play_auth_token")
    var playAuthToken: String? = null

    @SerializedName("play_biz_token")
    var playBizToken: String? = null

    @SerializedName("pread_params")
    var preadParams: PreadParams? = null

    @SerializedName("publish_time")
    var publishTime = 0

    @SerializedName("read_count")
    var readCount = 0

    @SerializedName("repin_count")
    var repinCount = 0

    @SerializedName("req_id")
    var reqId: String? = null

    @SerializedName("rid")
    var rid: String? = null

    @SerializedName("share_count")
    var shareCount = 0

    @SerializedName("share_info")
    var shareInfo: ShareInfo? = null

    @SerializedName("share_type")
    var shareType = 0

    @SerializedName("share_url")
    var shareUrl: String? = null

    @SerializedName("show_dislike")
    var isShowDislike = false

    @SerializedName("show_portrait")
    var isShowPortrait = false

    @SerializedName("show_portrait_article")
    var isShowPortraitArticle = false

    @SerializedName("small_image")
    var smallImage: Any? = null

    @SerializedName("source")
    var source: String? = null

    @SerializedName("source_icon_style")
    var sourceIconStyle = 0

    @SerializedName("source_open_url")
    var sourceOpenUrl: String? = null

    @SerializedName("tag")
    var tag: String? = null

    @SerializedName("tip")
    var tip = 0

    @SerializedName("title")
    var title: String? = null

    @SerializedName("ugc_recommend")
    var ugcRecommend: UgcRecommend? = null

    @SerializedName("url")
    var url: String? = null

    @SerializedName("user_info")
    var userInfo: UserInfo? = null

    @SerializedName("user_repin")
    var userRepin = 0

    @SerializedName("user_verified")
    var userVerified = 0

    @SerializedName("verified_content")
    var verifiedContent: String? = null

    @SerializedName("verify_reason")
    var verifyReason: String? = null

    @SerializedName("verify_status")
    var verifyStatus = 0

    @SerializedName("video_detail_info")
    var videoDetailInfo: VideoDetailInfo? = null

    @SerializedName("video_duration")
    var videoDuration = 0

    @SerializedName("video_id")
    var videoId: String? = null

    @SerializedName("video_like_count")
    var videoLikeCount = 0

    @SerializedName("video_play_info")
    var videoPlayInfo: VideoPlayInfo? = null

    @SerializedName("video_proportion_article")
    var videoProportionArticle = 0.0

    @SerializedName("video_style")
    var videoStyle = 0

    @SerializedName("video_user_like")
    var videoUserLike = 0

    @SerializedName("action_list")
    var actionList: List<ActionList>? = null

    @SerializedName("categories")
    var categories: List<String>? = null

    @SerializedName("filter_words")
    var filterWords: List<FilterWords>? = null

    @SerializedName("large_image_list")
    var largeImageList: List<LargeImageList>? = null

    fun setIsOriginal(isOriginal: Boolean) {
        isIsOriginal = isOriginal
    }

    fun setIsSubject(isSubject: Boolean) {
        isIsSubject = isSubject
    }

    fun setIsSubscribe(isSubscribe: Boolean) {
        isIsSubscribe = isSubscribe
    }

    class ActionExtra {
        /**
         * channel_id : 3431225546
         */
        @SerializedName("channel_id")
        var channelId: Long = 0

    }

    class ForwardInfo {
        /**
         * forward_count : 0
         */
        @SerializedName("forward_count")
        var forwardCount = 0

    }

    class LogPb {
        /**
         * author_id : 3966676636019549
         * category_name : video
         * enter_from : click_category
         * group_id : 6827330514471354894
         * group_source : 2
         * impr_id : 2020051616471801001404813003F24DBD
         * impr_type : __channel__
         * is_following : 0
         */
        @SerializedName("author_id")
        var authorId: String? = null

        @SerializedName("category_name")
        var categoryName: String? = null

        @SerializedName("enter_from")
        var enterFrom: String? = null

        @SerializedName("group_id")
        var groupId: String? = null

        @SerializedName("group_source")
        var groupSource: String? = null

        @SerializedName("impr_id")
        var imprId: String? = null

        @SerializedName("impr_type")
        var imprType: String? = null

        @SerializedName("is_following")
        var isFollowing: String? = null

    }

    class MediaInfo {
        /**
         * avatar_url : http://p6-tt-ipv6.byteimg.com/img/pgc-image/e9acbf4ecb7b4c84b790c5a6c7cb8267~tplv-resize:120
         * :120.webp?from=xigua
         * media_id : 1666749920870403
         * name : 南北资讯站
         * subcribed : 0
         * subscribed : 0
         * user_id : 3966676636019549
         * user_verified : false
         * verified_content :
         */
        @SerializedName("avatar_url")
        var avatarUrl: String? = null

        @SerializedName("media_id")
        var mediaId: Long = 0

        @SerializedName("name")
        var name: String? = null

        @SerializedName("subcribed")
        var subcribed = 0

        @SerializedName("subscribed")
        var subscribed = 0

        @SerializedName("user_id")
        var userId: Long = 0

        @SerializedName("user_verified")
        var isUserVerified = false

        @SerializedName("verified_content")
        var verifiedContent: String? = null

    }

    class MiddleImage {
        /**
         * height : 324
         * uri : img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_576x324.webp
         * url : http://p26-tt.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_576x324.webp
         * url_list : [{"url":"http://p26-tt.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be
         * ~c5_q75_576x324.webp"},{"url":"http://p26-tt.byteimg
         * .com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_576x324.webp"},{"url":"http://p26-tt
         * .byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_576x324.webp"}]
         * width : 576
         */
        @SerializedName("height")
        var height = 0

        @SerializedName("uri")
        var uri: String? = null

        @SerializedName("url")
        var url: String? = null

        @SerializedName("width")
        var width = 0

        @SerializedName("url_list")
        var urlList: List<UrlList>? = null

        class UrlList {
            /**
             * url : http://p26-tt.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_576x324.webp
             */
            @SerializedName("url")
            var url: String? = null

        }
    }

    class PreadParams {
        /**
         * group_id : 6827330514471354894
         * item_id : 6827330514471354894
         * media_id : 1666749920870403
         * channel_id : 3431225546
         * category_tag : video_domestic
         * from_category : video
         * is_gov_article : false
         * display_flags : 0
         * review_comment_mode : 0
         * group_source : 2
         * categories : ["video_domestic/other","video_domestic","video_movie"]
         * video_duration : 46
         * rec_quality : 0
         */
        @SerializedName("group_id")
        var groupId: Long = 0

        @SerializedName("item_id")
        var itemId: Long = 0

        @SerializedName("media_id")
        var mediaId: Long = 0

        @SerializedName("channel_id")
        var channelId: Long = 0

        @SerializedName("category_tag")
        var categoryTag: String? = null

        @SerializedName("from_category")
        var fromCategory: String? = null

        @SerializedName("is_gov_article")
        var isIsGovArticle = false
            private set

        @SerializedName("display_flags")
        var displayFlags: Long = 0

        @SerializedName("review_comment_mode")
        var reviewCommentMode = 0

        @SerializedName("group_source")
        var groupSource = 0

        @SerializedName("video_duration")
        var videoDuration = 0

        @SerializedName("rec_quality")
        var recQuality = 0

        @SerializedName("categories")
        var categories: List<String>? = null

        fun setIsGovArticle(isGovArticle: Boolean) {
            isIsGovArticle = isGovArticle
        }

    }

    class ShareInfo {
        /**
         * cover_image : null
         * description : null
         * hidden_url : null
         * on_suppress : 0
         * share_control : {"image":"false","video":"false"}
         * share_type : {"pyq":0,"qq":0,"qzone":0,"wx":0}
         * share_url : https://m.toutiaoimg.cn/a6827330514471354894/?app=news_article&is_hit_share_recommend=0
         * title : 一群人站棺材旁正为亲人举办葬礼 接下来发生诡异一幕 - 今日头条
         * token_type : 1
         * video_url :
         * weixin_cover_image : null
         */
        @SerializedName("cover_image")
        var coverImage: Any? = null

        @SerializedName("description")
        var description: Any? = null

        @SerializedName("hidden_url")
        var hiddenUrl: Any? = null

        @SerializedName("on_suppress")
        var onSuppress = 0

        @SerializedName("share_control")
        var shareControl: ShareControl? = null

        @SerializedName("share_type")
        var shareType: ShareType? = null

        @SerializedName("share_url")
        var shareUrl: String? = null

        @SerializedName("title")
        var title: String? = null

        @SerializedName("token_type")
        var tokenType = 0

        @SerializedName("video_url")
        var videoUrl: String? = null

        @SerializedName("weixin_cover_image")
        var weixinCoverImage: Any? = null

        class ShareControl {
            /**
             * image : false
             * video : false
             */
            @SerializedName("image")
            var image: String? = null

            @SerializedName("video")
            var video: String? = null

        }

        class ShareType {
            /**
             * pyq : 0
             * qq : 0
             * qzone : 0
             * wx : 0
             */
            @SerializedName("pyq")
            var pyq = 0

            @SerializedName("qq")
            var qq = 0

            @SerializedName("qzone")
            var qzone = 0

            @SerializedName("wx")
            var wx = 0

        }
    }

    class UgcRecommend {
        /**
         * activity :
         * reason :
         */
        @SerializedName("activity")
        var activity: String? = null

        @SerializedName("reason")
        var reason: String? = null

    }

    class UserInfo {
        /**
         * avatar_url : http://p6-tt-ipv6.byteimg.com/img/pgc-image/e9acbf4ecb7b4c84b790c5a6c7cb8267~tplv-resize:120
         * :120.webp?from=xigua
         * description : 南北资讯站，看南来北往的资讯
         * follow : false
         * follower_count : 0
         * is_blocked : false
         * is_blocking : false
         * is_discipulus : false
         * is_living : false
         * name : 南北资讯站
         * schema : sslocal://profile?uid=3966676636019549&refer=video
         * sec_user_id : MS4wLjABAAAAleuAkFmwNq1D-XfnFZBzP-CHYW9ivuIzgcvol02IPAXmXNrgIhAoXnSlpvEz1q_8
         * user_id : 3966676636019549
         * user_verified : false
         * verified_content :
         */
        @SerializedName("avatar_url")
        var avatarUrl: String? = null

        @SerializedName("description")
        var description: String? = null

        @SerializedName("follow")
        var isFollow = false

        @SerializedName("follower_count")
        var followerCount = 0

        @SerializedName("is_blocked")
        var isIsBlocked = false
            private set

        @SerializedName("is_blocking")
        var isIsBlocking = false
            private set

        @SerializedName("is_discipulus")
        var isIsDiscipulus = false
            private set

        @SerializedName("is_living")
        var isIsLiving = false
            private set

        @SerializedName("name")
        var name: String? = null

        @SerializedName("schema")
        var schema: String? = null

        @SerializedName("sec_user_id")
        var secUserId: String? = null

        @SerializedName("user_id")
        var userId: Long = 0

        @SerializedName("user_verified")
        var isUserVerified = false

        @SerializedName("verified_content")
        var verifiedContent: String? = null

        fun setIsBlocked(isBlocked: Boolean) {
            isIsBlocked = isBlocked
        }

        fun setIsBlocking(isBlocking: Boolean) {
            isIsBlocking = isBlocking
        }

        fun setIsDiscipulus(isDiscipulus: Boolean) {
            isIsDiscipulus = isDiscipulus
        }

        fun setIsLiving(isLiving: Boolean) {
            isIsLiving = isLiving
        }

    }

    class VideoDetailInfo {
        /**
         * detail_video_large_image : {"height":326,"uri":"video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be",
         * "url":"http://p8.pstatp.com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be","url_list":[{"url
         * ":"http://p8.pstatp.com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be"},{"url":"http://pb3
         * .pstatp.com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be"},{"url":"http://pb3.pstatp
         * .com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be"}],"width":580}
         * direct_play : 1
         * group_flags : 32832
         * last_play_duration : 0
         * show_pgc_subscribe : 1
         * use_last_duration : false
         * video_id : v02004ba0000bqvopc51mik4saba10l0
         * video_preloading_flag : 1
         * video_type : 0
         * video_watch_count : 0
         */
        @SerializedName("detail_video_large_image")
        var detailVideoLargeImage: DetailVideoLargeImage? = null

        @SerializedName("direct_play")
        var directPlay = 0

        @SerializedName("group_flags")
        var groupFlags = 0

        @SerializedName("last_play_duration")
        var lastPlayDuration = 0

        @SerializedName("show_pgc_subscribe")
        var showPgcSubscribe = 0

        @SerializedName("use_last_duration")
        var isUseLastDuration = false

        @SerializedName("video_id")
        var videoId: String? = null

        @SerializedName("video_preloading_flag")
        var videoPreloadingFlag = 0

        @SerializedName("video_type")
        var videoType = 0

        @SerializedName("video_watch_count")
        var videoWatchCount = 0

        class DetailVideoLargeImage {
            /**
             * height : 326
             * uri : video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be
             * url : http://p8.pstatp.com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be
             * url_list : [{"url":"http://p8.pstatp.com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be"},{
             * "url":"http://pb3.pstatp.com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be"},{"url":"http
             * ://pb3.pstatp.com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be"}]
             * width : 580
             */
            @SerializedName("height")
            var height = 0

            @SerializedName("uri")
            var uri: String? = null

            @SerializedName("url")
            var url: String? = null

            @SerializedName("width")
            var width = 0

            @SerializedName("url_list")
            var urlList: List<UrlListX>? = null

            class UrlListX {
                /**
                 * url : http://p8.pstatp.com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be
                 */
                @SerializedName("url")
                var url: String? = null

            }
        }
    }

    class VideoPlayInfo {
        /**
         * status : 10
         * message : success
         * enable_ssl : true
         * video_id : v02004ba0000bqvopc51mik4saba10l0
         * video_duration : 46.042
         * media_type : video
         * big_thumbs : [{"img_num":46,"uri":"30917000335262f143bfa","img_url":"http://p3.pstatp
         * .com/origin/30917000335262f143bfa","img_x_size":236,"img_y_size":136,"img_x_len":10,"img_y_len":5,
         * "duration":46.041667,"interval":1,"fext":"jpg"}]
         * fallback_api : https://vas-lf-x.snssdk
         * .com/video/fplay/1/b13293b46a1f4a3d1ebbba1b8210a847/v02004ba0000bqvopc51mik4saba10l0?aid=13\u0026key_seed
         * =raPC%2FhzgyOTWmJMosNYC%2BBApROQiBc8Q8oWjc%2FuqNrw%3D\u0026logo_type=default\u0026ptoken=pgc_1080p
         * \u0026stream_type=normal
         * key_seed : raPC/hzgyOTWmJMosNYC+BApROQiBc8Q8oWjc/uqNrw=
         * video_list : {"video_1":{"definition":"360p","quality":"normal","vtype":"mp4","vwidth":626,"vheight":360,
         * "bitrate":318177,"codec_type":"h264","size":1831191,
         * "main_url
         * ":"aHR0cDovL3YyNi10dC5peGlndWEuY29tL2IwMzk0OTFmYjFkYTBhNjYxYTFkOTQ0N2RkZjI2MjE4LzVlYmZiNmQ1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC9hMGIzZjYwOTFhMzY0ZGZmODE2ZGE3ZTMwMzY3YjZmOC8/YT0xMyZicj05MzAmYnQ9MzEwJmNyPTAmY3M9MCZkcj0wJmRzPTEmZXI9MCZsPTIwMjAwNTE2MTY0NzE4MDEwMDE0MDQ4MTMwMDNGMjREQkQmbHI9ZGVmYXVsdCZxcz0wJnJjPU16TmtaRGRzTkdaeWRETXpaRGN6TTBBcFpUa3pORE5vTXp4bE4yZzVhV1pvTkdkcExsOXdhR295YlhOZkxTMWZMUzl6Y3pSZ05pNHdZREV4WHpVMkxURXVNeTQ2WXclM0QlM0Qmdmw9JnZyPQ==","backup_url_1":"aHR0cDovL3YyNy10dC5peGlndWEuY29tLzQ1NTgyYjBmNGIxOTE1NmZiOTM0MTVhZTEwNjRkZjJlLzVlYmZiNmQ1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC9hMGIzZjYwOTFhMzY0ZGZmODE2ZGE3ZTMwMzY3YjZmOC8/YT0xMyZicj05MzAmYnQ9MzEwJmNyPTAmY3M9MCZkcj0wJmRzPTEmZXI9MCZsPTIwMjAwNTE2MTY0NzE4MDEwMDE0MDQ4MTMwMDNGMjREQkQmbHI9ZGVmYXVsdCZxcz0wJnJjPU16TmtaRGRzTkdaeWRETXpaRGN6TTBBcFpUa3pORE5vTXp4bE4yZzVhV1pvTkdkcExsOXdhR295YlhOZkxTMWZMUzl6Y3pSZ05pNHdZREV4WHpVMkxURXVNeTQ2WXclM0QlM0Qmdmw9JnZyPQ==","url_expire":1589622485,"preload_size":327680,"preload_interval":45,"preload_min_step":5,"preload_max_step":10,"file_hash":"aa1c712641c71e1ad83a477ff6300a8f","file_id":"11e6c1f460e948bb9404ec0311096cb7","p2p_verify_url":"aHR0cDovL3YyNi10dC5peGlndWEuY29tL2Y1MDU0MTk3YzAxYzY0NmQ3MTU2OGI1N2VjZWY2YjhiLzVlYmZiNmQ1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC8xNjNkNmU1OTY3Y2M0OTI4OTExY2QzYjc4MTA0OTEzYi8=","encrypt":false},"video_2":{"definition":"480p","quality":"normal","vtype":"mp4","vwidth":640,"vheight":368,"bitrate":332990,"codec_type":"h264","size":1916441,"main_url":"aHR0cDovL3YyNi10dC5peGlndWEuY29tLzE4NmJjNDhlZGY2YTVkOGFmNGZlOTY5ZTcyY2FjYzI0LzVlYmZiNmQ1L3ZpZGVvL24vdG9zZWRnZS10b3MtYWdzeS12ZS0wMDAwL2M0ZTJkMDY0NjZiODQyZjg5OGM5M2ZiMDZhOGUxNWI2Lz9hPTEzJmJyPTk3NSZidD0zMjUmY3I9MCZjcz0wJmRyPTAmZHM9MiZlcj0wJmw9MjAyMDA1MTYxNjQ3MTgwMTAwMTQwNDgxMzAwM0YyNERCRCZscj1kZWZhdWx0JnFzPTAmcmM9TXpOa1pEZHNOR1p5ZERNelpEY3pNMEFwT21sbFpEcG9OR1ZwTnp4a05EWnBOMmRwTGw5d2FHb3liWE5mTFMxZkxTOXpjekExTUM5ZU1EWTFOREJqWVM0dUxpODZZdyUzRCUzRCZ2bD0mdnI9","backup_url_1":"aHR0cDovL3YyNy10dC5peGlndWEuY29tLzRkMTdjZjYyMjM1ZGM0ODI3ZTUyYjU0ODUxZDNlY2RjLzVlYmZiNmQ1L3ZpZGVvL24vdG9zZWRnZS10b3MtYWdzeS12ZS0wMDAwL2M0ZTJkMDY0NjZiODQyZjg5OGM5M2ZiMDZhOGUxNWI2Lz9hPTEzJmJyPTk3NSZidD0zMjUmY3I9MCZjcz0wJmRyPTAmZHM9MiZlcj0wJmw9MjAyMDA1MTYxNjQ3MTgwMTAwMTQwNDgxMzAwM0YyNERCRCZscj1kZWZhdWx0JnFzPTAmcmM9TXpOa1pEZHNOR1p5ZERNelpEY3pNMEFwT21sbFpEcG9OR1ZwTnp4a05EWnBOMmRwTGw5d2FHb3liWE5mTFMxZkxTOXpjekExTUM5ZU1EWTFOREJqWVM0dUxpODZZdyUzRCUzRCZ2bD0mdnI9","url_expire":1589622485,"preload_size":327680,"preload_interval":45,"preload_min_step":5,"preload_max_step":10,"file_hash":"698606f51168c6fe712e95d7adab178c","file_id":"42f13111ad9f43f7b819e37aa2b3f873","p2p_verify_url":"aHR0cDovL3YyNi10dC5peGlndWEuY29tLzU3YWRmYjRlNGM2Yzg5MTRlMGYyZjYyODA5ZTc1NDQ4LzVlYmZiNmQ1L3ZpZGVvL24vdG9zZWRnZS10b3MtYWdzeS12ZS0wMDAwLzM2ZGE1NTQ0ZGY5ZDQxYzE4ZGI3OTBiMWQ1ZTcxYjdjLw==","encrypt":false}}
         */
        @SerializedName("status")
        var status = 0

        @SerializedName("message")
        var message: String? = null

        @SerializedName("enable_ssl")
        var isEnableSsl = false

        @SerializedName("video_id")
        var videoId: String? = null

        @SerializedName("video_duration")
        var videoDuration = 0.0

        @SerializedName("media_type")
        var mediaType: String? = null

        @SerializedName("fallback_api")
        var fallbackApi: String? = null

        @SerializedName("key_seed")
        var keySeed: String? = null

        @SerializedName("video_list")
        var videoList: VideoList? = null

        @SerializedName("big_thumbs")
        var bigThumbs: List<BigThumbs>? = null

        class VideoList {
            /**
             * video_1 : {"definition":"360p","quality":"normal","vtype":"mp4","vwidth":626,"vheight":360,
             * "bitrate":318177,"codec_type":"h264","size":1831191,
             * "main_url
             * ":"aHR0cDovL3YyNi10dC5peGlndWEuY29tL2IwMzk0OTFmYjFkYTBhNjYxYTFkOTQ0N2RkZjI2MjE4LzVlYmZiNmQ1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC9hMGIzZjYwOTFhMzY0ZGZmODE2ZGE3ZTMwMzY3YjZmOC8/YT0xMyZicj05MzAmYnQ9MzEwJmNyPTAmY3M9MCZkcj0wJmRzPTEmZXI9MCZsPTIwMjAwNTE2MTY0NzE4MDEwMDE0MDQ4MTMwMDNGMjREQkQmbHI9ZGVmYXVsdCZxcz0wJnJjPU16TmtaRGRzTkdaeWRETXpaRGN6TTBBcFpUa3pORE5vTXp4bE4yZzVhV1pvTkdkcExsOXdhR295YlhOZkxTMWZMUzl6Y3pSZ05pNHdZREV4WHpVMkxURXVNeTQ2WXclM0QlM0Qmdmw9JnZyPQ==","backup_url_1":"aHR0cDovL3YyNy10dC5peGlndWEuY29tLzQ1NTgyYjBmNGIxOTE1NmZiOTM0MTVhZTEwNjRkZjJlLzVlYmZiNmQ1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC9hMGIzZjYwOTFhMzY0ZGZmODE2ZGE3ZTMwMzY3YjZmOC8/YT0xMyZicj05MzAmYnQ9MzEwJmNyPTAmY3M9MCZkcj0wJmRzPTEmZXI9MCZsPTIwMjAwNTE2MTY0NzE4MDEwMDE0MDQ4MTMwMDNGMjREQkQmbHI9ZGVmYXVsdCZxcz0wJnJjPU16TmtaRGRzTkdaeWRETXpaRGN6TTBBcFpUa3pORE5vTXp4bE4yZzVhV1pvTkdkcExsOXdhR295YlhOZkxTMWZMUzl6Y3pSZ05pNHdZREV4WHpVMkxURXVNeTQ2WXclM0QlM0Qmdmw9JnZyPQ==","url_expire":1589622485,"preload_size":327680,"preload_interval":45,"preload_min_step":5,"preload_max_step":10,"file_hash":"aa1c712641c71e1ad83a477ff6300a8f","file_id":"11e6c1f460e948bb9404ec0311096cb7","p2p_verify_url":"aHR0cDovL3YyNi10dC5peGlndWEuY29tL2Y1MDU0MTk3YzAxYzY0NmQ3MTU2OGI1N2VjZWY2YjhiLzVlYmZiNmQ1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC8xNjNkNmU1OTY3Y2M0OTI4OTExY2QzYjc4MTA0OTEzYi8=","encrypt":false}
             * video_2 : {"definition":"480p","quality":"normal","vtype":"mp4","vwidth":640,"vheight":368,
             * "bitrate":332990,"codec_type":"h264","size":1916441,
             * "main_url
             * ":"aHR0cDovL3YyNi10dC5peGlndWEuY29tLzE4NmJjNDhlZGY2YTVkOGFmNGZlOTY5ZTcyY2FjYzI0LzVlYmZiNmQ1L3ZpZGVvL24vdG9zZWRnZS10b3MtYWdzeS12ZS0wMDAwL2M0ZTJkMDY0NjZiODQyZjg5OGM5M2ZiMDZhOGUxNWI2Lz9hPTEzJmJyPTk3NSZidD0zMjUmY3I9MCZjcz0wJmRyPTAmZHM9MiZlcj0wJmw9MjAyMDA1MTYxNjQ3MTgwMTAwMTQwNDgxMzAwM0YyNERCRCZscj1kZWZhdWx0JnFzPTAmcmM9TXpOa1pEZHNOR1p5ZERNelpEY3pNMEFwT21sbFpEcG9OR1ZwTnp4a05EWnBOMmRwTGw5d2FHb3liWE5mTFMxZkxTOXpjekExTUM5ZU1EWTFOREJqWVM0dUxpODZZdyUzRCUzRCZ2bD0mdnI9","backup_url_1":"aHR0cDovL3YyNy10dC5peGlndWEuY29tLzRkMTdjZjYyMjM1ZGM0ODI3ZTUyYjU0ODUxZDNlY2RjLzVlYmZiNmQ1L3ZpZGVvL24vdG9zZWRnZS10b3MtYWdzeS12ZS0wMDAwL2M0ZTJkMDY0NjZiODQyZjg5OGM5M2ZiMDZhOGUxNWI2Lz9hPTEzJmJyPTk3NSZidD0zMjUmY3I9MCZjcz0wJmRyPTAmZHM9MiZlcj0wJmw9MjAyMDA1MTYxNjQ3MTgwMTAwMTQwNDgxMzAwM0YyNERCRCZscj1kZWZhdWx0JnFzPTAmcmM9TXpOa1pEZHNOR1p5ZERNelpEY3pNMEFwT21sbFpEcG9OR1ZwTnp4a05EWnBOMmRwTGw5d2FHb3liWE5mTFMxZkxTOXpjekExTUM5ZU1EWTFOREJqWVM0dUxpODZZdyUzRCUzRCZ2bD0mdnI9","url_expire":1589622485,"preload_size":327680,"preload_interval":45,"preload_min_step":5,"preload_max_step":10,"file_hash":"698606f51168c6fe712e95d7adab178c","file_id":"42f13111ad9f43f7b819e37aa2b3f873","p2p_verify_url":"aHR0cDovL3YyNi10dC5peGlndWEuY29tLzU3YWRmYjRlNGM2Yzg5MTRlMGYyZjYyODA5ZTc1NDQ4LzVlYmZiNmQ1L3ZpZGVvL24vdG9zZWRnZS10b3MtYWdzeS12ZS0wMDAwLzM2ZGE1NTQ0ZGY5ZDQxYzE4ZGI3OTBiMWQ1ZTcxYjdjLw==","encrypt":false}
             */
            @SerializedName("video_1")
            var video1: Video1? = null

            @SerializedName("video_2")
            var video2: Video2? = null

            class Video1 {
                /**
                 * definition : 360p
                 * quality : normal
                 * vtype : mp4
                 * vwidth : 626
                 * vheight : 360
                 * bitrate : 318177
                 * codec_type : h264
                 * size : 1831191
                 * main_url :
                 * aHR0cDovL3YyNi10dC5peGlndWEuY29tL2IwMzk0OTFmYjFkYTBhNjYxYTFkOTQ0N2RkZjI2MjE4LzVlYmZiNmQ1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC9hMGIzZjYwOTFhMzY0ZGZmODE2ZGE3ZTMwMzY3YjZmOC8/YT0xMyZicj05MzAmYnQ9MzEwJmNyPTAmY3M9MCZkcj0wJmRzPTEmZXI9MCZsPTIwMjAwNTE2MTY0NzE4MDEwMDE0MDQ4MTMwMDNGMjREQkQmbHI9ZGVmYXVsdCZxcz0wJnJjPU16TmtaRGRzTkdaeWRETXpaRGN6TTBBcFpUa3pORE5vTXp4bE4yZzVhV1pvTkdkcExsOXdhR295YlhOZkxTMWZMUzl6Y3pSZ05pNHdZREV4WHpVMkxURXVNeTQ2WXclM0QlM0Qmdmw9JnZyPQ==
                 * backup_url_1 :
                 * aHR0cDovL3YyNy10dC5peGlndWEuY29tLzQ1NTgyYjBmNGIxOTE1NmZiOTM0MTVhZTEwNjRkZjJlLzVlYmZiNmQ1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC9hMGIzZjYwOTFhMzY0ZGZmODE2ZGE3ZTMwMzY3YjZmOC8/YT0xMyZicj05MzAmYnQ9MzEwJmNyPTAmY3M9MCZkcj0wJmRzPTEmZXI9MCZsPTIwMjAwNTE2MTY0NzE4MDEwMDE0MDQ4MTMwMDNGMjREQkQmbHI9ZGVmYXVsdCZxcz0wJnJjPU16TmtaRGRzTkdaeWRETXpaRGN6TTBBcFpUa3pORE5vTXp4bE4yZzVhV1pvTkdkcExsOXdhR295YlhOZkxTMWZMUzl6Y3pSZ05pNHdZREV4WHpVMkxURXVNeTQ2WXclM0QlM0Qmdmw9JnZyPQ==
                 * url_expire : 1589622485
                 * preload_size : 327680
                 * preload_interval : 45
                 * preload_min_step : 5
                 * preload_max_step : 10
                 * file_hash : aa1c712641c71e1ad83a477ff6300a8f
                 * file_id : 11e6c1f460e948bb9404ec0311096cb7
                 * p2p_verify_url :
                 * aHR0cDovL3YyNi10dC5peGlndWEuY29tL2Y1MDU0MTk3YzAxYzY0NmQ3MTU2OGI1N2VjZWY2YjhiLzVlYmZiNmQ1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC8xNjNkNmU1OTY3Y2M0OTI4OTExY2QzYjc4MTA0OTEzYi8=
                 * encrypt : false
                 */
                @SerializedName("definition")
                var definition: String? = null

                @SerializedName("quality")
                var quality: String? = null

                @SerializedName("vtype")
                var vtype: String? = null

                @SerializedName("vwidth")
                var vwidth = 0

                @SerializedName("vheight")
                var vheight = 0

                @SerializedName("bitrate")
                var bitrate = 0

                @SerializedName("codec_type")
                var codecType: String? = null

                @SerializedName("size")
                var size = 0

                @SerializedName("main_url")
                var mainUrl: String? = null

                @SerializedName("backup_url_1")
                var backupUrl1: String? = null

                @SerializedName("url_expire")
                var urlExpire = 0

                @SerializedName("preload_size")
                var preloadSize = 0

                @SerializedName("preload_interval")
                var preloadInterval = 0

                @SerializedName("preload_min_step")
                var preloadMinStep = 0

                @SerializedName("preload_max_step")
                var preloadMaxStep = 0

                @SerializedName("file_hash")
                var fileHash: String? = null

                @SerializedName("file_id")
                var fileId: String? = null

                @SerializedName("p2p_verify_url")
                var p2pVerifyUrl: String? = null

                @SerializedName("encrypt")
                var isEncrypt = false

            }

            class Video2 {
                /**
                 * definition : 480p
                 * quality : normal
                 * vtype : mp4
                 * vwidth : 640
                 * vheight : 368
                 * bitrate : 332990
                 * codec_type : h264
                 * size : 1916441
                 * main_url :
                 * aHR0cDovL3YyNi10dC5peGlndWEuY29tLzE4NmJjNDhlZGY2YTVkOGFmNGZlOTY5ZTcyY2FjYzI0LzVlYmZiNmQ1L3ZpZGVvL24vdG9zZWRnZS10b3MtYWdzeS12ZS0wMDAwL2M0ZTJkMDY0NjZiODQyZjg5OGM5M2ZiMDZhOGUxNWI2Lz9hPTEzJmJyPTk3NSZidD0zMjUmY3I9MCZjcz0wJmRyPTAmZHM9MiZlcj0wJmw9MjAyMDA1MTYxNjQ3MTgwMTAwMTQwNDgxMzAwM0YyNERCRCZscj1kZWZhdWx0JnFzPTAmcmM9TXpOa1pEZHNOR1p5ZERNelpEY3pNMEFwT21sbFpEcG9OR1ZwTnp4a05EWnBOMmRwTGw5d2FHb3liWE5mTFMxZkxTOXpjekExTUM5ZU1EWTFOREJqWVM0dUxpODZZdyUzRCUzRCZ2bD0mdnI9
                 * backup_url_1 :
                 * aHR0cDovL3YyNy10dC5peGlndWEuY29tLzRkMTdjZjYyMjM1ZGM0ODI3ZTUyYjU0ODUxZDNlY2RjLzVlYmZiNmQ1L3ZpZGVvL24vdG9zZWRnZS10b3MtYWdzeS12ZS0wMDAwL2M0ZTJkMDY0NjZiODQyZjg5OGM5M2ZiMDZhOGUxNWI2Lz9hPTEzJmJyPTk3NSZidD0zMjUmY3I9MCZjcz0wJmRyPTAmZHM9MiZlcj0wJmw9MjAyMDA1MTYxNjQ3MTgwMTAwMTQwNDgxMzAwM0YyNERCRCZscj1kZWZhdWx0JnFzPTAmcmM9TXpOa1pEZHNOR1p5ZERNelpEY3pNMEFwT21sbFpEcG9OR1ZwTnp4a05EWnBOMmRwTGw5d2FHb3liWE5mTFMxZkxTOXpjekExTUM5ZU1EWTFOREJqWVM0dUxpODZZdyUzRCUzRCZ2bD0mdnI9
                 * url_expire : 1589622485
                 * preload_size : 327680
                 * preload_interval : 45
                 * preload_min_step : 5
                 * preload_max_step : 10
                 * file_hash : 698606f51168c6fe712e95d7adab178c
                 * file_id : 42f13111ad9f43f7b819e37aa2b3f873
                 * p2p_verify_url : aHR0cDovL3YyNi10dC5peGlndWEuY29tLzU3YWRmYjRlNGM2Yzg5MTRlMGYyZjYyODA5ZTc1NDQ4LzVlYmZiNmQ1L3ZpZGVvL24vdG9zZWRnZS10b3MtYWdzeS12ZS0wMDAwLzM2ZGE1NTQ0ZGY5ZDQxYzE4ZGI3OTBiMWQ1ZTcxYjdjLw==
                 * encrypt : false
                 */
                @SerializedName("definition")
                var definition: String? = null

                @SerializedName("quality")
                var quality: String? = null

                @SerializedName("vtype")
                var vtype: String? = null

                @SerializedName("vwidth")
                var vwidth = 0

                @SerializedName("vheight")
                var vheight = 0

                @SerializedName("bitrate")
                var bitrate = 0

                @SerializedName("codec_type")
                var codecType: String? = null

                @SerializedName("size")
                var size = 0

                @SerializedName("main_url")
                var mainUrl: String? = null

                @SerializedName("backup_url_1")
                var backupUrl1: String? = null

                @SerializedName("url_expire")
                var urlExpire = 0

                @SerializedName("preload_size")
                var preloadSize = 0

                @SerializedName("preload_interval")
                var preloadInterval = 0

                @SerializedName("preload_min_step")
                var preloadMinStep = 0

                @SerializedName("preload_max_step")
                var preloadMaxStep = 0

                @SerializedName("file_hash")
                var fileHash: String? = null

                @SerializedName("file_id")
                var fileId: String? = null

                @SerializedName("p2p_verify_url")
                var p2pVerifyUrl: String? = null

                @SerializedName("encrypt")
                var isEncrypt = false

            }
        }

        class BigThumbs {
            /**
             * img_num : 46
             * uri : 30917000335262f143bfa
             * img_url : http://p3.pstatp.com/origin/30917000335262f143bfa
             * img_x_size : 236
             * img_y_size : 136
             * img_x_len : 10
             * img_y_len : 5
             * duration : 46.041667
             * interval : 1
             * fext : jpg
             */
            @SerializedName("img_num")
            var imgNum = 0

            @SerializedName("uri")
            var uri: String? = null

            @SerializedName("img_url")
            var imgUrl: String? = null

            @SerializedName("img_x_size")
            var imgXSize = 0

            @SerializedName("img_y_size")
            var imgYSize = 0

            @SerializedName("img_x_len")
            var imgXLen = 0

            @SerializedName("img_y_len")
            var imgYLen = 0

            @SerializedName("duration")
            var duration = 0.0

            @SerializedName("interval")
            var interval = 0

            @SerializedName("fext")
            var fext: String? = null

        }
    }

    class ActionList {
        /**
         * action : 1
         * desc :
         * extra : {}
         */
        @SerializedName("action")
        var action = 0

        @SerializedName("desc")
        var desc: String? = null

        @SerializedName("extra")
        var extra: Extra? = null

        class Extra
    }

    class FilterWords {
        /**
         * id : 8:0
         * is_selected : false
         * name : 看过了
         */
        @SerializedName("id")
        var id: String? = null

        @SerializedName("is_selected")
        var isIsSelected = false
            private set

        @SerializedName("name")
        var name: String? = null

        fun setIsSelected(isSelected: Boolean) {
            isIsSelected = isSelected
        }

    }

    class LargeImageList {
        /**
         * height : 486
         * uri : img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486.webp
         * url : http://p9-tt-ipv6.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486.webp
         * url_list : [{"url":"http://p9-tt-ipv6.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486.webp"},{"url":"http://p9-tt-ipv6.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486.webp"},{"url":"http://p9-tt-ipv6.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486.webp"}]
         * width : 864
         */
        @SerializedName("height")
        var height = 0

        @SerializedName("uri")
        var uri: String? = null

        @SerializedName("url")
        var url: String? = null

        @SerializedName("width")
        var width = 0

        @SerializedName("url_list")
        var urlList: List<UrlListXX>? = null

        class UrlListXX {
            /**
             * url : http://p9-tt-ipv6.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486.webp
             */
            @SerializedName("url")
            var url: String? = null

        }
    }
}