package collect.jhjz.com.mine;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MineActivity extends AppCompatActivity {

    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = this.getSupportFragmentManager();
        transaction = fm.beginTransaction();
        MineFragment mineFragment = MineFragment.newInstance();
        transaction.replace(R.id.frame_layout, mineFragment);
        transaction.commit();
    }
}
