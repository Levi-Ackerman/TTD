package mikasa.ackerman.ttd.host.di

import android.content.Context
import android.widget.Toast

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
 * 2020/5/20 10:00 PM
 */

fun Context.toast(text :String){
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}