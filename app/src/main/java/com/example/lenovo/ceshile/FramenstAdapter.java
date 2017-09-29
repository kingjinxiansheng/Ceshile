package com.example.lenovo.ceshile;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by KING on 2017/9/28 19:50
 * 邮箱:992767879@qq.com
 */

public class FramenstAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;

    public FramenstAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
