package com.moksh.gamesense.ui.Weapons.AR;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.moksh.gamesense.R;
import com.moksh.gamesense.ui.Weapons.CustomProgressBar;

public class MK47 extends Fragment {
    CustomProgressBar cb;

    public MK47() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_mk47,container,false);
        FrameLayout mk47 = view.findViewById(R.id.mk47);

        View view1 = inflater.inflate(R.layout.sample_layout_guns,null);

        String url_to_image = "https://opgg-pubg-static.akamaized.net/assets/assets/item/weapon/main/item_weapon_mk47mutant_c.png?image=w_500%2Ce_trim%2Fe_outline%3Aouter%3A8%3A0%2Fe_outline%3Aouter%3A3%3A1000%2Cco_rgb%3A00000080%2Fw_500%2Ch_500%2Cc_pad&v=1";
        cb = new CustomProgressBar();
        cb.prog(view1,49,0.1, 780,3.367,380,10000, "MK47 Mutant", "Assault Rifel", "7.62", "Single, Burst", "All", url_to_image,this.getContext(), false);
        mk47.addView(view1);
        return view;
    }
}