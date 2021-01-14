package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class today_adopter extends FragmentPagerAdapter {

    private final List<Fragment> FstFragment = new ArrayList<>();
    private final List<String> FstTitles =new ArrayList<>();

    public today_adopter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return FstFragment.get(position);
    }

    @Override
    public int getCount() {
        return FstTitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return FstTitles.get(position);
    }

    public void AddFragment(Fragment fragment,String title){
        FstFragment.add(fragment);
        FstTitles.add(title);
    }
}
