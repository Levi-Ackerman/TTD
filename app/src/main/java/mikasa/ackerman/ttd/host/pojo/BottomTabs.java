package mikasa.ackerman.ttd.host.pojo;

import java.util.List;

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
 * 2020/5/7 10:41 PM
 */
public class BottomTabs {

    /**
     * code : 0
     * data : {"all_tab_md5":"3b791c547fab6d6649869989062c2e77","jump_tab_md5":"8f96ba26b8124614b7e5eaaabd724451",
     * "middle_item":{"activity_list":null,"category_default_index":0,"category_pull_mode":[],
     * "click_track_url_ist":null,"click_track_url_list":null,"display_time_sec":0,"expire_seconds":0,"is_expand":0,
     * "new_tab_icon_url_bold_normal":"https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/tabs/hot_normal_bold.png",
     * "new_tab_icon_url_bold_pressed":"https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/tabs/hot_selected.png",
     * "new_tab_icon_url_normal":"http://p3.pstatp.com/origin/321a20004127065cb589f",
     * "new_tab_icon_url_pressed":"http://p3.pstatp.com/origin/321a600041531e1276826","rank":0,
     * "search_default_pd":"","show_track_url_list":null,"tab_channel_list":[{"parent_channel_id":0,
     * "channel_id":94349533046,"name":"热榜","type":5,"category":"hot_board","tip_new":0,"web_url":"https://i.snssdk
     * .com/feoffline/hot_list/template/hot_list/?fe_api_version=2&in_pindao=1&count=50&fe_source=hot_board&tab_name
     * =tab_hot_board&is_web_refresh=1&style_type=18&client_extra_params=%7B%22hot_board_source%22%3A%22hot_board%22
     * %2C%22style_id%22%3A%2210006%22%7D&log_pb=%7B%22entrance_hotspot%22%3A%22tab%22%2C%22style_id%22%3A%2210006%22
     * %2C%22location%22%3A%22hot_board%22%7D&extra=%7B%22CardStyle%22%3A0%2C%22JumpToWebList%22%3Atrue%7D&category
     * =hot_board&stream_api_version=88","default_add":0,"icon_url":"","icon_url2":"http://sf1-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png","description":"",
     * "flags":1,"concern_id":"","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
     * "gid":94349533046,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,"background_color":"",
     * "placehold_color":"","recommend_score":0,"hidden":0}],"tab_icon_url_normal":"http://p3.pstatp
     * .com/origin/2dedd000197bdc566cde8","tab_icon_url_pressed":"http://p1.pstatp.com/origin/2dedb0002de4029293ba6",
     * "tab_id":"tab_hot_board","tab_name":"热榜","tab_schema":"","tab_type":1},"middle_item_list":[{"activity_list
     * ":null,"category_default_index":0,"category_pull_mode":[],"click_track_url_ist":null,
     * "click_track_url_list":null,"display_time_sec":0,"expire_seconds":0,"is_expand":0,
     * "new_tab_icon_url_bold_normal":"https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/tabs/hot_normal_bold.png",
     * "new_tab_icon_url_bold_pressed":"https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/tabs/hot_selected.png",
     * "new_tab_icon_url_normal":"http://p3.pstatp.com/origin/321a20004127065cb589f",
     * "new_tab_icon_url_pressed":"http://p3.pstatp.com/origin/321a600041531e1276826","rank":0,
     * "search_default_pd":"","show_track_url_list":null,"tab_channel_list":[{"parent_channel_id":0,
     * "channel_id":94349533046,"name":"热榜","type":5,"category":"hot_board","tip_new":0,"web_url":"https://i.snssdk
     * .com/feoffline/hot_list/template/hot_list/?fe_api_version=2&in_pindao=1&count=50&fe_source=hot_board&tab_name
     * =tab_hot_board&is_web_refresh=1&style_type=18&client_extra_params=%7B%22hot_board_source%22%3A%22hot_board%22
     * %2C%22style_id%22%3A%2210006%22%7D&log_pb=%7B%22entrance_hotspot%22%3A%22tab%22%2C%22style_id%22%3A%2210006%22
     * %2C%22location%22%3A%22hot_board%22%7D&extra=%7B%22CardStyle%22%3A0%2C%22JumpToWebList%22%3Atrue%7D&category
     * =hot_board&stream_api_version=88","default_add":0,"icon_url":"","icon_url2":"http://sf1-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png","description":"",
     * "flags":1,"concern_id":"","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
     * "gid":94349533046,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,"background_color":"",
     * "placehold_color":"","recommend_score":0,"hidden":0}],"tab_icon_url_normal":"http://p3.pstatp
     * .com/origin/2dedd000197bdc566cde8","tab_icon_url_pressed":"http://p1.pstatp.com/origin/2dedb0002de4029293ba6",
     * "tab_id":"tab_hot_board","tab_name":"热榜","tab_schema":"","tab_type":1}],"normal_list":[{"activity_list":null,
     * "category_default_index":0,"category_pull_mode":[],"click_track_url_ist":null,"click_track_url_list":null,
     * "display_time_sec":0,"expire_seconds":0,"is_expand":0,"new_tab_icon_url_bold_normal":"",
     * "new_tab_icon_url_bold_pressed":"","new_tab_icon_url_normal":"http://p9.pstatp
     * .com/origin/321a7000414f12e38d43c","new_tab_icon_url_pressed":"http://p3.pstatp
     * .com/origin/3219f00041152ba472eb2","rank":0,"search_default_pd":"","show_track_url_list":null,
     * "tab_channel_list":[],"tab_icon_url_normal":"","tab_icon_url_pressed":"","tab_id":"tab_video",
     * "tab_name":"西瓜视频","tab_schema":"","tab_type":1},{"activity_list":[{"duration":259200,
     * "icon_url_normal":"http://sf1-ttcdn-tos.pstatp.com/obj/toutiao-cdn/hubble_pressed_compressed.png",
     * "icon_url_pressed":"http://sf1-ttcdn-tos.pstatp.com/obj/toutiao-cdn/hubble_normal_compressed.png",
     * "schema":"subv_tt_lvideo_hublleNew","start":1587769200,"tip":"独家 BBC 纪录片，带你畅游宇宙"}],"category_default_index":0,
     * "category_pull_mode":[],"click_track_url_ist":null,"click_track_url_list":null,"display_time_sec":0,
     * "expire_seconds":0,"is_expand":0,"new_tab_icon_url_bold_normal":"http://p3-tt.bytecdn
     * .cn/origin/tos-cn-i-0000/e9c2b752920a4699836b0d1264fd5437","new_tab_icon_url_bold_pressed":"http://p3-tt
     * .bytecdn.cn/origin/tos-cn-i-0000/ed2e659f578e49f59f9e6bea69bafb0d","new_tab_icon_url_normal":"http://p3.pstatp
     * .com/origin/321a7000417658a9d4439","new_tab_icon_url_pressed":"http://p9.pstatp
     * .com/origin/3219f00042c42be8ac8c6","rank":0,"search_default_pd":"","show_track_url_list":null,
     * "tab_channel_list":[],"tab_icon_url_normal":"http://p3-tt.bytecdn
     * .cn/origin/tos-cn-i-0000/a8b9ffc633d14c76b087554990e0c9a6","tab_icon_url_pressed":"http://p3-tt.bytecdn
     * .cn/origin/tos-cn-i-0000/6666cb6af8e34164a72ec5125628f274","tab_id":"tab_cinemanew","tab_name":"放映厅",
     * "tab_schema":"","tab_type":1}],"should_update":0,"system_time":1587872382}
     * msg :
     */

