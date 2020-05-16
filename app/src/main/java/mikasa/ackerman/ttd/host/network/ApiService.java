package mikasa.ackerman.ttd.host.network;

import mikasa.ackerman.ttd.host.pojo.entity.NewsDetail;
import mikasa.ackerman.ttd.host.pojo.entity.VideoModel;
import mikasa.ackerman.ttd.host.pojo.response.CommentResponse;
import mikasa.ackerman.ttd.host.pojo.response.NewsResponse;
import mikasa.ackerman.ttd.host.pojo.response.ResultResponse;
import mikasa.ackerman.ttd.host.pojo.response.VideoPathResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url; 

/**
 * @author ChayChan
 * @description: 网络请求的service
 * @date 2017/6/18  19:28
 */

public interface ApiService {

    String GET_ARTICLE_LIST = "api/news/feed/v62/?refer=1&count=20&loc_mode=4&device_id=34960436458&iid=13136511752";
    String GET_COMMENT_LIST = "article/v2/tab_comments/";
    //http://is.snssdk.com
    //http://is.snssdk.com/api/news/feed/v54/?refer=1&count=20&min_behot_time=1498722625&last_refresh_sub_entrance_interval=1498724693&loc_mode=4&tt_from=pull（tab_tip） 新闻列表
    //http://is.snssdk.com/article/v2/tab_comments/?group_id=6436886053704958466&item_id=6436886053704958466&offset=30&count=20 评论
    //http://is.snssdk.com/2/article/information/v21/ 详情

    /**
     * 获取新闻列表
     *
     * @param category 频道
     * @return
     */
    @GET(GET_ARTICLE_LIST)
    Call<NewsResponse> getNewsList(@Query("category") String category, @Query("min_behot_time") long lastTime,
        @Query("last_refresh_sub_entrance_interval") long currentTime);

    /**
     * 获取新闻详情
     */
    @GET
    Call<ResultResponse<NewsDetail>> getNewsDetail(@Url String url);

    /**
     * 获取评论列表数据
     *
     * @param groupId
     * @param itemId
     * @param offset
     * @param count
     * @return
     */
    @GET(GET_COMMENT_LIST)
    Call<CommentResponse> getComment(@Query("group_id") String groupId, @Query("item_id") String itemId,
        @Query("offset") String offset, @Query("count") String count);

    /**
     * 获取视频页的html代码
     */
    @GET
    Call<String> getVideoHtml(@Url String url);

    /**
     * 获取视频数据json
     * @param url
     * @return
     */
    @GET
    Call<VideoModel> getVideoData(@Url String url);

    @Headers({
            "Content-Type:application/x-www-form-urlencoded; charset=UTF-8",
            "Cookie:PHPSESSIID=334267171504; _ga=GA1.2.646236375.1499951727; _gid=GA1.2.951962968.1507171739; Hm_lvt_e0a6a4397bcb500e807c5228d70253c8=1507174305;Hm_lpvt_e0a6a4397bcb500e807c5228d70253c8=1507174305; _gat=1",
            "Origin:http://toutiao.iiilab.com"

    })

    @POST("https://www.parsevideo.com/api.php")
    Call<VideoPathResponse> parseVideo(@Query("url") String url, @Query("hash") String hash);

}

