package collect.jhjz.com.hotnews;

import collect.jhjz.com.common.base.BaseFragment;

/**
 * Created by 时雷 2019/5/17 14:28
 */
public class HotNewsFragment extends BaseFragment {


    @Override
    public int initView() {
        return R.layout.fragment_hot_news;
    }

    @Override
    public void initData() {

    }

    public static HotNewsFragment newInstance(){
         return new HotNewsFragment();
    }
}
