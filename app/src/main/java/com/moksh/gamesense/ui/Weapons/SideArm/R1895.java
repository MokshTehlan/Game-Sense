package com.moksh.gamesense.ui.Weapons.SideArm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.moksh.gamesense.R;
import com.moksh.gamesense.ui.Weapons.CustomProgressBar;


public class R1895 extends Fragment {

    FrameLayout r1895;
    CustomProgressBar cb;
    public R1895() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_r1895,container,false);
        r1895 = view.findViewById(R.id.r1895);
        String url_to_image = "https://opgg-pubg-static.akamaized.net/assets/assets/item/weapon/handgun/item_weapon_m1911_c.png?image=w_500%2Ce_trim%2Fe_outline%3Aouter%3A8%3A0%2Fe_outline%3Aouter%3A3%3A1000%2Cco_rgb%3A00000080%2Fw_500%2Ch_500%2Cc_pad&v=1";

        View view1 = inflater.inflate(R.layout.sample_layout_guns,null);
        cb = new CustomProgressBar();
        cb.prog(view1,55,0.4, 330,0.75,200,8000, "R1895", "SIDEARM", "7.62", "Single", "Erangle, Sanhok", url_to_image,this.getContext(), false);
        r1895.addView(view1);

        return view;
    }
}