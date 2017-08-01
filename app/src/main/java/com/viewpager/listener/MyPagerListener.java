package com.viewpager.listener;

import android.support.v4.view.ViewPager;
import android.util.Log;

/**
 * Created by HanWei on 2017/8/1.
 */

public class MyPagerListener implements ViewPager.OnPageChangeListener {
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        Log.e("test", "onPageScrolled------>arg0："+position+"\nonPageScrolled------>arg1:"
                +positionOffset+"\nonPageScrolled------>arg2:"+positionOffsetPixels);
    }

    @Override
    public void onPageSelected(int position) {
        Log.e("test", "onPageSelected-----当前所处的界面position=>"+position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        if(state == 0){
            Log.e("test", "onPageScrollStateChanged------>0--什么也没做");
        }else if(state == 1){
            Log.e("test", "onPageScrollStateChanged------>1--正在滑动");
        }else if(state == 2){
            Log.e("test", "onPageScrollStateChanged------>2--滑动完毕");
        }
    }
}
