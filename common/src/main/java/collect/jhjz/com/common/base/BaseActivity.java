package collect.jhjz.com.common.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by 时雷 2019/5/17 15:58
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayout());
        initData();
    }

    public abstract int initLayout();
    public abstract void initData();

}
