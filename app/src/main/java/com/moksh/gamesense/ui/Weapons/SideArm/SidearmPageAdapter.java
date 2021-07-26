package com.moksh.gamesense.ui.Weapons.SideArm;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SidearmPageAdapter extends FragmentStateAdapter {
    public SidearmPageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new P18C();
            case 1: return new Skorpion();
            case 2: return new Sawed();
            case 3: return new R45();
            case 4: return new R1895();
            case 5: return new P92();
            case 6: return new P1911();
            default:return null;

        }
    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
