package mikasa.ackerman.ttd.host

import android.os.Bundle
import mikasa.ackerman.ttd.host.base.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}