package com.example.alan.lahacks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    //Profile tests
    @Test
    public void testProfileConstructors(){
        Profile def = new Profile();
        Profile prof = new Profile("Alan", 0, 1000);
    }

    //Testing toString (simple test; need to improve)
    @Test
    public void testToString(){
        Profile toStringTest = new Profile("Lol", 10, 100);
        String testString = "Profile{" +
                "name='" + "Lol" + '\'' +
                ", numberOfFriends=" + 10 +
                ", eventsAttended=" + 100 +
                '}';
        assertEquals(toStringTest.toString(),  testString);
    }

    //Testing some setters
    @Test
    public void testProfileSetters(){
        Profile ex = new Profile();
        String testString = "Profile{" +
                "name='" + "name" + '\'' +
                ", numberOfFriends=" + 3 +
                ", eventsAttended=" + 5 +
                '}';
        ex.setEventsAttended(10);
        ex.setName("name");
        ex.setEventsAttended(5);
        ex.setNumberOfFriends(3);

        assertEquals(ex.toString(),  testString);
    }

    @Test
    public void testProfileGetters(){
        Profile ex = new Profile();
        ex.setEventsAttended(10);
        ex.setName("lol");
        ex.setNumberOfFriends(3);

        //Testing getters one-by-one
        assertEquals(ex.getName(), "lol");
        assertEquals(ex.getEventsAttended(), 10);
        assertEquals(ex.getNumberOfFriends(), 3);
    }
}