package mikasa.ackerman.ttd.host.base.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.databinding.BindingAdapter
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
    companion object{
        const val DEFAULT_TAB_INDEX = 0
    }

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

    override fun setOnCheckedChangeListener(listener: OnCheckedChangeListener?) {
        super.setOnCheckedChangeListener(listener)
    }

    fun setDynamicTabList(tabs: List<RBTab>?) {
        if (tabs != null) {
            for (tab in tabs) {
                val bottomButton = (LayoutInflater.from(context).inflate(R.layout.view_bottom_bar_tab, this, false) as RadioButton).apply {
                    text = tab.name
                    tab.showDrawable(this)
                    id = tab.tabId
                }
                addView(bottomButton)
            }

            post {
                if(childCount > DEFAULT_TAB_INDEX){
                    (getChildAt(DEFAULT_TAB_INDEX) as RadioButton).isChecked = true
                }
            }
        }

    }

}