package com.example.alan.lahacks;

import android.app.ListActivity;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class EventList extends AppCompatActivity{

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;
    RecyclerView recyclerView;
    EventAdapter adapter;
    List<EventData> events;
    Queue<EventData> queuedEvents;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        events = new ArrayList<>();
        queuedEvents = new CircularArrayQueue<EventData>(10);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        queueEvents();
        events.add(queuedEvents.remove());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        //mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        adapter = new EventAdapter(this, events);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event_list, menu);
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

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position){
                case 0:
                    Tab2Featured tab2 = new Tab2Featured();
                    return tab2;
                case 1:
                    Tab1Suggested tab1 = new Tab1Suggested();
                    return tab1;
                case 2:
                    Tab3SavedEvents tab3 = new Tab3SavedEvents();
                    return tab3;
                default:
                    return null;
            }

        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position){
            switch(position){
                case 0:
                    return "FEATURED";
                case 1:
                    return "SUGGESTED";
                case 2:
                    return "SAVED EVENTS";
            }
            return null;
        }
    }

    public void loadMoreEvents(View view) {
        events.add(queuedEvents.remove());
        adapter = new EventAdapter(this, events);
        recyclerView.setAdapter(adapter);
    }

    private void queueEvents(){
        queuedEvents.add(new EventData(
                        1,
                        "Networking",
                        "Set up your professional profile, learn the basics, and " +
                                " effectively harness the power of LinkedIn to connect with " +
                                " employers, gather career information, and find jobs.",
                        "2 Apr 2018",
                        R.drawable.career));
        queuedEvents.add(new EventData(2, "Lol", "lol", "3 april 2034", R.drawable.dance));
        queuedEvents.add(new EventData(2, "Lol", "lol", "3 april 2034", R.drawable.dance));
        queuedEvents.add(new EventData(2, "Lol", "lol", "3 april 2034", R.drawable.dance));
        queuedEvents.add(new EventData(2, "Lol", "lol", "3 april 2034", R.drawable.dance));
        queuedEvents.add(new EventData(2, "Lol", "lol", "3 april 2034", R.drawable.dance));
        queuedEvents.add(new EventData(2, "Lol", "lol", "3 april 2034", R.drawable.dance));
        queuedEvents.add(new EventData(2, "Lol", "lol", "3 april 2034", R.drawable.dance));


    }

    /**
     * toEventProfile method. Takes user to GEvent Profile screen when button is clicked.
     * @param view View
     */
    public void toEventProfile(View view) {
        Intent startNewActivity = new Intent(this, EventProfile.class);
        startActivity(startNewActivity);
    }

    /**
     * toPersonalProfile method. Takes user to Personal Profile screen when button is clicked.
     * @param view View
     */
    public void toPersonalProfile(View view) {
        Intent startNewActivity = new Intent(this, PersonalProfile.class);
        startActivity(startNewActivity);
    }

    /**
     * toMapView method. Takes user to the maps view when clicked.
     * @param view View
     */
    public void toMapView(View view) {
        Intent startNewActivity = new Intent(this, MapsActivity.class);
        startActivity(startNewActivity);
    }
}