    @SerializedName("code")
    private int code;
    @SerializedName("data")
    private Data data;
    @SerializedName("msg")
    private String msg;

    public int getCode() { return code;}

    public void setCode(int code) { this.code = code;}

    public Data getData() { return data;}

    public void setData(Data data) { this.data = data;}

    public String getMsg() { return msg;}

    public void setMsg(String msg) { this.msg = msg;}

    public static class Data {
        /**
         * all_tab_md5 : 3b791c547fab6d6649869989062c2e77
         * jump_tab_md5 : 8f96ba26b8124614b7e5eaaabd724451
         * middle_item : {"activity_list":null,"category_default_index":0,"category_pull_mode":[],
         * "click_track_url_ist":null,"click_track_url_list":null,"display_time_sec":0,"expire_seconds":0,
         * "is_expand":0,"new_tab_icon_url_bold_normal":"https://sf1-ttcdn-tos.pstatp
         * .com/obj/ttfe/tabs/hot_normal_bold.png","new_tab_icon_url_bold_pressed":"https://sf1-ttcdn-tos.pstatp
         * .com/obj/ttfe/tabs/hot_selected.png","new_tab_icon_url_normal":"http://p3.pstatp
         * .com/origin/321a20004127065cb589f","new_tab_icon_url_pressed":"http://p3.pstatp
         * .com/origin/321a600041531e1276826","rank":0,"search_default_pd":"","show_track_url_list":null,
         * "tab_channel_list":[{"parent_channel_id":0,"channel_id":94349533046,"name":"热榜","type":5,
         * "category":"hot_board","tip_new":0,"web_url":"https://i.snssdk
         * .com/feoffline/hot_list/template/hot_list/?fe_api_version=2&in_pindao=1&count=50&fe_source=hot_board
         * &tab_name=tab_hot_board&is_web_refresh=1&style_type=18&client_extra_params=%7B%22hot_board_source%22%3A
         * %22hot_board%22%2C%22style_id%22%3A%2210006%22%7D&log_pb=%7B%22entrance_hotspot%22%3A%22tab%22%2C
         * %22style_id%22%3A%2210006%22%2C%22location%22%3A%22hot_board%22%7D&extra=%7B%22CardStyle%22%3A0%2C
         * %22JumpToWebList%22%3Atrue%7D&category=hot_board&stream_api_version=88","default_add":0,"icon_url":"",
         * "icon_url2":"http://sf1-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png","description":"",
         * "flags":1,"concern_id":"","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
         * "gid":94349533046,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,"background_color":"",
         * "placehold_color":"","recommend_score":0,"hidden":0}],"tab_icon_url_normal":"http://p3.pstatp
         * .com/origin/2dedd000197bdc566cde8","tab_icon_url_pressed":"http://p1.pstatp
         * .com/origin/2dedb0002de4029293ba6","tab_id":"tab_hot_board","tab_name":"热榜","tab_schema":"","tab_type":1}
         * middle_item_list : [{"activity_list":null,"category_default_index":0,"category_pull_mode":[],
         * "click_track_url_ist":null,"click_track_url_list":null,"display_time_sec":0,"expire_seconds":0,
         * "is_expand":0,"new_tab_icon_url_bold_normal":"https://sf1-ttcdn-tos.pstatp
         * .com/obj/ttfe/tabs/hot_normal_bold.png","new_tab_icon_url_bold_pressed":"https://sf1-ttcdn-tos.pstatp
         * .com/obj/ttfe/tabs/hot_selected.png","new_tab_icon_url_normal":"http://p3.pstatp
         * .com/origin/321a20004127065cb589f","new_tab_icon_url_pressed":"http://p3.pstatp
         * .com/origin/321a600041531e1276826","rank":0,"search_default_pd":"","show_track_url_list":null,
         * "tab_channel_list":[{"parent_channel_id":0,"channel_id":94349533046,"name":"热榜","type":5,
         * "category":"hot_board","tip_new":0,"web_url":"https://i.snssdk
         * .com/feoffline/hot_list/template/hot_list/?fe_api_version=2&in_pindao=1&count=50&fe_source=hot_board
         * &tab_name=tab_hot_board&is_web_refresh=1&style_type=18&client_extra_params=%7B%22hot_board_source%22%3A
         * %22hot_board%22%2C%22style_id%22%3A%2210006%22%7D&log_pb=%7B%22entrance_hotspot%22%3A%22tab%22%2C
         * %22style_id%22%3A%2210006%22%2C%22location%22%3A%22hot_board%22%7D&extra=%7B%22CardStyle%22%3A0%2C
         * %22JumpToWebList%22%3Atrue%7D&category=hot_board&stream_api_version=88","default_add":0,"icon_url":"",
         * "icon_url2":"http://sf1-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png","description":"",
         * "flags":1,"concern_id":"","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
         * "gid":94349533046,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,"background_color":"",
         * "placehold_color":"","recommend_score":0,"hidden":0}],"tab_icon_url_normal":"http://p3.pstatp
         * .com/origin/2dedd000197bdc566cde8","tab_icon_url_pressed":"http://p1.pstatp
         * .com/origin/2dedb0002de4029293ba6","tab_id":"tab_hot_board","tab_name":"热榜","tab_schema":"","tab_type":1}]
         * normal_list : [{"activity_list":null,"category_default_index":0,"category_pull_mode":[],
         * "click_track_url_ist":null,"click_track_url_list":null,"display_time_sec":0,"expire_seconds":0,
         * "is_expand":0,"new_tab_icon_url_bold_normal":"","new_tab_icon_url_bold_pressed":"",
         * "new_tab_icon_url_normal":"http://p9.pstatp.com/origin/321a7000414f12e38d43c",
         * "new_tab_icon_url_pressed":"http://p3.pstatp.com/origin/3219f00041152ba472eb2","rank":0,
         * "search_default_pd":"","show_track_url_list":null,"tab_channel_list":[],"tab_icon_url_normal":"",
         * "tab_icon_url_pressed":"","tab_id":"tab_video","tab_name":"西瓜视频","tab_schema":"","tab_type":1},{
         * "activity_list":[{"duration":259200,"icon_url_normal":"http://sf1-ttcdn-tos.pstatp
         * .com/obj/toutiao-cdn/hubble_pressed_compressed.png","icon_url_pressed":"http://sf1-ttcdn-tos.pstatp
         * .com/obj/toutiao-cdn/hubble_normal_compressed.png","schema":"subv_tt_lvideo_hublleNew","start":1587769200,
         * "tip":"独家 BBC 纪录片，带你畅游宇宙"}],"category_default_index":0,"category_pull_mode":[],"click_track_url_ist":null,
         * "click_track_url_list":null,"display_time_sec":0,"expire_seconds":0,"is_expand":0,
         * "new_tab_icon_url_bold_normal":"http://p3-tt.bytecdn
         * .cn/origin/tos-cn-i-0000/e9c2b752920a4699836b0d1264fd5437","new_tab_icon_url_bold_pressed":"http://p3-tt
         * .bytecdn.cn/origin/tos-cn-i-0000/ed2e659f578e49f59f9e6bea69bafb0d","new_tab_icon_url_normal":"http://p3
         * .pstatp.com/origin/321a7000417658a9d4439","new_tab_icon_url_pressed":"http://p9.pstatp
         * .com/origin/3219f00042c42be8ac8c6","rank":0,"search_default_pd":"","show_track_url_list":null,
         * "tab_channel_list":[],"tab_icon_url_normal":"http://p3-tt.bytecdn
         * .cn/origin/tos-cn-i-0000/a8b9ffc633d14c76b087554990e0c9a6","tab_icon_url_pressed":"http://p3-tt.bytecdn
         * .cn/origin/tos-cn-i-0000/6666cb6af8e34164a72ec5125628f274","tab_id":"tab_cinemanew","tab_name":"放映厅",
         * "tab_schema":"","tab_type":1}]
         * should_update : 0
         * system_time : 1587872382
         */

