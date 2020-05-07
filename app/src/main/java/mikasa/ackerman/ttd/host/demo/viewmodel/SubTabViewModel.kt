package mikasa.ackerman.ttd.host.demo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mikasa.ackerman.ttd.host.network.MineService
import mikasa.ackerman.ttd.host.pojo.Result
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.concurrent.thread

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
 * 2020/4/27 9:37 PM
 */
class SubTabViewModel : ViewModel() {
    companion object {
        const val BASE_URL = "https://api3-normal-c-lf.snssdk.com"
    }

    private val mSubtabs = MutableLiveData<List<SubTab>>()
    val subtabs: LiveData<List<SubTab>>
        get() = mSubtabs

    fun requestSubTabs() {
        val mineService = Retrofit.Builder().baseUrl(BASE_URL).client(OkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MineService::class.java)
        thread {
            val result = mineService.mine().enqueue(object : Callback<Result> {
                override fun onResponse(call: Call<Result>?, response: Response<Result>?) {
                    println(response?.body())
                }

                override fun onFailure(call: Call<Result>?, t: Throwable?) {
                    println(t)
                }

            })
            println(result)
        }
    }
}