package com.softwaredevtools.imads;

import android.app.Activity;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.facebook.ads.AdSettings;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;

public class ImInitialize {


    public static void Ads(Activity activity, String ADS_BACKUP, String INITIALIZE_BACKUP) {
        AdSettings.setDataProcessingOptions(new String[]{});
        AppLovinSdk.getInstance(activity).setMediationProvider(AppLovinMediationProvider.MAX);
        AppLovinSdk.getInstance(activity).initializeSdk(config -> {
        });
        switch (ADS_BACKUP) {
            case "STARTAPP":
                StartAppSDK.init(activity, INITIALIZE_BACKUP, true);
                StartAppAd.disableSplash();
                StartAppSDK.setUserConsent(activity,
                        "pas",
                        System.currentTimeMillis(),
                        true);
                break;
        }
    }

}
