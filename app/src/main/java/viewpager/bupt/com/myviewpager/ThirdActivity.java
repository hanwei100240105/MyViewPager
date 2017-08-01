package viewpager.bupt.com.myviewpager;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends Activity {
    private List<String> titlelist;//标题列表数组
    private View view1, view2, view3;//需要滑动的页卡
    private ViewPager viewPager;//viewpager
    private PagerTitleStrip pagerTitleStrip;//viewpager的标题
    private PagerTabStrip pagerTabStrip;//一个viewpager的指示器，效果就是一个横的粗的下划线
    private List<View> viewList;//把需要滑动的页卡添加到这个list中
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.v("ThirdActivity","跳转到ThirdActivity");
      viewPager=(ViewPager)findViewById(R.id.viewpager3);
        LayoutInflater l=getLayoutInflater();

        view1=l.inflate(R.layout.layout1,null);
        view2=l.inflate(R.layout.layout2,null);
        view3=l.inflate(R.layout.layout3,null);
        viewList= new ArrayList<View>();
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        titlelist=new ArrayList<String>();
        titlelist.add("张三");
        titlelist.add("李四");
        titlelist.add("王五");

        PagerAdapter pagerAdapter = new PagerAdapter() {
            @Override

            public boolean isViewFromObject(View arg0, Object arg1) {

                // TODO Auto-generated method stub
                return arg0 == arg1;
            }
            @Override

            public int getCount() {

                // TODO Auto-generated method stub
                System.out.println("view数量是"+viewList.size());
                return viewList.size();
            }

            @Override

            public void destroyItem(ViewGroup container, int position,

                                    Object object) {
                // TODO Auto-generated method stub
                container.removeView(viewList.get(position));

            }
            @Override
            public Object instantiateItem(ViewGroup container, int position) {

                // TODO Auto-generated method stub
                if(viewList.get(position).getParent()==null) {
                    container.addView(viewList.get(position));
                }else{
                    ((ViewGroup) viewList.get(position).getParent()).removeView(viewList.get(position));
                    container.addView(viewList.get(position));
                }

                return viewList.get(position);
            }
            @Override
            public CharSequence getPageTitle(int position) {

                return titlelist.get(position);
                //直接用适配器来完成标题的显示，所以从上面可以看到，
                // 我们没有使用PagerTitleStrip。当然你可以使用。

            }


        };
        viewPager.setAdapter(pagerAdapter);



    }
}
