package mikasa.ackerman.ttd.host.di

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.ui.LocalRBTab
import mikasa.ackerman.ttd.host.base.ui.RBTab
import mikasa.ackerman.ttd.host.home.viewmodel.HomeViewModel
import mikasa.ackerman.ttd.host.index.feed.viewmodel.FeedViewModel
import mikasa.ackerman.ttd.host.index.viewmodel.IndexViewModel
import mikasa.ackerman.ttd.host.network.ArticleCategoryService
import mikasa.ackerman.ttd.host.network.BottomTabService
import mikasa.ackerman.ttd.host.network.FeedService
import mikasa.ackerman.ttd.host.network.SearchSuggestionService
import mikasa.ackerman.ttd.host.pojo.FeedItem
import mikasa.ackerman.ttd.host.pojo.FeedList
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
 * @author zhengxian.lzx@aclibaba-inc.com
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
    single<FeedItem.FeedItemAdapter> {
        FeedItem.FeedItemAdapter()
    }
    single<Gson> {
        GsonBuilder()
                .registerTypeAdapter(FeedItem::class.java, get<FeedItem.FeedItemAdapter>())
                .create()
    }
    single<Retrofit> {
        Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(get()))
                .baseUrl(BASE_URL)
                .client(OkHttpClient())
                .build()
    }
}

val serviceModule = module {
    single<BottomTabService> {
        get<Retrofit>().create(BottomTabService::class.java)
    }
    single<SearchSuggestionService> {
        get<Retrofit>().create(SearchSuggestionService::class.java)
    }
    single<ArticleCategoryService> {
        get<Retrofit>().create(ArticleCategoryService::class.java)
    }
    single<FeedService> {
        get<Retrofit>().create(FeedService::class.java)
    }
}

val vmModule = module {
    viewModel { HomeViewModel(androidApplication(), get(), get()) }
    viewModel { IndexViewModel(androidApplication(), get(), get()) }
    viewModel { FeedViewModel(androidApplication(), get()) }
}
val appModule = listOf(singleModule, vmModule, serviceModule)