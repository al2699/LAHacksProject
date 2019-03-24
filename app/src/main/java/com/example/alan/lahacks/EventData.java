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
    private double latitude;
    private double longitude;
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
        setID(id);
        setTitle(title);
        setShortDesc(shortDesc);
        setDate(date);
        setImage(image);
        setImage(image);
    }

    /**
     * Constructor for map display purposes
     * @param title Title of the event
     * @param shortDesc Short description of the event
     * @param date Date that the event will occur
     * @param latitude The event's approximate latitude
     * @param longitude The event's approximate longitude
     */
    public EventData(String title, String shortDesc, String date, double latitude, double longitude){
        setTitle(title);
        setShortDesc(shortDesc);
        setDate(date);
        setLatitude(latitude);
        setLongitude(longitude);
    }

    /**
     * Default constructor. Fills all instance variables with trash data.
     */
    public EventData(){
    }

    @Override
    public String toString() {
        return "EventData{" +
                "title='" + title + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", date='" + date + '\'' +
                ", location_latitude=" + latitude +
                ", location_longitude=" + longitude +
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

    public void setImage(int image){
        this.image = image;
    }

    /**
     * @param id This event's unique id
     */
    public void setID(int id){
        this.id = id;
    }

    /**
     * @param shortDesc Short description of this event in string form
     */
    public void setShortDesc(String shortDesc){
        this.shortDesc = shortDesc;
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
    public void setLatitude(double lat){
        latitude = lat;
    }

    /**
     * @param lon The event's approximate location longitude
     */
    public void setLongitude(double lon){
        longitude = lon;
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
    public double getLatitude(){
        return latitude;
    }

    /**
     * @return Returns this event location's longitude
     */
    public double getLongitude(){
        return longitude;
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
