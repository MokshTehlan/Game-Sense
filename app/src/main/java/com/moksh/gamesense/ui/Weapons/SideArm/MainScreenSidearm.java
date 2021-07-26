package com.moksh.gamesense.ui.Weapons.SideArm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.moksh.gamesense.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainScreenSidearm extends AppCompatActivity {
    LinearLayout toolbar_sidearm;
    TabLayout tablayout_sidearm;
    TabItem P18C,SKORPION,SAWED,R45,R1895,P92,P1911;
    ViewPager2 sidearm_pager;
    SidearmPageAdapter sidearm_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen_sidearm);

        toolbar_sidearm = findViewById(R.id.toolbar_sidearm);
        tablayout_sidearm = findViewById(R.id.tablayout_sidearm);
        sidearm_pager = findViewById(R.id.sidearm_pager);

        P18C = findViewById(R.id.P18C);
        SKORPION = findViewById(R.id.SKORPION);
        SAWED = findViewById(R.id.SAWED);
        R45 = findViewById(R.id.R45);
        R1895 = findViewById(R.id.R1895);
        P92 = findViewById(R.id.P92);
        P1911 = findViewById(R.id.P1911);

        LayoutInflater inflater = getLayoutInflater();
        View toolbar = inflater.inflate(R.layout.toolbar, null);
        ImageView back = toolbar.findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainScreenSidearm.super.onBackPressed();
            }
        });
        TextView toolbar_name = toolbar.findViewById(R.id.toolbar_name);
        toolbar_name.setText("SideArms");
        toolbar_sidearm.addView(toolbar);


        sidearm_adapter = new SidearmPageAdapter(getSupportFragmentManager(),getLifecycle());
        sidearm_pager.setAdapter(sidearm_adapter);

        tablayout_sidearm.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                sidearm_pager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5||tab.getPosition()==6){
                    sidearm_adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        sidearm_pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tablayout_sidearm.selectTab(tablayout_sidearm.getTabAt(position));
            }
        });
    }
}