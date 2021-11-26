package com.example.a08_thaihuyhoang_18074161;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
ImageButton btnBill;
TextView tvBann;
    String a="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        btnBill = findViewById(R.id.btnBill);
        tvBann = findViewById(R.id.tvBann);
        if(getIntent().getStringExtra("ban") != null){
            a = getIntent().getStringExtra("ban");
            tvBann.setText(a);
        }
        btnBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity4.class);
                intent.putExtra("ban1",a);
                startActivity(intent);
                startActivity(intent);
            }
        });
    }
}