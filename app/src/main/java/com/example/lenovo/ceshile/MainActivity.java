package com.example.lenovo.ceshile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.lenovo.ceshile.framents.BlankFragment;
import com.example.lenovo.ceshile.framents.BlankFragment2;
import com.example.lenovo.ceshile.framents.BlankFragment3;
import com.example.lenovo.ceshile.framents.BlankFragment4;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private List<Fragment> list=new ArrayList<Fragment>();
    private MyVpar vp;
    private Button anniu1;
    private Button anniu2;
    private Button anniu3;
    private Button anniu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        vp = (MyVpar) findViewById(R.id.vp);
        anniu1 = (Button) findViewById(R.id.anniu1);
        anniu2 = (Button) findViewById(R.id.anniu2);
        anniu3 = (Button) findViewById(R.id.anniu3);
        anniu4 = (Button) findViewById(R.id.anniu4);
        anniu1.setOnClickListener(this);
        anniu2.setOnClickListener(this);
        anniu3.setOnClickListener(this);
        anniu4.setOnClickListener(this);
        list.add(new BlankFragment());
        list.add(new BlankFragment2());
        list.add(new BlankFragment3());
        list.add(new BlankFragment4());
        FramenstAdapter framenstAdapter = new FramenstAdapter(getSupportFragmentManager(), list);
        vp.setAdapter(framenstAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.anniu1:
                vp.setCurrentItem(0);
                break;
            case R.id.anniu2:
                vp.setCurrentItem(1);
                break;
            case R.id.anniu3:
                vp.setCurrentItem(2);
                break;
            case R.id.anniu4:
                vp.setCurrentItem(3);
                break;
        }
    }
}
