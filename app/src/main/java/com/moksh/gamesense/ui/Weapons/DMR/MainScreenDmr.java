package com.moksh.gamesense.ui.Weapons.DMR;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.moksh.gamesense.R;
import com.moksh.gamesense.ui.Weapons.SniperRifels.MainScreenSr;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainScreenDmr extends AppCompatActivity {
    TabLayout tablayout_dmr;
    LinearLayout toolbar_dmr;
    TabItem MK14,SLR,QBU,MINI14,SKS,VSS;
    ViewPager2 dmr_pager;
    DmrPageAdapter dmr_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen_dmr);

        tablayout_dmr = findViewById(R.id.tablayout_dmr);
        toolbar_dmr = findViewById(R.id.toolbar_dmr);
        dmr_pager = findViewById(R.id.dmr_pager);

        MK14 = findViewById(R.id.MK14);
        SLR = findViewById(R.id.SLR);
        QBU = findViewById(R.id.QBU);
        MINI14 = findViewById(R.id.MINI14);
        SKS = findViewById(R.id.SKS);
        VSS = findViewById(R.id.VSS);

        //back button to go back
        LayoutInflater inflater = getLayoutInflater();
        View toolbar = inflater.inflate(R.layout.toolbar, null);
        ImageView back = toolbar.findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainScreenDmr.super.onBackPressed();
            }
        });
        TextView toolbar_name = toolbar.findViewById(R.id.toolbar_name);
        toolbar_name.setText("DMR");
        toolbar_dmr.addView(toolbar);

        dmr_adapter = new DmrPageAdapter(getSupportFragmentManager(),getLifecycle());
        dmr_pager.setAdapter(dmr_adapter);

        tablayout_dmr.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                dmr_pager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5){
                    dmr_adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        dmr_pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tablayout_dmr.selectTab(tablayout_dmr.getTabAt(position));
            }
        });
    }
}