        @SerializedName("all_tab_md5")
        private String allTabMd5;
        @SerializedName("jump_tab_md5")
        private String jumpTabMd5;
        @SerializedName("middle_item")
        private MiddleItem middleItem;
        @SerializedName("should_update")
        private int shouldUpdate;
        @SerializedName("system_time")
        private int systemTime;
        @SerializedName("middle_item_list")
        private List<MiddleItemList> middleItemList;
        @SerializedName("normal_list")
        private List<NormalList> normalList;

        public String getAllTabMd5() { return allTabMd5;}

        public void setAllTabMd5(String allTabMd5) { this.allTabMd5 = allTabMd5;}

        public String getJumpTabMd5() { return jumpTabMd5;}

        public void setJumpTabMd5(String jumpTabMd5) { this.jumpTabMd5 = jumpTabMd5;}

        public MiddleItem getMiddleItem() { return middleItem;}

        public void setMiddleItem(MiddleItem middleItem) { this.middleItem = middleItem;}

        public int getShouldUpdate() { return shouldUpdate;}

        public void setShouldUpdate(int shouldUpdate) { this.shouldUpdate = shouldUpdate;}

        public int getSystemTime() { return systemTime;}

        public void setSystemTime(int systemTime) { this.systemTime = systemTime;}

        public List<MiddleItemList> getMiddleItemList() { return middleItemList;}

        public void setMiddleItemList(List<MiddleItemList> middleItemList) { this.middleItemList = middleItemList;}

        public List<NormalList> getNormalList() { return normalList;}

        public void setNormalList(List<NormalList> normalList) { this.normalList = normalList;}

        public static class MiddleItem {
            /**
             * activity_list : null
             * category_default_index : 0
             * category_pull_mode : []
             * click_track_url_ist : null
             * click_track_url_list : null
             * display_time_sec : 0
             * expire_seconds : 0
             * is_expand : 0
             * new_tab_icon_url_bold_normal : https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/tabs/hot_normal_bold.png
             * new_tab_icon_url_bold_pressed : https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/tabs/hot_selected.png
             * new_tab_icon_url_normal : http://p3.pstatp.com/origin/321a20004127065cb589f
             * new_tab_icon_url_pressed : http://p3.pstatp.com/origin/321a600041531e1276826
             * rank : 0
             * search_default_pd :
             * show_track_url_list : null
             * tab_channel_list : [{"parent_channel_id":0,"channel_id":94349533046,"name":"热榜","type":5,
             * "category":"hot_board","tip_new":0,"web_url":"https://i.snssdk
             * .com/feoffline/hot_list/template/hot_list/?fe_api_version=2&in_pindao=1&count=50&fe_source=hot_board
             * &tab_name=tab_hot_board&is_web_refresh=1&style_type=18&client_extra_params=%7B%22hot_board_source%22
             * %3A%22hot_board%22%2C%22style_id%22%3A%2210006%22%7D&log_pb=%7B%22entrance_hotspot%22%3A%22tab%22%2C
             * %22style_id%22%3A%2210006%22%2C%22location%22%3A%22hot_board%22%7D&extra=%7B%22CardStyle%22%3A0%2C
             * %22JumpToWebList%22%3Atrue%7D&category=hot_board&stream_api_version=88","default_add":0,"icon_url":"",
             * "icon_url2":"http://sf1-ttcdn-tos.pstatp
             * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png",
             * "description":"","flags":1,"concern_id":"","image_url":"http://s2.pstatp
             * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
             * "gid":94349533046,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
             * "background_color":"","placehold_color":"","recommend_score":0,"hidden":0}]
             * tab_icon_url_normal : http://p3.pstatp.com/origin/2dedd000197bdc566cde8
             * tab_icon_url_pressed : http://p1.pstatp.com/origin/2dedb0002de4029293ba6
             * tab_id : tab_hot_board
             * tab_name : 热榜
             * tab_schema :
             * tab_type : 1
             */

