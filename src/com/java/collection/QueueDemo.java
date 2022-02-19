package com.java.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main (String[] args){
        Queue<String> q = new LinkedList<String>();
        q.add("Soumya");
        q.add("Sony");
        q.add("Sanju");
        q.add("Rahul");
        q.add("Rahul");
        System.out.println("Elements in Queue: " +q);
        System.out.println("Removed Element: " +q.remove());
        System.out.println("Elements in Queue: " +q);
        System.out.println("Head: " +q.element());//printing the first value
        System.out.println("poll() :" +q.poll());//printing the head value
        System.out.println("peek() :" +q.peek());//removing the header value and printing first value in queue
        System.out.println("Queue :"+q);
    }
}
