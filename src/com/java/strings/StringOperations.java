package com.java.strings;



public class StringOperations {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("Warangal");
        StringBuffer s2 = new StringBuffer("Hyderabad");
        StringBuffer s3 = new StringBuffer("INDIA");
        StringBuffer s = new StringBuffer("WELCOME TO INDIA");
        StringBuilder str = new StringBuilder();
        System.out.println(str.toString());
        s.replace(11, 16, "BHARATH");



        s1.deleteCharAt(1);

        int p = s1.length();

        // Getting the capacity of the string
        int q = s1.capacity();
        s2.append("Biryani");

        s3.reverse();
        System.out.println(q);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s);

    }
}
