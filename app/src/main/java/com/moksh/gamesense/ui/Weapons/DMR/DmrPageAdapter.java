package com.moksh.gamesense.ui.Weapons.DMR;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class DmrPageAdapter extends FragmentStateAdapter{

    public DmrPageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new MK14();
            case 1: return new SLR();
            case 2: return new QBU();
            case 3: return new MINI14();
            case 4: return new SKS();
            case 5: return new VSS();
            default:return null;
        }
    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
