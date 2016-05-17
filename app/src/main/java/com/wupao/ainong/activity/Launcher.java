package com.wupao.ainong.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.wupao.ainong.R;

public class Launcher extends AppCompatActivity {
    private GridView grLauncher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher);
        initView();
    }

    private void initView() {
        grLauncher = (GridView) findViewById(R.id.launcher_gr);
    }
}
