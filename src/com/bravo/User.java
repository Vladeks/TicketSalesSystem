package com.bravo;

public class User {

    private int Id;
    private String name;

    public User(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
