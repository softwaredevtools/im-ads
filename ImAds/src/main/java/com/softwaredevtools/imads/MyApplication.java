package com.softwaredevtools.imads;

import android.app.Application;
import android.os.Handler;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;

import java.util.concurrent.TimeUnit;

public class MyApplication extends Application {

        @Override
        public void onCreate() {
            super.onCreate();
            AppLovinSdk.getInstance(MyApplication.this).setMediationProvider(AppLovinMediationProvider.MAX);
            AppLovinSdk.getInstance(MyApplication.this).initializeSdk(config -> {

            });
        }





}

