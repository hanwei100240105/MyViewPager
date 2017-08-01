package viewpager.bupt.com.myviewpager;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by HanWei on 2017/7/31.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;
    private List<String> titlelist;
    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> fragments,List<String> titlelist) {
        super(fm);
        this.fragments = fragments;
        this.titlelist=titlelist;
    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();

    }
    @Override
    public CharSequence getPageTitle(int position) {

        return titlelist.get(position);
        //直接用适配器来完成标题的显示，所以从上面可以看到，
        // 我们没有使用PagerTitleStrip。当然你可以使用。

    }

}
