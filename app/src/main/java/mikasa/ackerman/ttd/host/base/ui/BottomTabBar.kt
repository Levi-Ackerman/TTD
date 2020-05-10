package mikasa.ackerman.ttd.host.base.ui

import android.content.Context
import android.graphics.drawable.Drawable
import android.graphics.drawable.StateListDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
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
 * 2020/5/9 7:43 PM
 */
class BottomTabBar : RadioGroup {

    constructor(context: Context?) : super(context) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }


    private fun init() {
        orientation = LinearLayout.HORIZONTAL
        setBackgroundColor(resources.getColor(R.color.color_button_bar_background))

    }

    fun setTabList(tabs: List<Tab>) {
        removeAllViews()
        for (tab in tabs) {
            LayoutInflater.from(context).inflate(R.layout.view_bottom_bar_tab, this, true)
            findViewById<RadioButton>(R.id.bottom_bar_tab).apply {
                text = tab.name
                setCompoundDrawablesWithIntrinsicBounds(null, StateListDrawable().apply {
                    addState(intArrayOf(android.R.attr.state_checked), tab.checkedDrawable)
                    //负号表示"非"
                    addState(intArrayOf(-android.R.attr.state_checked), tab.normalDrawable)
                }, null, null)
            }
        }
    }

    data class Tab(val normalDrawable: Drawable, val checkedDrawable: Drawable, val name: String)
}