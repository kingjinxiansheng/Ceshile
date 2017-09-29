package com.example.lenovo.ceshile.framents.fragmentss;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KING on 2017/9/28 20:14
 * 邮箱:992767879@qq.com
 */

public class FrgmentssssAdapter extends FragmentPagerAdapter {
    private List<Fragment> listframgent;
    private List<String> listtab;

    public FrgmentssssAdapter(FragmentManager fm, List<Fragment> listframgent, List<String> listtab) {
        super(fm);
        this.listframgent = listframgent;
        this.listtab = listtab;
    }

    @Override
    public Fragment getItem(int position) {
        return listframgent.get(position);
    }

    @Override
    public int getCount() {
        return listframgent.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listtab.get(position);
    }
}
