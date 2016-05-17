package com.wupao.ainong;

import android.app.Application;
import android.content.Context;

/**
 * Created by 隋虹山 on 2016/5/17.
 */
public class LauncherApplication extends Application {

    private static LauncherApplication INSTANCE;
    private static Context CONTEXT;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        CONTEXT = this;
    }

    public static LauncherApplication getInstance(){
        return INSTANCE;
    }

    public static Context getContext(){
        return CONTEXT;
    }
}
