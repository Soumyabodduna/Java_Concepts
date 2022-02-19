package com.java.collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> Fruits = new Vector<String>();
        Fruits.addElement("Apple");
        Fruits.addElement("Orange");
        Fruits.addElement("Mango");
        Fruits.addElement("Fig");
        System.out.println("Size is: "+Fruits.size());
        System.out.println("Default capacity increment is: "+Fruits.capacity());
        Fruits.addElement("Grapes");
        Fruits.addElement("Cheery");
        Fruits.addElement("Banana");
        Fruits.addElement("Banana");//contains duplicates

        /*size and capacityIncrement after two insertions*/
        System.out.println("Size after addition of some fruits: "+Fruits.size());
        System.out.println("Capacity after increment is: "+Fruits.capacity());
        System.out.println("clone:" +Fruits.clone());

        /*Display Vector elements*/
        Enumeration en = Fruits.elements();
        System.out.println("\nElements are:");
        while(en.hasMoreElements())
            System.out.println(en.nextElement() + " ");

        Collections.sort(Fruits);
        System.out.println("after sorting:" +Fruits);

    }

}
