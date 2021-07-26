package com.moksh.gamesense.ui.Weapons.SMG;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SmgPageAdapter extends FragmentStateAdapter {
    public SmgPageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new Mp5k();
            case 1: return new pp();
            case 2: return new Tommy();
            case 3: return new Ump();
            case 4: return new Uzi();
            case 5: return new Vector();
            default: return null;

        }
    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
