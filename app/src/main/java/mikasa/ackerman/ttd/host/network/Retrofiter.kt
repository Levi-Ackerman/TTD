package mikasa.ackerman.ttd.host.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * TTD
 *
 * <p>Title: Retrofit 请求用的单例</p>
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
 * 2020/5/7 7:40 PM
 */
class Retrofiter private constructor(val mRetrofit: Retrofit) {

    companion object {
        fun <T> create(serviceClazz: Class<T>): T = INSTANCE.mRetrofit.create(serviceClazz)

        const val BASE_URL = "https://api3-normal-c-lf.snssdk.com"

        val INSTANCE: Retrofiter by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            val retrofit = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .client(OkHttpClient())
                    .build()
            Retrofiter(retrofit)
        }
    }

}