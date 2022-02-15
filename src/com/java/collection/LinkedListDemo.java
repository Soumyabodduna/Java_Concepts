package com.java.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        //Adding elements to the Linked list
        list.add("Steve smith");
        list.add("David Warner");
        list.add("Virat");

        //Adding an element to the first position
        list.addFirst("Rohit");

        //Adding an element to the last position
        list.addLast("Sreyas");

        //Adding an element to the 3rd position
        list.add(2, "Ashwin");

        //Iterating LinkedList
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        Collections.sort(list);
        System.out.println(list);
    }
}
