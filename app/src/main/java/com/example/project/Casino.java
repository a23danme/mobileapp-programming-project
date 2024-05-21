package com.example.project;

import com.google.gson.annotations.SerializedName;

public class Casino {

    @SerializedName("ID")
    private String id;

    @SerializedName("login")
    private String login;

    @SerializedName("name")
    private String name;

    @SerializedName("location")
    private String location;

    @SerializedName("size")
    private String size;

    public Casino(String id, String login, String name, String location, String size) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.location = location;
        this.size = size;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getSize(){
        return size;
    }

}


