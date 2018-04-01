package com.example.alan.lahacks;

/**
 * Java class to hold each individual event's data.
 * Create an array of EventData objects in order to hold all of our data(or other data structure)
 * Created by jesse on 3/21/2018.
 */

public class EventData {

    private String title;
    private String details;
    private String shortDesc;
    private String date;
    private double location_latitude;
    private double location_longitude;
    private String thumbnail;
    private int upvotes;
    private int downvotes;
    private int image;
    private int id;

    public EventData(int id, String title, String shortDesc, String date, int image){
        this.id = id;
        this.title = title;
        this.shortDesc = shortDesc;
        this.date = date;
        this.image = image;
    }

    public EventData(String title, String details, String date, double location_latitude, double location_longitude){
        this.title = title;
        this.details = details;
        this.date = date;
        this.location_latitude = location_latitude;
        this.location_longitude = location_longitude;
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
        shortDesc = string;
    }

    public void setDate(String string){
        date = string;
    }

    public void setLocation_latitude(double lat){
        location_latitude = lat;
    }

    public void setLocation_longitude(double lon){
        location_longitude = lon;
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

    public String getShortDesc(){
        return shortDesc;
    }

    public String getDetails(){
        return details;
    }


    public String getDate(){
        return date;
    }

    public double getLocation_latitude(){
        return location_latitude;
    }

    public double getLocation_longitude(){
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

    public int getImage() {
        return image;
    }

    public int getId() {
        return id;
    }
}
