package com.example.cmathew.kickchase.welcome;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class OverviewPageAdapter extends FragmentPagerAdapter {
    private Context context;
    private List<OverviewSlide> slides;

    public OverviewPageAdapter(Context ctx, FragmentManager fm, List<OverviewSlide> slides) {
        super(fm);

        this.context = ctx;
        this.slides = slides;
    }

    @Override
    public Fragment getItem(int position) {
        OverviewSlide thisSlide = slides.get(position);
        return OverviewPageFragment.newInstance(thisSlide);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        OverviewSlide thisSlide = slides.get(position);
        return context.getString(thisSlide.getTitle());
    }

    @Override
    public int getCount() {
        return slides.size();
    }
}