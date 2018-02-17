package com.example.root.myimgview;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    myPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vpPager = findViewById(R.id.vpPager);

        adapterViewPager = new myPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);
    }
}
