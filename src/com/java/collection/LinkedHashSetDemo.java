package com.java.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args){
        LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>();
        linkedhashset.add("Mobile");
        linkedhashset.add("Charger");
        linkedhashset.add("SIM");
        linkedhashset.add("PowerBank");
        linkedhashset.add(null);
        linkedhashset.add(null);
        linkedhashset.add("PowerBank");
        Iterator<String> it = linkedhashset.iterator();
        while (it.hasNext()){
            String st = it.next();
            System.out.println("Elements in LinkedHashSet: " +st);

        }
    }
}
