package com.example.alan.lahacks;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class EventProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_profile);

        ImageView eventPicture =(ImageView) findViewById(R.id.eventImage) ;
        eventPicture.setImageResource(R.drawable.eclipse);
//        /**
//         * Set the event picture.
//         */
//        Resources res = getResources();
//        Drawable drawable = res.getDrawable(R.drawable.eclipse);
    }
}
