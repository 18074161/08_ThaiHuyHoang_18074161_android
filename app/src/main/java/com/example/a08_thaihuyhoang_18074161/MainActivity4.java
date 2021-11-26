package com.example.a08_thaihuyhoang_18074161;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    ImageButton btnTien;
    TextView tvMoney;
    ImageView imghoi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        btnTien = findViewById(R.id.btnTien);
        tvMoney = findViewById(R.id.tvMoney);
        imghoi = findViewById(R.id.imghoi);


    }
}