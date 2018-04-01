package com.example.alan.lahacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PersonalProfile extends AppCompatActivity {

    RecyclerView recyclerView;
    EventAdapter adapter;

    List<EventData> eventList;
    Profile p1 = new Profile("Yumi Tam", 45, 11);

    TextView name;
    TextView friendsNum;
    TextView eventsNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_profile);


        eventList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        eventsNum = findViewById(R.id.textViewEventsNum);
        name = findViewById(R.id.textViewName);
        friendsNum = findViewById(R.id.textViewFriendsNum);

        name.setText(p1.getName());
        friendsNum.setText(String.valueOf(p1.getNumberOfFriends()));
        eventsNum.setText(String.valueOf(p1.getEventsAttended()));

        eventList.add(
                new EventData(
                        1,
                        "Networking",
                        "Set up your professional profile, learn the basics, and " +
                                " effectively harness the power of LinkedIn to connect with " +
                                " employers, gather career information, and find jobs.",
                        "2 Apr 2018",
                        R.drawable.career));

        eventList.add(
                new EventData(
                        1,
                        "Classical Music",
                        "Listen to some classical music played by our very own MiraCosta" +
                                " Orchestra!",
                        "27 Apr 2018",
                        R.drawable.music));

        eventList.add(
                new EventData(
                        1,
                        "Ballet Dance",
                        "Ballet performance at the MiraCosta theater.",
                        "3 Jun 2018",
                        R.drawable.dance));

        eventList.add(
                new EventData(
                        1,
                        "Financial Fitness",
                        "Understanding the rules of how money works, and building " +
                                " good money habits now, will set the tone for your level of " +
                                " financial fitness in the future.",
                        "5 Jun 2018",
                        R.drawable.finance));

        eventList.add(
                new EventData(
                        1,
                        "Thoughtful Thursday",
                        "Discuss Puerto Rican women's experiences with reproductive " +
                                " control in the 20th century.",
                        "3 Jun 2018",
                        R.drawable.thoughts));

        adapter = new EventAdapter(this, eventList);
        recyclerView.setAdapter(adapter);

    }
}