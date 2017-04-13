package com.example.yashkv.wifiname;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.widget.Toast;

public class WiFiName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wi_fi_name);

        //IntentFilter intentFilter = new IntentFilter();
        //intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        //registerReceiver(broadcastReceiver,intentFilter);

        //registerReceiver(broadcastReceiver,intent);
        startService(new Intent(this, NotifyService.class));
    }

}
