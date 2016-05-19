package com.wupao.ainong.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wupao.ainong.R;
import com.wupao.ainong.adapter.LauncherPagerAdapter;
import com.wupao.ainong.listener.LauncherOnPageChangeListener;
import com.wupao.ainong.utils.UIUtils;

import java.util.ArrayList;

public class Launcher extends Activity {
//    private GridView grLauncher;
    private ViewPager mPager;
    private LinearLayout llPoints;
    private View red_point;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher);
        initView();
        initData();
        mPager.setAdapter(new LauncherPagerAdapter());
        mPager.setOnPageChangeListener(new LauncherOnPageChangeListener(red_point));
        mPager.setCurrentItem(3, true);
    }

    private void initView() {
//        grLauncher = (GridView) findViewById(R.id.launcher_gr);
        mPager = (ViewPager) findViewById(R.id.launcher_vp_content);
        llPoints = (LinearLayout) findViewById(R.id.ll_points);
        red_point = findViewById(R.id.red_point);
    }

    private void initData(){
        int dip2px = UIUtils.dip2px(6);
        for (int i = 0; i < 5; i++) {
            View view = new View(getApplicationContext());
            view.setBackgroundResource(R.drawable.launcher_point_nomal);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(dip2px, dip2px);
            if (i != 0) {
                params.leftMargin = dip2px;
            }
            view.setLayoutParams(params);
            llPoints.addView(view);
        }
    }
}
