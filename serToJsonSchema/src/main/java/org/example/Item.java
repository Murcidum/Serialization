package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
    @JsonProperty("Id")
    public int id;
    @JsonProperty("ItemName")
    public String itemName;
    @JsonProperty("Owner")
    public User owner;

    public Item(int i, String theItem, User theUser) {
        this.id = i;
        this.itemName = theItem;
        this.owner = theUser;
    }

    public Item(){

    }

}