package com.softwaredevtools.imads;

import android.app.Application;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;

public class MyApplication extends Application {

        @Override
        public void onCreate() {
            super.onCreate();
            AppLovinSdk.getInstance(MyApplication.this).setMediationProvider(AppLovinMediationProvider.MAX);
            AppLovinSdk.getInstance(MyApplication.this).initializeSdk(config -> {

            });
        }





}

