package com.moksh.gamesense.ui.Weapons.Other;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.moksh.gamesense.R;
import com.moksh.gamesense.ui.Weapons.SMG.MainScreenSmg;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainScreenOther extends AppCompatActivity {

    TabLayout tablayout_other;
    LinearLayout toolbar_other;
    TabItem CROSSBOW,DP28,M249;
    ViewPager2 other_pager;
    OtherPageAdapter other_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen_other);

        tablayout_other = findViewById(R.id.tablayout_other);
        toolbar_other = findViewById(R.id.toolbar_other);
        other_pager = findViewById(R.id.other_pager);
        CROSSBOW = findViewById(R.id.CROSSBOW);
        DP28 = findViewById(R.id.DP28);
        M249 = findViewById(R.id.M249);

        //back button to go back
        LayoutInflater inflater = getLayoutInflater();
        View toolbar = inflater.inflate(R.layout.toolbar, null);
        ImageView back = toolbar.findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainScreenOther.super.onBackPressed();
            }
        });
        TextView toolbar_name = toolbar.findViewById(R.id.toolbar_name);
        toolbar_name.setText("OTHERS");
        toolbar_other.addView(toolbar);

        other_adapter = new OtherPageAdapter(getSupportFragmentManager(),getLifecycle());
        other_pager.setAdapter(other_adapter);

        tablayout_other.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                other_pager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2){
                    other_adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        other_pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tablayout_other.selectTab(tablayout_other.getTabAt(position));
            }
        });
    }
}