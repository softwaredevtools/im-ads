package com.softwaredevtools.test;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.util.Log;

import com.softwaredevtools.imads.ImInitialize;
import com.softwaredevtools.imads.ImInterstitial;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("ads", "log test app");
        ImInitialize.Ads(this, "STARTAPP", "xsf");
        ImInterstitial.loadAds(this, "95abd6df8c8c4f48", "STARTAPP", "dafgfa");


    }

    public void showInter(View view) {
        // Do something in response to button click
        ImInterstitial.ShowAds(this, "STARTAPP", "fdssd", "eew", 0);

    }
}