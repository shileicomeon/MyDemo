package collect.jhjz.com.home;

import collect.jhjz.com.common.base.BaseFragment;

/**
 * Created by 时雷 2019/5/17 14:32
 */
public class HomeFragment extends BaseFragment {

    @Override
    public int initView() {
        return R.layout.fragment_home;
    }

    @Override
    public void initData() {

    }

    public static HomeFragment newInstance(){
        return new HomeFragment();
    }
}
