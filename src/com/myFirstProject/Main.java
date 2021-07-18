package com.myFirstProject;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
       /* Item one = new Item("First Item");
        System.out.println(one.getName());
        System.out.println(one.getDone());
        // System.out.println(one.unDone());
        one.setDone();
        System.out.println(one.getDone());
        one.unDone();
        System.out.println(one.getDone()); */
        Todo thingsToDo = new Todo("Things to do ", "What you have to do today");
        thingsToDo.addItem("item 1");
        System.out.println(thingsToDo.getTitle());
        System.out.println(thingsToDo.getDescription());
        thingsToDo.addItem("Item 2 ");

        ArrayList<Item> items = thingsToDo.getItems();
        for (int i=0 ; i < items.size(); i++) {
            System.out.println(items.get(i).getName());
        }


    }
}
