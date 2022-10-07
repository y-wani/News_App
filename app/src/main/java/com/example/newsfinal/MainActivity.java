package com.example.newsfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabs;
    TabItem top, world, politics, us, tech, business;
    PagerAdapter pagerAdapter;
    Toolbar toolbar;

    String key = "dfb52f565b824f62bca2f183ce81f672";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        top = findViewById(R.id.top);
        politics = findViewById(R.id.politics);
        world = findViewById(R.id.world);
        us = findViewById(R.id.us);
        business=findViewById(R.id.business);
        tech = findViewById(R.id.technology);

        ViewPager viewPager = findViewById(R.id.viewpager);
        tabs = findViewById(R.id.tabs);

        pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 6);
        viewPager.setAdapter(pagerAdapter);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                int pos = tab.getPosition();
                if (pos == 0 || pos == 1 || pos == 2 || pos == 3 || pos == 4 || pos == 5)
                {
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));

    }
}