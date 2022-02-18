package com.java.collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        //Adding elements to the Linked list
        list.add("Steve smith");
        list.add("David Warner");
        list.add("Virat");
        //it will print duplicate elements
        list.add("David Warner");
        //Adding an element to the first position
        list.addFirst("Rohit");

        //Adding an element to the last position
        list.addLast("Sreyas");

        //Adding an element to the 3rd position
        list.add(2, "Ashwin");
        list.push("Kane");

        //Iterating LinkedList
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
       // Collections.sort(list);
        System.out.println(list);
        System.out.println("Element removed: "+list.pop());//fifo
        System.out.println("head: "+list.element());
        System.out.println("poll: "+list.poll());//It retrieves and removes the first element of a list.
        System.out.println("peek: " +list.peek());//It retrieves the first element of a list


        Object firstElement = list.getFirst();
        System.out.println("First Element is: "+firstElement);
        Object lastElement = list.getLast();
        System.out.println("Last Element is: "+lastElement);

    }
}
