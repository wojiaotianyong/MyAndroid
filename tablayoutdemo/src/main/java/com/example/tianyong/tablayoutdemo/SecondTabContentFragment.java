package com.example.tianyong.tablayoutdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by clcw1191 on 2017/8/31.
 */

public class SecondTabContentFragment extends Fragment {

    // 页面标题
    public static final String ARGUMENT_TITLE = "argument_title";

    View mRootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_second_tab_content, container, false);
        // 自动设置Fragment页面标题
        Bundle arguments = getArguments();
        if (arguments != null) {
            setFragmentTitle(arguments.getString(ARGUMENT_TITLE, null));
        }
        return mRootView;
    }

    public static SecondTabContentFragment newInstance(String s) {
        SecondTabContentFragment fragment = new SecondTabContentFragment();
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
