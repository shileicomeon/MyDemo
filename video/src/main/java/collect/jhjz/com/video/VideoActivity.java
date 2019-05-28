package collect.jhjz.com.video;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class VideoActivity extends AppCompatActivity {

    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = this.getSupportFragmentManager();
        transaction = fm.beginTransaction();
        VideoFragment videoFragment = VideoFragment.newInstance();
        transaction.replace(R.id.frame_layout, videoFragment);
        transaction.commit();
    }
}
