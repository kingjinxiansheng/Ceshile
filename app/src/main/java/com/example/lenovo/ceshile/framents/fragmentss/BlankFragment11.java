package com.example.lenovo.ceshile.framents.fragmentss;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ListView;

import com.example.lenovo.ceshile.Adapters;
import com.example.lenovo.ceshile.Main2Activity;
import com.example.lenovo.ceshile.R;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment11 extends Fragment {

    private ListView listView;
    private Button tiao;
    private Adapters adapters;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_blank_fragment11, container, false);
        listView = inflate.findViewById(R.id.liatview);
        tiao = inflate.findViewById(R.id.tiaozhuan);
        return inflate;
    }
    private List<String> list=new ArrayList<String>();
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        for (int i = 0; i <50 ; i++) {
            list.add("aaa"+i);
        }
        adapters = new Adapters(list,getActivity());
        listView.setAdapter(adapters);
        tiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Main2Activity.class);
                getActivity().startActivity(intent);
            }
        });
        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {
                for (int j = 0; j <50 ; j++) {
                    list.add("dddd"+j);
                }
                adapters.notifyDataSetChanged();
            }

            @Override
            public void onScroll(AbsListView absListView, int i, int i1, int i2) {

            }
        });
    }
}
