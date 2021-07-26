package com.moksh.gamesense.ui.Weapons.AR;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.moksh.gamesense.R;
import com.moksh.gamesense.ui.Weapons.CustomProgressBar;

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;

import static android.view.View.VISIBLE;


public class GROZA extends Fragment {
    CustomProgressBar cb;

    public GROZA() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_groza,container,false);
        FrameLayout groza = view.findViewById(R.id.groza);

        View view1 = inflater.inflate(R.layout.sample_layout_guns,null);

        String url_to_image = "https://opgg-pubg-static.akamaized.net/assets/assets/item/weapon/main/item_weapon_groza_c.png?image=w_500%2Ce_trim%2Fe_outline%3Aouter%3A8%3A0%2Fe_outline%3Aouter%3A3%3A1000%2Cco_rgb%3A00000080%2Fw_500%2Ch_500%2Cc_pad&v=1";
        cb = new CustomProgressBar();
        cb.prog(view1,49,0.08, 715,3,380,10000, "GROZA", "Assault Rifel", "7.62", "Single, Auto", "All", url_to_image,this.getContext(), true);
        groza.addView(view1);
        return view;
    }
}