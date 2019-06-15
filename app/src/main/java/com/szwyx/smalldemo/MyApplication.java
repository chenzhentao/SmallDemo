package com.szwyx.smalldemo;

import android.app.Application;

import net.wequick.small.Small;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Small.preSetUp(this); //small框架的初始化
    }
}
