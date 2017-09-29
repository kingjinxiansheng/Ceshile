package com.example.lenovo.ceshile.framents;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.Toast;

import com.example.lenovo.ceshile.R;
import com.example.lenovo.ceshile.framents.fragmentss.BlankFragment11;
import com.example.lenovo.ceshile.framents.fragmentss.BlankFragment22;
import com.example.lenovo.ceshile.framents.fragmentss.BlankFragment33;
import com.example.lenovo.ceshile.framents.fragmentss.FrgmentssssAdapter;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    private List<Fragment> listframgent=new ArrayList<Fragment>();
    private List<String> listtab=new ArrayList<String>();
    private TabLayout tableLayout;
    private ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_blank, container, false);
        tableLayout = inflate.findViewById(R.id.tab);
        viewPager = inflate.findViewById(R.id.vvpp);

        return inflate;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listframgent.add(new BlankFragment11());
        listframgent.add(new BlankFragment22());
        listframgent.add(new BlankFragment33());
        listtab.add("aa1");
        listtab.add("aa2");
        listtab.add("aa3");
        tableLayout.setupWithViewPager(viewPager);
        FrgmentssssAdapter frgmentssssAdapter = new FrgmentssssAdapter(getActivity().getSupportFragmentManager(),listframgent,listtab);
        viewPager.setAdapter(frgmentssssAdapter);
    }
}
