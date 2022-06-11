package com.softwaredevtools.imads;


import android.app.Activity;
import android.util.Log;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.startapp.sdk.adsbase.StartAppAd;

public class ImInterstitial {

    public static MaxInterstitialAd interstitialAd;
    public static int COUNTER;


    public static void loadAds(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

        interstitialAd = new MaxInterstitialAd(idIntertitial, activity);
        interstitialAd.loadAd();

        switch (selectAdsBackup) {
            case "STARTAPP":
                //panggil kode interstiital startapp disini

        }
    }


    public static void ShowAds(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup, int INTERVAL) {
        if (COUNTER >= INTERVAL) {
            if (interstitialAd.isReady()) {
                interstitialAd.showAd();
                loadAds(activity, selectAdsBackup, idIntertitial, idIntertitialBackup);
            } else {
                switch (selectAdsBackup) {
                    case "STARTAPP":
                        StartAppAd.showAd(activity);
                        Log.i("ads log","ads show StartApp");

                    loadAds(activity, selectAdsBackup, idIntertitial, idIntertitialBackup);
                    interstitialAd.loadAd();
                }
                COUNTER = 0;
            }

        } else
            COUNTER++;
    }
}
