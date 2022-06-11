package com.softwaredevtools.imads;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;

import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.ironsource.mediationsdk.IronSource;
import com.startapp.sdk.adsbase.StartAppAd;

public class ImInterstitial {

    public static MaxInterstitialAd interstitialAd;
    public static int COUNTER;


    public static void loadImAds(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

        interstitialAd = new MaxInterstitialAd(idIntertitial, activity);
        interstitialAd.loadAd();

        switch (selectAdsBackup) {
            case "STARTAPP":
                //panggil kode interstiital startapp disini

        }
    }


    public static void ShowImAds(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup, int INTERVAL) {
        if (COUNTER >= INTERVAL) {
            if (interstitialAd.isReady()) {
                interstitialAd.showAd();
                loadImAds(activity, selectAdsBackup, idIntertitial, idIntertitialBackup);
            } else {
                switch (selectAdsBackup) {
                    case "STARTAPP":
                        StartAppAd.showAd(activity);
                        Log.i("ads log","ads show StartApp");

                    loadImAds(activity, selectAdsBackup, idIntertitial, idIntertitialBackup);
                    interstitialAd.loadAd();
                }
                COUNTER = 0;
            }

        } else
            COUNTER++;
    }
}
