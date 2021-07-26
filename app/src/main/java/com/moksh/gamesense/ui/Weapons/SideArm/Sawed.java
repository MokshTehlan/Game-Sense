package com.moksh.gamesense.ui.Weapons.SideArm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.moksh.gamesense.R;
import com.moksh.gamesense.ui.Weapons.CustomProgressBar;

public class Sawed extends Fragment {
    FrameLayout sawed;
    CustomProgressBar cb;
    public Sawed() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sawed,container,false);
        sawed = view.findViewById(R.id.sawed);
        String url_to_image = "https://opgg-pubg-static.akamaized.net/assets/assets/item/weapon/handgun/item_weapon_sawnoff_c.png?image=w_500%2Ce_trim%2Fe_outline%3Aouter%3A8%3A0%2Fe_outline%3Aouter%3A3%3A1000%2Cco_rgb%3A00000080%2Fw_500%2Ch_500%2Cc_pad&v=1";

        View view1 = inflater.inflate(R.layout.sample_layout_guns,null);
        cb = new CustomProgressBar();
        cb.prog(view1,160,0.25, 330,4,200,8000, "Sawed-off", "SIDEARM", "12 Guage", "Single", "All", url_to_image,this.getContext(), false);
        sawed.addView(view1);

        return view;
    }
}