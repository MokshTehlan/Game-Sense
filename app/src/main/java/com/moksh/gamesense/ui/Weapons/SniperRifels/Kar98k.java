package com.moksh.gamesense.ui.Weapons.SniperRifels;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.moksh.gamesense.R;
import com.moksh.gamesense.ui.Weapons.CustomProgressBar;


public class Kar98k extends Fragment {

    FrameLayout kar98k;
    CustomProgressBar cb;
    public Kar98k() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kar98k,container,false);
        kar98k = view.findViewById(R.id.kar98k);

        String url_to_image = "https://opgg-pubg-static.akamaized.net/assets/assets/item/weapon/main/item_weapon_kar98k_c.png?image=w_500%2Ce_trim%2Fe_outline%3Aouter%3A8%3A0%2Fe_outline%3Aouter%3A3%3A1000%2Cco_rgb%3A00000080%2Fw_500%2Ch_500%2Cc_pad&v=1";
        View view1 = inflater.inflate(R.layout.sample_layout_guns,null);
        cb = new CustomProgressBar();
        cb.prog(view1,75,1.9, 760,4,500,16000, "Kar98k", "Sniper Rifel", "7.62", "Single", "All", url_to_image,this.getContext(), false);
        kar98k.addView(view1);
        return view;
      }
}