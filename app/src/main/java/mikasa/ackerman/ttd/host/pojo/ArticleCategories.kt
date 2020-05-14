package mikasa.ackerman.ttd.host.pojo

import com.google.gson.annotations.SerializedName
import mikasa.ackerman.ttd.host.pojo.ArticleCategories.DataX
import java.io.Serializable

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
 * 2020/5/13 5:15 PM
 */
class ArticleCategories : IPojo<List<DataX.Data?>?> {
    /**
     * data : {"data":[{"parent_channel_id":0,"channel_id":60021127260,"name":"关注","type":4,"category":"关注",
     * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf1-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png","description":"",
     * "flags":0,"concern_id":"","stick":1,"image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%85%B3%E6%B3%A8@3x_2c347b458b109f5f3446f90c6b117731.jpg",
     * "gid":60021127260,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,"background_color":"",
     * "placehold_color":"","recommend_score":0,"hidden":0},{"parent_channel_id":0,"channel_id":0,"name":"推荐",
     * "type":4,"category":"__all__","tip_new":0,"web_url":"","default_add":1,"icon_url":"",
     * "icon_url2":"http://sf1-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png","description":"",
     * "flags":0,"concern_id":"","stick":1,"image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E6%8E%A8%E8%8D%90@3x_b7c4a5d40c37a9d075a541b54e9d3058.jpg",
     * "hor_immersive_category":"tt_subv_landscape","feed_list_style":0,"background_color":"","placehold_color":"",
     * "recommend_score":0,"hidden":0},{"parent_channel_id":0,"channel_id":94349546415,"name":"抗击肺炎","type":4,
     * "category":"anti_pneumonia_channel","tip_new":0,"web_url":"","default_add":1,"icon_url":"",
     * "icon_url2":"http://sf1-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png","description":"",
     * "flags":0,"concern_id":"","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
     * "gid":94349546415,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,"background_color":"",
     * "placehold_color":"","recommend_score":0,"hidden":0},{"parent_channel_id":94349547910,"channel_id":3431225546,
     * "name":"视频","type":4,"category":"video","tip_new":0,"web_url":"","default_add":1,"icon_url":"",
     * "icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/shipin_3x_1583074218344.png",
     * "description":"新鲜好看的视频内容","flags":0,"concern_id":"","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E8%A7%86%E9%A2%91@3x_3607ce50553e0c1c690d52098cf3e192.jpg",
     * "gid":6527573731718468871,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#fff7f2","placehold_color":"#ffa775","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":3189398991,"name":"广州","type":4,"category":"news_local","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/bendi_3x_1583074218496.png",
     * "description":"足不出户看家乡新鲜事","flags":0,"concern_id":"6216118362422905346","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E6%9C%AC%E5%9C%B0@3x_4e8773877596d221d6fb9973090e6b9d.jpg",
     * "gid":6542932385149752584,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#E5FFF9EB","placehold_color":"#ffd05e","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":59161009683,"name":"小视频","type":4,"category":"hotsoon_video","tip_new":0,
     * "web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/xiaoshipin_3x_1583074218631.png",
     * "description":"新鲜精彩小视频看不停","flags":0,"concern_id":"","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%B0%8F%E8%A7%86%E9%A2%91_9278d74ee2c7b8ab2d1aa941bae8906e.jpg",
     * "gid":6527569125609313550,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#fff7f2","placehold_color":"#ffa775","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":3189398996,"name":"热点","type":4,"category":"news_hot","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/redian_3x_1583074218562.png",
     * "description":"热点新闻深度分析报道","flags":0,"concern_id":"","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E7%83%AD%E7%82%B9@3x_abe62ee4894b68712c205134df944ee7.jpg",
     * "gid":6537448892210894094,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#CCFFF2F2","placehold_color":"#ff8585","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":6761210920,"name":"问答","type":4,"category":"question_and_answer","tip_new":0,
     * "web_url":"https://ic.snssdk.com/wenda/v1/waphome/brow/","default_add":1,"icon_url":"",
     * "icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/wenda_3x_1583074218185.png",
     * "description":"专注分享知识和经验","flags":0,"concern_id":"6260258266329123329","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E9%97%AE%E7%AD%94_c3d2b12625387464a1d2728226ebad48.jpg",
     * "gid":6579925235221402894,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#CCFFF2F2","placehold_color":"#ff8585","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":3189398972,"name":"娱乐","type":4,"category":"news_entertainment","tip_new":0,
     * "web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/yule_3x_1583074218347.png","description":"今日娱乐圈新鲜事",
     * "flags":0,"concern_id":"6215497896830175745","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%A8%B1%E4%B9%90_d1014b2c62d907653fc9f8d41ca739be.jpg",
     * "gid":6537231843312293123,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#fff7f2","placehold_color":"#ffa775","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":0,"channel_id":94349547905,"name":"在家上课","type":4,"category":"new_study_at_home","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf1-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png","description":"",
     * "flags":0,"concern_id":"","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
     * "gid":94349547905,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,"background_color":"",
     * "placehold_color":"","recommend_score":0,"hidden":0},{"parent_channel_id":94349547910,"channel_id":3189398960,
     * "name":"军事","type":4,"category":"news_military","tip_new":0,"web_url":"","default_add":1,"icon_url":"",
     * "icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/junshi_3x_1583074218811.png",
     * "description":"国防和军队建设动态","flags":0,"concern_id":"6215497895454444033","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%86%9B%E4%BA%8B_285ff6818097fc703e6be8dc51a08543.jpg",
     * "gid":6534547406116099342,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#A5E9F7F7","placehold_color":"#5ed1d1","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":3462458037,"name":"音乐","type":4,"category":"music","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/yinyue_3x_1583074218472.png",
     * "description":"宝藏音乐，热门神曲","flags":0,"concern_id":"6213187413628422658","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
     * "gid":6534517065087210756,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#CCFFF2F2","placehold_color":"#ff8585","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":3189398957,"name":"体育","type":4,"category":"news_sports","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/tiyu_3x_1583074218539.png","description":"专业体育赛事报道",
     * "flags":0,"concern_id":"6215497726554016258","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E4%BD%93%E8%82%B2_584ebd40bf126e96659df421973bba57.jpg",
     * "gid":6537233900396139789,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#A5E9F7F7","placehold_color":"#5ed1d1","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":3189398968,"name":"国际","type":4,"category":"news_world","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/guoji_3x_1583074218746.png",
     * "description":"全球时事报道分析","flags":0,"concern_id":"6215497896255556098","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%9B%BD%E9%99%85_f70ea0d49c0d2c615ffbe086888b2da9.jpg",
     * "gid":6537185719566210307,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#B2EBF4FA","placehold_color":"#6cbaf0","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":3189399007,"name":"财经","type":4,"category":"news_finance","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/caijing_3x_1583074218492.png",
     * "description":"股票基金宏观经济分析","flags":0,"concern_id":"6215497900357585410","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E8%B4%A2%E7%BB%8F_958b5f3134f64c8222a560dcef5677fc.jpg",
     * "gid":6537250026748400909,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#fff7f2","placehold_color":"#ffa775","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":94349530259,"name":"直播","type":4,"category":"live","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/zhibo_3x_1583074218713.png",
     * "description":"音乐游戏聊天直播","flags":0,"concern_id":"","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E7%9B%B4%E6%92%AD_3482a9f86b540f4bca78f648074f6522.jpg",
     * "gid":6598250690668139784,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#fff7f2","placehold_color":"#ffa775","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":3462398442,"name":"影视","type":4,"category":"film_tv","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/yingshi_3x_1583074219048.png",
     * "description":"承包你的追剧清单","flags":0,"concern_id":"6213187413263518209","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
     * "gid":6595508849245951239,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#fff7f2","placehold_color":"#ffa775","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":5567543668,"name":"免费小说","type":5,"category":"novel_channel","tip_new":0,
     * "web_url":"https://novel.snssdk.com/feoffline/novel/channel/index
     * .html?aid=13&app_name=news_article&device_id=2242634821676750&is_web_refresh=1","default_add":1,"icon_url":"",
     * "icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/fanqiexiaoshuo_3x_1583074218029.png",
     * "description":"好看又免费的流行小说","flags":1,"concern_id":"","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%B0%8F%E8%AF%B4_d2af7ed2fc6344fa4eb7b6cd4f9bf21b.jpeg",
     * "gid":6537218674346956045,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#f8f8f8","placehold_color":"#4C222222","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":3189398976,"name":"情感","type":4,"category":"emotion","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/qinggan_3x_1583074218649.png",
     * "description":"温柔的故事和有趣段子","flags":0,"concern_id":"6215845055769348610","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E6%83%85%E6%84%9F_f1a60c88eb61834889ad9196f4d0ed2d.jpg",
     * "gid":6605800896335025411,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#E5FFF9EB","placehold_color":"#ffd05e","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":3189398965,"name":"历史","type":4,"category":"news_history","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/lishi_3x_1583074218336.png",
     * "description":"历史上的名人和趣事","flags":0,"concern_id":"6215497901590710786","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%8E%86%E5%8F%B2_d36c9c08f32139ca7fea2c869963b710.jpg",
     * "gid":6532372705260377352,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#E5FFF9EB","placehold_color":"#ffd05e","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":3189398958,"name":"健康","type":4,"category":"news_health","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/jiankang_3x_1583074218552.png",
     * "description":"你关心的健康医疗信息","flags":0,"concern_id":"6215497895248923137","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%81%A5%E5%BA%B7_24ae84b0d926933d59aec0085846d3ed.jpg",
     * "gid":6537266845685142787,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#f5faed","placehold_color":"#acde5b","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":3189399002,"name":"美食","type":4,"category":"news_food","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/meishi_3x_1583074218673.png",
     * "description":"新鲜热辣的味蕾情报","flags":0,"concern_id":"6215497899774577154","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E7%BE%8E%E9%A3%9F_bfe8d98d4a443165e6f4e0cb6b14af20.jpeg",
     * "gid":6598250706661020941,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#fff7f2","placehold_color":"#ffa775","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":3189398993,"name":"懂车帝","type":4,"category":"news_car","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/qiche_3x_1583074218223.png",
     * "description":"买车用车知识大全","flags":0,"concern_id":"6215497898671475202","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E6%87%82%E8%BD%A6%E5%B8%9D_5fdf4b983637a0dd1044585615b546ed.jpeg",
     * "gid":6595524418741474567,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#f8f8f8","placehold_color":"#4C222222","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":3189398999,"name":"科技","type":4,"category":"news_tech","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/keji_3x_1583074218294.png",
     * "description":"互联网名人和公司动态","flags":0,"concern_id":"6215497899594222081","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E7%A7%91%E6%8A%80_840f792f4d1922118219a1373bace126.jpg",
     * "gid":6537179925537920270,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#A5E9F7F7","placehold_color":"#5ed1d1","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547910,"channel_id":5443492141,"name":"图片","type":4,"category":"组图","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/tupian_3x_1583074218410.png",
     * "description":"以图为媒，传递新闻","flags":0,"concern_id":"","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%9B%BE%E7%89%87_59e7147288fee8995efc4c1b01a8aed1.jpg",
     * "gid":6595539699517887758,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#E5FFF9EB","placehold_color":"#ffd05e","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547935,"channel_id":72115010420,"name":"新时代","type":4,"category":"nineteenth","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/xinshidai_3x_1583074218778.png",
     * "description":"真实的新时代社会风貌","flags":0,"concern_id":"","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E6%96%B0%E6%97%B6%E4%BB%A3_faa4f7af18207f5ec09a6c65ee7237a8.jpg",
     * "gid":6538746787082032392,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"#CCFFF2F2","placehold_color":"#ff8585","recommend_score":0,"hidden":0},{"parent_channel_id
     * ":94349547920,"channel_id":3462388071,"name":"NBA","type":4,"category":"NBA","tip_new":0,"web_url":"",
     * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/NBA_3x_1583074218483.png",
     * "description":"新鲜NBA赛况高清直播","flags":0,"concern_id":"6213187421211724290","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/nba_72bc7908cea6fdd082d5315c276f2080.jpg","gid":6595888408860595459,
     * "hor_immersive_category":"tt_subv_landscape","feed_list_style":0,"background_color":"#f8f8f8",
     * "placehold_color":"#4C222222","recommend_score":0,"hidden":0},{"parent_channel_id":0,"channel_id":4553290486,
     * "name":"漫画","type":4,"category":"漫画","tip_new":0,"web_url":"","default_add":1,"icon_url":"",
     * "icon_url2":"http://sf1-ttcdn-tos.pstatp
     * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png","description":"",
     * "flags":0,"concern_id":"6213185678314834433","image_url":"http://s2.pstatp
     * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
     * "gid":6527567465046611207,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
     * "background_color":"","placehold_color":"","recommend_score":0,"hidden":0}],"update_reason":["by_open"],
     * "version":"2242634821676750|14|1587662268"}
     * message : success
     */
    @SerializedName("data")
    var data: DataX? = null

