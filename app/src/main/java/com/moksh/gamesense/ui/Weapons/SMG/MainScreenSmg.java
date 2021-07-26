package com.moksh.gamesense.ui.Weapons.SMG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
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

public class MainScreenSmg extends AppCompatActivity {
    TabLayout tablayout_smg;
    LinearLayout toolbar_smg;
    TabItem MP5K,PP,TOMMY,UMP,UZI,VECTOR;
    ViewPager2 smg_pager;
    SmgPageAdapter smg_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen_smg);

        tablayout_smg = findViewById(R.id.tablayout_smg);
        toolbar_smg = findViewById(R.id.toolbar_smg);
        smg_pager = findViewById(R.id.smg_pager);

        MP5K = findViewById(R.id.MP5K);
        PP = findViewById(R.id.PP);
        TOMMY = findViewById(R.id.TOMMY);
        UMP = findViewById(R.id.UMP);
        UZI = findViewById(R.id.UZI);
        VECTOR = findViewById(R.id.VECTOR);
        //back button to go back
        LayoutInflater inflater = getLayoutInflater();
        View toolbar = inflater.inflate(R.layout.toolbar, null);
        ImageView back = toolbar.findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainScreenSmg.super.onBackPressed();
            }
        });
        TextView toolbar_name = toolbar.findViewById(R.id.toolbar_name);
        toolbar_name.setText("SMG");
        toolbar_smg.addView(toolbar);

        smg_adapter = new SmgPageAdapter(getSupportFragmentManager(),getLifecycle());
        smg_pager.setAdapter(smg_adapter);

        tablayout_smg.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                smg_pager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5){
                    smg_adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        smg_pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tablayout_smg.selectTab(tablayout_smg.getTabAt(position));
            }
        });


    }
}