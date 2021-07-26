package com.moksh.gamesense.ui.Weapons.AR;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
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
import com.moksh.gamesense.R;

import org.w3c.dom.Text;

public class MainScreenAr extends AppCompatActivity {
    TabLayout tablayout_ar;
    LinearLayout toolbar_ar;
    TabItem AKM, GROZA, MK47, M762, AUG, G36C, M16A4, M416, QBZ95, SCARL;
    ViewPager2 ar_pager;
    ar_page_adapter ar_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen_ar);

        tablayout_ar = findViewById(R.id.tablayout_ar);
        toolbar_ar = findViewById(R.id.toolbar_ar);
        ar_pager = findViewById(R.id.ar_pager);

        AKM = findViewById(R.id.AKM);
        GROZA = findViewById(R.id.GROZA);
        MK47 = findViewById(R.id.MK47);
        M762 = findViewById(R.id.M762);
        AUG = findViewById(R.id.AUG);
        G36C = findViewById(R.id.G36C);
        M16A4 = findViewById(R.id.M16A4);
        M416 = findViewById(R.id.M416);
        QBZ95 = findViewById(R.id.QBZ95);
        SCARL = findViewById(R.id.SCARL);


        //back button to go back
        LayoutInflater inflater = getLayoutInflater();
        View toolbar = inflater.inflate(R.layout.toolbar, null);
        ImageView back = toolbar.findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainScreenAr.super.onBackPressed();
            }
        });
        TextView toolbar_name = toolbar.findViewById(R.id.toolbar_name);
        toolbar_name.setText("Assault Rifels");
        toolbar_ar.addView(toolbar);

        //adapter object is created
        ar_adapter = new ar_page_adapter(getSupportFragmentManager(), getLifecycle());
        ar_pager.setAdapter(ar_adapter);

        tablayout_ar.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                ar_pager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 || tab.getPosition() == 1 || tab.getPosition() == 2 || tab.getPosition() == 3 || tab.getPosition() == 4 || tab.getPosition() == 5 || tab.getPosition() == 6 || tab.getPosition() == 7 || tab.getPosition() == 8 || tab.getPosition() == 9) {
                    ar_adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        ar_pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tablayout_ar.selectTab(tablayout_ar.getTabAt(position));
            }
        });

    }
}