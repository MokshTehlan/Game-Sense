package com.moksh.gamesense.ui.Weapons.SniperRifels;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.moksh.gamesense.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainScreenSr extends AppCompatActivity {
    TabLayout tablayout_sr;
    LinearLayout toolbar_sr;
    TabItem AWM,M24,KAR98k,WIN94;
    ViewPager2 sr_pager;
    SrPageAdapter sr_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen_sr);

        tablayout_sr = findViewById(R.id.tablayout_sr);
        toolbar_sr = findViewById(R.id.toolbar_sr);
        sr_pager = findViewById(R.id.sr_pager);

        AWM = findViewById(R.id.AWM);
        M24 = findViewById(R.id.M24);
        KAR98k = findViewById(R.id.KAR98K);
        WIN94 = findViewById(R.id.WIN94);

        //back button to go back
        LayoutInflater inflater = getLayoutInflater();
        View toolbar = inflater.inflate(R.layout.toolbar, null);
        ImageView back = toolbar.findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainScreenSr.super.onBackPressed();
            }
        });
        TextView toolbar_name = toolbar.findViewById(R.id.toolbar_name);
        toolbar_name.setText("Sniper Rifels");
        toolbar_sr.addView(toolbar);

        sr_adapter = new SrPageAdapter(getSupportFragmentManager(), getLifecycle());
        sr_pager.setAdapter(sr_adapter);

        tablayout_sr.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                sr_pager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 || tab.getPosition() == 1 || tab.getPosition() == 2 || tab.getPosition() == 3){
                    sr_adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        sr_pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tablayout_sr.selectTab(tablayout_sr.getTabAt(position));
            }
        });
    }
}