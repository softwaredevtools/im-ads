package com.softwaredevtools.imads;

import android.app.Application;
import android.util.Log;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;

public class MyApplication extends Application implements MaxAdListener {

        @Override
        public void onCreate() {
            super.onCreate();
            AppLovinSdk.getInstance(MyApplication.this).setMediationProvider(AppLovinMediationProvider.MAX);
            AppLovinSdk.getInstance(MyApplication.this).initializeSdk(config -> {

            }); AppLovinSdk.getInstance( this ).showMediationDebugger();
        }

    @Override
    public void onAdLoaded(MaxAd ad) {
            Log.i("ads log","ads loaded");

    }

    @Override
    public void onAdDisplayed(MaxAd ad) {
        Log.i("ads log","ads Displayed");

    }

    @Override
    public void onAdHidden(MaxAd ad) {

    }

    @Override
    public void onAdClicked(MaxAd ad) {

    }

    @Override
    public void onAdLoadFailed(String adUnitId, MaxError error) {

    }

    @Override
    public void onAdDisplayFailed(MaxAd ad, MaxError error) {

    }


}

