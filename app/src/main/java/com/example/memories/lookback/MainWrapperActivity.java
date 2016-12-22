package com.example.memories.lookback;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class MainWrapperActivity extends FragmentActivity {

    PagesAdapter mPagesAdapter;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPagesAdapter = new PagesAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.swipe_view_pager);
        mViewPager.setAdapter(mPagesAdapter);



    }



    public static class PagesAdapter extends FragmentPagerAdapter {
        final int NUM_ITEMS = 2;

        public PagesAdapter (FragmentManager mFragmentAdapter) {
            super(mFragmentAdapter);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    return CameraFragment.newInstance();
                case 1:
                    return MemoryFragment.newInstance();

            }
            return null;
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }
    }


}

