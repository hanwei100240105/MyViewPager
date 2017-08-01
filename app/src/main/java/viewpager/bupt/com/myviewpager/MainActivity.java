package viewpager.bupt.com.myviewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.viewpager.fragment.Fragment1;
import com.viewpager.fragment.Fragment2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private ViewPager viewpager;
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private MyFragmentPagerAdapter fragadapter;
    private List<Fragment> fragments;
    private List<String> titlelist;//标题列表数组
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager=(ViewPager)findViewById(R.id.viewpager);
        fragment1=new Fragment1();
        fragment2=new Fragment2();
        fragments=new ArrayList<Fragment>();
        fragments.add(fragment1);
        fragments.add(fragment2);
        titlelist=new ArrayList<String>();
        titlelist.add("张三");
        titlelist.add("李四");
        fragadapter=new MyFragmentPagerAdapter(getSupportFragmentManager(),
                fragments,titlelist);
        viewpager.setAdapter(fragadapter);
        viewpager.setCurrentItem(1);
    }
}
