package com.king.networkmonitor;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

public class MainActivity extends BaseActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onNetworkChanged(NetworkReceiver.NetworkType type)
    {
        //此处因为为测试机没有SIM卡，如在开发中可以改成mobil
        if (type == NetworkReceiver.NetworkType.Wifi)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("当前处于数据网络下，会耗费较多流量，是否继续？");
            builder.setCancelable(false);
            builder.setNegativeButton("取消", new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {

                }
            });
            builder.setPositiveButton("确定", new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {

                }
            });
            builder.show();
        }
        super.onNetworkChanged(type);
    }
}
