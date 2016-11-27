package com.example.memories.lookback;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Vinit Soni on 2016-11-27.
 */

public class PagesAdapter extends FragmentPagerAdapter {


    public PagesAdapter (FragmentManager mFragmentAdapter) {
        super(mFragmentAdapter);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new MemoryFragment();
            case 1:
                return new MainScreenFragment();

        }

        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
