package mikasa.ackerman.ttd.host.pojo;

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
 * 2020/5/14 12:36 AM
 */
public class FeedItem {

    /**
     * abstract : 新华社北京5月13日电 国家主席习近平5月13日晚同韩国总统文在寅通电话。习近平强调，经过艰苦努力，中韩两国新冠肺炎疫情都得到有效控制。
     * action_list : [{"action":1,"desc":"","extra":{}},{"action":3,"desc":"","extra":{}},{"action":7,"desc":"",
     * "extra":{}},{"action":9,"desc":"","extra":{}}]
     * aggr_type : 1
     * allow_download : false
     * article_sub_type : 0
     * article_type : 0
     * article_url : http://www.xinhuanet.com/world/2020-05/13/c_1125981575.htm
     * article_version : 0
     * ban_comment : 0
     * ban_immersive : 0
     * behot_time : 1589386751
     * bury_count : 0
     * bury_style_show : 0
     * cell_flag : 17039371
     * cell_layout_style : 1
     * cell_type : 0
     * comment_count : 54
     * content_decoration :
     * cursor : 1589386751000
     * digg_count : 630
     * display_url : http://toutiao.com/group/6826329825599291917/
     * filter_words : [{"id":"8:0","name":"看过了","is_selected":false},{"id":"9:1","name":"内容太水","is_selected":false},{
     * "id":"5:355256624","name":"拉黑作者:新华网客户端","is_selected":false},{"id":"2:11384971","name":"不想看:时政外交",
     * "is_selected":false},{"id":"6:15415","name":"不想看:韩国","is_selected":false},{"id":"6:578863","name":"不想看:文在寅",
     * "is_selected":false}]
     * forward_info : {"forward_count":5}
     * group_id : 6826329825599291917
     * group_source : 2
     * has_m3u8_video : false
     * has_mp4_video : 0
     * has_video : false
     * hot : 0
     * ignore_web_transform : 1
     * interaction_data :
     * is_stick : true
     * is_subject : false
     * item_id : 6826329825599291917
     * item_version : 0
     * label : 置顶
     * label_extra : {"is_redirect":false,"redirect_url":"","icon_url":{},"style_type":0}
     * label_style : 1
     * level : 0
     * log_pb : {"impr_id":"202005140019110100160401411D601865","is_following":"0"}
     * media_info : {"avatar_url":"http://p9.pstatp.com/large/pgc-image/03f6307ae99745119fa95747f9d9e525",
     * "name":"新华网客户端","user_verified":true,"media_id":4377795668,"user_id":4377795668,"verified_content":"",
     * "is_star_user":false,"recommend_reason":"","recommend_type":0,"follow":false}
     * media_name : 新华网客户端
     * need_client_impr_recycle : 1
     * preload_web : 1
     * publish_time : 1589378767
     * read_count : 44735
     * repin_count : 157
     * rid : 202005140019110100160401411D601865
     * share_count : 53
     * share_info : {"share_url":"https://m.toutiaocdn
     * .com/group/6826329825599291917/?app=news_article&is_hit_share_recommend=0","title":"习近平同韩国总统文在寅通电话 - 今日头条",
     * "description":null,"cover_image":null,"share_type":{"pyq":0,"qq":0,"qzone":0,"wx":0},"weixin_cover_image
     * ":null,"token_type":1,"on_suppress":0,"hidden_url":null,"video_url":null,"share_control":null}
     * share_url : https://m.toutiaocdn.com/group/6826329825599291917/?app=news_article&is_hit_share_recommend=0
     * show_dislike : false
     * show_portrait : false
     * show_portrait_article : false
     * small_image : null
     * source : 新华网客户端
     * source_icon_style : 1
     * source_open_url : sslocal://profile?uid=4377795668
     * stick_label : 置顶
     * stick_style : 1
     * tag : news_world
     * tag_id : 6826329825599291917
     * tip : 0
     * title : 习近平同韩国总统文在寅通电话
     * ugc_recommend : {"activity":"","reason":"新华网官方账号"}
     * url : http://www.xinhuanet.com/world/2020-05/13/c_1125981575.htm
     * user_info : {"avatar_url":"http://sf3-ttcdn-tos.pstatp
     * .com/img/pgc-image/03f6307ae99745119fa95747f9d9e525~120x256.image","name":"新华网客户端",
     * "description":"引领品质阅读，让新闻离你更近！","user_id":4377795668,"user_verified":true,"verified_content":"新华网官方账号","follow":false,"follower_count":0,"user_auth_info":"{\"auth_type\":\"0\",\"auth_info\":\"新华网官方账号\"}","schema":"sslocal://profile?uid=4377795668&refer=all","live_info_type":1}
     * user_repin : 0
     * user_verified : 1
     * verified_content : 新华网官方账号
     * video_style : 0
     */

