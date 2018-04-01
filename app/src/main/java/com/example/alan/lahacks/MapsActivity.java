package com.example.alan.lahacks;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

import java.io.BufferedReader;
import java.io.FileInputStream;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        System.out.println("onMapReady beginning.");
        EventData event1;
        String fileName = "EventData.csv";
        BufferedReader reader;
        EventData[] events;
        mMap = googleMap;

        event1 = new EventData("Test", "Some details", "03/30/18", 33.190537, -117.303057);
        events = makeObjects();
        System.out.println("Event 1 data: " + events[0].getTitle());


        // Add a marker in Sydney and move the camera
        LatLng testEvent  = new LatLng(event1.getLocation_latitude(), event1.getLocation_longitude());
        LatLng sydney = new LatLng(33.134880, -117.303175);
        LatLng testEvent2 = new LatLng(events[0].getLocation_latitude(), events[0].getLocation_latitude());

        //Marker at fake miracosta
        mMap.addMarker(new MarkerOptions().position(sydney)
                .title("Marker in Sydney")
                .snippet("Description!!!"));

        //Marker for testevent at real miracosta location
        mMap.addMarker(new MarkerOptions().position(testEvent)
                .title(event1.getTitle())
                .snippet(event1.getDetails()));

        //TEST MARKER
        mMap.addMarker(new MarkerOptions().position(testEvent2)
                .title(events[0].getTitle())
                .snippet(events[0].getDetails()));

        //TODO: IMPLEMENT for-loop to iterate through an array of type Event and then make a marker
        //      for event on the Googlemap


        //MAP MOVES: (move to MiraCosta Campus)
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.moveCamera(CameraUpdateFactory.zoomTo(18));
    }

    /**
     * Will find and return the amount of rows that are available in our given csv data file
     *
     * @param reader BufferedReader object which must be instantiated prior to passing and will be
     *               used to get input from a csv file
     * @return       Will return the amount of rows in a csv file
     */
    public int getRowAmount(BufferedReader reader)
    {
        return 1;
    }


    /**
     * Will fill the array of type EventData with objects of events
     *
     * @return none
     */
    public EventData[] makeObjects() {
        System.out.println("makeObjects beginning");
        BufferedReader reader = null;
        EventData[] events;
        try {
            System.out.println("ASSETS FOLDER");
            System.out.println(getAssets());
            reader = new BufferedReader(new InputStreamReader(getResources().openRawResource(R.raw.events)));
            events = new EventData[getRowAmount(reader)];

            events[0] = new EventData("a", "b", "c", 33.190535, -117.303055);
            System.out.println("Finished Instantiating first element.");
            return events;
            }
            catch(Exception e)
            {
                System.out.println("Encountered IOException!");
            }
            return null;
            //reader.close();
        }
}

