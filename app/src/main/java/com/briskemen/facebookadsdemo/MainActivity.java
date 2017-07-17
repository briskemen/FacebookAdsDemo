package com.briskemen.facebookadsdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

public class MainActivity extends AppCompatActivity implements InterstitialAdListener {
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadInterstitialAd();
            }
        });
    }

    private void loadInterstitialAd() {
        //加入你的广告版位号
        interstitialAd = new InterstitialAd(this, "134016537185906_134304320490461");
       // interstitialAd = new InterstitialAd(this, "1110535662372701_1110559022370365");
        interstitialAd.setAdListener(this);
        interstitialAd.loadAd();
    }

    @Override
    public void onInterstitialDisplayed(Ad ad) {
        //展示
    }

    @Override
    public void onInterstitialDismissed(Ad ad) {
        //消失
    }

    @Override
    public void onError(Ad ad, AdError adError) {
        //加载错误
    }

    @Override
    public void onAdLoaded(Ad ad) {
        //加载完成
        interstitialAd.show();
    }

    @Override
    public void onAdClicked(Ad ad) {
        //点击
    }

    @Override
    public void onLoggingImpression(Ad ad) {

    }

    @Override
    protected void onDestroy() {
        if (interstitialAd != null) {
            interstitialAd.destroy();// 释放 interstitialAd 使用的资源
        }
        super.onDestroy();
    }
}
