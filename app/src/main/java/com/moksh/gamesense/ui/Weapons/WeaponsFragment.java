package com.moksh.gamesense.ui.Weapons;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.moksh.gamesense.R;
import com.moksh.gamesense.ui.Weapons.AR.MainScreenAr;
import com.moksh.gamesense.ui.Weapons.DMR.MainScreenDmr;
import com.moksh.gamesense.ui.Weapons.Other.MainScreenOther;
import com.moksh.gamesense.ui.Weapons.SMG.MainScreenSmg;
import com.moksh.gamesense.ui.Weapons.ShotGuns.MainScreenShotgun;
import com.moksh.gamesense.ui.Weapons.SideArm.MainScreenSidearm;
import com.moksh.gamesense.ui.Weapons.SniperRifels.MainScreenSr;

public class WeaponsFragment extends Fragment {

    private LinearLayout ar,sr,smg,dmr,other,shotgun,sidearm;
    private AdView adView;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_weapons, container, false);
        ar = root.findViewById(R.id.ar);
        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(root.getContext(), MainScreenAr.class));
            }
        });
        sr = root.findViewById(R.id.sr);
        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(root.getContext(), MainScreenSr.class));
            }
        });

        smg = root.findViewById(R.id.smg);
        smg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(root.getContext(), MainScreenSmg.class));
            }
        });

        dmr = root.findViewById(R.id.dmr);
        dmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(root.getContext(), MainScreenDmr.class));
            }
        });

        other = root.findViewById(R.id.other);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(root.getContext(), MainScreenOther.class));
            }
        });

        shotgun = root.findViewById(R.id.shotgun);
        shotgun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(root.getContext(), MainScreenShotgun.class));
            }
        });

        sidearm = root.findViewById(R.id.sidearm);
        sidearm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(root.getContext(), MainScreenSidearm.class));
            }
        });
        //          Ad work here
        adView = root.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

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
                adView.loadAd(adRequest);

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
        return root;
    }
}