package com.moksh.gamesense.ui.Weapons.SideArm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.moksh.gamesense.R;
import com.moksh.gamesense.ui.Weapons.CustomProgressBar;

public class P1911 extends Fragment {

    FrameLayout p1911;
    CustomProgressBar cb;
    public P1911() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_p1911,container,false);
        p1911 = view.findViewById(R.id.p1911);
        String url_to_image = "https://opgg-pubg-static.akamaized.net/assets/assets/item/weapon/handgun/item_weapon_m1911_c.png?image=w_500%2Ce_trim%2Fe_outline%3Aouter%3A8%3A0%2Fe_outline%3Aouter%3A3%3A1000%2Cco_rgb%3A00000080%2Fw_500%2Ch_500%2Cc_pad&v=1";

        View view1 = inflater.inflate(R.layout.sample_layout_guns,null);
        cb = new CustomProgressBar();
        cb.prog(view1,41,0.11, 250,2.1,100,6000, "P1911", "SIDEARM", ".45", "Single", "All", url_to_image,this.getContext(), false);
        p1911.addView(view1);

        return view;
    }
}