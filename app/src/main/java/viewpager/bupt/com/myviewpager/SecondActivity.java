package viewpager.bupt.com.myviewpager;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends Activity implements View.OnClickListener,ViewPager.OnPageChangeListener {
    private View view1, view2, view3;
    private ViewPager viewpager;
    private List<View> viewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        viewpager = (ViewPager) findViewById(R.id.viewpager2);
        LayoutInflater l = getLayoutInflater();
        view1 = l.inflate(R.layout.layout1, null);
        view2 = l.inflate(R.layout.layout2, null);
        view3 = l.inflate(R.layout.layout3, null);
        viewList = new ArrayList<View>();
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        Button bt1 = (Button) view1.findViewById(R.id.bt1);
        Button bt2 = (Button) view2.findViewById(R.id.bt2);
        //bt1.setOnClickListener(this);
        //bt2.setOnClickListener(this);
        MyPagerAdapter adapter = new MyPagerAdapter(viewList);
        viewpager.setAdapter(adapter);

        viewpager.setOnPageChangeListener(this);


//        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset,
//                                       int positionOffsetPixels) {
//
//                Log.e("test", "onPageScrolled------>arg0："+position
//                        +"\nonPageScrolled------>arg1:"
//                        +positionOffset+"\nonPageScrolled------>arg2:"
//                        +positionOffsetPixels);
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//
//                Log.e("test", "onPageSelected-----当前所处的界面position=>"
//                        +position);
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//                if(state == 0){
//                    Log.e("test", "onPageScrollStateChanged-->0--什么也没做");
//                }else if(state == 1){
//                    Log.e("test", "onPageScrollStateChanged-->1--正在滑动");
//                }else if(state == 2){
//                    Log.e("test", "onPageScrollStateChanged-->2--滑动完毕");
//                }
//
//            }
//        });

    }//onCreate方法结束

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt1:
                Toast.makeText(SecondActivity.this, "界面1", Toast.LENGTH_LONG).show();
                break;
            case R.id.bt2:
                Toast.makeText(SecondActivity.this, "界面2", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        Log.e("test", "onPageScrolled------>arg0：" + position
                + "\nonPageScrolled------>arg1:"
                + positionOffset + "\nonPageScrolled------>arg2:"
                + positionOffsetPixels);
    }

    @Override
    public void onPageSelected(int position) {
        Log.e("test", "onPageSelected-----当前所处的界面position=>"
                + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        if (state == 0) {
            Log.e("test", "onPageScrollStateChanged-->0--什么也没做");
        } else if (state == 1) {
            Log.e("test", "onPageScrollStateChanged-->1--正在滑动");
        } else if (state == 2) {
            Log.e("test", "onPageScrollStateChanged-->2--滑动完毕");
        }
    }

}

//




// TODO Auto-generated method stub
//PagerAdapter pagerAdapter = new PagerAdapter() {//内部类
//            @Override
//
//            public boolean isViewFromObject(View arg0, Object arg1) {
//
//                // TODO Auto-generated method stub
//                return arg0 == arg1;
//            }
//            @Override
//
//            public int getCount() {
//
//                // TODO Auto-generated method stub
//                System.out.println("view数量是"+viewList.size());
//                return viewList.size();////返回要滑动的view的个数
//            }
//
//            @Override
//            public void destroyItem(ViewGroup container, int position,
//                                    Object object) {
//                // TODO Auto-generated method stub
//                container.removeView(viewList.get(position));
//
//            }
//            @Override
//            public Object instantiateItem(ViewGroup container,
//                                          int position) {
//                if (viewList.get(position).getParent() == null) {
//                    container.addView(viewList.get(position));
//                } else {
//                    ((ViewGroup) viewList.get(position).getParent()).removeView(viewList.get(position));
//                    container.addView(viewList.get(position));
//                }
//
//                return viewList.get(position);
//            }
//        };