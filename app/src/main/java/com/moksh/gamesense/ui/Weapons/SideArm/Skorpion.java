package com.moksh.gamesense.ui.Weapons.SideArm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.moksh.gamesense.R;
import com.moksh.gamesense.ui.Weapons.CustomProgressBar;


public class Skorpion extends Fragment {
    FrameLayout skorpion;
    CustomProgressBar cb;
    public Skorpion() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_skorpion,container,false);
        skorpion = view.findViewById(R.id.skorpion);
        String url_to_image = "https://opgg-pubg-static.akamaized.net/assets/assets/item/weapon/main/item_weapon_vz61skorpion_c2.png?image=w_500%2Ce_trim%2Fe_outline%3Aouter%3A8%3A0%2Fe_outline%3Aouter%3A3%3A1000%2Cco_rgb%3A00000080%2Fw_500%2Ch_500%2Cc_pad&v=1";

        View view1 = inflater.inflate(R.layout.sample_layout_guns,null);
        cb = new CustomProgressBar();
        cb.prog(view1,22,0.071, 350,3.1,150,5000, "Sawed-off", "SIDEARM", "9", "Normal", "All", url_to_image,this.getContext(), false);
        skorpion.addView(view1);
        return view;
    }
}