    @SerializedName("message")
    var message: String? = null

    override fun isEmpty(): Boolean {
        return data?.data?.isEmpty()?:true
    }

    override fun getContent(): List<DataX.Data> {
        return data?.data?: listOf()
    }

    class DataX {
        /**
         * data : [{"parent_channel_id":0,"channel_id":60021127260,"name":"关注","type":4,"category":"关注","tip_new":0,
         * "web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf1-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png","description":"",
         * "flags":0,"concern_id":"","stick":1,"image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%85%B3%E6%B3%A8@3x_2c347b458b109f5f3446f90c6b117731.jpg",
         * "gid":60021127260,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,"background_color":"",
         * "placehold_color":"","recommend_score":0,"hidden":0},{"parent_channel_id":0,"channel_id":0,"name":"推荐",
         * "type":4,"category":"__all__","tip_new":0,"web_url":"","default_add":1,"icon_url":"",
         * "icon_url2":"http://sf1-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png","description":"",
         * "flags":0,"concern_id":"","stick":1,"image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E6%8E%A8%E8%8D%90@3x_b7c4a5d40c37a9d075a541b54e9d3058.jpg",
         * "hor_immersive_category":"tt_subv_landscape","feed_list_style":0,"background_color":"",
         * "placehold_color":"","recommend_score":0,"hidden":0},{"parent_channel_id":0,"channel_id":94349546415,
         * "name":"抗击肺炎","type":4,"category":"anti_pneumonia_channel","tip_new":0,"web_url":"","default_add":1,
         * "icon_url":"","icon_url2":"http://sf1-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png","description":"",
         * "flags":0,"concern_id":"","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
         * "gid":94349546415,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,"background_color":"",
         * "placehold_color":"","recommend_score":0,"hidden":0},{"parent_channel_id":94349547910,
         * "channel_id":3431225546,"name":"视频","type":4,"category":"video","tip_new":0,"web_url":"","default_add":1,
         * "icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/shipin_3x_1583074218344.png",
         * "description":"新鲜好看的视频内容","flags":0,"concern_id":"","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E8%A7%86%E9%A2%91@3x_3607ce50553e0c1c690d52098cf3e192.jpg",
         * "gid":6527573731718468871,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#fff7f2","placehold_color":"#ffa775","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":3189398991,"name":"广州","type":4,"category":"news_local",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/bendi_3x_1583074218496.png",
         * "description":"足不出户看家乡新鲜事","flags":0,"concern_id":"6216118362422905346","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E6%9C%AC%E5%9C%B0@3x_4e8773877596d221d6fb9973090e6b9d.jpg",
         * "gid":6542932385149752584,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#E5FFF9EB","placehold_color":"#ffd05e","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":59161009683,"name":"小视频","type":4,"category":"hotsoon_video",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/xiaoshipin_3x_1583074218631.png",
         * "description":"新鲜精彩小视频看不停","flags":0,"concern_id":"","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%B0%8F%E8%A7%86%E9%A2%91_9278d74ee2c7b8ab2d1aa941bae8906e
         * .jpg","gid":6527569125609313550,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#fff7f2","placehold_color":"#ffa775","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":3189398996,"name":"热点","type":4,"category":"news_hot",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/redian_3x_1583074218562.png",
         * "description":"热点新闻深度分析报道","flags":0,"concern_id":"","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E7%83%AD%E7%82%B9@3x_abe62ee4894b68712c205134df944ee7.jpg",
         * "gid":6537448892210894094,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#CCFFF2F2","placehold_color":"#ff8585","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":6761210920,"name":"问答","type":4,
         * "category":"question_and_answer","tip_new":0,"web_url":"https://ic.snssdk.com/wenda/v1/waphome/brow/",
         * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/wenda_3x_1583074218185.png",
         * "description":"专注分享知识和经验","flags":0,"concern_id":"6260258266329123329","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E9%97%AE%E7%AD%94_c3d2b12625387464a1d2728226ebad48.jpg",
         * "gid":6579925235221402894,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#CCFFF2F2","placehold_color":"#ff8585","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":3189398972,"name":"娱乐","type":4,
         * "category":"news_entertainment","tip_new":0,"web_url":"","default_add":1,"icon_url":"",
         * "icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/yule_3x_1583074218347.png",
         * "description":"今日娱乐圈新鲜事","flags":0,"concern_id":"6215497896830175745","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%A8%B1%E4%B9%90_d1014b2c62d907653fc9f8d41ca739be.jpg",
         * "gid":6537231843312293123,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#fff7f2","placehold_color":"#ffa775","recommend_score":0,"hidden":0},{
         * "parent_channel_id":0,"channel_id":94349547905,"name":"在家上课","type":4,"category":"new_study_at_home",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf1-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png","description":"",
         * "flags":0,"concern_id":"","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
         * "gid":94349547905,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,"background_color":"",
         * "placehold_color":"","recommend_score":0,"hidden":0},{"parent_channel_id":94349547910,
         * "channel_id":3189398960,"name":"军事","type":4,"category":"news_military","tip_new":0,"web_url":"",
         * "default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/junshi_3x_1583074218811.png",
         * "description":"国防和军队建设动态","flags":0,"concern_id":"6215497895454444033","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%86%9B%E4%BA%8B_285ff6818097fc703e6be8dc51a08543.jpg",
         * "gid":6534547406116099342,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#A5E9F7F7","placehold_color":"#5ed1d1","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":3462458037,"name":"音乐","type":4,"category":"music",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/yinyue_3x_1583074218472.png",
         * "description":"宝藏音乐，热门神曲","flags":0,"concern_id":"6213187413628422658","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
         * "gid":6534517065087210756,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#CCFFF2F2","placehold_color":"#ff8585","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":3189398957,"name":"体育","type":4,"category":"news_sports",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/tiyu_3x_1583074218539.png",
         * "description":"专业体育赛事报道","flags":0,"concern_id":"6215497726554016258","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E4%BD%93%E8%82%B2_584ebd40bf126e96659df421973bba57.jpg",
         * "gid":6537233900396139789,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#A5E9F7F7","placehold_color":"#5ed1d1","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":3189398968,"name":"国际","type":4,"category":"news_world",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/guoji_3x_1583074218746.png",
         * "description":"全球时事报道分析","flags":0,"concern_id":"6215497896255556098","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%9B%BD%E9%99%85_f70ea0d49c0d2c615ffbe086888b2da9.jpg",
         * "gid":6537185719566210307,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#B2EBF4FA","placehold_color":"#6cbaf0","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":3189399007,"name":"财经","type":4,"category":"news_finance",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/caijing_3x_1583074218492.png",
         * "description":"股票基金宏观经济分析","flags":0,"concern_id":"6215497900357585410","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E8%B4%A2%E7%BB%8F_958b5f3134f64c8222a560dcef5677fc.jpg",
         * "gid":6537250026748400909,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#fff7f2","placehold_color":"#ffa775","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":94349530259,"name":"直播","type":4,"category":"live",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/zhibo_3x_1583074218713.png",
         * "description":"音乐游戏聊天直播","flags":0,"concern_id":"","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E7%9B%B4%E6%92%AD_3482a9f86b540f4bca78f648074f6522.jpg",
         * "gid":6598250690668139784,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#fff7f2","placehold_color":"#ffa775","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":3462398442,"name":"影视","type":4,"category":"film_tv",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/yingshi_3x_1583074219048.png",
         * "description":"承包你的追剧清单","flags":0,"concern_id":"6213187413263518209","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
         * "gid":6595508849245951239,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#fff7f2","placehold_color":"#ffa775","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":5567543668,"name":"免费小说","type":5,"category":"novel_channel",
         * "tip_new":0,"web_url":"https://novel.snssdk.com/feoffline/novel/channel/index
         * .html?aid=13&app_name=news_article&device_id=2242634821676750&is_web_refresh=1","default_add":1,
         * "icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/fanqiexiaoshuo_3x_1583074218029.png",
         * "description":"好看又免费的流行小说","flags":1,"concern_id":"","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%B0%8F%E8%AF%B4_d2af7ed2fc6344fa4eb7b6cd4f9bf21b.jpeg",
         * "gid":6537218674346956045,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#f8f8f8","placehold_color":"#4C222222","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":3189398976,"name":"情感","type":4,"category":"emotion",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/qinggan_3x_1583074218649.png",
         * "description":"温柔的故事和有趣段子","flags":0,"concern_id":"6215845055769348610","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E6%83%85%E6%84%9F_f1a60c88eb61834889ad9196f4d0ed2d.jpg",
         * "gid":6605800896335025411,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#E5FFF9EB","placehold_color":"#ffd05e","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":3189398965,"name":"历史","type":4,"category":"news_history",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/lishi_3x_1583074218336.png",
         * "description":"历史上的名人和趣事","flags":0,"concern_id":"6215497901590710786","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%8E%86%E5%8F%B2_d36c9c08f32139ca7fea2c869963b710.jpg",
         * "gid":6532372705260377352,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#E5FFF9EB","placehold_color":"#ffd05e","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":3189398958,"name":"健康","type":4,"category":"news_health",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/jiankang_3x_1583074218552.png",
         * "description":"你关心的健康医疗信息","flags":0,"concern_id":"6215497895248923137","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%81%A5%E5%BA%B7_24ae84b0d926933d59aec0085846d3ed.jpg",
         * "gid":6537266845685142787,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#f5faed","placehold_color":"#acde5b","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":3189399002,"name":"美食","type":4,"category":"news_food",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/meishi_3x_1583074218673.png",
         * "description":"新鲜热辣的味蕾情报","flags":0,"concern_id":"6215497899774577154","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E7%BE%8E%E9%A3%9F_bfe8d98d4a443165e6f4e0cb6b14af20.jpeg",
         * "gid":6598250706661020941,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#fff7f2","placehold_color":"#ffa775","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":3189398993,"name":"懂车帝","type":4,"category":"news_car",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/qiche_3x_1583074218223.png",
         * "description":"买车用车知识大全","flags":0,"concern_id":"6215497898671475202","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E6%87%82%E8%BD%A6%E5%B8%9D_5fdf4b983637a0dd1044585615b546ed
         * .jpeg","gid":6595524418741474567,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#f8f8f8","placehold_color":"#4C222222","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":3189398999,"name":"科技","type":4,"category":"news_tech",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/keji_3x_1583074218294.png",
         * "description":"互联网名人和公司动态","flags":0,"concern_id":"6215497899594222081","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E7%A7%91%E6%8A%80_840f792f4d1922118219a1373bace126.jpg",
         * "gid":6537179925537920270,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#A5E9F7F7","placehold_color":"#5ed1d1","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547910,"channel_id":5443492141,"name":"图片","type":4,"category":"组图","tip_new":0,
         * "web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/tupian_3x_1583074218410.png",
         * "description":"以图为媒，传递新闻","flags":0,"concern_id":"","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%9B%BE%E7%89%87_59e7147288fee8995efc4c1b01a8aed1.jpg",
         * "gid":6595539699517887758,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#E5FFF9EB","placehold_color":"#ffd05e","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547935,"channel_id":72115010420,"name":"新时代","type":4,"category":"nineteenth",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/xinshidai_3x_1583074218778.png",
         * "description":"真实的新时代社会风貌","flags":0,"concern_id":"","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E6%96%B0%E6%97%B6%E4%BB%A3_faa4f7af18207f5ec09a6c65ee7237a8
         * .jpg","gid":6538746787082032392,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#CCFFF2F2","placehold_color":"#ff8585","recommend_score":0,"hidden":0},{
         * "parent_channel_id":94349547920,"channel_id":3462388071,"name":"NBA","type":4,"category":"NBA",
         * "tip_new":0,"web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf6-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_3x/NBA_3x_1583074218483.png",
         * "description":"新鲜NBA赛况高清直播","flags":0,"concern_id":"6213187421211724290","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/nba_72bc7908cea6fdd082d5315c276f2080.jpg",
         * "gid":6595888408860595459,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"#f8f8f8","placehold_color":"#4C222222","recommend_score":0,"hidden":0},{
         * "parent_channel_id":0,"channel_id":4553290486,"name":"漫画","type":4,"category":"漫画","tip_new":0,
         * "web_url":"","default_add":1,"icon_url":"","icon_url2":"http://sf1-ttcdn-tos.pstatp
         * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png","description":"",
         * "flags":0,"concern_id":"6213185678314834433","image_url":"http://s2.pstatp
         * .com/site_new/promotion/landing_page/img/%E5%85%9C%E5%BA%95_e651e6ddd958cf4a7f4502c0d16ccbcc.jpg",
         * "gid":6527567465046611207,"hor_immersive_category":"tt_subv_landscape","feed_list_style":0,
         * "background_color":"","placehold_color":"","recommend_score":0,"hidden":0}]
         * update_reason : ["by_open"]
         * version : 2242634821676750|14|1587662268
         */
        @SerializedName("version")
        var version: String? = null

        @SerializedName("data")
        var data: List<Data>? = null

        @SerializedName("update_reason")
        var updateReason: List<String>? = null

        class Data :Serializable{
            /**
             * parent_channel_id : 0
             * channel_id : 60021127260
             * name : 关注
             * type : 4
             * category : 关注
             * tip_new : 0
             * web_url :
             * default_add : 1
             * icon_url :
             * icon_url2 : http://sf1-ttcdn-tos.pstatp
             * .com/obj/ttfe/channel_manage/channel_icon/channel_icon_2x/shoucang_2x_1583074219055.png
             * description :
             * flags : 0
             * concern_id :
             * stick : 1
             * image_url : http://s2.pstatp.com/site_new/promotion/landing_page/img/%E5%85%B3%E6%B3%A8
             * @3x_2c347b458b109f5f3446f90c6b117731.jpg
             * gid : 60021127260
             * hor_immersive_category : tt_subv_landscape
             * feed_list_style : 0
             * background_color :
             * placehold_color :
             * recommend_score : 0
             * hidden : 0
             */
            @SerializedName("parent_channel_id")
            var parentChannelId:Long = 0

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

            @SerializedName("stick")
            var stick = 0

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
}