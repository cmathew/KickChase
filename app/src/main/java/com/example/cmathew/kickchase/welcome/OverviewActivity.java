package com.example.cmathew.kickchase.welcome;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.cmathew.kickchase.R;

import java.util.Arrays;
import java.util.List;

public class OverviewActivity extends AppCompatActivity {
    public static final int REQUEST_PROVIDE_OVERVIEW = 20;
    public static final String PREF_KEY_OVERVIEW_PROVIDED = "overview_completed";

    private OverviewPageAdapter pageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mViewPager = (ViewPager) findViewById(R.id.welcome_pager);
        pageAdapter = new OverviewPageAdapter(this, getSupportFragmentManager(), getSlides());
        mViewPager.setAdapter(pageAdapter);
    }

    private List<OverviewSlide> getSlides() {
        OverviewSlide slide1 = new OverviewSlide(
                R.string.overview_title_welcome_slide,
                R.string.overview_header_welcome_slide,
                R.string.overview_message_welcome_slide,
                R.drawable.logo);

        OverviewSlide slide2 = new OverviewSlide(
                R.string.overview_title_prepare_slide,
                R.string.overview_header_prepare_slide,
                R.string.overview_message_prepare_slide,
                R.drawable.diamond);

        OverviewSlide slide3 = new OverviewSlide(
                R.string.overview_title_react_slide,
                R.string.overview_header_react_slide,
                R.string.overview_message_react_slide,
                R.drawable.diamond_populated);

        return Arrays.asList(slide1, slide2, slide3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