    @SerializedName("abstract")
    private String abstractX;
    @SerializedName("images")
    private List<String> imageUrls;
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
    @SerializedName("article_version")
    private int articleVersion;
    @SerializedName("ban_comment")
    private int banComment;
    @SerializedName("ban_immersive")
    private int banImmersive;
    @SerializedName("behot_time")
    private int behotTime;
    @SerializedName("bury_count")
    private int buryCount;
    @SerializedName("bury_style_show")
    private int buryStyleShow;
    @SerializedName("cell_flag")
    private int cellFlag;
    @SerializedName("cell_layout_style")
    private int cellLayoutStyle;
    @SerializedName("cell_type")
    private int cellType;
    @SerializedName("comment_count")
    private int commentCount;
    @SerializedName("content_decoration")
    private String contentDecoration;
    @SerializedName("cursor")
    private long cursor;
    @SerializedName("digg_count")
    private int diggCount;
    @SerializedName("display_url")
    private String displayUrl;
    @SerializedName("forward_info")
    private ForwardInfo forwardInfo;
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
    @SerializedName("ignore_web_transform")
    private int ignoreWebTransform;
    @SerializedName("interaction_data")
    private String interactionData;
    @SerializedName("is_stick")
    private boolean isStick;
    @SerializedName("is_subject")
    private boolean isSubject;
    @SerializedName("item_id")
    private long itemId;
    @SerializedName("item_version")
    private int itemVersion;
    @SerializedName("label")
    private String label;
    @SerializedName("label_extra")
    private LabelExtra labelExtra;
    @SerializedName("label_style")
    private int labelStyle;
    @SerializedName("level")
    private int level;
    @SerializedName("log_pb")
    private LogPb logPb;
    @SerializedName("media_info")
    private MediaInfo mediaInfo;
    @SerializedName("media_name")
    private String mediaName;
    @SerializedName("need_client_impr_recycle")
    private int needClientImprRecycle;
    @SerializedName("preload_web")
    private int preloadWeb;
    @SerializedName("publish_time")
    private int publishTime;
    @SerializedName("read_count")
    private int readCount;
    @SerializedName("repin_count")
    private int repinCount;
    @SerializedName("rid")
    private String rid;
    @SerializedName("share_count")
    private int shareCount;
    @SerializedName("share_info")
    private ShareInfo shareInfo;
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
    @SerializedName("stick_label")
    private String stickLabel;
    @SerializedName("stick_style")
    private int stickStyle;
    @SerializedName("tag")
    private String tag;
    @SerializedName("tag_id")
    private long tagId;
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
    @SerializedName("video_style")
    private int videoStyle;
    @SerializedName("action_list")
    private List<ActionList> actionList;
    @SerializedName("filter_words")
    private List<FilterWords> filterWords;
    @SerializedName("middle_image")
    private ImageEntity mMiddleImage;
    @SerializedName("image_list")
    private List<ImageEntity> mImageList;
    @SerializedName("has_image")
    private boolean mHasImage;

    public int gallary_image_count;

    public String getAbstractX() { return abstractX;}

    public void setAbstractX(String abstractX) { this.abstractX = abstractX;}

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

    public int getArticleVersion() { return articleVersion;}

    public void setArticleVersion(int articleVersion) { this.articleVersion = articleVersion;}

    public int getBanComment() { return banComment;}

    public void setBanComment(int banComment) { this.banComment = banComment;}

