package com.example.root.myimgview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by root on 2/17/18.
 */

public class myPagerAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 3;

    public myPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FragmentOne.newInstance("Fragment 1", R.drawable.buffaloface);
            case 1:
                return FragmentOne.newInstance("Fragment 2", R.drawable.elephant);
            case 2:
                return FragmentTwo.newInstance("Fragment 3", R.drawable.lion, R.drawable.rhino);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab " + position;
    }
}