            @SerializedName("activity_list")
            private Object activityList;
            @SerializedName("category_default_index")
            private int categoryDefaultIndex;
            @SerializedName("click_track_url_ist")
            private Object clickTrackUrlIst;
            @SerializedName("click_track_url_list")
            private Object clickTrackUrlList;
            @SerializedName("display_time_sec")
            private int displayTimeSec;
            @SerializedName("expire_seconds")
            private int expireSeconds;
            @SerializedName("is_expand")
            private int isExpand;
            @SerializedName("new_tab_icon_url_bold_normal")
            private String newTabIconUrlBoldNormal;
            @SerializedName("new_tab_icon_url_bold_pressed")
            private String newTabIconUrlBoldPressed;
            @SerializedName("new_tab_icon_url_normal")
            private String newTabIconUrlNormal;
            @SerializedName("new_tab_icon_url_pressed")
            private String newTabIconUrlPressed;
            @SerializedName("rank")
            private int rank;
            @SerializedName("search_default_pd")
            private String searchDefaultPd;
            @SerializedName("show_track_url_list")
            private Object showTrackUrlList;
            @SerializedName("tab_icon_url_normal")
            private String tabIconUrlNormal;
            @SerializedName("tab_icon_url_pressed")
            private String tabIconUrlPressed;
            @SerializedName("tab_id")
            private String tabId;
            @SerializedName("tab_name")
            private String tabName;
            @SerializedName("tab_schema")
            private String tabSchema;
            @SerializedName("tab_type")
            private int tabType;
            @SerializedName("category_pull_mode")
            private List<?> categoryPullMode;
            @SerializedName("tab_channel_list")
            private List<TabChannelList> tabChannelList;

            public Object getActivityList() { return activityList;}

            public void setActivityList(Object activityList) { this.activityList = activityList;}

            public int getCategoryDefaultIndex() { return categoryDefaultIndex;}

            public void setCategoryDefaultIndex(int categoryDefaultIndex) {
                this.categoryDefaultIndex = categoryDefaultIndex;
            }

            public Object getClickTrackUrlIst() { return clickTrackUrlIst;}

            public void setClickTrackUrlIst(Object clickTrackUrlIst) { this.clickTrackUrlIst = clickTrackUrlIst;}

            public Object getClickTrackUrlList() { return clickTrackUrlList;}

            public void setClickTrackUrlList(Object clickTrackUrlList) { this.clickTrackUrlList = clickTrackUrlList;}

            public int getDisplayTimeSec() { return displayTimeSec;}

            public void setDisplayTimeSec(int displayTimeSec) { this.displayTimeSec = displayTimeSec;}

            public int getExpireSeconds() { return expireSeconds;}

            public void setExpireSeconds(int expireSeconds) { this.expireSeconds = expireSeconds;}

            public int getIsExpand() { return isExpand;}

            public void setIsExpand(int isExpand) { this.isExpand = isExpand;}

            public String getNewTabIconUrlBoldNormal() { return newTabIconUrlBoldNormal;}

            public void setNewTabIconUrlBoldNormal(String newTabIconUrlBoldNormal) {
                this.newTabIconUrlBoldNormal = newTabIconUrlBoldNormal;
            }

            public String getNewTabIconUrlBoldPressed() { return newTabIconUrlBoldPressed;}

            public void setNewTabIconUrlBoldPressed(String newTabIconUrlBoldPressed) {
                this.newTabIconUrlBoldPressed = newTabIconUrlBoldPressed;
            }

            public String getNewTabIconUrlNormal() { return newTabIconUrlNormal;}

            public void setNewTabIconUrlNormal(String newTabIconUrlNormal) {
                this.newTabIconUrlNormal = newTabIconUrlNormal;
            }

            public String getNewTabIconUrlPressed() { return newTabIconUrlPressed;}

            public void setNewTabIconUrlPressed(String newTabIconUrlPressed) {
                this.newTabIconUrlPressed = newTabIconUrlPressed;
            }

            public int getRank() { return rank;}

            public void setRank(int rank) { this.rank = rank;}

            public String getSearchDefaultPd() { return searchDefaultPd;}

            public void setSearchDefaultPd(String searchDefaultPd) { this.searchDefaultPd = searchDefaultPd;}

            public Object getShowTrackUrlList() { return showTrackUrlList;}

            public void setShowTrackUrlList(Object showTrackUrlList) { this.showTrackUrlList = showTrackUrlList;}

            public String getTabIconUrlNormal() { return tabIconUrlNormal;}

            public void setTabIconUrlNormal(String tabIconUrlNormal) { this.tabIconUrlNormal = tabIconUrlNormal;}

            public String getTabIconUrlPressed() { return tabIconUrlPressed;}

            public void setTabIconUrlPressed(String tabIconUrlPressed) { this.tabIconUrlPressed = tabIconUrlPressed;}

            public String getTabId() { return tabId;}

            public void setTabId(String tabId) { this.tabId = tabId;}

            public String getTabName() { return tabName;}

            public void setTabName(String tabName) { this.tabName = tabName;}

            public String getTabSchema() { return tabSchema;}

            public void setTabSchema(String tabSchema) { this.tabSchema = tabSchema;}

            public int getTabType() { return tabType;}

            public void setTabType(int tabType) { this.tabType = tabType;}

            public List<?> getCategoryPullMode() { return categoryPullMode;}

            public void setCategoryPullMode(List<?> categoryPullMode) { this.categoryPullMode = categoryPullMode;}

            public List<TabChannelList> getTabChannelList() { return tabChannelList;}

