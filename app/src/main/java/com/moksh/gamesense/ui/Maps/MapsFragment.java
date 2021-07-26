package com.moksh.gamesense.ui.Maps;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.moksh.gamesense.R;

public class MapsFragment extends Fragment {
    private LinearLayout erangle,miramar,sanhok,livik;
    private TextView toolbar_name;
    private AdView adView;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
            View root = inflater.inflate(R.layout.fragment_maps, container, false);

            //on click listener for image

            erangle = root.findViewById(R.id.erangle);
            miramar = root.findViewById(R.id.miramar);
            sanhok = root.findViewById(R.id.sanhok);
            livik = root.findViewById(R.id.livik);


//          Ad work here




        adView = root.findViewById(R.id.adView);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        adView.loadAd(adRequest2);

        adView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                super.onAdLoaded();
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                super.onAdFailedToLoad(adError);
                adView.loadAd(adRequest2);

            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
                super.onAdOpened();
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                super.onAdClicked();
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
                super.onAdClosed();
                
            }
        });


        final Toast[] t = new Toast[1];
            toolbar_name = root.findViewById(R.id.toolbar_name);

            erangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(root.getContext(),ErangleMap.class));
            }});

            miramar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(root.getContext(),MiramarMap.class));
                }
            });

            sanhok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (t[0] != null){
                        t[0].cancel();
                    }

                    t[0] = Toast.makeText(getContext(),"Map will be available soon",Toast.LENGTH_SHORT);
                    t[0].show();
                }
            });

        livik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t[0] != null){
                    t[0].cancel();
                }
                t[0] = Toast.makeText(getContext(),"Map will be available soon",Toast.LENGTH_SHORT);
                t[0].show();
            }
        });

        return root;
    }



}