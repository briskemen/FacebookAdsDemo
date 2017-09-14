package com.briskemen.facebookadsdemo;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.ads.AdSettings;
import com.facebook.appevents.AppEventsLogger;

/**
 * Created by briskemen on 2017/7/14.
 */

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        //测试的时候要加上这一句话，里面这个id会在项目第一次运行时在控制台拿到。
        ////AdSettings: Test mode device hash: e689b41c4bb5be256a0118f6ea7bcbe1
        AdSettings.addTestDevice("471ae645254588e8498165df9b1fd87c");
    }
}
