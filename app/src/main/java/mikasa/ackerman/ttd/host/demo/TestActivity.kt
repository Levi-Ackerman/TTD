package mikasa.ackerman.ttd.host.demo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import mikasa.ackerman.ttd.host.R
import mikasa.ackerman.ttd.host.base.ui.StateView
import mikasa.ackerman.ttd.host.databinding.ActivityTestBinding
import mikasa.ackerman.ttd.host.demo.viewmodel.BottomTabsViewModel
import mikasa.ackerman.ttd.host.pojo.BottomTabs

class TestActivity : AppCompatActivity() {

    private lateinit var mSubTabViewModel: BottomTabsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityTestBinding>(this, R.layout.activity_test)
        binding.onTestClick = View.OnClickListener {
            mSubTabViewModel.requestBottomTabs()
        }
        binding.contentState = StateView.ContentState.CONTENT

        mSubTabViewModel = ViewModelProvider(this).get(BottomTabsViewModel::class.java)

        mSubTabViewModel.state.observe(this, Observer {
            binding.contentState = it
            if (it == StateView.ContentState.CONTENT){
                println("result ${mSubTabViewModel.bottomTabs?.data}")
            }
        })

    }
}