            public void setTabChannelList(List<TabChannelList> tabChannelList) { this.tabChannelList = tabChannelList;}

            public static class TabChannelList {
                /**
                 * parent_channel_id : 0
                 * channel_id : 94349533046
                 * name : 热榜
                 * type : 5
                 * category : hot_board
                 * tip_new : 0
                 * web_url : https://i.snssdk.com/feoffline/hot_list/template/hot_list/?fe_api_version=2&in_pindao=1
                 * &count=50&fe_source=hot_board&tab_name=tab_hot_board&is_web_refresh=1&style_type=18
                 * &client_extra_params=%7B%22hot_board_source%22%3A%22hot_board%22%2C%22style_id%22%3A%2210006%22%7D
                 * &log_pb=%7B%22entrance_hotspot%22%3A%22tab%22%2C%22style_id%22%3A%2210006%22%2C%22location%22%3A
                 * %22hot_board%22%7D&extra=%7B%22CardStyle%22%3A0%2C%22JumpToWebList%22%3Atrue%7D&category=hot_board
                 * &stream_api_version=88
                 * default_add : 0
                 * icon_url :
                 * icon_url2 : http://sf1-ttcdn-tos.pstatp
                 * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png
                 * description :
                 * flags : 1
                 * concern_id :
                 * image_url : http://s2.pstatp.com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA
                 * %95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg
                 * gid : 94349533046
                 * hor_immersive_category : tt_subv_landscape
                 * feed_list_style : 0
                 * background_color :
                 * placehold_color :
                 * recommend_score : 0
                 * hidden : 0
                 */

                @SerializedName("parent_channel_id")
                private int parentChannelId;
                @SerializedName("channel_id")
                private long channelId;
                @SerializedName("name")
                private String name;
                @SerializedName("type")
                private int type;
                @SerializedName("category")
                private String category;
                @SerializedName("tip_new")
                private int tipNew;
                @SerializedName("web_url")
                private String webUrl;
                @SerializedName("default_add")
                private int defaultAdd;
                @SerializedName("icon_url")
                private String iconUrl;
                @SerializedName("icon_url2")
                private String iconUrl2;
                @SerializedName("description")
                private String description;
                @SerializedName("flags")
                private int flags;
                @SerializedName("concern_id")
                private String concernId;
                @SerializedName("image_url")
                private String imageUrl;
                @SerializedName("gid")
                private long gid;
                @SerializedName("hor_immersive_category")
                private String horImmersiveCategory;
                @SerializedName("feed_list_style")
                private int feedListStyle;
                @SerializedName("background_color")
                private String backgroundColor;
                @SerializedName("placehold_color")
                private String placeholdColor;
                @SerializedName("recommend_score")
                private int recommendScore;
                @SerializedName("hidden")
                private int hidden;

                public int getParentChannelId() { return parentChannelId;}

                public void setParentChannelId(int parentChannelId) { this.parentChannelId = parentChannelId;}

                public long getChannelId() { return channelId;}

                public void setChannelId(long channelId) { this.channelId = channelId;}

                public String getName() { return name;}

                public void setName(String name) { this.name = name;}

                public int getType() { return type;}

                public void setType(int type) { this.type = type;}

                public String getCategory() { return category;}

                public void setCategory(String category) { this.category = category;}

                public int getTipNew() { return tipNew;}

                public void setTipNew(int tipNew) { this.tipNew = tipNew;}

                public String getWebUrl() { return webUrl;}

                public void setWebUrl(String webUrl) { this.webUrl = webUrl;}

                public int getDefaultAdd() { return defaultAdd;}

                public void setDefaultAdd(int defaultAdd) { this.defaultAdd = defaultAdd;}

                public String getIconUrl() { return iconUrl;}

                public void setIconUrl(String iconUrl) { this.iconUrl = iconUrl;}

                public String getIconUrl2() { return iconUrl2;}

                public void setIconUrl2(String iconUrl2) { this.iconUrl2 = iconUrl2;}

                public String getDescription() { return description;}

                public void setDescription(String description) { this.description = description;}

                public int getFlags() { return flags;}

                public void setFlags(int flags) { this.flags = flags;}

                public String getConcernId() { return concernId;}

                public void setConcernId(String concernId) { this.concernId = concernId;}

                public String getImageUrl() { return imageUrl;}

                public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl;}

                public long getGid() { return gid;}

                public void setGid(long gid) { this.gid = gid;}

                public String getHorImmersiveCategory() { return horImmersiveCategory;}

                public void setHorImmersiveCategory(String horImmersiveCategory) {
                    this.horImmersiveCategory = horImmersiveCategory;
                }

                public int getFeedListStyle() { return feedListStyle;}

                public void setFeedListStyle(int feedListStyle) { this.feedListStyle = feedListStyle;}

                public String getBackgroundColor() { return backgroundColor;}

                public void setBackgroundColor(String backgroundColor) { this.backgroundColor = backgroundColor;}

                public String getPlaceholdColor() { return placeholdColor;}

                public void setPlaceholdColor(String placeholdColor) { this.placeholdColor = placeholdColor;}

                public int getRecommendScore() { return recommendScore;}

                public void setRecommendScore(int recommendScore) { this.recommendScore = recommendScore;}

                public int getHidden() { return hidden;}

                public void setHidden(int hidden) { this.hidden = hidden;}
            }
        }

