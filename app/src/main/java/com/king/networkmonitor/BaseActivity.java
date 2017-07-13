package com.king.networkmonitor;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * <请描述这个类是干什么的>
 * Created by wwb on 2017/7/13 17:57.
 */

public class BaseActivity extends AppCompatActivity implements NetworkReceiver.NetworkCallback
{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState)
    {
        super.onCreate(savedInstanceState, persistentState);
        init();
    }

    private void init()
    {
        NetworkReceiver.addCallback(this);
    }

    @Override
    protected void onDestroy()
    {
        NetworkReceiver.removeCallback(this);
        super.onDestroy();
    }

    @Override
    public void onNetworkChanged(NetworkReceiver.NetworkType type)
    {

    }
}
