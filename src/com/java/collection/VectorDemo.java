package com.java.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String args[]) {
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

        /*size and capacityIncrement after two insertions*/
        System.out.println("Size after addition of some fruits: "+Fruits.size());
        int Capacity = Fruits.capacity();
        System.out.println("Capacity after increment is: "+Fruits.capacity());

        /*Display Vector elements*/
        Enumeration en = Fruits.elements();
        System.out.println("\nElements are:");
        while(en.hasMoreElements())
            System.out.print(en.nextElement() + " ");

    }

}
