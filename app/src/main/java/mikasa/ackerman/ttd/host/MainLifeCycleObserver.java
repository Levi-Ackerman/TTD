package mikasa.ackerman.ttd.host;

import android.util.Log;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

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
 * 2020-04-26 15:43
 */
public class MainLifeCycleObserver implements LifecycleObserver {

    @OnLifecycleEvent(Event.ON_CREATE)
    public void onCreate(){
        Log.i("lifeCycle event:", "onCreate");
    }
}
