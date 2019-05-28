package collect.jhjz.com.home;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class HomeActivity extends AppCompatActivity {

    private HomeFragment homeFragment;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = this.getSupportFragmentManager();
        transaction = fm.beginTransaction();
        homeFragment = HomeFragment.newInstance();
        transaction.replace(R.id.frame_layout, homeFragment);
        transaction.commit();
    }
}
