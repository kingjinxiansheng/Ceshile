package com.example.lenovo.ceshile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by KING on 2017/9/28 20:42
 * 邮箱:992767879@qq.com
 */

public class Adapters extends BaseAdapter {
    private List<String> list;
    private Context context;

    public Adapters(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_buju, null);
        TextView viewById = inflate.findViewById(R.id.name);
        viewById.setText(list.get(i));
        return inflate;
    }
}