        public static class MiddleItemList {
            /**
             * activity_list : null
             * category_default_index : 0
             * category_pull_mode : []
             * click_track_url_ist : null
             * click_track_url_list : null
             * display_time_sec : 0
             * expire_seconds : 0
             * is_expand : 0
             * new_tab_icon_url_bold_normal : https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/tabs/hot_normal_bold.png
             * new_tab_icon_url_bold_pressed : https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/tabs/hot_selected.png
             * new_tab_icon_url_normal : http://p3.pstatp.com/origin/321a20004127065cb589f
             * new_tab_icon_url_pressed : http://p3.pstatp.com/origin/321a600041531e1276826
             * rank : 0
             * search_default_pd :
             * show_track_url_list : null
             * tab_channel_list : [{"parent_channel_id":0,"channel_id":94349533046,"name":"热榜","type":5,
             * "category":"hot_board","tip_new":0,"web_url":"https://i.snssdk
             * .com/feoffline/hot_list/template/hot_list/?fe_api_version=2&in_pindao=1&count=50&fe_source=hot_board
             * &tab_name=tab_hot_board&is_web_refresh=1&style_type=18&client_extra_params=%7B%22hot_board_source%22
             * %3A%22hot_board%22%2C%22style_id%22%3A%2210006%22%7D&log_pb=%7B%22entrance_hotspot%22%3A%22tab%22%2C
             * %22style_id%22%3A%2210006%22%2C%22location%22%3A%22hot_board%22%7D&extra=%7B%22CardStyle%22%3A0%2C
             * %22JumpToWebList%22%3Atrue%7D&category=hot_board&stream_api_version=88","default_add":0,"icon_url":"",
             * "icon_url2":"http://sf1-ttcdn-tos.pstatp
             * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png",
             * "description":"","flags":1,"concern_id":"","image_url":"http://s2.pstatp
             * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
             * "gid":94349533046,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
             * "background_color":"","placehold_color":"","recommend_score":0,"hidden":0}]
             * tab_icon_url_normal : http://p3.pstatp.com/origin/2dedd000197bdc566cde8
             * tab_icon_url_pressed : http://p1.pstatp.com/origin/2dedb0002de4029293ba6
             * tab_id : tab_hot_board
             * tab_name : 热榜
             * tab_schema :
             * tab_type : 1
             */

            @SerializedName("activity_list")
            private Object activityList;
            @SerializedName("category_default_index")
            private int categoryDefaultIndex;
            @SerializedName("click_track_url_ist")
            private Object clickTrackUrlIst;
            @SerializedName("click_track_url_list")
            private Object clickTrackUrlList;
            @SerializedName("display_time_sec")
            private int displayTimeSec;
            @SerializedName("expire_seconds")
            private int expireSeconds;
            @SerializedName("is_expand")
            private int isExpand;
            @SerializedName("new_tab_icon_url_bold_normal")
            private String newTabIconUrlBoldNormal;
            @SerializedName("new_tab_icon_url_bold_pressed")
            private String newTabIconUrlBoldPressed;
            @SerializedName("new_tab_icon_url_normal")
            private String newTabIconUrlNormal;
            @SerializedName("new_tab_icon_url_pressed")
            private String newTabIconUrlPressed;
            @SerializedName("rank")
            private int rank;
            @SerializedName("search_default_pd")
            private String searchDefaultPd;
            @SerializedName("show_track_url_list")
            private Object showTrackUrlList;
            @SerializedName("tab_icon_url_normal")
            private String tabIconUrlNormal;
            @SerializedName("tab_icon_url_pressed")
            private String tabIconUrlPressed;
            @SerializedName("tab_id")
            private String tabId;
            @SerializedName("tab_name")
            private String tabName;
            @SerializedName("tab_schema")
            private String tabSchema;
            @SerializedName("tab_type")
            private int tabType;
            @SerializedName("category_pull_mode")
            private List<?> categoryPullMode;
            @SerializedName("tab_channel_list")
            private List<TabChannelListX> tabChannelList;

            public Object getActivityList() { return activityList;}

            public void setActivityList(Object activityList) { this.activityList = activityList;}

            public int getCategoryDefaultIndex() { return categoryDefaultIndex;}

            public void setCategoryDefaultIndex(int categoryDefaultIndex) {
                this.categoryDefaultIndex = categoryDefaultIndex;
            }

            public Object getClickTrackUrlIst() { return clickTrackUrlIst;}

            public void setClickTrackUrlIst(Object clickTrackUrlIst) { this.clickTrackUrlIst = clickTrackUrlIst;}

            public Object getClickTrackUrlList() { return clickTrackUrlList;}

            public void setClickTrackUrlList(Object clickTrackUrlList) { this.clickTrackUrlList = clickTrackUrlList;}

            public int getDisplayTimeSec() { return displayTimeSec;}

            public void setDisplayTimeSec(int displayTimeSec) { this.displayTimeSec = displayTimeSec;}

            public int getExpireSeconds() { return expireSeconds;}

            public void setExpireSeconds(int expireSeconds) { this.expireSeconds = expireSeconds;}

            public int getIsExpand() { return isExpand;}

            public void setIsExpand(int isExpand) { this.isExpand = isExpand;}

            public String getNewTabIconUrlBoldNormal() { return newTabIconUrlBoldNormal;}

            public void setNewTabIconUrlBoldNormal(String newTabIconUrlBoldNormal) {
                this.newTabIconUrlBoldNormal = newTabIconUrlBoldNormal;
            }

            public String getNewTabIconUrlBoldPressed() { return newTabIconUrlBoldPressed;}

            public void setNewTabIconUrlBoldPressed(String newTabIconUrlBoldPressed) {
                this.newTabIconUrlBoldPressed = newTabIconUrlBoldPressed;
            }

            public String getNewTabIconUrlNormal() { return newTabIconUrlNormal;}

            public void setNewTabIconUrlNormal(String newTabIconUrlNormal) {
                this.newTabIconUrlNormal = newTabIconUrlNormal;
            }

            public String getNewTabIconUrlPressed() { return newTabIconUrlPressed;}

            public void setNewTabIconUrlPressed(String newTabIconUrlPressed) {
                this.newTabIconUrlPressed = newTabIconUrlPressed;
            }

            public int getRank() { return rank;}

            public void setRank(int rank) { this.rank = rank;}

            public String getSearchDefaultPd() { return searchDefaultPd;}

            public void setSearchDefaultPd(String searchDefaultPd) { this.searchDefaultPd = searchDefaultPd;}

            public Object getShowTrackUrlList() { return showTrackUrlList;}

            public void setShowTrackUrlList(Object showTrackUrlList) { this.showTrackUrlList = showTrackUrlList;}

            public String getTabIconUrlNormal() { return tabIconUrlNormal;}

            public void setTabIconUrlNormal(String tabIconUrlNormal) { this.tabIconUrlNormal = tabIconUrlNormal;}

            public String getTabIconUrlPressed() { return tabIconUrlPressed;}

            public void setTabIconUrlPressed(String tabIconUrlPressed) { this.tabIconUrlPressed = tabIconUrlPressed;}

            public String getTabId() { return tabId;}

