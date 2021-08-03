package com.myFirstProject;


import java.util.ArrayList;

public class Todo {
    private final String title;
    private final String description;
    private ArrayList<Item> items;

    Todo(String title, String description) {
        this.title = title;
        this.description = description;
        this.items = new ArrayList<Item>();
    }

    void addItem(String taskName) {
        Item task = new Item(taskName);
        this.items.add(task);
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }
    public void delete(int k){
        this.items.remove(k);
    }

    void done(int index){
        Item item = items.get(index);
        item.setDone();

    }
    
    void undone(int index){
        Item item = items.get(index);
        item.unDone();
    }
    
   boo

