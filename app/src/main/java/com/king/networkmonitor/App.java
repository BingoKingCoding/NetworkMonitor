package com.king.networkmonitor;

import android.app.Application;

/**
 * <请描述这个类是干什么的>
 * Created by wwb on 2017/7/13 17:18.
 */

public class App extends Application
{
    private static App sInstance;

    public static App getApplication()
    {
        return sInstance;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        sInstance = this;
        init();
    }

    private void init()
    {
        NetworkReceiver.registerReceiver(this);
    }


    @Override
    public void onTerminate()
    {
        NetworkReceiver.unregisterReceiver(this);
        super.onTerminate();
    }
}
