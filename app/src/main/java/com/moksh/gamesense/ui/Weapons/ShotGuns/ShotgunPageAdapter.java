package com.moksh.gamesense.ui.Weapons.ShotGuns;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ShotgunPageAdapter  extends FragmentStateAdapter {
    public ShotgunPageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new S1897();
            case 1: return new S12K();
            case 2: return new S686();
            default: return null;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
