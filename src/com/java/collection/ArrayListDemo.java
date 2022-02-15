package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Hyd");
        list.add("Asf");
        list.add("Kzr");
        list.add("Knr");
        list.add("Nzbd");
        System.out.println(list);


        list.add(3, "MH");//adding using index
        list.set(0, "Lucknow"); //updating the value hyd to Lucknow
        list.remove("knr"); //removing KNR
        list.remove(4); //removing through index
        int pos = list.indexOf("Kzr");
        list.contains("Asf");
        String str= list.get(2);
        Collections.sort(list);
        //displaying elements
        System.out.println("Size of List :" + list.size());
        System.out.println("After Sorting" +list);
    }
}

