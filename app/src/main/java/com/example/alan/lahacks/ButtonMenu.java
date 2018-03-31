package com.example.alan.lahacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ButtonMenu extends AppCompatActivity {

    //Adding a change here.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_menu);
    }

    /**
     * toEventProfile method. Takes user to GEvent Profile screen when button is clicked.
     * @param view View
     */
    public void toEventProfile(View view) {
        Intent startNewActivity = new Intent(this, EventProfile.class);
        startActivity(startNewActivity);
    }

    /**
     * toPersonalProfile method. Takes user to Personal Profile screen when button is clicked.
     * @param view View
     */
    public void toPersonalProfile(View view) {
        Intent startNewActivity = new Intent(this, PersonalProfile.class);
        startActivity(startNewActivity);
    }

    /*
     * toGameSetup method. Takes user to Game Setup screen when button is clicked.
     * @param view View

    public void toGameSetup(View view) {
        Intent startNewActivity = new Intent(this, GameSetup.class);
        startActivity(startNewActivity);
    }
    */
}
