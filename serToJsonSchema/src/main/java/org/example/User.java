package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("id")
    public int id;
    @JsonProperty("Name")
    public String name;

    public User(int i, String theUser) {
        this.id = i;
        this.name = theUser;
    }

    public User(){

    }
}