package com.java.collection;

import java.util.ArrayDeque;

import java.util.Deque;

//Deque is a Queue in which you can add and remove elements from both sides.
public class DequeDemo {
    public static void main(String args[]) {
        Deque<String> dq = new ArrayDeque<>();
            //We cannot create instance of a Deque as it is an
            //	* interface, we can create instance of ArrayDeque or
            //	* LinkedList and assign it to Deque

            dq.add("BreakFast");
            dq.add("Lunch");
            dq.add("Snacks");
            dq.addLast("Dinner");
            dq.addFirst("Tea");
        System.out.println("Daily food routine" +dq);
        System.out.println("Skip Dinner: "+dq.removeLast());
        System.out.println("Head: " + dq.element());
        System.out.println("poll:" + dq.pollLast());
        System.out.println("peek(): "+dq.peek());


    }

}
