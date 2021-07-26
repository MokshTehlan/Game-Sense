package com.moksh.gamesense.ui.Maps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.moksh.gamesense.R;

public class MiramarMap extends AppCompatActivity {
    LinearLayout toolbar_miramar;
    private InterstitialAd mInterstitialAd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.miramar_map);

        //inflater for toolbar
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.toolbar,null);
        TextView tv = (TextView) view.findViewById(R.id.toolbar_name);
        ImageView back = (ImageView) view.findViewById(R.id.back_button);

        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }
        });

        //on click listner for back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onBackPressed();
            }
        });
        tv.setText("Miramar Map");

        //adding the view to xml
        toolbar_miramar = findViewById(R.id.toolbar_miramar);
        toolbar_miramar.addView(view);
    }
    @Override
    public void onBackPressed() {
        if (mInterstitialAd != null) {
            mInterstitialAd.show(MiramarMap.this);
        } else {
        }
        super.onBackPressed();

    }

}