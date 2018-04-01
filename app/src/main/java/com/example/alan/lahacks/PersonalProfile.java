package com.example.alan.lahacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PersonalProfile extends AppCompatActivity {

    RecyclerView recyclerView;
    EventAdapter adapter;

    List<EventData> eventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_profile);


        eventList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        eventList.add(
                new EventData(
                        1,
                        "Dinner Party",
                        "A fun dinner party for all!",
                        "24 Apr 2018",
                        R.drawable.dinner));

        eventList.add(
                new EventData(
                        1,
                        "Google Lecture",
                        "Learn all about Machine Learning from some of the top Google" +
                                "Engineers!",
                        "27 Apr 2018",
                        R.drawable.lecture));

        eventList.add(
                new EventData(
                        1,
                        "Dance Party",
                        "EDM Dance music party!",
                        "3 Jun 2018",
                        R.drawable.party));

        adapter = new EventAdapter(this, eventList);
        recyclerView.setAdapter(adapter);

    }
}
