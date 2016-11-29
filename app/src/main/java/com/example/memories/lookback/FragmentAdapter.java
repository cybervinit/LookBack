package com.example.memories.lookback;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Vinit Soni on 2016-11-27.
 */

public class FragmentAdapter extends FragmentActivity {

    PagesAdapter mPagesAdapter;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPagesAdapter = new PagesAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.swipe_view_pager);
        mViewPager.setAdapter(mPagesAdapter);

        Button check_btn_1 = (Button) findViewById(R.id.check_go_next_btn);
        mViewPager.setCurrentItem(1, true);

        check_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Button Clicked a", Toast.LENGTH_SHORT).show();
                mViewPager.getCurrentItem();
            }
        });


    }



    public static class PagesAdapter extends FragmentPagerAdapter {


        public PagesAdapter (FragmentManager mFragmentAdapter) {
            super(mFragmentAdapter);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 1:
                    return new MemoryFragment();
                default:
                    return new MainScreenFragment();
            }
        }

        @Override
        public int getCount() {
            return 1;
        }
    }


}

