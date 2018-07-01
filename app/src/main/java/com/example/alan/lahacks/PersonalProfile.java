package com.example.alan.lahacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
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

    /**
     * toCampusEvent method. Takes user to Personal Profile screen when button is clicked.
     * @param view View
     */
    public void toCampusEvent(View view) {
        Intent startNewActivity = new Intent(this, EventProfile.class);
        startNewActivity.putExtra("eventInteger", 2);
        startActivity(startNewActivity);
    }

    //METHODS FOR OBJECT CREATION
    /**
     * Makes an array of type EventData that is then filled with event data from a .csv file in the
     * raw assets folder. The instantiate and filled array is then returned
     *
     * @return EventData array which is full and cannot be partially filled
     */
    public EventData[] makeObjects() {
        System.out.println("makeObjects beginning");
        BufferedReader reader = null;
        EventData[] events;
        int amountOfRows;

        try {
            System.out.println("Just entered try block. Will now read.");
            reader = new BufferedReader(new InputStreamReader(getResources().openRawResource(R.raw.events)));
            amountOfRows = getRowAmount(reader);
            System.out.println("read in once. Opening again.");
            reader.close();
            reader = new BufferedReader(new InputStreamReader(getResources().openRawResource(R.raw.events)));
            System.out.println("Just finished reading.");
            events = new EventData[amountOfRows];

            reader.readLine();
            System.out.println("About to enter the for loop");
            for(int j = 0; j < amountOfRows - 1; j++)
            {
                try
                {
                    String[] row;
                    String temp;

                    temp = reader.readLine();
                    row = temp.split(",");

                    System.out.println("Just finished filling string.");
                    System.out.println("Lat: " + row[5]);
                    System.out.println("Long: " + row[4]);
                    events[j] = new EventData(row[1], row[2], row[3], Double.parseDouble(row[4]), Double.parseDouble(row[5]));
                    System.out.println("Just created first object.");
                    System.out.println(events[j]);
                    System.out.println("Just finished object: " + j);
                }
                catch(NumberFormatException e)
                {
                    e.printStackTrace();
                }
            }

            System.out.println("Finished Instantiating first element.");
            reader.close();
            return events;
        }
        catch(FileNotFoundException e)
        {
            System.out.println("REALLY ENCOUNTERED A FILE NOT FOUND EXCEPTION.");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public static int getRowAmount(BufferedReader reader) {
        int rows;
        rows = 0;

        try
        {
            while (reader.readLine() != null)
            {
                rows++;
            }
            return rows;
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return 0;
    }
}
