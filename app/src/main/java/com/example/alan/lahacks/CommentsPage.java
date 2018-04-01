package com.example.alan.lahacks;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CommentsPage extends AppCompatActivity {
    RecyclerView recyclerView;
    EventAdapter adapter;

    List<EventData> eventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments_page);

        eventList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        eventList.add(
                new EventData(
                        1,
                        " ",
                        "A number of decades ago a glass of boysenberry juice and a sarsaparilla at that saloon, " +
                                "along with a black licorice whip, defined Knott's as much as the train-flattened penny and "+
                                "the log ride. Love to go again for the boysenberries over the back-wrecking coasters.",
                        " ",
                        R.drawable.person1));

        eventList.add(
                new EventData(
                        1,
                        " ",
                        "I literally never eat boysenberry unless it's at this event. Please help me satisfy my boysenberry cravings!",
                        " ",
                        R.drawable.person2));

        eventList.add(
                new EventData(
                        1,
                        "Ballet Dance",
                        "Boysenberry overload!  YES, please!",
                        "3 Jun 2018",
                        R.drawable.person3));

        eventList.add(
                new EventData(
                        1,
                        "Financial Fitness",
                        "Understanding the rules of how money works, and building " +
                                " good money habits now, will set the tone for your level of " +
                                " financial fitness in the future.",
                        "",
                        R.drawable.person4));

        eventList.add(
                new EventData(
                        1,
                        "Thoughtful Thursday",
                        "Love boysenberry! Would love to attend this event",
                        "",
                        R.drawable.person5));


        adapter = new EventAdapter(this, eventList);
        recyclerView.setAdapter(adapter);

    }
}