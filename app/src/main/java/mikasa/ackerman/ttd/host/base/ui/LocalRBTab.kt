package mikasa.ackerman.ttd.host.base.ui

import android.graphics.drawable.Drawable
import android.graphics.drawable.StateListDrawable
import android.widget.RadioButton

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
 * 2020/5/10 11:25 PM
 */
class LocalRBTab(private val normalDrawable: Drawable?, private val checkedDrawable: Drawable?, name: String?, tabId: Int) : RBTab(name, tabId) {
    override fun showDrawable(view: RadioButton) {
        view.apply {
            setCompoundDrawablesWithIntrinsicBounds(null, StateListDrawable().apply {
                addState(intArrayOf(android.R.attr.state_checked), checkedDrawable)
                //负号表示"非"
                addState(intArrayOf(-android.R.attr.state_checked), normalDrawable)
            }, null, null)
        }
    }
}