package com.moksh.gamesense.ui.Weapons.Other;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.moksh.gamesense.R;
import com. moksh.gamesense.ui.Weapons.CustomProgressBar;


public class M249 extends Fragment {
    FrameLayout m249;
    CustomProgressBar cb;

    public M249() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_m249,container,false);
        m249 = view.findViewById(R.id.m249);


        String url_to_image = "https://opgg-pubg-static.akamaized.net/assets/assets/item/weapon/main/item_weapon_m249_c.png?image=w_500%2Ce_trim%2Fe_outline%3Aouter%3A8%3A0%2Fe_outline%3Aouter%3A3%3A1000%2Cco_rgb%3A00000080%2Fw_500%2Ch_500%2Cc_pad&v=1";
        View view1 = inflater.inflate(R.layout.sample_layout_guns,null);
        cb = new CustomProgressBar();
        cb.prog(view1,45,0.075, 915,8.2,450,10000, "M249", "OTHERS", "5.56", "Auto", "Erangle", url_to_image,this.getContext(), true);
        m249.addView(view1);
        return view;
    }
}