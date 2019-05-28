package collect.jhjz.com.common.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

/**
 * Created by 时雷 2019/5/17 15:58
 */
public abstract class BaseFragment extends Fragment {
    protected Activity mActivity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = (AppCompatActivity) context;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(initView(),container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();

    }

    public abstract int initView();
    public abstract void initData();
}
