package com.test.app;
import android.app.Application;
import com.adapter.util.AdapterUtil;
/**
 * Created by zhouguizhi on 2017/12/7.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AdapterUtil.init(this);
    }
}