    public int getBanImmersive() { return banImmersive;}

    public void setBanImmersive(int banImmersive) { this.banImmersive = banImmersive;}

    public int getBehotTime() { return behotTime;}

    public void setBehotTime(int behotTime) { this.behotTime = behotTime;}

    public int getBuryCount() { return buryCount;}

    public void setBuryCount(int buryCount) { this.buryCount = buryCount;}

    public int getBuryStyleShow() { return buryStyleShow;}

    public void setBuryStyleShow(int buryStyleShow) { this.buryStyleShow = buryStyleShow;}

    public int getCellFlag() { return cellFlag;}

    public void setCellFlag(int cellFlag) { this.cellFlag = cellFlag;}

    public int getCellLayoutStyle() { return cellLayoutStyle;}

    public void setCellLayoutStyle(int cellLayoutStyle) { this.cellLayoutStyle = cellLayoutStyle;}

    public int getCellType() { return cellType;}

    public void setCellType(int cellType) { this.cellType = cellType;}

    public int getCommentCount() { return commentCount;}

    public void setCommentCount(int commentCount) { this.commentCount = commentCount;}

    public String getContentDecoration() { return contentDecoration;}

    public void setContentDecoration(String contentDecoration) { this.contentDecoration = contentDecoration;}

    public long getCursor() { return cursor;}

    public void setCursor(long cursor) { this.cursor = cursor;}

    public int getDiggCount() { return diggCount;}

    public void setDiggCount(int diggCount) { this.diggCount = diggCount;}

    public String getDisplayUrl() { return displayUrl;}

    public void setDisplayUrl(String displayUrl) { this.displayUrl = displayUrl;}

    public ForwardInfo getForwardInfo() { return forwardInfo;}

    public void setForwardInfo(ForwardInfo forwardInfo) { this.forwardInfo = forwardInfo;}

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

    public int getIgnoreWebTransform() { return ignoreWebTransform;}

    public void setIgnoreWebTransform(int ignoreWebTransform) { this.ignoreWebTransform = ignoreWebTransform;}

    public String getInteractionData() { return interactionData;}

    public void setInteractionData(String interactionData) { this.interactionData = interactionData;}

    public boolean isIsStick() { return isStick;}

    public void setIsStick(boolean isStick) { this.isStick = isStick;}

    public boolean isIsSubject() { return isSubject;}

    public void setIsSubject(boolean isSubject) { this.isSubject = isSubject;}

    public long getItemId() { return itemId;}

    public void setItemId(long itemId) { this.itemId = itemId;}

    public int getItemVersion() { return itemVersion;}

    public void setItemVersion(int itemVersion) { this.itemVersion = itemVersion;}

    public String getLabel() { return label;}

    public void setLabel(String label) { this.label = label;}

    public LabelExtra getLabelExtra() { return labelExtra;}

    public void setLabelExtra(LabelExtra labelExtra) { this.labelExtra = labelExtra;}

    public int getLabelStyle() { return labelStyle;}

    public void setLabelStyle(int labelStyle) { this.labelStyle = labelStyle;}

    public int getLevel() { return level;}

    public void setLevel(int level) { this.level = level;}

    public LogPb getLogPb() { return logPb;}

    public void setLogPb(LogPb logPb) { this.logPb = logPb;}

    public MediaInfo getMediaInfo() { return mediaInfo;}

    public void setMediaInfo(MediaInfo mediaInfo) { this.mediaInfo = mediaInfo;}

    public String getMediaName() { return mediaName;}

    public void setMediaName(String mediaName) { this.mediaName = mediaName;}

    public int getNeedClientImprRecycle() { return needClientImprRecycle;}

    public void setNeedClientImprRecycle(int needClientImprRecycle) {
        this.needClientImprRecycle = needClientImprRecycle;
    }

    public int getPreloadWeb() { return preloadWeb;}

    public void setPreloadWeb(int preloadWeb) { this.preloadWeb = preloadWeb;}

    public int getPublishTime() { return publishTime;}

    public void setPublishTime(int publishTime) { this.publishTime = publishTime;}