            public void setTabId(String tabId) { this.tabId = tabId;}

            public String getTabName() { return tabName;}

            public void setTabName(String tabName) { this.tabName = tabName;}

            public String getTabSchema() { return tabSchema;}

            public void setTabSchema(String tabSchema) { this.tabSchema = tabSchema;}

            public int getTabType() { return tabType;}

            public void setTabType(int tabType) { this.tabType = tabType;}

            public List<?> getCategoryPullMode() { return categoryPullMode;}

            public void setCategoryPullMode(List<?> categoryPullMode) { this.categoryPullMode = categoryPullMode;}

            public List<TabChannelListX> getTabChannelList() { return tabChannelList;}

            public void setTabChannelList(List<TabChannelListX> tabChannelList) { this.tabChannelList = tabChannelList;}

            public static class TabChannelListX {
                /**
                 * parent_channel_id : 0
                 * channel_id : 94349533046
                 * name : 热榜
                 * type : 5
                 * category : hot_board
                 * tip_new : 0
                 * web_url : https://i.snssdk.com/feoffline/hot_list/template/hot_list/?fe_api_version=2&in_pindao=1
                 * &count=50&fe_source=hot_board&tab_name=tab_hot_board&is_web_refresh=1&style_type=18
                 * &client_extra_params=%7B%22hot_board_source%22%3A%22hot_board%22%2C%22style_id%22%3A%2210006%22%7D
                 * &log_pb=%7B%22entrance_hotspot%22%3A%22tab%22%2C%22style_id%22%3A%2210006%22%2C%22location%22%3A
                 * %22hot_board%22%7D&extra=%7B%22CardStyle%22%3A0%2C%22JumpToWebList%22%3Atrue%7D&category=hot_board
                 * &stream_api_version=88
                 * default_add : 0
                 * icon_url :
                 * icon_url2 : http://sf1-ttcdn-tos.pstatp
                 * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png
                 * description :
                 * flags : 1
                 * concern_id :
                 * image_url : http://s2.pstatp.com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA
                 * %95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg
                 * gid : 94349533046
                 * hor_immersive_category : tt_subv_landscape
                 * feed_list_style : 0
                 * background_color :
                 * placehold_color :
                 * recommend_score : 0
                 * hidden : 0
                 */

                @SerializedName("parent_channel_id")
                private int parentChannelId;
                @SerializedName("channel_id")
                private long channelId;
                @SerializedName("name")
                private String name;
                @SerializedName("type")
                private int type;
                @SerializedName("category")
                private String category;
                @SerializedName("tip_new")
                private int tipNew;
                @SerializedName("web_url")
                private String webUrl;
                @SerializedName("default_add")
                private int defaultAdd;
                @SerializedName("icon_url")
                private String iconUrl;
                @SerializedName("icon_url2")
                private String iconUrl2;
                @SerializedName("description")
                private String description;
                @SerializedName("flags")
                private int flags;
                @SerializedName("concern_id")
                private String concernId;
                @SerializedName("image_url")
                private String imageUrl;
                @SerializedName("gid")
                private long gid;
                @SerializedName("hor_immersive_category")
                private String horImmersiveCategory;
                @SerializedName("feed_list_style")
                private int feedListStyle;
                @SerializedName("background_color")
                private String backgroundColor;
                @SerializedName("placehold_color")
                private String placeholdColor;
                @SerializedName("recommend_score")
                private int recommendScore;
                @SerializedName("hidden")
                private int hidden;

                public int getParentChannelId() { return parentChannelId;}

                public void setParentChannelId(int parentChannelId) { this.parentChannelId = parentChannelId;}

                public long getChannelId() { return channelId;}

                public void setChannelId(long channelId) { this.channelId = channelId;}

                public String getName() { return name;}

                public void setName(String name) { this.name = name;}

                public int getType() { return type;}

                public void setType(int type) { this.type = type;}

                public String getCategory() { return category;}

                public void setCategory(String category) { this.category = category;}

                public int getTipNew() { return tipNew;}

                public void setTipNew(int tipNew) { this.tipNew = tipNew;}

                public String getWebUrl() { return webUrl;}

                public void setWebUrl(String webUrl) { this.webUrl = webUrl;}

                public int getDefaultAdd() { return defaultAdd;}

                public void setDefaultAdd(int defaultAdd) { this.defaultAdd = defaultAdd;}

                public String getIconUrl() { return iconUrl;}

                public void setIconUrl(String iconUrl) { this.iconUrl = iconUrl;}

                public String getIconUrl2() { return iconUrl2;}

                public void setIconUrl2(String iconUrl2) { this.iconUrl2 = iconUrl2;}

                public String getDescription() { return description;}

                public void setDescription(String description) { this.description = description;}

                public int getFlags() { return flags;}

                public void setFlags(int flags) { this.flags = flags;}

                public String getConcernId() { return concernId;}

                public void setConcernId(String concernId) { this.concernId = concernId;}

                public String getImageUrl() { return imageUrl;}

                public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl;}

                public long getGid() { return gid;}

                public void setGid(long gid) { this.gid = gid;}

                public String getHorImmersiveCategory() { return horImmersiveCategory;}

                public void setHorImmersiveCategory(String horImmersiveCategory) {
                    this.horImmersiveCategory = horImmersiveCategory;
                }

                public int getFeedListStyle() { return feedListStyle;}

                public void setFeedListStyle(int feedListStyle) { this.feedListStyle = feedListStyle;}

                public String getBackgroundColor() { return backgroundColor;}

                public void setBackgroundColor(String backgroundColor) { this.backgroundColor = backgroundColor;}

                public String getPlaceholdColor() { return placeholdColor;}

                public void setPlaceholdColor(String placeholdColor) { this.placeholdColor = placeholdColor;}

                public int getRecommendScore() { return recommendScore;}

                public void setRecommendScore(int recommendScore) { this.recommendScore = recommendScore;}

                public int getHidden() { return hidden;}

