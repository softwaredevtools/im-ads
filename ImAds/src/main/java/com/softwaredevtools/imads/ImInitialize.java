package com.softwaredevtools.imads;

import android.app.Activity;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.facebook.ads.AdSettings;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;

public class ImInitialize {

    public static MaxAdListener interstitialAd;
    private int retryAttempt;

    public static void SelectAdsApplovinMax(Activity activity, String selectAdsBackup, String idInitialize) {
        AdSettings.setDataProcessingOptions(new String[]{});
        AppLovinSdk.getInstance(activity).setMediationProvider(AppLovinMediationProvider.MAX);
        AppLovinSdk.getInstance(activity).initializeSdk(config -> {
        });
        switch (selectAdsBackup) {
            case "STARTAPP":
                StartAppSDK.init(activity, idInitialize, true);
                StartAppAd.disableSplash();
                StartAppSDK.setUserConsent(activity,
                        "pas",
                        System.currentTimeMillis(),
                        true);
                break;
        }
    }

}
