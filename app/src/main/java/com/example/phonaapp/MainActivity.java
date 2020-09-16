package com.example.phonaapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tab_id);
        viewPager=findViewById(R.id.view_id);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentCall(),"");
        adapter.AddFragment(new FragmentContact(),"");
        adapter.AddFragment(new FragmentFav(),"");


        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic__call_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group_24);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_baseline_star_24);

        ActionBar actionBar=getSupportActionBar();
actionBar.setElevation(0);
    }

}