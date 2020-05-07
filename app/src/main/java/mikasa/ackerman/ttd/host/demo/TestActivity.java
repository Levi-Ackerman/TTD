package mikasa.ackerman.ttd.host.demo;

import java.util.List;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import mikasa.ackerman.ttd.host.R;
import mikasa.ackerman.ttd.host.demo.viewmodel.SubTab;
import mikasa.ackerman.ttd.host.demo.viewmodel.SubTabViewModel;

public class TestActivity extends AppCompatActivity {
    private ViewModelProvider mViewModelProvider;
    private SubTabViewModel mSubTabViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        mViewModelProvider = new ViewModelProvider(this);
        mSubTabViewModel = mViewModelProvider.get(SubTabViewModel.class);
        mSubTabViewModel.getSubtabs().observe(this, subtabs->{});
    }
}