    public int getReadCount() { return readCount;}

    public void setReadCount(int readCount) { this.readCount = readCount;}

    public int getRepinCount() { return repinCount;}

    public void setRepinCount(int repinCount) { this.repinCount = repinCount;}

    public String getRid() { return rid;}

    public void setRid(String rid) { this.rid = rid;}

    public int getShareCount() { return shareCount;}

    public void setShareCount(int shareCount) { this.shareCount = shareCount;}

    public ShareInfo getShareInfo() { return shareInfo;}

    public void setShareInfo(ShareInfo shareInfo) { this.shareInfo = shareInfo;}

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

    public String getStickLabel() { return stickLabel;}

    public void setStickLabel(String stickLabel) { this.stickLabel = stickLabel;}

    public int getStickStyle() { return stickStyle;}

    public void setStickStyle(int stickStyle) { this.stickStyle = stickStyle;}

    public String getTag() { return tag;}

    public void setTag(String tag) { this.tag = tag;}

    public long getTagId() { return tagId;}

    public void setTagId(long tagId) { this.tagId = tagId;}

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

    public int getVideoStyle() { return videoStyle;}

    public void setVideoStyle(int videoStyle) { this.videoStyle = videoStyle;}

    public List<ActionList> getActionList() { return actionList;}

    public void setActionList(List<ActionList> actionList) { this.actionList = actionList;}

    public List<FilterWords> getFilterWords() { return filterWords;}

    public void setFilterWords(List<FilterWords> filterWords) { this.filterWords = filterWords;}

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public ImageEntity getMiddleImage() {
        return mMiddleImage;
    }

    public void setMiddleImage(ImageEntity middleImage) {
        this.mMiddleImage = middleImage;
    }

    public List<ImageEntity> getImageList() {
        return mImageList;
    }

    public void setImageList(List<ImageEntity> imageList) {
        this.mImageList = imageList;
    }

    public boolean isHasImage() {
        return mHasImage;
    }

    public void setHasImage(boolean hasImage) {
        mHasImage = hasImage;
    }

    public static class ForwardInfo {
        /**
         * forward_count : 5
         */

        @SerializedName("forward_count")
        private int forwardCount;

        public int getForwardCount() { return forwardCount;}

        public void setForwardCount(int forwardCount) { this.forwardCount = forwardCount;}
    }

    public static class LabelExtra {
        /**
         * is_redirect : false
         * redirect_url :
         * icon_url : {}
         * style_type : 0
         */

        @SerializedName("is_redirect")
        private boolean isRedirect;
        @SerializedName("redirect_url")
        private String redirectUrl;
        @SerializedName("icon_url")
        private IconUrl iconUrl;
        @SerializedName("style_type")
        private int styleType;

        public boolean isIsRedirect() { return isRedirect;}

        public void setIsRedirect(boolean isRedirect) { this.isRedirect = isRedirect;}

        public String getRedirectUrl() { return redirectUrl;}

        public void setRedirectUrl(String redirectUrl) { this.redirectUrl = redirectUrl;}

        public IconUrl getIconUrl() { return iconUrl;}

        public void setIconUrl(IconUrl iconUrl) { this.iconUrl = iconUrl;}

        public int getStyleType() { return styleType;}

        public void setStyleType(int styleType) { this.styleType = styleType;}

        public static class IconUrl {}
    }

    public static class LogPb {
        /**
         * impr_id : 202005140019110100160401411D601865
         * is_following : 0
         */

        @SerializedName("impr_id")
        private String imprId;
        @SerializedName("is_following")
        private String isFollowing;

        public String getImprId() { return imprId;}

        public void setImprId(String imprId) { this.imprId = imprId;}

        public String getIsFollowing() { return isFollowing;}

        public void setIsFollowing(String isFollowing) { this.isFollowing = isFollowing;}
    }

    public static class MediaInfo {
        /**
         * avatar_url : http://p9.pstatp.com/large/pgc-image/03f6307ae99745119fa95747f9d9e525
         * name : 新华网客户端
         * user_verified : true
         * media_id : 4377795668
         * user_id : 4377795668
         * verified_content :
         * is_star_user : false
         * recommend_reason :
         * recommend_type : 0
         * follow : false
         */

