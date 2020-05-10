package mikasa.ackerman.ttd.host.di

import android.content.Context
import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.ui.Tab
import mikasa.ackerman.ttd.host.home.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

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
val singleModule = module {
    single<List<Tab>> {
        listOf(Tab(get<Context>().resources.getDrawable(R.drawable.tab_home_normal),
                get<Context>().resources.getDrawable(R.drawable.tab_home_selected)
                , "首页"),
                Tab(get<Context>().resources.getDrawable(R.drawable.tab_me_normal),
                        get<Context>().resources.getDrawable(R.drawable.tab_me_selected), "我的"))
    }
}

val vmModule = module {
    viewModel { HomeViewModel(get()) }
}
val appModule = listOf(singleModule, vmModule)