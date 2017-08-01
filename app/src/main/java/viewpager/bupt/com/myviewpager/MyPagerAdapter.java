package viewpager.bupt.com.myviewpager;

import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

/**
 * Created by HanWei on 2017/7/31.
 */

public class MyPagerAdapter extends PagerAdapter {
    private List<View> list;

    public MyPagerAdapter(List<View> list) {
     this.list=list;

    }
    @Override
    public int getCount() {
        Log.v("text","运行了getCount");
        return list.size();//返回要滑动的view的个数
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        Log.v("text","运行了isViewFromObject");
        //根据传来的key（object），找到view,判断与传来的参数View view是不是同一个视图
        return view==list.get(Integer.parseInt(object.toString()));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        switch (position) {
            case 0:

                list.get(0).setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Log.e("haha", "点击了页面0");
                    }
                });

                Button bt1 = (Button) list.get(0).findViewById(R.id.bt1);
                bt1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.e("haha", "点击了页面0上的按钮");
                    }
                });
                break;
            case 1:

                list.get(1).setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Log.e("haha", "点击了页面1");
                    }
                });
                Button bt2 = (Button) list.get(1).findViewById(R.id.bt2);
                bt2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.e("haha", "点击了页面1上的按钮");
                    }
                });
                break;
            case 2:
                list.get(2).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Log.e("haha", "点击了页面2");
                    }
                });
                break;
            default:
                break;
        }
        ViewGroup v = (ViewGroup) list.get(position).getParent();
        if (v != null) {
            v.removeView(list.get(position));
        }
        container.addView(list.get(position));
        return position;
       //做了两件事，第一：将当前视图添加到container中，第二：返回当前View
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        Log.v("text","运行了destroyItem");
    container.removeView(list.get(position));
        //从当前container中删除指定位置（position）的View;

    }

    @Override
    public void startUpdate(ViewGroup container) {
        Log.e("text","运行了startUpdate");

        super.startUpdate(container);
    }

    @Override
    public void finishUpdate(ViewGroup container) {
        Log.e("text","运行了finishUpdate");
        super.finishUpdate(container);
    }
}
//Log.v("text","运行了instantiateItem");
//
//