package mikasa.ackerman.ttd.host.base.ui

import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.StateListDrawable
import android.widget.RadioButton
import com.squareup.picasso.Picasso
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import mikasa.ackerman.ttd.host.R

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
 * 2020/5/10 11:38 PM
 */
class RemoteRBTab(private val normalUrl: String?, private val checkedUrl: String?, name: String?, tabId: Int) : RBTab(name, tabId) {
    override fun showDrawable(view: RadioButton) {
        val size = view.resources.getDimension(R.dimen.bottom_bar_icon_size).toInt()
        GlobalScope.launch(Dispatchers.Main) {
            val drawables = withContext(Dispatchers.IO) {
                Pair<Drawable, Drawable>(
                        BitmapDrawable(view.resources, Picasso.with(view.context).load(normalUrl).resize(size, size).centerInside().get())
                        , BitmapDrawable(view.resources, Picasso.with(view.context).load(checkedUrl).resize(size, size).centerInside().get())
                )
            }
            view.apply {
                setCompoundDrawablesWithIntrinsicBounds(null, StateListDrawable().apply {
                    addState(intArrayOf(android.R.attr.state_checked), drawables.second)
                    //负号表示"非"
                    addState(intArrayOf(-android.R.attr.state_checked), drawables.first)
                }, null, null)
            }
        }
    }
}