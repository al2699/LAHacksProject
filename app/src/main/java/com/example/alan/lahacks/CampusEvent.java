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

public class CampusEvent extends AppCompatActivity {

    RecyclerView recyclerView;
    EventPageAdapter adapter;

    List<Comment> commList;

    //TextView name;
    //TextView desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_campus_event);

        commList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //name = findViewById(R.id.textViewEventName);
        //desc = findViewById(R.id.textViewEvPgDes);

        //name.setText("Networking Event");
        //desc.setText("Set up your professional profile, learn the basics, and " +
                        //" effectively harness the power of LinkedIn to connect with employers, " +
                        //" gather career information, and find jobs.");

        commList.add(
                new Comment(
                        1,
                        "Mandi Murdock",
                        "I'll see you guys there!",
                        R.drawable.p1));

        commList.add(
                new Comment(
                        2,
                        "John Keogh",
                        "I'll see you guys there!",
                        R.drawable.p2));

        commList.add(
                new Comment(
                        3,
                        "Betty Rufner",
                        "I'll see you guys there!",
                        R.drawable.p3));

        commList.add(
                new Comment(
                        4,
                        "John Lovelady",
                        "I'll see you guys there!",
                        R.drawable.p4));

        commList.add(
                new Comment(
                        5,
                        "Noell Francis",
                        "I'll see you guys there!",
                        R.drawable.p5));

        commList.add(
                new Comment(
                        6,
                        "May Kirby",
                        "I'll see you guys there!",
                        R.drawable.p6));

        commList.add(
                new Comment(
                        7,
                        "Michael Farnum",
                        "I'll see you guys there!",
                        R.drawable.p7));

        adapter = new EventPageAdapter(commList, this);
        recyclerView.setAdapter(adapter);

    }

}
