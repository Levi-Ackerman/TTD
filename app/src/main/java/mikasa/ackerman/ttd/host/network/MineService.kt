package mikasa.ackerman.ttd.host.network

import mikasa.ackerman.ttd.host.pojo.Result
import okhttp3.ResponseBody
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
 * 2020/5/7 11:25 AM
 */
interface MineService {
    @GET("/user/tab/tabs/v3/?profile_style_version=1&detail=my_tabs&iid=113434438828&device_id=2242634821676750&ac=wifi&mac_address=D6%3AD5%3A15%3AEE%3A05%3AC8&channel=xiaomi&aid=13&app_name=news_article&version_code=770&version_name=7.7.0&device_platform=android&ab_version=1587702%2C662176%2C1587717%2C1651975%2C1656556%2C1419043%2C668775%2C1529251%2C1190525%2C1157750%2C1157634%2C1413878%2C1419597%2C1629530%2C1469498%2C1484965%2C1576658%2C1593455%2C1637863%2C1612946%2C668779%2C662099%2C1640176%2C668774%2C1634985%2C1633733%2C660830%2C1660584%2C1645901%2C1645920&ab_feature=94563%2C102749&ssmix=a&device_type=Redmi+K30&device_brand=Redmi&language=zh&os_api=29&os_version=10&openudid=8d86e3b42d7389fb&manifest_version_code=7700&resolution=1080*2175&dpi=440&update_version_code=77011&_rticket=1587872388076&plugin=18762&pos=5r_-9Onkv6e_eCQieCoDeCUfv7G_8fLz-vTp6Pn4v6esrK6zrqSvrKmrsb_x_On06ej5-L-nr66zraWrpKSlsb_88Pzt3vTp5L-nv3gkIngqA3glH7-xv_zw_O3R8vP69Ono-fi_p6ysrrOupK-sqauxv_zw_O3R_On06ej5-L-nr66zraWrpKSl4A%3D%3D&host_abi=armeabi-v7a&tma_jssdk_version=1.61.0.7&rom_version=miui_v11_v11.0.14.0.qghcnxm&cdid=6d5d0ccc-3b48-4de1-8ac0-96f877971433&oaid=b292598a9f63588a")
    fun  mine(): Call<Result>
}