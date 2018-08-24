package com.udacity.gradle.builditbigger.backend;

/** The object model for the data we are sending through endpoints */
public class Joke {

    private String myJoke;

    public String getJoke() {
        return myJoke;
    }

    public void setJoke(String theJoke) {
        myJoke = theJoke;
    }
}