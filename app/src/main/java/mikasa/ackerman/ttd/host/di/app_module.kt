package mikasa.ackerman.ttd.host.di

import android.content.Context
import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.ui.LocalRBTab
import mikasa.ackerman.ttd.host.base.ui.RBTab
import mikasa.ackerman.ttd.host.home.viewmodel.HomeViewModel
import mikasa.ackerman.ttd.host.index.viewmodel.IndexViewModel
import mikasa.ackerman.ttd.host.network.BottomTabService
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

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
 * 2020/5/10 3:13 PM
 */
const val BASE_URL = "https://api3-normal-c-lf.snssdk.com"

val singleModule = module {
    single<List<RBTab>> {
        listOf(LocalRBTab(get<Context>().resources.getDrawable(R.drawable.tab_home_normal),
                get<Context>().resources.getDrawable(R.drawable.tab_home_selected)
                , "首页", 1),
                LocalRBTab(get<Context>().resources.getDrawable(R.drawable.tab_me_normal),
                        get<Context>().resources.getDrawable(R.drawable.tab_me_selected), "我的", 2))
    }
    single<Retrofit> {
        Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .client(OkHttpClient())
                .build()
    }
}

val serviceModule = module {
    single<BottomTabService> {
        get<Retrofit>().create(BottomTabService::class.java)
    }
}

val vmModule = module {
    viewModel { HomeViewModel(androidApplication(), get(), get()) }
    viewModel { IndexViewModel(androidApplication()) }
}
val appModule = listOf(singleModule, vmModule, serviceModule)