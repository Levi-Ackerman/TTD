package mikasa.ackerman.ttd.host.base

import android.app.Application
import mikasa.ackerman.ttd.host.BuildConfig
import mikasa.ackerman.ttd.host.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.logger.AndroidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.EmptyLogger
import tv.danmaku.ijk.media.player.IjkMediaPlayer

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
 * 2020/5/10 2:27 PM
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(appModule)
            logger(if (BuildConfig.DEBUG) AndroidLogger() else EmptyLogger())
        }
    }

}