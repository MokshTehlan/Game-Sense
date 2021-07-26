package com.moksh.gamesense.ui.Weapons.AR;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ar_page_adapter extends FragmentStateAdapter {

    public ar_page_adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new AKM();
            case 1: return new GROZA();
            case 2: return new MK47();
            case 3: return new M762();
            case 4: return new AUG();
            case 5: return new G36C();
            case 6: return new M16A4();
            case 7: return new M416();
            case 8: return new QBZ();
            case 9: return new SCARL();
            default: return null;
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
