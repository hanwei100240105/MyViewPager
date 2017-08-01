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

public class Fragment2 extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
      View v=inflater.inflate(R.layout.layout2,container,false);
        Button bt2=(Button)v.findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Fragment2！", Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }
    @Override
    public void onDestroy() {
        Log.e("text","fragment2 ondestroy");
        super.onDestroy();
    }

    @Override
    public void onPause() {
        Log.e("text","fragment2 onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e("text","fragment2 onStop");
        super.onStop();
    }
}
