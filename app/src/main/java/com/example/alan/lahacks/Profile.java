package com.example.alan.lahacks;

/**
 * Class dedicated to storing user profiles in memory for display
 * @Version: 0.5
 * @Author: Alan & Jesse
 */
public class Profile
{
    private String name;
    private int numberOfFriends;
    private int eventsAttended;
    //Name, number of events joined, friends

    /**
     * Default constructor
     */
    public Profile(){
        this.name = null;
        this.numberOfFriends = 0;
        this.eventsAttended = 0;
    }

    /**
     * Full constructor
     * @param name            Name of the user (profile owner)
     * @param numberOfFriends Number of friends the user has
     * @param eventsAttended  Number of events attended by the user
     */
    public Profile(String name, int numberOfFriends, int eventsAttended)
    {
        this.name = name;
        this.numberOfFriends = numberOfFriends;
        this.eventsAttended = eventsAttended;
    }

    /**
     * Copy constructor.
     * @param other Object of type Profile who's data will be copied to fill this object
     */
    public Profile(Profile other){
        this.name = other.getName();
        this.numberOfFriends = other.getNumberOfFriends();
        this.eventsAttended = other.getEventsAttended();
    }

    @Override
    public boolean equals(Object other){
        if(other != null && other.getClass() == this.getClass()){
            Profile otherP = (Profile) other;
            return this.name == otherP.getName() && this.numberOfFriends == otherP.getNumberOfFriends()
                    && this.eventsAttended == otherP.getEventsAttended();
        }
        return false;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", numberOfFriends=" + numberOfFriends +
                ", eventsAttended=" + eventsAttended +
                '}';
    }

    /**
     * Sets the user's name
     * @param name name of the user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the number of friends the user has
     * @param numberOfFriends number of friends the user has
     */
    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    /**
     * Sets the number of events attended
     * @param eventsAttended number of events attended by user
     */
    public void setEventsAttended(int eventsAttended) {
        this.eventsAttended = eventsAttended;
    }

    /**
     * Gets the name of the user
     * @return the name of the user in string form
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the number of friends the given user has
     * @return number of friends the user has
     */
    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    /**
     * Gets the number of events the user has attended
     * @return number of events the user has attended
     */
    public int getEventsAttended() {
        return eventsAttended;
    }
}