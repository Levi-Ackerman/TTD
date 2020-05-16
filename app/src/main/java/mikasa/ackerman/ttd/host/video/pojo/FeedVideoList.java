package mikasa.ackerman.ttd.host.video.pojo;

import java.util.Collections;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import mikasa.ackerman.ttd.host.pojo.IPojo;

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
 * 2020/5/16 4:59 PM
 */
public class FeedVideoList implements IPojo<List<FeedVideoItem>> {

    /**
     * message : success
     * total_number : 1
     * has_more : true
     * login_status : 0
     * show_et_status : 0
     * post_content_hint : 分享今日新鲜事
     * has_more_to_refresh : true
     * action_to_last_stick : 0
     * feed_flag : 0
     * tips : {"type":"app","display_duration":2,"display_info":"今日头条推荐引擎有1条更新","display_template":"今日头条推荐引擎有%s条更新",
     * "open_url":"","web_url":"","download_url":"","app_name":"今日头条","package_name":""}
     * is_use_bytedance_stream : true
     * get_offline_pool : false
     * location : null
     * api_base_info : null
     * show_last_read : false
     * last_response_extra : {"data":"e30"}
     */

    @SerializedName("message")
    private String message;
    @SerializedName("total_number")
    private int totalNumber;
    @SerializedName("has_more")
    private boolean hasMore;
    @SerializedName("data")
    private List<FeedVideoItem> feedVideoItems;
    @SerializedName("login_status")
    private int loginStatus;
    @SerializedName("show_et_status")
    private int showEtStatus;
    @SerializedName("post_content_hint")
    private String postContentHint;
    @SerializedName("has_more_to_refresh")
    private boolean hasMoreToRefresh;
    @SerializedName("action_to_last_stick")
    private int actionToLastStick;
    @SerializedName("feed_flag")
    private int feedFlag;
    @SerializedName("tips")
    private Tips tips;
    @SerializedName("is_use_bytedance_stream")
    private boolean isUseBytedanceStream;
    @SerializedName("get_offline_pool")
    private boolean getOfflinePool;
    @SerializedName("location")
    private Object location;
    @SerializedName("api_base_info")
    private Object apiBaseInfo;
    @SerializedName("show_last_read")
    private boolean showLastRead;
    @SerializedName("last_response_extra")
    private LastResponseExtra lastResponseExtra;

    public String getMessage() { return message;}

    public void setMessage(String message) { this.message = message;}

    public int getTotalNumber() { return totalNumber;}

    public void setTotalNumber(int totalNumber) { this.totalNumber = totalNumber;}

    public boolean isHasMore() { return hasMore;}

    public void setHasMore(boolean hasMore) { this.hasMore = hasMore;}

    public int getLoginStatus() { return loginStatus;}

    public void setLoginStatus(int loginStatus) { this.loginStatus = loginStatus;}

    public int getShowEtStatus() { return showEtStatus;}

    public void setShowEtStatus(int showEtStatus) { this.showEtStatus = showEtStatus;}

    public String getPostContentHint() { return postContentHint;}

    public void setPostContentHint(String postContentHint) { this.postContentHint = postContentHint;}

    public boolean isHasMoreToRefresh() { return hasMoreToRefresh;}

    public void setHasMoreToRefresh(boolean hasMoreToRefresh) { this.hasMoreToRefresh = hasMoreToRefresh;}

    public int getActionToLastStick() { return actionToLastStick;}

    public void setActionToLastStick(int actionToLastStick) { this.actionToLastStick = actionToLastStick;}

    public int getFeedFlag() { return feedFlag;}

    public void setFeedFlag(int feedFlag) { this.feedFlag = feedFlag;}

    public Tips getTips() { return tips;}

    public void setTips(Tips tips) { this.tips = tips;}

    public boolean isIsUseBytedanceStream() { return isUseBytedanceStream;}

    public void setIsUseBytedanceStream(boolean isUseBytedanceStream) {
        this.isUseBytedanceStream = isUseBytedanceStream;
    }

    public boolean isGetOfflinePool() { return getOfflinePool;}

    public void setGetOfflinePool(boolean getOfflinePool) { this.getOfflinePool = getOfflinePool;}

    public Object getLocation() { return location;}

    public void setLocation(Object location) { this.location = location;}

    public Object getApiBaseInfo() { return apiBaseInfo;}

    public void setApiBaseInfo(Object apiBaseInfo) { this.apiBaseInfo = apiBaseInfo;}

    public boolean isShowLastRead() { return showLastRead;}

    public void setShowLastRead(boolean showLastRead) { this.showLastRead = showLastRead;}

    public LastResponseExtra getLastResponseExtra() { return lastResponseExtra;}

    public void setLastResponseExtra(LastResponseExtra lastResponseExtra) { this.lastResponseExtra = lastResponseExtra;}

    public List<FeedVideoItem> getFeedVideoItems() {
        return feedVideoItems;
    }

    public void setFeedVideoItems(List<FeedVideoItem> feedVideoItems) {
        this.feedVideoItems = feedVideoItems;
    }

    @Override
    public boolean isEmpty() {
        return feedVideoItems == null || feedVideoItems.isEmpty();
    }

    @Override
    public List<FeedVideoItem> getContent() {
        return feedVideoItems == null ? Collections.emptyList() : feedVideoItems;
    }

    public static class Tips {
        /**
         * type : app
         * display_duration : 2
         * display_info : 今日头条推荐引擎有1条更新
         * display_template : 今日头条推荐引擎有%s条更新
         * open_url :
         * web_url :
         * download_url :
         * app_name : 今日头条
         * package_name :
         */

        @SerializedName("type")
        private String type;
        @SerializedName("display_duration")
        private int displayDuration;
        @SerializedName("display_info")
        private String displayInfo;
        @SerializedName("display_template")
        private String displayTemplate;
        @SerializedName("open_url")
        private String openUrl;
        @SerializedName("web_url")
        private String webUrl;
        @SerializedName("download_url")
        private String downloadUrl;
        @SerializedName("app_name")
        private String appName;
        @SerializedName("package_name")
        private String packageName;

        public String getType() { return type;}

        public void setType(String type) { this.type = type;}

        public int getDisplayDuration() { return displayDuration;}

        public void setDisplayDuration(int displayDuration) { this.displayDuration = displayDuration;}

        public String getDisplayInfo() { return displayInfo;}

        public void setDisplayInfo(String displayInfo) { this.displayInfo = displayInfo;}

        public String getDisplayTemplate() { return displayTemplate;}

        public void setDisplayTemplate(String displayTemplate) { this.displayTemplate = displayTemplate;}

        public String getOpenUrl() { return openUrl;}

        public void setOpenUrl(String openUrl) { this.openUrl = openUrl;}

        public String getWebUrl() { return webUrl;}

        public void setWebUrl(String webUrl) { this.webUrl = webUrl;}

        public String getDownloadUrl() { return downloadUrl;}

        public void setDownloadUrl(String downloadUrl) { this.downloadUrl = downloadUrl;}

        public String getAppName() { return appName;}

        public void setAppName(String appName) { this.appName = appName;}

        public String getPackageName() { return packageName;}

        public void setPackageName(String packageName) { this.packageName = packageName;}
    }

    public static class LastResponseExtra {
        /**
         * data : e30
         */

        @SerializedName("data")
        private String data;

        public String getData() { return data;}

        public void setData(String data) { this.data = data;}
    }
}
