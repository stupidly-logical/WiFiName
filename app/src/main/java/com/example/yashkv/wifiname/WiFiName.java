package com.example.yashkv.wifiname;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

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