        @SerializedName("avatar_url")
        private String avatarUrl;
        @SerializedName("name")
        private String name;
        @SerializedName("user_verified")
        private boolean userVerified;
        @SerializedName("media_id")
        private long mediaId;
        @SerializedName("user_id")
        private long userId;
        @SerializedName("verified_content")
        private String verifiedContent;
        @SerializedName("is_star_user")
        private boolean isStarUser;
        @SerializedName("recommend_reason")
        private String recommendReason;
        @SerializedName("recommend_type")
        private int recommendType;
        @SerializedName("follow")
        private boolean follow;

        public String getAvatarUrl() { return avatarUrl;}

        public void setAvatarUrl(String avatarUrl) { this.avatarUrl = avatarUrl;}

        public String getName() { return name;}

        public void setName(String name) { this.name = name;}

        public boolean isUserVerified() { return userVerified;}

        public void setUserVerified(boolean userVerified) { this.userVerified = userVerified;}

        public long getMediaId() { return mediaId;}

        public void setMediaId(long mediaId) { this.mediaId = mediaId;}

        public long getUserId() { return userId;}

        public void setUserId(long userId) { this.userId = userId;}

        public String getVerifiedContent() { return verifiedContent;}

        public void setVerifiedContent(String verifiedContent) { this.verifiedContent = verifiedContent;}

        public boolean isIsStarUser() { return isStarUser;}

        public void setIsStarUser(boolean isStarUser) { this.isStarUser = isStarUser;}

        public String getRecommendReason() { return recommendReason;}

        public void setRecommendReason(String recommendReason) { this.recommendReason = recommendReason;}

        public int getRecommendType() { return recommendType;}

        public void setRecommendType(int recommendType) { this.recommendType = recommendType;}

        public boolean isFollow() { return follow;}

        public void setFollow(boolean follow) { this.follow = follow;}
    }

    public static class ShareInfo {
        /**
         * share_url : https://m.toutiaocdn.com/group/6826329825599291917/?app=news_article&is_hit_share_recommend=0
         * title : 习近平同韩国总统文在寅通电话 - 今日头条
         * description : null
         * cover_image : null
         * share_type : {"pyq":0,"qq":0,"qzone":0,"wx":0}
         * weixin_cover_image : null
         * token_type : 1
         * on_suppress : 0
         * hidden_url : null
         * video_url : null
         * share_control : null
         */

        @SerializedName("share_url")
        private String shareUrl;
        @SerializedName("title")
        private String title;
        @SerializedName("description")
        private Object description;
        @SerializedName("cover_image")
        private Object coverImage;
        @SerializedName("share_type")
        private ShareType shareType;
        @SerializedName("weixin_cover_image")
        private Object weixinCoverImage;
        @SerializedName("token_type")
        private int tokenType;
        @SerializedName("on_suppress")
        private int onSuppress;
        @SerializedName("hidden_url")
        private Object hiddenUrl;
        @SerializedName("video_url")
        private Object videoUrl;
        @SerializedName("share_control")
        private Object shareControl;

        public String getShareUrl() { return shareUrl;}

        public void setShareUrl(String shareUrl) { this.shareUrl = shareUrl;}

        public String getTitle() { return title;}

        public void setTitle(String title) { this.title = title;}

        public Object getDescription() { return description;}

        public void setDescription(Object description) { this.description = description;}

        public Object getCoverImage() { return coverImage;}

        public void setCoverImage(Object coverImage) { this.coverImage = coverImage;}

        public ShareType getShareType() { return shareType;}

        public void setShareType(ShareType shareType) { this.shareType = shareType;}

        public Object getWeixinCoverImage() { return weixinCoverImage;}

        public void setWeixinCoverImage(Object weixinCoverImage) { this.weixinCoverImage = weixinCoverImage;}

        public int getTokenType() { return tokenType;}

        public void setTokenType(int tokenType) { this.tokenType = tokenType;}

        public int getOnSuppress() { return onSuppress;}

