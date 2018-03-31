package com.example.alan.lahacks;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class EventProfile extends AppCompatActivity {

    //Initialize all of my Objects to be declared within onCreate method.
    TextView descriptionText;
    String descriptionTextString = "The star party will be host in front of the fountain" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_profile);

        //Setup event picture
        ImageView eventPicture =(ImageView) findViewById(R.id.eventImage) ;
        eventPicture.setBackgroundResource(R.drawable.eclipse);

        //Link all of my objects to the ones created in my XML.
        descriptionText = (TextView)findViewById(R.id.descriptionText);
        descriptionText.setText(descriptionTextString);

    }
}
