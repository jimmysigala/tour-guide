package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jimmy on 12/19/2016.
 */

public class AppFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public AppFragmentPagerAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    // Display fragments
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0: return new RestaurantsFragment();
            case 1: return new HistoricalFragment();
            case 2: return new MuseumsFragment();
            default: return new ParksFragment();
        }
    }

    // Display tab titles
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0: return mContext.getString(R.string.category_eat);
            case 1: return mContext.getString(R.string.category_historic);
            case 2: return mContext.getString(R.string.category_artmuseum);
            default: return mContext.getString(R.string.category_park);
        }
    }
}
