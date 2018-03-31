package com.example.alan.lahacks;

/**
 * Java class to hold each individual event's data.
 * Create an array of EventData objects in order to hold all of our data(or other data structure)
 * Created by jesse on 3/21/2018.
 */

public class EventData {

    private String title;
    private String details;
    private String date;
    private String location_latitude;
    private String location_longitude;
    private String thumbnail;
    private int upvotes;
    private int downvotes;

    public EventData(String title, String details){
        this.title = title;
        this.details = details;
    }

    /*public EventData(){
        title = "New Event";
        details = "Example Details";
        /*date = "4 April 2018";
        location_latitude = "12378592";
        location_longitude = "168374";
        thumbnail = "Insert Image id here";
        upvotes = 200;
        downvotes = 1000;
    }*/

    public void setTitle(String string){
        title = string;
    }

    public void setDetails(String string){
        details = string;
    }

    public void setDate(String string){
        date = string;
    }

    public void setLocation_latitude(String string){
        location_latitude = string;
    }

    public void setLocation_longitude(String string){
        location_longitude = string;
    }

    public void setThumbnail(String string){
        thumbnail = string;
    }

    public void setUpvotes(int x){
        upvotes = x;
    }

    public void setDownvotes(int x){
        downvotes = x;
    }

    public String getTitle(){
        return title;
    }

    public String getDetails(){
        return details;
    }

    public String getDate(){
        return date;
    }

    public String getLocation_latitude(){
        return location_latitude;
    }

    public String getLocation_longitude(){
        return location_longitude;
    }

    public String getThumbnail(){
        return thumbnail;
    }

    public int getUpvotes(){
        return upvotes;
    }

    public int getDownvotes(){
        return downvotes;
    }
}
