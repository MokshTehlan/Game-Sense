package com.moksh.gamesense.ui.Weapons.SniperRifels;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SrPageAdapter extends FragmentStateAdapter {


    public SrPageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new AWM();
            case 1: return new Kar98k();
            case 2: return new M24();
            case 3: return new Win94();
            default: return null;
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
