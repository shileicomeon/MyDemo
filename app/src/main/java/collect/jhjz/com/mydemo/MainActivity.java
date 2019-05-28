package collect.jhjz.com.mydemo;

import android.os.Bundle;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import collect.jhjz.com.common.base.BaseActivity;
import collect.jhjz.com.home.HomeFragment;
import collect.jhjz.com.hotnews.HotNewsFragment;
import collect.jhjz.com.mine.MineFragment;
import collect.jhjz.com.video.VideoFragment;

public class MainActivity extends BaseActivity {

    private HotNewsFragment hotNewsFragment;
    private HomeFragment homeFragment;
    private VideoFragment videoFragment;
    private MineFragment mineFragment;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_main);
    //    StatusBarUtil.setStatusBarColor(this,getResources().getColor(R.color.colorAccent));

    }

    /**
     * 设置默认的
     */
    private void setDefaultFragment() {
        FragmentManager fm = this.getSupportFragmentManager();
        transaction = fm.beginTransaction();
        homeFragment = homeFragment.newInstance();
        transaction.replace(R.id.frame_layout,homeFragment);
        transaction.commit();
    }


    public void onTab(int position) {
       FragmentManager fm = this.getSupportFragmentManager();
        //开启事务
        transaction = fm.beginTransaction();
        switch (position) {
            case 0:
                if (homeFragment == null) {
                    homeFragment = HomeFragment.newInstance();
                }
                transaction.replace(R.id.frame_layout, homeFragment);
                break;
            case 1:
                if (hotNewsFragment == null) {
                    hotNewsFragment = HotNewsFragment.newInstance();
                }
                transaction.replace(R.id.frame_layout, hotNewsFragment);
                break;
            case 2:
                if (videoFragment == null) {
                    videoFragment = VideoFragment.newInstance();
                }
                transaction.replace(R.id.frame_layout, videoFragment);
                break;
            case 3:
                if (mineFragment == null) {
                    mineFragment = MineFragment.newInstance();
                }
                transaction.replace(R.id.frame_layout, mineFragment);
                break;
            default:
                break;
        }
        // 事务提交
        transaction.commit();
    }

    @Override
    public int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initData() {
        setDefaultFragment();
        BottomNavigationBar bottomNavigationBar =  findViewById(R.id.bottom_navigation_bar);

        bottomNavigationBar
                .addItem(new BottomNavigationItem(R.drawable.ic_launcher_background, "Home"))
                .addItem(new BottomNavigationItem(R.drawable.ic_launcher_background, "Hot"))
                .addItem(new BottomNavigationItem(R.drawable.ic_launcher_background, "Video"))
                .addItem(new BottomNavigationItem(R.drawable.ic_launcher_background, "Mine"))
                .initialise();
        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                onTab(position);
            }

            @Override
            public void onTabUnselected(int position) {
            }

            @Override
            public void onTabReselected(int position) {
            }
        });
    }
}
