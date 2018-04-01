package com.example.alan.lahacks;


public class Profile
{
    private String name;
    private int numberOfFriends;
    private int eventsAttended;
    //Name, number of events joined, friends

    public Profile(String name, int numberOfFriends, int eventsAttended)
    {
        this.name = name;
        this.numberOfFriends = numberOfFriends;
        this.eventsAttended = eventsAttended;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public void setEventsAttended(int eventsAttended) {
        this.eventsAttended = eventsAttended;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public int getEventsAttended() {
        return eventsAttended;
    }
}