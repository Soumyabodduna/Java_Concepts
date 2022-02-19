package com.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet<String> treeset = new TreeSet<String>();
        TreeSet<Integer> treeset1 = new TreeSet<Integer>();
// treeset sorts the elements in the ascending order
        treeset.add("Ganga");
        treeset.add("Ganga");
        treeset.add("Godavari");
        treeset.add("Bramaputra");
        treeset.add("Narmada");

       // treeset.add(null); //it does not allow null values
        System.out.println("Size of treeset:" +treeset.size());
        System.out.println("Elements in treeset:  " +treeset);
        Iterator<String> itr = treeset.iterator();
        while (itr.hasNext()){
            String st = itr.next();
            System.out.println("Elements in treeset: " +st);
        }


        treeset1.add(56);
        treeset1.add(500);
        treeset1.add(250);
        treeset1.add(5);
        treeset1.add(20);
        System.out.println("Size of treeset1:" +treeset1.size());
        System.out.println("Elements in treeset1:" +treeset1);
        Iterator<Integer> it = treeset1.iterator();
        while(it.hasNext()){
            Integer in = it.next();
            System.out.print(in + " ");
        }

    }
}
