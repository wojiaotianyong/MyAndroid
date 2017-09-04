package com.example.tianyong.tablayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by clcw1191 on 2017/8/31.
 */

public class ContentPagerAdapter extends FragmentPagerAdapter {

    private List<String> mTabIndicators;
    private List<Fragment> mTabFragments;

    public ContentPagerAdapter(FragmentManager fm, List<Fragment> tabFragments, List<String> tabIndicators) {
        super(fm);
        this.mTabIndicators = tabIndicators;
        this.mTabFragments = tabFragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mTabFragments.get(position);
    }

    @Override
    public int getCount() {
        return mTabIndicators.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabIndicators.get(position);
    }
}
