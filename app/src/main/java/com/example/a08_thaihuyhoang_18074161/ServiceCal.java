package com.example.a08_thaihuyhoang_18074161;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class ServiceCal extends Service {
    private BinderCal mBinder = new BinderCal();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    public class BinderCal extends Binder{
        ServiceCal getService(){
            return ServiceCal.this;
        }
    }

    public Integer add(int a, int b, int c, int d){
        return a + b +c +d;
    }
    public Double minus(Double a, Double b){
        return a - b;
    }
    public Double div(Double a, Double b){
        return a/b;
    }
    public Double multi(Double a, Double b){
        return a*b;
    }
}
