package com.moksh.gamesense.ui.Weapons.AR;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.moksh.gamesense.R;
import com.moksh.gamesense.ui.Weapons.CustomProgressBar;

public class G36C extends Fragment {

    CustomProgressBar cb;
    public G36C() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_g36c,container,false);
        FrameLayout g36c = view.findViewById(R.id.g36c);

        View view1 = inflater.inflate(R.layout.sample_layout_guns,null);

        String url_to_image = "https://opgg-pubg-static.akamaized.net/assets/assets/item/weapon/main/item_weapon_g36c_c.png?image=w_500%2Ce_trim%2Fe_outline%3Aouter%3A8%3A0%2Fe_outline%3Aouter%3A3%3A1000%2Cco_rgb%3A00000080%2Fw_500%2Ch_500%2Cc_pad&v=1";
        cb = new CustomProgressBar();
        cb.prog(view1,43,0.086, 870,3.8,350,3500, "G36C", "Assault Rifel", "5.56", "Single, Auto", "Vikendi", url_to_image, this.getContext(), false);
        g36c.addView(view1);
        return view;
    }
}