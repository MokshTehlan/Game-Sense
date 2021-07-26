package com.moksh.gamesense.ui.Weapons;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.moksh.gamesense.R;

import java.util.Timer;
import java.util.TimerTask;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class CustomProgressBar {

    TextView damage_text,rate_of_fire_text,bullet_text,reload_text,range_text,body_hit_text;
    android.widget.ProgressBar damage,rof,bs,rd,range,impact;
    int counter1 = 0,counter2 = 0, counter3 =0, counter4 = 0, counter5=0, counter6 = 0;

    public void prog(View view, double d, double r, double b, double reload, double rng, double i, String gunName, String gunType, String gunAmmo, String gunFirringMode, String gunMap, String urlImage, Context context, Boolean flag){

        TextView found_in = view.findViewById(R.id.found_in);
        if (flag == true){
            found_in.setVisibility(VISIBLE);
        }else{
            found_in.setVisibility(INVISIBLE);
        }
        TextView gun_name = view.findViewById(R.id.gun_name);
        gun_name.setText(gunName);
        TextView gun_type = view.findViewById(R.id.gun_type);
        gun_type.setText(gunType);
        TextView gun_ammo = view.findViewById(R.id.gun_ammo);
        ImageView ammo_image = view.findViewById(R.id.ammo_image);
        switch (gunAmmo)
        {
            case "7.62": gun_ammo.setText(gunAmmo+"mm");
                Glide.with(context)
                        .load("https://opgg-pubg-static.akamaized.net/images/item/7mm.png")
                        .centerCrop()
                        .into(ammo_image);
                break;
            case "5.56": gun_ammo.setText(gunAmmo+"mm");
                Glide.with(context)
                        .load("https://opgg-pubg-static.akamaized.net/images/item/5mm.png")
                        .centerCrop()
                        .into(ammo_image);
                break;
            case "12 Guage": gun_ammo.setText(gunAmmo);
                Glide.with(context)
                        .load("https://opgg-pubg-static.akamaized.net/images/item/12gauge.png")
                        .centerCrop()
                        .into(ammo_image);
                break;
            case ".45": gun_ammo.setText(".45 ACP");
                Glide.with(context)
                        .load("https://opgg-pubg-static.akamaized.net/images/item/45acp.png")
                        .centerCrop()
                        .into(ammo_image);
                break;
            case ".300 Magnum": gun_ammo.setText(".300 mgn");
                Glide.with(context)
                        .load("https://opgg-pubg-static.akamaized.net/images/item/300mgn.png")
                        .centerCrop()
                        .into(ammo_image);
                break;
            case "Bolt": gun_ammo.setText(gunAmmo);
                Glide.with(context)
                        .load("https://opgg-pubg-static.akamaized.net/images/item/bolt.png")
                        .centerCrop()
                        .into(ammo_image);
                break;
            case "9": gun_ammo.setText(gunAmmo+"mm");
                Glide.with(context)
                        .load("https://opgg-pubg-static.akamaized.net/images/item/9mm.png")
                        .centerCrop()
                        .into(ammo_image);
                break;
        }

        TextView gun_firring_mode = view.findViewById(R.id.gun_firring_mode);
        gun_firring_mode.setText(gunFirringMode);
        TextView gun_map = view.findViewById(R.id.gun_map);
        gun_map.setText(gunMap);
        ImageView gun_image =view.findViewById(R.id.gun_image);
        Glide.with(context)
                .load(urlImage)
                .centerCrop()
                .into(gun_image);
        TextView firring_mode_margin = view.findViewById(R.id.firring_mode_margin);
        if (gun_firring_mode.getText().equals("Single, Auto, Burst")){
            ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) firring_mode_margin.getLayoutParams();
            int margin = ((ViewGroup.MarginLayoutParams) firring_mode_margin.getLayoutParams()).bottomMargin;
            params.bottomMargin = 3*margin;
            firring_mode_margin.requestLayout();
        }

        damage_text = view.findViewById(R.id.damage_text);
        damage_text.setText((int)d+"");
        rate_of_fire_text = view.findViewById(R.id.rate_of_fire_text);
        rate_of_fire_text.setText(r+"s");
        bullet_text = view.findViewById(R.id.bullet_text);
        bullet_text.setText((int)b+"m/s");
        reload_text = view.findViewById(R.id.reload_text);
        reload_text.setText(reload+"s");
        range_text = view.findViewById(R.id.range_text);
        range_text.setText((int)rng+"m");
        body_hit_text = view.findViewById(R.id.body_hit_text);
        body_hit_text.setText((int)i+"");


        damage = view.findViewById(R.id.damage);
        rof = view.findViewById(R.id.rof);
        bs = view.findViewById(R.id.bs);
        rd = view.findViewById(R.id.rd);
        range = view.findViewById(R.id.range);
        impact = view.findViewById(R.id.impact);
        final Timer t1=new Timer(),t2= new Timer(),t3 = new Timer(), t4 = new Timer(), t5 = new Timer(), t6 = new Timer();

        //Timer task for damage
        TimerTask tt1 = new TimerTask() {
            @Override
            public void run() {
                counter1++;
                damage.setProgress(counter1);
                if (counter1 == ((d/220)*100) || counter1 > ((d/150)*100))
                {
                    t1.cancel();
                }
            }
        };
        t1.schedule(tt1,0,5);

        //Timer task for Rate of fire
        TimerTask tt2 = new TimerTask() {
            @Override
            public void run() {
            counter2++;
            rof.setProgress(counter2);
            if (counter2 == (100-((r/2)*100)) || counter2 > (100-((r/2)*100))){
                t2.cancel();
            }
            }
        };
        t2.schedule(tt2,0,5);

        //Timer task for bullet speed
        TimerTask tt3 = new TimerTask() {
            @Override
            public void run() {
                counter3++;
                bs.setProgress(counter3);
                if (counter3 == ((b/950)*100) || counter3 > ((b/950)*100)){
                    t3.cancel();
                }
            }
        };
        t3.schedule(tt3,0,5);

        //Timer task for Reload Duration
        TimerTask tt4 = new TimerTask() {
            @Override
            public void run() {
                counter4++;
                rd.setProgress(counter4);
                if (counter4 == (100-((reload/13)*100)) || counter4 > (100-((reload/13)*100))){
                    t4.cancel();
                }
            }
        };
        t4.schedule(tt4,0,5);

        //Timer task for Range
        TimerTask tt5 = new TimerTask() {
            @Override
            public void run() {
                counter5++;
                range.setProgress(counter5);
                if (counter5 == ((rng/650)*100) || counter5 > ((rng/650)*100)){
                    t5.cancel();
                }
            }
        };
        t5.schedule(tt5,0,5);

        //Timer task for body hit impact
        TimerTask tt6 = new TimerTask() {
            @Override
            public void run() {
                counter6++;
                impact.setProgress(counter6);
                if (counter6 == ((i/40000)*100) || counter6 > ((i/40000)*100)){
                    t6.cancel();
                }
            }
        };
        t6.schedule(tt6,0,5);
    }
}
