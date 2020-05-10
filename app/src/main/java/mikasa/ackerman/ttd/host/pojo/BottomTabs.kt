package mikasa.ackerman.ttd.host.pojo

import com.google.gson.annotations.SerializedName

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
 * 2020/5/7 10:41 PM
 */
class BottomTabs : IPojo<List<BottomTabs.Data.NormalList>> {

    override fun isEmpty(): Boolean? {
        return data?.normalList?.isEmpty()
    }

    override fun getContent(): List<Data.NormalList>? {
        return data?.normalList
    }

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
    var code = 0

    @SerializedName("data")
    var data: Data? = null

    @SerializedName("msg")
    var msg: String? = null

    class Data {
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
        var allTabMd5: String? = null

        @SerializedName("jump_tab_md5")
        var jumpTabMd5: String? = null

        @SerializedName("middle_item")
        var middleItem: MiddleItem? = null

        @SerializedName("should_update")
        var shouldUpdate = 0

        @SerializedName("system_time")
        var systemTime = 0

        @SerializedName("middle_item_list")
        var middleItemList: List<MiddleItemList>? = null

        @SerializedName("normal_list")
        var normalList: List<NormalList>? = null

        class MiddleItem {
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
            var activityList: Any? = null

            @SerializedName("category_default_index")
            var categoryDefaultIndex = 0

            @SerializedName("click_track_url_ist")
            var clickTrackUrlIst: Any? = null

            @SerializedName("click_track_url_list")
            var clickTrackUrlList: Any? = null

            @SerializedName("display_time_sec")
            var displayTimeSec = 0

            @SerializedName("expire_seconds")
            var expireSeconds = 0

            @SerializedName("is_expand")
            var isExpand = 0

            @SerializedName("new_tab_icon_url_bold_normal")
            var newTabIconUrlBoldNormal: String? = null

            @SerializedName("new_tab_icon_url_bold_pressed")
            var newTabIconUrlBoldPressed: String? = null

            @SerializedName("new_tab_icon_url_normal")
            var newTabIconUrlNormal: String? = null

            @SerializedName("new_tab_icon_url_pressed")
            var newTabIconUrlPressed: String? = null

            @SerializedName("rank")
            var rank = 0

            @SerializedName("search_default_pd")
            var searchDefaultPd: String? = null

            @SerializedName("show_track_url_list")
            var showTrackUrlList: Any? = null

            @SerializedName("tab_icon_url_normal")
            var tabIconUrlNormal: String? = null

            @SerializedName("tab_icon_url_pressed")
            var tabIconUrlPressed: String? = null

            @SerializedName("tab_id")
            var tabId: String? = null

            @SerializedName("tab_name")
            var tabName: String? = null

            @SerializedName("tab_schema")
            var tabSchema: String? = null

            @SerializedName("tab_type")
            var tabType = 0

            @SerializedName("category_pull_mode")
            var categoryPullMode: List<*>? = null

            @SerializedName("tab_channel_list")
            var tabChannelList: List<TabChannelList>? = null

            class TabChannelList {
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
                var parentChannelId = 0

                @SerializedName("channel_id")
                var channelId: Long = 0

                @SerializedName("name")
                var name: String? = null

                @SerializedName("type")
                var type = 0

                @SerializedName("category")
                var category: String? = null

                @SerializedName("tip_new")
                var tipNew = 0

                @SerializedName("web_url")
                var webUrl: String? = null

                @SerializedName("default_add")
                var defaultAdd = 0

                @SerializedName("icon_url")
                var iconUrl: String? = null

                @SerializedName("icon_url2")
                var iconUrl2: String? = null

                @SerializedName("description")
                var description: String? = null

                @SerializedName("flags")
                var flags = 0

                @SerializedName("concern_id")
                var concernId: String? = null

                @SerializedName("image_url")
                var imageUrl: String? = null

                @SerializedName("gid")
                var gid: Long = 0

                @SerializedName("hor_immersive_category")
                var horImmersiveCategory: String? = null

                @SerializedName("feed_list_style")
                var feedListStyle = 0

                @SerializedName("background_color")
                var backgroundColor: String? = null

                @SerializedName("placehold_color")
                var placeholdColor: String? = null

                @SerializedName("recommend_score")
                var recommendScore = 0

                @SerializedName("hidden")
                var hidden = 0

            }
        }

        class MiddleItemList {
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
            var activityList: Any? = null

            @SerializedName("category_default_index")
            var categoryDefaultIndex = 0

            @SerializedName("click_track_url_ist")
            var clickTrackUrlIst: Any? = null

            @SerializedName("click_track_url_list")
            var clickTrackUrlList: Any? = null

