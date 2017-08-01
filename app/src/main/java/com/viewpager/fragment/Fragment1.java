package com.viewpager.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import viewpager.bupt.com.myviewpager.R;


/**
 * Created by HanWei on 2017/7/31.
 */

public class Fragment1 extends Fragment {
    String TAG="fragment1";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout1, container, false);
        Button bt1=(Button)view.findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "点击了第一个fragment的bt",
                        Toast.LENGTH_LONG).show();

            }
        });
        return view;
    }
    @Override
    public void onDestroy() {
        Log.e("text","fragment1 ondestroy");
        super.onDestroy();
    }

    @Override
    public void onPause() {
        Log.e("text","fragment1 onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e("text","fragment1 onStop");
        super.onStop();
    }
}
