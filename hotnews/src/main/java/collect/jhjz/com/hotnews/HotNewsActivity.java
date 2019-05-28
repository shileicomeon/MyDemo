package collect.jhjz.com.hotnews;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class HotNewsActivity extends AppCompatActivity {

    private HotNewsFragment hotNewsFragment;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = this.getSupportFragmentManager();
        transaction = fm.beginTransaction();
        hotNewsFragment = HotNewsFragment.newInstance();
        transaction.replace(R.id.frame_layout, hotNewsFragment);
        transaction.commit();
    }
}
