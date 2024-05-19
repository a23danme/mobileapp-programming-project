package com.example.project;

public class Casino {
    private String ID;
    private String Login;
    private String Name;
    private String Location;
    private int Rating;

    // Getters och Setters
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        this.Login = login;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        this.Rating = rating;
    }

    @Override
    public String toString() {
        return Name;
    }

}
