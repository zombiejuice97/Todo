package com.myFirstProject;

public class Item {
    private final String name;
    private Boolean isDone;

    public Item(String name) {
        this.name = name;
        this.isDone = false;
    }

    void setDone() {
        this.isDone = true;
    }

    Boolean getDone() {
        return this.isDone;
    }

    String getName() {
        return this.name;
    }

    void unDone(){
        this.isDone = false;
    }
}
