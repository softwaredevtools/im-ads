package com.softwaredevtools.imads;


import android.app.Activity;
import android.app.Application;
import android.util.Log;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.startapp.sdk.adsbase.StartAppAd;

public class ImInterstitial {

    public static MaxInterstitialAd interstitialAd;
    public static int COUNTER;


    public static void loadAds(Activity activity, String MaxInter, String AdsBackup, String InterBackup) {

        interstitialAd = new MaxInterstitialAd(MaxInter, activity);
        interstitialAd.loadAd();


        switch (AdsBackup) {
            case "STARTAPP":
                //panggil kode interstiital startapp disini

        }
    }


    public static void ShowAds(Activity activity, String AdsBackup, String MaxInter, String BackupInter, int Interval) {
        if (COUNTER >= Interval) {
            if (interstitialAd.isReady()) {
                interstitialAd.showAd();
               Log.i("ads log","ads show Max");
            } else {
                switch (AdsBackup) {
                    case "STARTAPP":
                        StartAppAd.showAd(activity);
                        Log.i("ads log","ads show StartApp");
                }
                loadAds(activity, AdsBackup, MaxInter, BackupInter);
                COUNTER = 0;
            }

        } else
            COUNTER++;
    }

}
