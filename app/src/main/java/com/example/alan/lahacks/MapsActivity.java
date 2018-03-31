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

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private EventData[] events;


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
     * installed Google Play services and returned to the app. loll
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        EventData event1;
        String fileName;
        BufferedReader reader;
        EventData[] events = new EventData[1];
        mMap = googleMap;

        event1 = new EventData("Test", "Some details", "03/30/18", 33.190537, -117.303057);
        events[0] = new EventData("a",  "b", "c", 0, 0);

        // Add a marker in Sydney and move the camera
        LatLng testEvent  = new LatLng(event1.getLocation_latitude(), event1.getLocation_longitude());
        LatLng sydney = new LatLng(33.134880, -117.303175);

        //Marker at fake miracosta
        mMap.addMarker(new MarkerOptions().position(sydney)
                .title("Marker in Sydney")
                .snippet("Description!!!"));

        //Marker for testevent at real miracosta location
        mMap.addMarker(new MarkerOptions().position(testEvent)
                .title(event1.getTitle())
                .snippet(event1.getDetails()));

        //TODO: IMPLEMENT for-loop to iterate through an array of type Event and then make a marker
        //      for event on the Googlemap


        //MAP MOVES: (move to MiraCosta Campus)
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.moveCamera(CameraUpdateFactory.zoomTo(18));
    }

    public int getRowAmount()
    {
        return 0;
    }

    public void makeObjects()
    {

    }
}
