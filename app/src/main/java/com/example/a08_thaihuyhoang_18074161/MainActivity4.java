package com.example.a08_thaihuyhoang_18074161;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    ImageButton btnTien;
    TextView tvMoney;
    ImageView imghoi;

    private ServiceCal mServiceCal;
    private Boolean isConnect = false;
    private ServiceConnection mConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            ServiceCal.BinderCal binderCal = (ServiceCal.BinderCal) service;
            mServiceCal = binderCal.getService();
            isConnect = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isConnect = false;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent =  new Intent(MainActivity4.this, ServiceCal.class);
        bindService(intent, mConnection,BIND_AUTO_CREATE);

        setContentView(R.layout.activity_main4);
        btnTien = findViewById(R.id.btnTien);
        tvMoney = findViewById(R.id.tvMoney);
        imghoi = findViewById(R.id.imghoi);
        imghoi.setVisibility(View.VISIBLE);
        tvMoney.setVisibility(View.GONE);
        btnTien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMoney.setText(mServiceCal.add(200,300,30,150)+"k");
                imghoi.setVisibility(View.GONE);
                tvMoney.setVisibility(View.VISIBLE);
            }
        });


    }
}