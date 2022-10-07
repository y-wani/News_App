package com.example.newsfinal;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    int count;

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        count = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new Top_fragment();

            case 1:
                return new Politics_fragment();

            case 2:
                return new Business_fragment();

            case 3:
                return new World_fragment();

            case 4:
                return new US_fragment();

            case 5:
                return new Tech_fragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return count;
    }
}
