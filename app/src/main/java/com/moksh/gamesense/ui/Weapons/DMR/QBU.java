package com.moksh.gamesense.ui.Weapons.DMR;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.moksh.gamesense.R;
import com.moksh.gamesense.ui.Weapons.CustomProgressBar;


public class QBU extends Fragment {
    FrameLayout qbu;
    CustomProgressBar cb;

    public QBU() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_qbu,container,false);
        qbu = view.findViewById(R.id.qbu);

        String url_to_image = "https://opgg-pubg-static.akamaized.net/images/meta/WeapQBU88.png?image=w_500%2Ce_trim%2Fe_outline%3Aouter%3A8%3A0%2Fe_outline%3Aouter%3A3%3A1000%2Cco_rgb%3A00000080%2Fw_500%2Ch_500%2Cc_pad&v=2";
        View view1 = inflater.inflate(R.layout.sample_layout_guns,null);
        cb = new CustomProgressBar();
        cb.prog(view1,48,0.1, 945,3,400,10000, "QBU", "DMR", "5.56", "Single", "Sanhok", url_to_image,this.getContext(), false);
        qbu.addView(view1);
        return view;
    }
}