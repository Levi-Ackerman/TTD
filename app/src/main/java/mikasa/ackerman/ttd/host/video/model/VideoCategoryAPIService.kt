package mikasa.ackerman.ttd.host.video.model

import mikasa.ackerman.ttd.host.video.pojo.VideoCategories
import retrofit2.Call
import retrofit2.http.GET

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
 * 2020/5/15 10:22 PM
 */
interface VideoCategoryAPIService {
    @GET("/video_api/get_category/v3/?iid=1626914607338158&device_id=2242634821676750&ac=wifi&mac_address=D6%3AD5%3A15%3AEE%3A05%3AC8&channel=update&aid=13&app_name=news_article&version_code=773&version_name=7.7.3&device_platform=android&ab_version=662176%2C1656556%2C1520217%2C1419043%2C1309285%2C668775%2C1403236%2C1529251%2C1190525%2C1157750%2C1413878%2C1419597%2C1500054%2C1629530%2C1469498%2C1484965%2C1576658%2C1675175%2C1593455%2C1698901%2C668779%2C662099%2C668774%2C1634980%2C1702948%2C660830%2C1681101%2C1680294%2C1662745%2C1686065&ab_feature=94563%2C102749&ssmix=a&device_type=Redmi+K30&device_brand=Redmi&language=zh&os_api=29&os_version=10&openudid=8d86e3b42d7389fb&manifest_version_code=7725&resolution=1080*2175&dpi=440&update_version_code=77310&_rticket=1589517965796&plugin=2&host_abi=armeabi-v7a&rom_version=miui_v11_v11.0.15.0.qghcnxm&cdid=02519798-ff75-42b3-ae99-304b8246f44d&oaid=b292598a9f63588a")
    fun getCategory():Call<VideoCategories>
}