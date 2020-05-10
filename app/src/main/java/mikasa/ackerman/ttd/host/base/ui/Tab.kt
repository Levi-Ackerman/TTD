package mikasa.ackerman.ttd.host.base.ui

import android.graphics.drawable.Drawable
import android.view.View

abstract class Tab<T:View>(val name: String?, val tabId: Int) {
    abstract fun showDrawable(view: T)
}