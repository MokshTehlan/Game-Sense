package com.moksh.gamesense.ui.Weapons.ShotGuns;

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

public class MainScreenShotgun extends AppCompatActivity {
    LinearLayout toolbar_shotgun;
    TabLayout tablayout_shotgun;
    TabItem S686,S12K,S1897;
    ViewPager2 shotgun_pager;
    ShotgunPageAdapter shotgun_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen_shotgun);

        tablayout_shotgun = findViewById(R.id.tablayout_shotgun);
        toolbar_shotgun = findViewById(R.id.toolbar_shotgun);
        shotgun_pager = findViewById(R.id.shotgun_pager);
        S686 = findViewById(R.id.S686);
        S12K = findViewById(R.id.S12K);
        S1897 = findViewById(R.id.S1897);

        //back button to go back
        LayoutInflater inflater = getLayoutInflater();
        View toolbar = inflater.inflate(R.layout.toolbar, null);
        ImageView back = toolbar.findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainScreenShotgun.super.onBackPressed();
            }
        });
        TextView toolbar_name = toolbar.findViewById(R.id.toolbar_name);
        toolbar_name.setText("SMG");
        toolbar_shotgun.addView(toolbar);

        shotgun_adapter = new ShotgunPageAdapter(getSupportFragmentManager(),getLifecycle());
        shotgun_pager.setAdapter(shotgun_adapter);

        tablayout_shotgun.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                shotgun_pager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2){
                    shotgun_adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        shotgun_pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tablayout_shotgun.selectTab(tablayout_shotgun.getTabAt(position));
            }
        });
    }
}