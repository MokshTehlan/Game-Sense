package com.moksh.gamesense.ui.Weapons.SMG;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.moksh.gamesense.R;
import com.moksh.gamesense.ui.Weapons.CustomProgressBar;


public class Uzi extends Fragment {

    FrameLayout uzi;
    CustomProgressBar cb;
    public Uzi() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_uzi,container,false);
        uzi = view.findViewById(R.id.uzi);


        String url_to_image = "https://opgg-pubg-static.akamaized.net/assets/assets/item/weapon/main/item_weapon_uzi_c.png?image=w_500%2Ce_trim%2Fe_outline%3Aouter%3A8%3A0%2Fe_outline%3Aouter%3A3%3A1000%2Cco_rgb%3A00000080%2Fw_500%2Ch_500%2Cc_pad&v=1";
        View view1 = inflater.inflate(R.layout.sample_layout_guns,null);
        cb = new CustomProgressBar();
        cb.prog(view1,26,0.048, 350,3.1,150,5000, "Uzi", "SMG", "9", "Single, Auto, Burst", "ALL", url_to_image,this.getContext(), false);
        uzi.addView(view1);
        return view;
    }
}