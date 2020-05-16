package mikasa.ackerman.ttd.host.video.pojo;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.SerializedName;
import mikasa.ackerman.ttd.host.pojo.FeedItem;

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
 * 2020/5/16 4:53 PM
 */
public class FeedVideoItem {
    public static class FeedVideoItemAdapter implements JsonDeserializer<FeedVideoItem>, JsonSerializer<FeedVideoItem> {
        public FeedVideoItemAdapter(Gson gson){
            this.mGson = gson;
        }
        private final Gson mGson ;
        @Override
        public FeedVideoItem deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
            return mGson.fromJson(((JsonObject)json).get("content").getAsString(), FeedVideoItem.class);
        }

        @Override
        public JsonElement serialize(FeedVideoItem src, Type typeOfSrc, JsonSerializationContext context) {
            return mGson.toJsonTree(src);
        }
    }

    /**
     * abstract : 一群人站棺材旁正为亲人举办葬礼 接下来发生诡异一幕
     * action_extra : {"channel_id": 3431225546}
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
     * .com/video/fplay/1/b13293b46a1f4a3d1ebbba1b8210a847/v02004ba0000bqvopc51mik4saba10l0?aid=13\u0026key_seed=raPC
     * %2FhzgyOTWmJMosNYC%2BBApROQiBc8Q8oWjc%2FuqNrw%3D\u0026logo_type=default\u0026ptoken=pgc_1080p\u0026stream_type
     * =normal","key_seed":"raPC/hzgyOTWmJMosNYC+BApROQiBc8Q8oWjc/uqNrw=","video_list":{"video_1":{"definition":"360p
     * ","quality":"normal","vtype":"mp4","vwidth":626,"vheight":360,"bitrate":318177,"codec_type":"h264",
     * "size":1831191,
     * "main_url
     * ":"aHR0cDovL3YyNi10dC5peGlndWEuY29tL2IwMzk0OTFmYjFkYTBhNjYxYTFkOTQ0N2RkZjI2MjE4LzVlYmZiNmQ1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC9hMGIzZjYwOTFhMzY0ZGZmODE2ZGE3ZTMwMzY3YjZmOC8/YT0xMyZicj05MzAmYnQ9MzEwJmNyPTAmY3M9MCZkcj0wJmRzPTEmZXI9MCZsPTIwMjAwNTE2MTY0NzE4MDEwMDE0MDQ4MTMwMDNGMjREQkQmbHI9ZGVmYXVsdCZxcz0wJnJjPU16TmtaRGRzTkdaeWRETXpaRGN6TTBBcFpUa3pORE5vTXp4bE4yZzVhV1pvTkdkcExsOXdhR295YlhOZkxTMWZMUzl6Y3pSZ05pNHdZREV4WHpVMkxURXVNeTQ2WXclM0QlM0Qmdmw9JnZyPQ==","backup_url_1":"aHR0cDovL3YyNy10dC5peGlndWEuY29tLzQ1NTgyYjBmNGIxOTE1NmZiOTM0MTVhZTEwNjRkZjJlLzVlYmZiNmQ1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC9hMGIzZjYwOTFhMzY0ZGZmODE2ZGE3ZTMwMzY3YjZmOC8/YT0xMyZicj05MzAmYnQ9MzEwJmNyPTAmY3M9MCZkcj0wJmRzPTEmZXI9MCZsPTIwMjAwNTE2MTY0NzE4MDEwMDE0MDQ4MTMwMDNGMjREQkQmbHI9ZGVmYXVsdCZxcz0wJnJjPU16TmtaRGRzTkdaeWRETXpaRGN6TTBBcFpUa3pORE5vTXp4bE4yZzVhV1pvTkdkcExsOXdhR295YlhOZkxTMWZMUzl6Y3pSZ05pNHdZREV4WHpVMkxURXVNeTQ2WXclM0QlM0Qmdmw9JnZyPQ==","url_expire":1589622485,"preload_size":327680,"preload_interval":45,"preload_min_step":5,"preload_max_step":10,"file_hash":"aa1c712641c71e1ad83a477ff6300a8f","file_id":"11e6c1f460e948bb9404ec0311096cb7","p2p_verify_url":"aHR0cDovL3YyNi10dC5peGlndWEuY29tL2Y1MDU0MTk3YzAxYzY0NmQ3MTU2OGI1N2VjZWY2YjhiLzVlYmZiNmQ1L3ZpZGVvL3Rvcy9jbi90b3MtY24tdmUtNC8xNjNkNmU1OTY3Y2M0OTI4OTExY2QzYjc4MTA0OTEzYi8=","encrypt":false},"video_2":{"definition":"480p","quality":"normal","vtype":"mp4","vwidth":640,"vheight":368,"bitrate":332990,"codec_type":"h264","size":1916441,"main_url":"aHR0cDovL3YyNi10dC5peGlndWEuY29tLzE4NmJjNDhlZGY2YTVkOGFmNGZlOTY5ZTcyY2FjYzI0LzVlYmZiNmQ1L3ZpZGVvL24vdG9zZWRnZS10b3MtYWdzeS12ZS0wMDAwL2M0ZTJkMDY0NjZiODQyZjg5OGM5M2ZiMDZhOGUxNWI2Lz9hPTEzJmJyPTk3NSZidD0zMjUmY3I9MCZjcz0wJmRyPTAmZHM9MiZlcj0wJmw9MjAyMDA1MTYxNjQ3MTgwMTAwMTQwNDgxMzAwM0YyNERCRCZscj1kZWZhdWx0JnFzPTAmcmM9TXpOa1pEZHNOR1p5ZERNelpEY3pNMEFwT21sbFpEcG9OR1ZwTnp4a05EWnBOMmRwTGw5d2FHb3liWE5mTFMxZkxTOXpjekExTUM5ZU1EWTFOREJqWVM0dUxpODZZdyUzRCUzRCZ2bD0mdnI9","backup_url_1":"aHR0cDovL3YyNy10dC5peGlndWEuY29tLzRkMTdjZjYyMjM1ZGM0ODI3ZTUyYjU0ODUxZDNlY2RjLzVlYmZiNmQ1L3ZpZGVvL24vdG9zZWRnZS10b3MtYWdzeS12ZS0wMDAwL2M0ZTJkMDY0NjZiODQyZjg5OGM5M2ZiMDZhOGUxNWI2Lz9hPTEzJmJyPTk3NSZidD0zMjUmY3I9MCZjcz0wJmRyPTAmZHM9MiZlcj0wJmw9MjAyMDA1MTYxNjQ3MTgwMTAwMTQwNDgxMzAwM0YyNERCRCZscj1kZWZhdWx0JnFzPTAmcmM9TXpOa1pEZHNOR1p5ZERNelpEY3pNMEFwT21sbFpEcG9OR1ZwTnp4a05EWnBOMmRwTGw5d2FHb3liWE5mTFMxZkxTOXpjekExTUM5ZU1EWTFOREJqWVM0dUxpODZZdyUzRCUzRCZ2bD0mdnI9","url_expire":1589622485,"preload_size":327680,"preload_interval":45,"preload_min_step":5,"preload_max_step":10,"file_hash":"698606f51168c6fe712e95d7adab178c","file_id":"42f13111ad9f43f7b819e37aa2b3f873","p2p_verify_url":"aHR0cDovL3YyNi10dC5peGlndWEuY29tLzU3YWRmYjRlNGM2Yzg5MTRlMGYyZjYyODA5ZTc1NDQ4LzVlYmZiNmQ1L3ZpZGVvL24vdG9zZWRnZS10b3MtYWdzeS12ZS0wMDAwLzM2ZGE1NTQ0ZGY5ZDQxYzE4ZGI3OTBiMWQ1ZTcxYjdjLw==","encrypt":false}}}
     * video_proportion_article : 1.738888888888889
     * video_style : 12
     * video_user_like : 0
     */

    @SerializedName("abstract")
    private String abstractX;
    @SerializedName("action_extra")
    private String actionExtra;
    @SerializedName("aggr_type")
    private int aggrType;
    @SerializedName("allow_download")
    private boolean allowDownload;
    @SerializedName("article_sub_type")
    private int articleSubType;
    @SerializedName("article_type")
    private int articleType;
    @SerializedName("article_url")
    private String articleUrl;
    @SerializedName("ban_comment")
    private int banComment;
    @SerializedName("ban_danmaku")
    private int banDanmaku;
    @SerializedName("ban_danmaku_send")
    private int banDanmakuSend;
    @SerializedName("ban_immersive")
    private int banImmersive;
    @SerializedName("behot_time")
    private int behotTime;
    @SerializedName("bury_count")
    private int buryCount;
    @SerializedName("can_comment_level")
    private int canCommentLevel;
    @SerializedName("cell_flag")
    private int cellFlag;
    @SerializedName("cell_layout_style")
    private int cellLayoutStyle;
    @SerializedName("cell_type")
    private int cellType;
    @SerializedName("comment_count")
    private int commentCount;
    @SerializedName("composition")
    private int composition;
    @SerializedName("content_decoration")
    private String contentDecoration;
    @SerializedName("cursor")
    private long cursor;
    @SerializedName("danmaku_count")
    private int danmakuCount;
    @SerializedName("data_type")
    private int dataType;
    @SerializedName("default_danmaku")
    private int defaultDanmaku;
    @SerializedName("digg_count")
    private int diggCount;
    @SerializedName("display_url")
    private String displayUrl;
    @SerializedName("followers_count")
    private int followersCount;
    @SerializedName("forward_info")
    private ForwardInfo forwardInfo;
    @SerializedName("group_flags")
    private int groupFlags;
    @SerializedName("group_id")
    private long groupId;
    @SerializedName("group_source")
    private int groupSource;
    @SerializedName("has_m3u8_video")
    private boolean hasM3u8Video;
    @SerializedName("has_mp4_video")
    private int hasMp4Video;
    @SerializedName("has_video")
    private boolean hasVideo;
    @SerializedName("hot")
    private int hot;
    @SerializedName("id")
    private long id;
    @SerializedName("ignore_web_transform")
    private int ignoreWebTransform;
    @SerializedName("impression_count")
    private int impressionCount;
    @SerializedName("interaction_data")
    private String interactionData;
    @SerializedName("is_original")
    private boolean isOriginal;
    @SerializedName("is_subject")
    private boolean isSubject;
    @SerializedName("is_subscribe")
    private boolean isSubscribe;
    @SerializedName("item_id")
    private long itemId;
    @SerializedName("item_version")
    private int itemVersion;
    @SerializedName("level")
    private int level;
    @SerializedName("log_pb")
    private LogPb logPb;
    @SerializedName("lynx_server")
    private Object lynxServer;
    @SerializedName("media_info")
    private MediaInfo mediaInfo;
    @SerializedName("media_name")
    private String mediaName;
    @SerializedName("middle_image")
    private MiddleImage middleImage;
    @SerializedName("need_client_impr_recycle")
    private int needClientImprRecycle;
    @SerializedName("play_auth_token")
    private String playAuthToken;
    @SerializedName("play_biz_token")
    private String playBizToken;
    @SerializedName("pread_params")
    private String preadParams;
    @SerializedName("publish_time")
    private int publishTime;
    @SerializedName("read_count")
    private int readCount;
    @SerializedName("repin_count")
    private int repinCount;
    @SerializedName("req_id")
    private String reqId;
    @SerializedName("rid")
    private String rid;
    @SerializedName("share_count")
    private int shareCount;
    @SerializedName("share_info")
    private ShareInfo shareInfo;
    @SerializedName("share_type")
    private int shareType;
    @SerializedName("share_url")
    private String shareUrl;
    @SerializedName("show_dislike")
    private boolean showDislike;
    @SerializedName("show_portrait")
    private boolean showPortrait;
    @SerializedName("show_portrait_article")
    private boolean showPortraitArticle;
    @SerializedName("small_image")
    private Object smallImage;
    @SerializedName("source")
    private String source;
    @SerializedName("source_icon_style")
    private int sourceIconStyle;
    @SerializedName("source_open_url")
    private String sourceOpenUrl;
    @SerializedName("tag")
    private String tag;
    @SerializedName("tip")
    private int tip;
    @SerializedName("title")
    private String title;
    @SerializedName("ugc_recommend")
    private UgcRecommend ugcRecommend;
    @SerializedName("url")
    private String url;
    @SerializedName("user_info")
    private UserInfo userInfo;
    @SerializedName("user_repin")
    private int userRepin;
    @SerializedName("user_verified")
    private int userVerified;
    @SerializedName("verified_content")
    private String verifiedContent;
    @SerializedName("verify_reason")
    private String verifyReason;
    @SerializedName("verify_status")
    private int verifyStatus;
    @SerializedName("video_detail_info")
    private VideoDetailInfo videoDetailInfo;
    @SerializedName("video_duration")
    private int videoDuration;
    @SerializedName("video_id")
    private String videoId;
    @SerializedName("video_like_count")
    private int videoLikeCount;
    @SerializedName("video_play_info")
    private String videoPlayInfo;
    @SerializedName("video_proportion_article")
    private double videoProportionArticle;
    @SerializedName("video_style")
    private int videoStyle;
    @SerializedName("video_user_like")
    private int videoUserLike;
    @SerializedName("action_list")
    private List<ActionList> actionList;
    @SerializedName("categories")
    private List<String> categories;
    @SerializedName("filter_words")
    private List<FilterWords> filterWords;
    @SerializedName("large_image_list")
    private List<LargeImageList> largeImageList;

    public String getAbstractX() { return abstractX;}

    public void setAbstractX(String abstractX) { this.abstractX = abstractX;}

    public String getActionExtra() { return actionExtra;}

    public void setActionExtra(String actionExtra) { this.actionExtra = actionExtra;}

    public int getAggrType() { return aggrType;}

    public void setAggrType(int aggrType) { this.aggrType = aggrType;}

    public boolean isAllowDownload() { return allowDownload;}

    public void setAllowDownload(boolean allowDownload) { this.allowDownload = allowDownload;}

    public int getArticleSubType() { return articleSubType;}

    public void setArticleSubType(int articleSubType) { this.articleSubType = articleSubType;}

    public int getArticleType() { return articleType;}

    public void setArticleType(int articleType) { this.articleType = articleType;}

    public String getArticleUrl() { return articleUrl;}

    public void setArticleUrl(String articleUrl) { this.articleUrl = articleUrl;}

    public int getBanComment() { return banComment;}

    public void setBanComment(int banComment) { this.banComment = banComment;}

    public int getBanDanmaku() { return banDanmaku;}

    public void setBanDanmaku(int banDanmaku) { this.banDanmaku = banDanmaku;}

    public int getBanDanmakuSend() { return banDanmakuSend;}

    public void setBanDanmakuSend(int banDanmakuSend) { this.banDanmakuSend = banDanmakuSend;}

    public int getBanImmersive() { return banImmersive;}

    public void setBanImmersive(int banImmersive) { this.banImmersive = banImmersive;}

    public int getBehotTime() { return behotTime;}

    public void setBehotTime(int behotTime) { this.behotTime = behotTime;}

    public int getBuryCount() { return buryCount;}

    public void setBuryCount(int buryCount) { this.buryCount = buryCount;}

    public int getCanCommentLevel() { return canCommentLevel;}

    public void setCanCommentLevel(int canCommentLevel) { this.canCommentLevel = canCommentLevel;}

    public int getCellFlag() { return cellFlag;}

    public void setCellFlag(int cellFlag) { this.cellFlag = cellFlag;}

    public int getCellLayoutStyle() { return cellLayoutStyle;}

    public void setCellLayoutStyle(int cellLayoutStyle) { this.cellLayoutStyle = cellLayoutStyle;}

    public int getCellType() { return cellType;}

    public void setCellType(int cellType) { this.cellType = cellType;}

    public int getCommentCount() { return commentCount;}

    public void setCommentCount(int commentCount) { this.commentCount = commentCount;}

    public int getComposition() { return composition;}

    public void setComposition(int composition) { this.composition = composition;}

    public String getContentDecoration() { return contentDecoration;}

    public void setContentDecoration(String contentDecoration) { this.contentDecoration = contentDecoration;}

    public long getCursor() { return cursor;}

    public void setCursor(long cursor) { this.cursor = cursor;}

    public int getDanmakuCount() { return danmakuCount;}

    public void setDanmakuCount(int danmakuCount) { this.danmakuCount = danmakuCount;}

    public int getDataType() { return dataType;}

    public void setDataType(int dataType) { this.dataType = dataType;}

    public int getDefaultDanmaku() { return defaultDanmaku;}

    public void setDefaultDanmaku(int defaultDanmaku) { this.defaultDanmaku = defaultDanmaku;}

    public int getDiggCount() { return diggCount;}

    public void setDiggCount(int diggCount) { this.diggCount = diggCount;}

    public String getDisplayUrl() { return displayUrl;}

    public void setDisplayUrl(String displayUrl) { this.displayUrl = displayUrl;}

    public int getFollowersCount() { return followersCount;}

    public void setFollowersCount(int followersCount) { this.followersCount = followersCount;}

    public ForwardInfo getForwardInfo() { return forwardInfo;}

    public void setForwardInfo(ForwardInfo forwardInfo) { this.forwardInfo = forwardInfo;}

    public int getGroupFlags() { return groupFlags;}

    public void setGroupFlags(int groupFlags) { this.groupFlags = groupFlags;}

    public long getGroupId() { return groupId;}

    public void setGroupId(long groupId) { this.groupId = groupId;}

    public int getGroupSource() { return groupSource;}

    public void setGroupSource(int groupSource) { this.groupSource = groupSource;}

    public boolean isHasM3u8Video() { return hasM3u8Video;}

    public void setHasM3u8Video(boolean hasM3u8Video) { this.hasM3u8Video = hasM3u8Video;}

    public int getHasMp4Video() { return hasMp4Video;}

    public void setHasMp4Video(int hasMp4Video) { this.hasMp4Video = hasMp4Video;}

    public boolean isHasVideo() { return hasVideo;}

    public void setHasVideo(boolean hasVideo) { this.hasVideo = hasVideo;}

    public int getHot() { return hot;}

    public void setHot(int hot) { this.hot = hot;}

    public long getId() { return id;}

    public void setId(long id) { this.id = id;}

    public int getIgnoreWebTransform() { return ignoreWebTransform;}

    public void setIgnoreWebTransform(int ignoreWebTransform) { this.ignoreWebTransform = ignoreWebTransform;}

    public int getImpressionCount() { return impressionCount;}

    public void setImpressionCount(int impressionCount) { this.impressionCount = impressionCount;}

    public String getInteractionData() { return interactionData;}

    public void setInteractionData(String interactionData) { this.interactionData = interactionData;}

    public boolean isIsOriginal() { return isOriginal;}

    public void setIsOriginal(boolean isOriginal) { this.isOriginal = isOriginal;}

    public boolean isIsSubject() { return isSubject;}

    public void setIsSubject(boolean isSubject) { this.isSubject = isSubject;}

    public boolean isIsSubscribe() { return isSubscribe;}

    public void setIsSubscribe(boolean isSubscribe) { this.isSubscribe = isSubscribe;}

    public long getItemId() { return itemId;}

    public void setItemId(long itemId) { this.itemId = itemId;}

    public int getItemVersion() { return itemVersion;}

    public void setItemVersion(int itemVersion) { this.itemVersion = itemVersion;}

    public int getLevel() { return level;}

    public void setLevel(int level) { this.level = level;}

    public LogPb getLogPb() { return logPb;}

    public void setLogPb(LogPb logPb) { this.logPb = logPb;}

    public Object getLynxServer() { return lynxServer;}

    public void setLynxServer(Object lynxServer) { this.lynxServer = lynxServer;}

    public MediaInfo getMediaInfo() { return mediaInfo;}

    public void setMediaInfo(MediaInfo mediaInfo) { this.mediaInfo = mediaInfo;}

    public String getMediaName() { return mediaName;}

    public void setMediaName(String mediaName) { this.mediaName = mediaName;}

    public MiddleImage getMiddleImage() { return middleImage;}

    public void setMiddleImage(MiddleImage middleImage) { this.middleImage = middleImage;}

    public int getNeedClientImprRecycle() { return needClientImprRecycle;}

    public void setNeedClientImprRecycle(int needClientImprRecycle) {
        this.needClientImprRecycle = needClientImprRecycle;
    }

    public String getPlayAuthToken() { return playAuthToken;}

    public void setPlayAuthToken(String playAuthToken) { this.playAuthToken = playAuthToken;}

    public String getPlayBizToken() { return playBizToken;}

    public void setPlayBizToken(String playBizToken) { this.playBizToken = playBizToken;}

    public String getPreadParams() { return preadParams;}

    public void setPreadParams(String preadParams) { this.preadParams = preadParams;}

    public int getPublishTime() { return publishTime;}

    public void setPublishTime(int publishTime) { this.publishTime = publishTime;}

    public int getReadCount() { return readCount;}

    public void setReadCount(int readCount) { this.readCount = readCount;}

    public int getRepinCount() { return repinCount;}

    public void setRepinCount(int repinCount) { this.repinCount = repinCount;}

    public String getReqId() { return reqId;}

    public void setReqId(String reqId) { this.reqId = reqId;}

    public String getRid() { return rid;}

    public void setRid(String rid) { this.rid = rid;}

    public int getShareCount() { return shareCount;}

    public void setShareCount(int shareCount) { this.shareCount = shareCount;}

    public ShareInfo getShareInfo() { return shareInfo;}

    public void setShareInfo(ShareInfo shareInfo) { this.shareInfo = shareInfo;}

    public int getShareType() { return shareType;}

    public void setShareType(int shareType) { this.shareType = shareType;}

    public String getShareUrl() { return shareUrl;}

    public void setShareUrl(String shareUrl) { this.shareUrl = shareUrl;}

    public boolean isShowDislike() { return showDislike;}

    public void setShowDislike(boolean showDislike) { this.showDislike = showDislike;}

    public boolean isShowPortrait() { return showPortrait;}

    public void setShowPortrait(boolean showPortrait) { this.showPortrait = showPortrait;}

    public boolean isShowPortraitArticle() { return showPortraitArticle;}

    public void setShowPortraitArticle(boolean showPortraitArticle) { this.showPortraitArticle = showPortraitArticle;}

    public Object getSmallImage() { return smallImage;}

    public void setSmallImage(Object smallImage) { this.smallImage = smallImage;}

    public String getSource() { return source;}

    public void setSource(String source) { this.source = source;}

    public int getSourceIconStyle() { return sourceIconStyle;}

    public void setSourceIconStyle(int sourceIconStyle) { this.sourceIconStyle = sourceIconStyle;}

    public String getSourceOpenUrl() { return sourceOpenUrl;}

    public void setSourceOpenUrl(String sourceOpenUrl) { this.sourceOpenUrl = sourceOpenUrl;}

    public String getTag() { return tag;}

    public void setTag(String tag) { this.tag = tag;}

    public int getTip() { return tip;}

    public void setTip(int tip) { this.tip = tip;}

    public String getTitle() { return title;}

    public void setTitle(String title) { this.title = title;}

    public UgcRecommend getUgcRecommend() { return ugcRecommend;}

    public void setUgcRecommend(UgcRecommend ugcRecommend) { this.ugcRecommend = ugcRecommend;}

    public String getUrl() { return url;}

    public void setUrl(String url) { this.url = url;}

    public UserInfo getUserInfo() { return userInfo;}

    public void setUserInfo(UserInfo userInfo) { this.userInfo = userInfo;}

    public int getUserRepin() { return userRepin;}

    public void setUserRepin(int userRepin) { this.userRepin = userRepin;}

    public int getUserVerified() { return userVerified;}

    public void setUserVerified(int userVerified) { this.userVerified = userVerified;}

    public String getVerifiedContent() { return verifiedContent;}

    public void setVerifiedContent(String verifiedContent) { this.verifiedContent = verifiedContent;}

    public String getVerifyReason() { return verifyReason;}

    public void setVerifyReason(String verifyReason) { this.verifyReason = verifyReason;}

    public int getVerifyStatus() { return verifyStatus;}

    public void setVerifyStatus(int verifyStatus) { this.verifyStatus = verifyStatus;}

    public VideoDetailInfo getVideoDetailInfo() { return videoDetailInfo;}

    public void setVideoDetailInfo(VideoDetailInfo videoDetailInfo) { this.videoDetailInfo = videoDetailInfo;}

    public int getVideoDuration() { return videoDuration;}

    public void setVideoDuration(int videoDuration) { this.videoDuration = videoDuration;}

    public String getVideoId() { return videoId;}

    public void setVideoId(String videoId) { this.videoId = videoId;}

    public int getVideoLikeCount() { return videoLikeCount;}

    public void setVideoLikeCount(int videoLikeCount) { this.videoLikeCount = videoLikeCount;}

    public String getVideoPlayInfo() { return videoPlayInfo;}

    public void setVideoPlayInfo(String videoPlayInfo) { this.videoPlayInfo = videoPlayInfo;}

    public double getVideoProportionArticle() { return videoProportionArticle;}

    public void setVideoProportionArticle(double videoProportionArticle) {
        this.videoProportionArticle = videoProportionArticle;
    }

    public int getVideoStyle() { return videoStyle;}

    public void setVideoStyle(int videoStyle) { this.videoStyle = videoStyle;}

    public int getVideoUserLike() { return videoUserLike;}

    public void setVideoUserLike(int videoUserLike) { this.videoUserLike = videoUserLike;}

    public List<ActionList> getActionList() { return actionList;}

    public void setActionList(List<ActionList> actionList) { this.actionList = actionList;}

    public List<String> getCategories() { return categories;}

    public void setCategories(List<String> categories) { this.categories = categories;}

    public List<FilterWords> getFilterWords() { return filterWords;}

    public void setFilterWords(List<FilterWords> filterWords) { this.filterWords = filterWords;}

    public List<LargeImageList> getLargeImageList() { return largeImageList;}

    public void setLargeImageList(List<LargeImageList> largeImageList) { this.largeImageList = largeImageList;}

    public static class ForwardInfo {
        /**
         * forward_count : 0
         */

        @SerializedName("forward_count")
        private int forwardCount;

        public int getForwardCount() { return forwardCount;}

        public void setForwardCount(int forwardCount) { this.forwardCount = forwardCount;}
    }

    public static class LogPb {
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
        private String authorId;
        @SerializedName("category_name")
        private String categoryName;
        @SerializedName("enter_from")
        private String enterFrom;
        @SerializedName("group_id")
        private String groupId;
        @SerializedName("group_source")
        private String groupSource;
        @SerializedName("impr_id")
        private String imprId;
        @SerializedName("impr_type")
        private String imprType;
        @SerializedName("is_following")
        private String isFollowing;

        public String getAuthorId() { return authorId;}

        public void setAuthorId(String authorId) { this.authorId = authorId;}

        public String getCategoryName() { return categoryName;}

        public void setCategoryName(String categoryName) { this.categoryName = categoryName;}

        public String getEnterFrom() { return enterFrom;}

        public void setEnterFrom(String enterFrom) { this.enterFrom = enterFrom;}

        public String getGroupId() { return groupId;}

        public void setGroupId(String groupId) { this.groupId = groupId;}

        public String getGroupSource() { return groupSource;}

        public void setGroupSource(String groupSource) { this.groupSource = groupSource;}

        public String getImprId() { return imprId;}

        public void setImprId(String imprId) { this.imprId = imprId;}

        public String getImprType() { return imprType;}

        public void setImprType(String imprType) { this.imprType = imprType;}

        public String getIsFollowing() { return isFollowing;}

        public void setIsFollowing(String isFollowing) { this.isFollowing = isFollowing;}
    }

    public static class MediaInfo {
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
        private String avatarUrl;
        @SerializedName("media_id")
        private long mediaId;
        @SerializedName("name")
        private String name;
        @SerializedName("subcribed")
        private int subcribed;
        @SerializedName("subscribed")
        private int subscribed;
        @SerializedName("user_id")
        private long userId;
        @SerializedName("user_verified")
        private boolean userVerified;
        @SerializedName("verified_content")
        private String verifiedContent;

        public String getAvatarUrl() { return avatarUrl;}

        public void setAvatarUrl(String avatarUrl) { this.avatarUrl = avatarUrl;}

        public long getMediaId() { return mediaId;}

        public void setMediaId(long mediaId) { this.mediaId = mediaId;}

        public String getName() { return name;}

        public void setName(String name) { this.name = name;}

        public int getSubcribed() { return subcribed;}

        public void setSubcribed(int subcribed) { this.subcribed = subcribed;}

        public int getSubscribed() { return subscribed;}

        public void setSubscribed(int subscribed) { this.subscribed = subscribed;}

        public long getUserId() { return userId;}

        public void setUserId(long userId) { this.userId = userId;}

        public boolean isUserVerified() { return userVerified;}

        public void setUserVerified(boolean userVerified) { this.userVerified = userVerified;}

        public String getVerifiedContent() { return verifiedContent;}

        public void setVerifiedContent(String verifiedContent) { this.verifiedContent = verifiedContent;}
    }

    public static class MiddleImage {
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
        private int height;
        @SerializedName("uri")
        private String uri;
        @SerializedName("url")
        private String url;
        @SerializedName("width")
        private int width;
        @SerializedName("url_list")
        private List<UrlList> urlList;

        public int getHeight() { return height;}

        public void setHeight(int height) { this.height = height;}

        public String getUri() { return uri;}

        public void setUri(String uri) { this.uri = uri;}

        public String getUrl() { return url;}

        public void setUrl(String url) { this.url = url;}

        public int getWidth() { return width;}

        public void setWidth(int width) { this.width = width;}

        public List<UrlList> getUrlList() { return urlList;}

        public void setUrlList(List<UrlList> urlList) { this.urlList = urlList;}

        public static class UrlList {
            /**
             * url : http://p26-tt.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_576x324.webp
             */

            @SerializedName("url")
            private String url;

            public String getUrl() { return url;}

            public void setUrl(String url) { this.url = url;}
        }
    }

    public static class ShareInfo {
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
        private Object coverImage;
        @SerializedName("description")
        private Object description;
        @SerializedName("hidden_url")
        private Object hiddenUrl;
        @SerializedName("on_suppress")
        private int onSuppress;
        @SerializedName("share_control")
        private ShareControl shareControl;
        @SerializedName("share_type")
        private ShareType shareType;
        @SerializedName("share_url")
        private String shareUrl;
        @SerializedName("title")
        private String title;
        @SerializedName("token_type")
        private int tokenType;
        @SerializedName("video_url")
        private String videoUrl;
        @SerializedName("weixin_cover_image")
        private Object weixinCoverImage;

        public Object getCoverImage() { return coverImage;}

        public void setCoverImage(Object coverImage) { this.coverImage = coverImage;}

        public Object getDescription() { return description;}

        public void setDescription(Object description) { this.description = description;}

        public Object getHiddenUrl() { return hiddenUrl;}

        public void setHiddenUrl(Object hiddenUrl) { this.hiddenUrl = hiddenUrl;}

        public int getOnSuppress() { return onSuppress;}

        public void setOnSuppress(int onSuppress) { this.onSuppress = onSuppress;}

        public ShareControl getShareControl() { return shareControl;}

        public void setShareControl(ShareControl shareControl) { this.shareControl = shareControl;}

        public ShareType getShareType() { return shareType;}

        public void setShareType(ShareType shareType) { this.shareType = shareType;}

        public String getShareUrl() { return shareUrl;}

        public void setShareUrl(String shareUrl) { this.shareUrl = shareUrl;}

        public String getTitle() { return title;}

        public void setTitle(String title) { this.title = title;}

        public int getTokenType() { return tokenType;}

        public void setTokenType(int tokenType) { this.tokenType = tokenType;}

        public String getVideoUrl() { return videoUrl;}

        public void setVideoUrl(String videoUrl) { this.videoUrl = videoUrl;}

        public Object getWeixinCoverImage() { return weixinCoverImage;}

        public void setWeixinCoverImage(Object weixinCoverImage) { this.weixinCoverImage = weixinCoverImage;}

        public static class ShareControl {
            /**
             * image : false
             * video : false
             */

            @SerializedName("image")
            private String image;
            @SerializedName("video")
            private String video;

            public String getImage() { return image;}

            public void setImage(String image) { this.image = image;}

            public String getVideo() { return video;}

            public void setVideo(String video) { this.video = video;}
        }

        public static class ShareType {
            /**
             * pyq : 0
             * qq : 0
             * qzone : 0
             * wx : 0
             */

            @SerializedName("pyq")
            private int pyq;
            @SerializedName("qq")
            private int qq;
            @SerializedName("qzone")
            private int qzone;
            @SerializedName("wx")
            private int wx;

            public int getPyq() { return pyq;}

            public void setPyq(int pyq) { this.pyq = pyq;}

            public int getQq() { return qq;}

            public void setQq(int qq) { this.qq = qq;}

            public int getQzone() { return qzone;}

            public void setQzone(int qzone) { this.qzone = qzone;}

            public int getWx() { return wx;}

            public void setWx(int wx) { this.wx = wx;}
        }
    }

    public static class UgcRecommend {
        /**
         * activity :
         * reason :
         */

        @SerializedName("activity")
        private String activity;
        @SerializedName("reason")
        private String reason;

        public String getActivity() { return activity;}

        public void setActivity(String activity) { this.activity = activity;}

        public String getReason() { return reason;}

        public void setReason(String reason) { this.reason = reason;}
    }

    public static class UserInfo {
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
        private String avatarUrl;
        @SerializedName("description")
        private String description;
        @SerializedName("follow")
        private boolean follow;
        @SerializedName("follower_count")
        private int followerCount;
        @SerializedName("is_blocked")
        private boolean isBlocked;
        @SerializedName("is_blocking")
        private boolean isBlocking;
        @SerializedName("is_discipulus")
        private boolean isDiscipulus;
        @SerializedName("is_living")
        private boolean isLiving;
        @SerializedName("name")
        private String name;
        @SerializedName("schema")
        private String schema;
        @SerializedName("sec_user_id")
        private String secUserId;
        @SerializedName("user_id")
        private long userId;
        @SerializedName("user_verified")
        private boolean userVerified;
        @SerializedName("verified_content")
        private String verifiedContent;

        public String getAvatarUrl() { return avatarUrl;}

        public void setAvatarUrl(String avatarUrl) { this.avatarUrl = avatarUrl;}

        public String getDescription() { return description;}

        public void setDescription(String description) { this.description = description;}

        public boolean isFollow() { return follow;}

        public void setFollow(boolean follow) { this.follow = follow;}

        public int getFollowerCount() { return followerCount;}

        public void setFollowerCount(int followerCount) { this.followerCount = followerCount;}

        public boolean isIsBlocked() { return isBlocked;}

        public void setIsBlocked(boolean isBlocked) { this.isBlocked = isBlocked;}

        public boolean isIsBlocking() { return isBlocking;}

        public void setIsBlocking(boolean isBlocking) { this.isBlocking = isBlocking;}

        public boolean isIsDiscipulus() { return isDiscipulus;}

        public void setIsDiscipulus(boolean isDiscipulus) { this.isDiscipulus = isDiscipulus;}

        public boolean isIsLiving() { return isLiving;}

        public void setIsLiving(boolean isLiving) { this.isLiving = isLiving;}

        public String getName() { return name;}

        public void setName(String name) { this.name = name;}

        public String getSchema() { return schema;}

        public void setSchema(String schema) { this.schema = schema;}

        public String getSecUserId() { return secUserId;}

        public void setSecUserId(String secUserId) { this.secUserId = secUserId;}

        public long getUserId() { return userId;}

        public void setUserId(long userId) { this.userId = userId;}

        public boolean isUserVerified() { return userVerified;}

        public void setUserVerified(boolean userVerified) { this.userVerified = userVerified;}

        public String getVerifiedContent() { return verifiedContent;}

        public void setVerifiedContent(String verifiedContent) { this.verifiedContent = verifiedContent;}
    }

    public static class VideoDetailInfo {
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
        private DetailVideoLargeImage detailVideoLargeImage;
        @SerializedName("direct_play")
        private int directPlay;
        @SerializedName("group_flags")
        private int groupFlags;
        @SerializedName("last_play_duration")
        private int lastPlayDuration;
        @SerializedName("show_pgc_subscribe")
        private int showPgcSubscribe;
        @SerializedName("use_last_duration")
        private boolean useLastDuration;
        @SerializedName("video_id")
        private String videoId;
        @SerializedName("video_preloading_flag")
        private int videoPreloadingFlag;
        @SerializedName("video_type")
        private int videoType;
        @SerializedName("video_watch_count")
        private int videoWatchCount;

        public DetailVideoLargeImage getDetailVideoLargeImage() { return detailVideoLargeImage;}

        public void setDetailVideoLargeImage(DetailVideoLargeImage detailVideoLargeImage) {
            this.detailVideoLargeImage = detailVideoLargeImage;
        }

        public int getDirectPlay() { return directPlay;}

        public void setDirectPlay(int directPlay) { this.directPlay = directPlay;}

        public int getGroupFlags() { return groupFlags;}

        public void setGroupFlags(int groupFlags) { this.groupFlags = groupFlags;}

        public int getLastPlayDuration() { return lastPlayDuration;}

        public void setLastPlayDuration(int lastPlayDuration) { this.lastPlayDuration = lastPlayDuration;}

        public int getShowPgcSubscribe() { return showPgcSubscribe;}

        public void setShowPgcSubscribe(int showPgcSubscribe) { this.showPgcSubscribe = showPgcSubscribe;}

        public boolean isUseLastDuration() { return useLastDuration;}

        public void setUseLastDuration(boolean useLastDuration) { this.useLastDuration = useLastDuration;}

        public String getVideoId() { return videoId;}

        public void setVideoId(String videoId) { this.videoId = videoId;}

        public int getVideoPreloadingFlag() { return videoPreloadingFlag;}

        public void setVideoPreloadingFlag(int videoPreloadingFlag) { this.videoPreloadingFlag = videoPreloadingFlag;}

        public int getVideoType() { return videoType;}

        public void setVideoType(int videoType) { this.videoType = videoType;}

        public int getVideoWatchCount() { return videoWatchCount;}

        public void setVideoWatchCount(int videoWatchCount) { this.videoWatchCount = videoWatchCount;}

        public static class DetailVideoLargeImage {
            /**
             * height : 326
             * uri : video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be
             * url : http://p8.pstatp.com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be
             * url_list : [{"url":"http://p8.pstatp.com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be"},{"url":"http://pb3.pstatp.com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be"},{"url":"http://pb3.pstatp.com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be"}]
             * width : 580
             */

            @SerializedName("height")
            private int height;
            @SerializedName("uri")
            private String uri;
            @SerializedName("url")
            private String url;
            @SerializedName("width")
            private int width;
            @SerializedName("url_list")
            private List<UrlListX> urlList;

            public int getHeight() { return height;}

            public void setHeight(int height) { this.height = height;}

            public String getUri() { return uri;}

            public void setUri(String uri) { this.uri = uri;}

            public String getUrl() { return url;}

            public void setUrl(String url) { this.url = url;}

            public int getWidth() { return width;}

            public void setWidth(int width) { this.width = width;}

            public List<UrlListX> getUrlList() { return urlList;}

            public void setUrlList(List<UrlListX> urlList) { this.urlList = urlList;}

            public static class UrlListX {
                /**
                 * url : http://p8.pstatp.com/video1609/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be
                 */

                @SerializedName("url")
                private String url;

                public String getUrl() { return url;}

                public void setUrl(String url) { this.url = url;}
            }
        }
    }

    public static class ActionList {
        /**
         * action : 1
         * desc :
         * extra : {}
         */

        @SerializedName("action")
        private int action;
        @SerializedName("desc")
        private String desc;
        @SerializedName("extra")
        private Extra extra;

        public int getAction() { return action;}

        public void setAction(int action) { this.action = action;}

        public String getDesc() { return desc;}

        public void setDesc(String desc) { this.desc = desc;}

        public Extra getExtra() { return extra;}

        public void setExtra(Extra extra) { this.extra = extra;}

        public static class Extra {}
    }

    public static class FilterWords {
        /**
         * id : 8:0
         * is_selected : false
         * name : 看过了
         */

        @SerializedName("id")
        private String id;
        @SerializedName("is_selected")
        private boolean isSelected;
        @SerializedName("name")
        private String name;

        public String getId() { return id;}

        public void setId(String id) { this.id = id;}

        public boolean isIsSelected() { return isSelected;}

        public void setIsSelected(boolean isSelected) { this.isSelected = isSelected;}

        public String getName() { return name;}

        public void setName(String name) { this.name = name;}
    }

    public static class LargeImageList {
        /**
         * height : 486
         * uri : img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486.webp
         * url : http://p9-tt-ipv6.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486.webp
         * url_list : [{"url":"http://p9-tt-ipv6.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486.webp"},{"url":"http://p9-tt-ipv6.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486.webp"},{"url":"http://p9-tt-ipv6.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486.webp"}]
         * width : 864
         */

        @SerializedName("height")
        private int height;
        @SerializedName("uri")
        private String uri;
        @SerializedName("url")
        private String url;
        @SerializedName("width")
        private int width;
        @SerializedName("url_list")
        private List<UrlListXX> urlList;

        public int getHeight() { return height;}

        public void setHeight(int height) { this.height = height;}

        public String getUri() { return uri;}

        public void setUri(String uri) { this.uri = uri;}

        public String getUrl() { return url;}

        public void setUrl(String url) { this.url = url;}

        public int getWidth() { return width;}

        public void setWidth(int width) { this.width = width;}

        public List<UrlListXX> getUrlList() { return urlList;}

        public void setUrlList(List<UrlListXX> urlList) { this.urlList = urlList;}

        public static class UrlListXX {
            /**
             * url : http://p9-tt-ipv6.byteimg.com/img/tos-cn-p-0026/ab7b8f22d679e1ac5fb5c7a6637a05be~c5_q75_864x486.webp
             */

            @SerializedName("url")
            private String url;

            public String getUrl() { return url;}

            public void setUrl(String url) { this.url = url;}
        }
    }
}
