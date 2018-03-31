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

        //Link to creator's profile !!(CAUTION: Now just link to own profile)
        ImageButton profileButton = (ImageButton) findViewById(R.id.imageButton);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startNewActivity = new Intent(EventProfile.this, PersonalProfile.class);
                startActivity(startNewActivity);

            }
        });

        //Add actions to Like, save, and toGo buttons.
        final ImageButton likeButton = (ImageButton) findViewById(R.id.imageButton3) ;
        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                likeButton.setBackgroundResource(R.drawable.eclipse);
            }
        });
        //likeButton.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
         //       likeButton.setBackgroundResource(R.drawable.);
        //    }
       // });

        final ImageButton saveButton = (ImageButton) findViewById(R.id.imageButton6) ;
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveButton.setImageResource(R.drawable.common_google_signin_btn_icon_dark);
            }
        });

        //Setup event picture
        ImageView eventPicture =(ImageView) findViewById(R.id.eventImage) ;
        eventPicture.setBackgroundResource(R.drawable.eclipse);

        //Link all of my objects to the ones created in my XML.
        descriptionText = (TextView)findViewById(R.id.descriptionText);
        descriptionText.setText(descriptionTextString);

        //Link comment box to comment page
        final TextView commentBox = (TextView) findViewById(R.id.comment_box) ;
        commentBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startNewActivity = new Intent(EventProfile.this, CommentPage.class);
                startActivity(startNewActivity);
            }
        });

    }
}
