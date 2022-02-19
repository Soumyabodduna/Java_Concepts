package com.java.collection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet<String> hashset = new HashSet<String>();
        //HashSet doesn’t maintain any order,
        // the elements would be returned in any random order.
        hashset.add("India");
        hashset.add("America");
        hashset.add("UK");
        hashset.add("Portugal");
        //HashSet doesn’t allow duplicates
        hashset.add("India");//Addition of duplicate elements
        hashset.add(null);//HashSet allows null values however
        // if you insert more than one nulls it would still return only one null value.
        hashset.add(null);
        System.out.println("Size of Hashset: " +hashset.size());
        System.out.println("Elements in the Hashset:" +hashset);
        if(hashset.contains("UK")){
            System.out.println("HashSet contains UK" );
        }

    }
}
