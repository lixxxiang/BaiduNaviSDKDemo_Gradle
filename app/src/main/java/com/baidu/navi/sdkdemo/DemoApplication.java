package com.baidu.navi.sdkdemo;

import android.app.Application;
import com.squareup.leakcanary.LeakCanary;
/**
 * Created by dingbbin on 2017/2/8.
 */

public class DemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
