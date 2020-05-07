package mikasa.ackerman.ttd.host.demo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import mikasa.ackerman.ttd.host.R;
import mikasa.ackerman.ttd.host.databinding.ActivityTestBinding;
import mikasa.ackerman.ttd.host.demo.viewmodel.SubTabViewModel;

public class TestActivity extends AppCompatActivity {
    private ViewModelProvider mViewModelProvider;
    private SubTabViewModel mSubTabViewModel;
    private ActivityTestBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_test);
        mViewModelProvider = new ViewModelProvider(this);
        mSubTabViewModel = mViewModelProvider.get(SubTabViewModel.class);
        mSubTabViewModel.getSubtabs().observe(this, subtabs -> {

        });
        mBinding.setOnTestClick(view->{
            mSubTabViewModel.requestSubTabs();
        });
    }
}