            @SerializedName("display_time_sec")
            var displayTimeSec = 0

            @SerializedName("expire_seconds")
            var expireSeconds = 0

            @SerializedName("is_expand")
            var isExpand = 0

            @SerializedName("new_tab_icon_url_bold_normal")
            var newTabIconUrlBoldNormal: String? = null

            @SerializedName("new_tab_icon_url_bold_pressed")
            var newTabIconUrlBoldPressed: String? = null

            @SerializedName("new_tab_icon_url_normal")
            var newTabIconUrlNormal: String? = null

            @SerializedName("new_tab_icon_url_pressed")
            var newTabIconUrlPressed: String? = null

            @SerializedName("rank")
            var rank = 0

            @SerializedName("search_default_pd")
            var searchDefaultPd: String? = null

            @SerializedName("show_track_url_list")
            var showTrackUrlList: Any? = null

            @SerializedName("tab_icon_url_normal")
            var tabIconUrlNormal: String? = null

            @SerializedName("tab_icon_url_pressed")
            var tabIconUrlPressed: String? = null

            @SerializedName("tab_id")
            var tabId: String? = null

            @SerializedName("tab_name")
            var tabName: String? = null

            @SerializedName("tab_schema")
            var tabSchema: String? = null

            @SerializedName("tab_type")
            var tabType = 0

            @SerializedName("category_pull_mode")
            var categoryPullMode: List<*>? = null

            @SerializedName("tab_channel_list")
            var tabChannelList: List<TabChannelListX>? = null

            class TabChannelListX {
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
                var parentChannelId = 0

                @SerializedName("channel_id")
                var channelId: Long = 0

                @SerializedName("name")
                var name: String? = null

                @SerializedName("type")
                var type = 0

                @SerializedName("category")
                var category: String? = null

                @SerializedName("tip_new")
                var tipNew = 0

                @SerializedName("web_url")
                var webUrl: String? = null

                @SerializedName("default_add")
                var defaultAdd = 0

                @SerializedName("icon_url")
                var iconUrl: String? = null

                @SerializedName("icon_url2")
                var iconUrl2: String? = null

                @SerializedName("description")
                var description: String? = null

                @SerializedName("flags")
                var flags = 0

                @SerializedName("concern_id")
                var concernId: String? = null

                @SerializedName("image_url")
                var imageUrl: String? = null

                @SerializedName("gid")
                var gid: Long = 0

                @SerializedName("hor_immersive_category")
                var horImmersiveCategory: String? = null

                @SerializedName("feed_list_style")
                var feedListStyle = 0

                @SerializedName("background_color")
                var backgroundColor: String? = null

                @SerializedName("placehold_color")
                var placeholdColor: String? = null

                @SerializedName("recommend_score")
                var recommendScore = 0

                @SerializedName("hidden")
                var hidden = 0

            }
        }

        class NormalList {
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
            var activityList: Any? = null

            @SerializedName("category_default_index")
            var categoryDefaultIndex = 0

            @SerializedName("click_track_url_ist")
            var clickTrackUrlIst: Any? = null

            @SerializedName("click_track_url_list")
            var clickTrackUrlList: Any? = null

            @SerializedName("display_time_sec")
            var displayTimeSec = 0

            @SerializedName("expire_seconds")
            var expireSeconds = 0

            @SerializedName("is_expand")
            var isExpand = 0

            @SerializedName("new_tab_icon_url_bold_normal")
            var newTabIconUrlBoldNormal: String? = null

            @SerializedName("new_tab_icon_url_bold_pressed")
            var newTabIconUrlBoldPressed: String? = null

            @SerializedName("new_tab_icon_url_normal")
            var newTabIconUrlNormal: String? = null

            @SerializedName("new_tab_icon_url_pressed")
            var newTabIconUrlPressed: String? = null

            @SerializedName("rank")
            var rank = 0

            @SerializedName("search_default_pd")
            var searchDefaultPd: String? = null

            @SerializedName("show_track_url_list")
            var showTrackUrlList: Any? = null

            @SerializedName("tab_icon_url_normal")
            var tabIconUrlNormal: String? = null

            @SerializedName("tab_icon_url_pressed")
            var tabIconUrlPressed: String? = null

            @SerializedName("tab_id")
            var tabId: String? = null

            @SerializedName("tab_name")
            var tabName: String? = null

            @SerializedName("tab_schema")
            var tabSchema: String? = null

            @SerializedName("tab_type")
            var tabType = 0

            @SerializedName("category_pull_mode")
            var categoryPullMode: List<*>? = null

            @SerializedName("tab_channel_list")
            var tabChannelList: List<*>? = null

        }
    }
}