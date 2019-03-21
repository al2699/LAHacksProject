package com.example.alan.lahacks;

/**
 * Java class to hold each individual event's data.
 * Create an array of EventData objects in order to hold all of our data(or other data structure)
 * Created by jesse on 3/21/2018.
 *
 * Version: 1.0
 * Authors: Jesse & Alan
 */

public class EventData {

    private String title;
    private String shortDesc;
    private String date;
    private double location_latitude;
    private double location_longitude;
    private int upvotes;
    private int downvotes;
    private int image;
    private int id;

    /**
     * Constructor for preview purposes
     * @param id Unique event id from ordering purposes (to be used at programmer's discretion)
     * @param title Title of the event
     * @param shortDesc Short description of the event
     * @param date Date that the event will occur
     * @param image The number representing the unique image which corresponds to this event
     */
    public EventData(int id, String title, String shortDesc, String date, int image){
        this.id = id;
        this.title = title;
        this.shortDesc = shortDesc;
        this.date = date;
        this.image = image;
    }

    /**
     * Constructor for map display purposes
     * @param title Title of the event
     * @param shortDesc Short description of the event
     * @param date Date that the event will occur
     * @param location_latitude The event's approximate latitude
     * @param location_longitude The event's approximate longitude
     */
    public EventData(String title, String shortDesc, String date, double location_latitude, double location_longitude){
        this.title = title;
        this.shortDesc = shortDesc;
        this.date = date;
        this.location_latitude = location_latitude;
        this.location_longitude = location_longitude;
    }

    /**
     * Default constructor. Fills all instance variables with trash data.
     */
    public EventData(){
        title = "New Event";
        shortDesc = "Example Details";
        /*date = "4 April 2018";
        location_latitude = "12378592";
        location_longitude = "168374";
        thumbnail = "Insert Image id here";
        upvotes = 200;
        downvotes = 1000;*/
    }

    @Override
    public String toString() {
        return "EventData{" +
                "title='" + title + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", date='" + date + '\'' +
                ", location_latitude=" + location_latitude +
                ", location_longitude=" + location_longitude +
                ", upvotes=" + upvotes +
                ", downvotes=" + downvotes +
                ", image=" + image +
                ", id=" + id +
                '}';
    }

    /**
     * @param string The event's name
     */
    public void setTitle(String string){
        title = string;
    }

    /**
     * @param string The date of the event in the form: MM/DD/YYYY
     */
    public void setDate(String string){
        date = string;
    }

    /**
     * @param lat The event's approximate location lattitude
     */
    public void setLocation_latitude(double lat){
        location_latitude = lat;
    }

    /**
     * @param lon The event's approximate location longitude
     */
    public void setLocation_longitude(double lon){
        location_longitude = lon;
    }

    /**
     * @param x The amount of upvotes this event has
     */
    public void setUpvotes(int x){
        upvotes = x;
    }

    /**
     * @param x The amount of downvotes this event has
     */
    public void setDownvotes(int x){
        downvotes = x;
    }

    /**
     * @return The title of this event
     */
    public String getTitle(){
        return title;
    }

    /**
     * @return The description of this given event
     */
    public String getShortDesc(){
        return shortDesc;
    }

    /**
     * @return Returns the date of this given event in the form MM/DD/YYYY
     */
    public String getDate(){
        return date;
    }

    /**
     * @return Returns this event's location lattitude
     */
    public double getLocation_latitude(){
        return location_latitude;
    }

    /**
     * @return Returns this event location's longitude
     */
    public double getLocation_longitude(){
        return location_longitude;
    }

    /**
     * @return The amount of upvotes this event has
     */
    public int getUpvotes(){
        return upvotes;
    }

    /**
     * @return The amount of downvotes this event has
     */
    public int getDownvotes(){
        return downvotes;
    }

    /**
     * @return The integer corresponding the image for this event
     */
    public int getImage() {
        return image;
    }

    /**
     * @return The unique id associated with this event
     */
    public int getId() {
        return id;
    }

}
