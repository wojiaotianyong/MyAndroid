package com.example.tianyong.tablayoutdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/29.
 */

public class TabContentFragment extends Fragment {

    // 页面标题
    public static final String ARGUMENT_TITLE = "argument_title";
    private View mRootView;

    private TabLayout mTabTl;
    private ViewPager mContentVp;
    private List<String> tabIndicators;
    private List<Fragment> tabFragments;
    private ContentPagerAdapter contentAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_main__content, container, false);
        // 自动设置Fragment页面标题
        Bundle arguments = getArguments();
        if (arguments != null) {
            setFragmentTitle(arguments.getString(ARGUMENT_TITLE, null));
        }
        mTabTl = (TabLayout) mRootView.findViewById(R.id.tl_tab);
        mContentVp = (ViewPager) mRootView.findViewById(R.id.vp_content);
        mContentVp.setOffscreenPageLimit(2);

        initContent();
        initTab();
        return mRootView;
    }

    private void initTab() {
        mTabTl.setTabMode(TabLayout.MODE_SCROLLABLE);
        mTabTl.setTabTextColors(ContextCompat.getColor(getActivity(), R.color.gray), ContextCompat.getColor(getActivity(), R.color.white));
        mTabTl.setSelectedTabIndicatorColor(ContextCompat.getColor(getActivity(), R.color.white));
        ViewCompat.setElevation(mTabTl, 10);
        mTabTl.setupWithViewPager(mContentVp);
    }

    private void initContent() {
        tabIndicators = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            tabIndicators.add("second_tab" + i);
        }
        tabFragments = new ArrayList<>();
        for (String s : tabIndicators) {
            tabFragments.add(SecondTabContentFragment.newInstance(s));
        }
        contentAdapter = new ContentPagerAdapter(getChildFragmentManager(), tabFragments, tabIndicators);
        mContentVp.setAdapter(contentAdapter);
    }

    public static TabContentFragment newInstance(String s) {
        TabContentFragment fragment = new TabContentFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARGUMENT_TITLE, s);
        fragment.setArguments(bundle);
        return fragment;
    }

    protected void setFragmentTitle(String title) {
        if (mRootView == null || title == null) {
            return;
        }
        TextView titleView = (TextView) mRootView.findViewById(R.id.tv_title);
        if (titleView == null) {
            return;
        }
        titleView.setText(title);
    }

}
