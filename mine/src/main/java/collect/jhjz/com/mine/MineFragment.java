package collect.jhjz.com.mine;

import collect.jhjz.com.common.base.BaseFragment;

/**
 * Created by 时雷 2019/5/17 14:38
 */
public class MineFragment extends BaseFragment {

    @Override
    public int initView() {
        return R.layout.fragment_mine;
    }

    @Override
    public void initData() {

    }

    public static MineFragment newInstance(){
        return new MineFragment();
    }
}