        public void setOnSuppress(int onSuppress) { this.onSuppress = onSuppress;}

        public Object getHiddenUrl() { return hiddenUrl;}

        public void setHiddenUrl(Object hiddenUrl) { this.hiddenUrl = hiddenUrl;}

        public Object getVideoUrl() { return videoUrl;}

        public void setVideoUrl(Object videoUrl) { this.videoUrl = videoUrl;}

        public Object getShareControl() { return shareControl;}

        public void setShareControl(Object shareControl) { this.shareControl = shareControl;}

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
         * reason : 新华网官方账号
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
         * avatar_url : http://sf3-ttcdn-tos.pstatp.com/img/pgc-image/03f6307ae99745119fa95747f9d9e525~120x256.image
         * name : 新华网客户端
         * description : 引领品质阅读，让新闻离你更近！
         * user_id : 4377795668
         * user_verified : true
         * verified_content : 新华网官方账号
         * follow : false
         * follower_count : 0
         * user_auth_info : {"auth_type":"0","auth_info":"新华网官方账号"}
         * schema : sslocal://profile?uid=4377795668&refer=all
         * live_info_type : 1
         */

        @SerializedName("avatar_url")
        private String avatarUrl;
        @SerializedName("name")
        private String name;
        @SerializedName("description")
        private String description;
        @SerializedName("user_id")
        private long userId;
        @SerializedName("user_verified")
        private boolean userVerified;
        @SerializedName("verified_content")
        private String verifiedContent;
        @SerializedName("follow")
        private boolean follow;
        @SerializedName("follower_count")
        private int followerCount;
        @SerializedName("user_auth_info")
        private String userAuthInfo;
        @SerializedName("schema")
        private String schema;
        @SerializedName("live_info_type")
        private int liveInfoType;

        public String getAvatarUrl() { return avatarUrl;}

        public void setAvatarUrl(String avatarUrl) { this.avatarUrl = avatarUrl;}

        public String getName() { return name;}

        public void setName(String name) { this.name = name;}

        public String getDescription() { return description;}

        public void setDescription(String description) { this.description = description;}

        public long getUserId() { return userId;}

        public void setUserId(long userId) { this.userId = userId;}

        public boolean isUserVerified() { return userVerified;}

        public void setUserVerified(boolean userVerified) { this.userVerified = userVerified;}

        public String getVerifiedContent() { return verifiedContent;}

        public void setVerifiedContent(String verifiedContent) { this.verifiedContent = verifiedContent;}

        public boolean isFollow() { return follow;}

        public void setFollow(boolean follow) { this.follow = follow;}

        public int getFollowerCount() { return followerCount;}

        public void setFollowerCount(int followerCount) { this.followerCount = followerCount;}

        public String getUserAuthInfo() { return userAuthInfo;}

        public void setUserAuthInfo(String userAuthInfo) { this.userAuthInfo = userAuthInfo;}

        public String getSchema() { return schema;}

        public void setSchema(String schema) { this.schema = schema;}

        public int getLiveInfoType() { return liveInfoType;}

        public void setLiveInfoType(int liveInfoType) { this.liveInfoType = liveInfoType;}
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
         * name : 看过了
         * is_selected : false
         */

        @SerializedName("id")
        private String id;
        @SerializedName("name")
        private String name;
        @SerializedName("is_selected")
        private boolean isSelected;

        public String getId() { return id;}

        public void setId(String id) { this.id = id;}

        public String getName() { return name;}

        public void setName(String name) { this.name = name;}

        public boolean isIsSelected() { return isSelected;}

        public void setIsSelected(boolean isSelected) { this.isSelected = isSelected;}
    }

    public static class FeedItemAdapter implements JsonDeserializer<FeedItem> , JsonSerializer<FeedItem>{
        private static final Gson mGson = new Gson();
        @Override
        public FeedItem deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
            return mGson.fromJson(((JsonObject)json).get("content").getAsString(), FeedItem.class);
        }

        @Override
        public JsonElement serialize(FeedItem src, Type typeOfSrc, JsonSerializationContext context) {
            return mGson.toJsonTree(src);
        }
    }
}
