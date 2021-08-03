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
        thingsToDo.addItem("1.write code");
        System.out.println(thingsToDo.getTitle());
        System.out.println(thingsToDo.getDescription());
        thingsToDo.addItem("2.run the code");
        thingsToDo.addItem("3.Write a delete method");


        ArrayList<Item> items = thingsToDo.getItems();

        for (int i=0 ; i < items.size(); i++) {
            System.out.println(items.get(i).getName());
        }

        thingsToDo.delete(2);


        for (int i=0 ; i < items.size(); i++) {
            System.out.println(items.get(i).getName());
        }



    }
}