package com.moksh.gamesense.ui.Weapons.AR;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.moksh.gamesense.R;
import com.moksh.gamesense.ui.Weapons.CustomProgressBar;

public class M762 extends Fragment {
    CustomProgressBar cb;

    public M762() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_m762,container,false);
        FrameLayout m762 = view.findViewById(R.id.m762);

        View view1 = inflater.inflate(R.layout.sample_layout_guns,null);

        String url_to_image= "https://opgg-pubg-static.akamaized.net/assets/assets/item/weapon/main/item_weapon_berylm762_c.png?image=w_500%2Ce_trim%2Fe_outline%3Aouter%3A8%3A0%2Fe_outline%3Aouter%3A3%3A1000%2Cco_rgb%3A00000080%2Fw_500%2Ch_500%2Cc_pad&v=1";
        cb = new CustomProgressBar();
        cb.prog(view1,47,0.086, 715,2.9,380,10000, "M762", "Assault Rifel", "7.62", "Single, Auto, Burst", "All", url_to_image, this.getContext(), false);
        m762.addView(view1);
        return view;
    }
}