                public void setHidden(int hidden) { this.hidden = hidden;}
            }
        }

        public static class NormalList {
            /**
             * activity_list : null
             * category_default_index : 0
             * category_pull_mode : []
             * click_track_url_ist : null
             * click_track_url_list : null
             * display_time_sec : 0
             * expire_seconds : 0
             * is_expand : 0
             * new_tab_icon_url_bold_normal :
             * new_tab_icon_url_bold_pressed :
             * new_tab_icon_url_normal : http://p9.pstatp.com/origin/321a7000414f12e38d43c
             * new_tab_icon_url_pressed : http://p3.pstatp.com/origin/3219f00041152ba472eb2
             * rank : 0
             * search_default_pd :
             * show_track_url_list : null
             * tab_channel_list : []
             * tab_icon_url_normal :
             * tab_icon_url_pressed :
             * tab_id : tab_video
             * tab_name : 西瓜视频
             * tab_schema :
             * tab_type : 1
             */

            @SerializedName("activity_list")
            private Object activityList;
            @SerializedName("category_default_index")
            private int categoryDefaultIndex;
            @SerializedName("click_track_url_ist")
            private Object clickTrackUrlIst;
            @SerializedName("click_track_url_list")
            private Object clickTrackUrlList;
            @SerializedName("display_time_sec")
            private int displayTimeSec;
            @SerializedName("expire_seconds")
            private int expireSeconds;
            @SerializedName("is_expand")
            private int isExpand;
            @SerializedName("new_tab_icon_url_bold_normal")
            private String newTabIconUrlBoldNormal;
            @SerializedName("new_tab_icon_url_bold_pressed")
            private String newTabIconUrlBoldPressed;
            @SerializedName("new_tab_icon_url_normal")
            private String newTabIconUrlNormal;
            @SerializedName("new_tab_icon_url_pressed")
            private String newTabIconUrlPressed;
            @SerializedName("rank")
            private int rank;
            @SerializedName("search_default_pd")
            private String searchDefaultPd;
            @SerializedName("show_track_url_list")
            private Object showTrackUrlList;
            @SerializedName("tab_icon_url_normal")
            private String tabIconUrlNormal;
            @SerializedName("tab_icon_url_pressed")
            private String tabIconUrlPressed;
            @SerializedName("tab_id")
            private String tabId;
            @SerializedName("tab_name")
            private String tabName;
            @SerializedName("tab_schema")
            private String tabSchema;
            @SerializedName("tab_type")
            private int tabType;
            @SerializedName("category_pull_mode")
            private List<?> categoryPullMode;
            @SerializedName("tab_channel_list")
            private List<?> tabChannelList;

            public Object getActivityList() { return activityList;}

            public void setActivityList(Object activityList) { this.activityList = activityList;}

            public int getCategoryDefaultIndex() { return categoryDefaultIndex;}

            public void setCategoryDefaultIndex(int categoryDefaultIndex) {
                this.categoryDefaultIndex = categoryDefaultIndex;
            }

            public Object getClickTrackUrlIst() { return clickTrackUrlIst;}

            public void setClickTrackUrlIst(Object clickTrackUrlIst) { this.clickTrackUrlIst = clickTrackUrlIst;}

            public Object getClickTrackUrlList() { return clickTrackUrlList;}

            public void setClickTrackUrlList(Object clickTrackUrlList) { this.clickTrackUrlList = clickTrackUrlList;}

            public int getDisplayTimeSec() { return displayTimeSec;}

            public void setDisplayTimeSec(int displayTimeSec) { this.displayTimeSec = displayTimeSec;}

            public int getExpireSeconds() { return expireSeconds;}

            public void setExpireSeconds(int expireSeconds) { this.expireSeconds = expireSeconds;}

            public int getIsExpand() { return isExpand;}

            public void setIsExpand(int isExpand) { this.isExpand = isExpand;}

            public String getNewTabIconUrlBoldNormal() { return newTabIconUrlBoldNormal;}

            public void setNewTabIconUrlBoldNormal(String newTabIconUrlBoldNormal) {
                this.newTabIconUrlBoldNormal = newTabIconUrlBoldNormal;
            }

            public String getNewTabIconUrlBoldPressed() { return newTabIconUrlBoldPressed;}

            public void setNewTabIconUrlBoldPressed(String newTabIconUrlBoldPressed) {
                this.newTabIconUrlBoldPressed = newTabIconUrlBoldPressed;
            }

            public String getNewTabIconUrlNormal() { return newTabIconUrlNormal;}

            public void setNewTabIconUrlNormal(String newTabIconUrlNormal) {
                this.newTabIconUrlNormal = newTabIconUrlNormal;
            }

            public String getNewTabIconUrlPressed() { return newTabIconUrlPressed;}

            public void setNewTabIconUrlPressed(String newTabIconUrlPressed) {
                this.newTabIconUrlPressed = newTabIconUrlPressed;
            }

            public int getRank() { return rank;}

            public void setRank(int rank) { this.rank = rank;}

            public String getSearchDefaultPd() { return searchDefaultPd;}

            public void setSearchDefaultPd(String searchDefaultPd) { this.searchDefaultPd = searchDefaultPd;}

            public Object getShowTrackUrlList() { return showTrackUrlList;}

            public void setShowTrackUrlList(Object showTrackUrlList) { this.showTrackUrlList = showTrackUrlList;}

            public String getTabIconUrlNormal() { return tabIconUrlNormal;}

            public void setTabIconUrlNormal(String tabIconUrlNormal) { this.tabIconUrlNormal = tabIconUrlNormal;}

            public String getTabIconUrlPressed() { return tabIconUrlPressed;}

            public void setTabIconUrlPressed(String tabIconUrlPressed) { this.tabIconUrlPressed = tabIconUrlPressed;}

            public String getTabId() { return tabId;}

            public void setTabId(String tabId) { this.tabId = tabId;}

            public String getTabName() { return tabName;}

            public void setTabName(String tabName) { this.tabName = tabName;}

            public String getTabSchema() { return tabSchema;}

            public void setTabSchema(String tabSchema) { this.tabSchema = tabSchema;}

            public int getTabType() { return tabType;}

            public void setTabType(int tabType) { this.tabType = tabType;}

            public List<?> getCategoryPullMode() { return categoryPullMode;}

            public void setCategoryPullMode(List<?> categoryPullMode) { this.categoryPullMode = categoryPullMode;}

            public List<?> getTabChannelList() { return tabChannelList;}

            public void setTabChannelList(List<?> tabChannelList) { this.tabChannelList = tabChannelList;}
        }
    }
}
