package mikasa.ackerman.ttd.host.network

import mikasa.ackerman.ttd.host.pojo.FeedList
import retrofit2.Call
import retrofit2.http.GET

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
 * 2020/5/13 9:31 PM
 */
interface FeedService {
    @GET("/api/news/feed/v88/?st_time=259&ad_ui_style=%7B%22is_crowd_generalization_style%22%3A1%2C%22van_package%22%3A130000030%7D&lynx_template_data=%5B%5D&lynx_version=0.2.5.2-bugfix&last_response_extra=%7B%22data%22%3A%22e30%22%7D&last_ad_show_interval=262&cached_item_num=0&list_count=18&support_rn=4&concern_id=6286225228934679042&refer=1&refresh_reason=1&session_refresh_idx=3&count=20&min_behot_time=1589376352&last_refresh_sub_entrance_interval=1589376615&client_extra_params=%7B%22last_ad_position%22%3A-1%2C%22prefer_profile_change%22%3A0%2C%22lynx_version_json%22%3A%22%7B%5C%22ugc_lynx_native_hotboard_card%5C%22%3A74006%2C%5C%22ugc_lynx_survey%5C%22%3A76400%2C%5C%22live_chat_header%5C%22%3A73801%2C%5C%22tt_lynx_hotboard%5C%22%3A76903%2C%5C%22new_local_stick_cell%5C%22%3A76600%2C%5C%22ugc_lynx_wenda%5C%22%3A74600%2C%5C%22lynx_common_resource%5C%22%3A76900%2C%5C%22lynx_city_channel%5C%22%3A76500%2C%5C%22article_big_image%5C%22%3A76602%2C%5C%22new_local_forum_cell%5C%22%3A76400%2C%5C%22new_local_channel_header%5C%22%3A75700%2C%5C%22article_multi_image%5C%22%3A76602%2C%5C%22attach_post_card%5C%22%3A76800%2C%5C%22ugc_lynx_hotboard%5C%22%3A75501%7D%22%2C%22playparam%22%3A%22codec_type%3A1%2Ccdn_type%3A0%2Cenable_dash%3A0%22%2C%22ad_download%22%3A%7B%22space_unoccupied%22%3A75188616%2C%22space_cleanable%22%3A0%7D%7D&gps_mode=0&loc_mode=1&loc_time=1587824673&latitude=23.086998&longitude=113.392146&city=%E5%B9%BF%E5%B7%9E%E5%B8%82&tt_from=pull&iid=1626914607338158&device_id=2242634821676750&ac=wifi&mac_address=D6%3AD5%3A15%3AEE%3A05%3AC8&channel=update&aid=13&app_name=news_article&version_code=773&version_name=7.7.3&device_platform=android&ab_version=662176%2C1656556%2C1520217%2C1419043%2C1309285%2C668775%2C1403236%2C1529251%2C1190525%2C1157750%2C1413878%2C1419597%2C1500054%2C1629530%2C1469498%2C1484965%2C1576658%2C1675175%2C1593455%2C1698901%2C668779%2C662099%2C668774%2C1634982%2C660830%2C1681101%2C1680294%2C1662745%2C1686065&ab_feature=94563%2C102749&ssmix=a&device_type=Redmi+K30&device_brand=Redmi&language=zh&os_api=29&os_version=10&openudid=8d86e3b42d7389fb&manifest_version_code=7725&resolution=1080*2175&dpi=440&update_version_code=77310&_rticket=1589376615704&plugin=18762&pos=5r_-9Onkv6e_eCQieCoDeCUfv7G_8fLz-vTp6Pn4v6esrK6zrqSvrKmrsb_x_On06ej5-L-nr66zraWrpKSl4A%3D%3D&host_abi=armeabi-v7a&tma_jssdk_version=1.64.0.1&rom_version=miui_v11_v11.0.15.0.qghcnxm&cdid=6d5d0ccc-3b48-4de1-8ac0-96f877971433&oaid=b292598a9f63588a&cp=5ae3beb2f3667q1")
    fun pullFeed():Call<FeedList>
}