package collect.jhjz.com.video;

import collect.jhjz.com.common.base.BaseFragment;

/**
 * Created by 时雷 2019/5/17 14:40
 */
public class VideoFragment extends BaseFragment {

    @Override
    public int initView() {
        return R.layout.fragment_video;
    }

    @Override
    public void initData() {

    }

    public static VideoFragment newInstance(){
        return new VideoFragment();
    }
}
