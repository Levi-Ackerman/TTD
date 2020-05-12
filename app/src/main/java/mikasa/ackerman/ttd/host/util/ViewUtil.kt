package mikasa.ackerman.ttd.host.util

import android.content.Context

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
 * 2020/5/9 8:26 PM
 */
object ViewUtil {
    fun dp2px(context: Context, dp: Int): Float {
        return dp * context.resources.displayMetrics.density
    }

    fun getStatusBarHeight(context: Context):Int {
        val resourceId = context.resources.getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            return context.resources.getDimensionPixelSize(resourceId);
        }
        return 0
    }
}