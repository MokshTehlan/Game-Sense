package com.moksh.gamesense.ui.Weapons.Other;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class OtherPageAdapter extends FragmentStateAdapter {

    public OtherPageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new Crossbow();
            case 1: return new DP28();
            case 2: return new M249();
            default:return null;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
