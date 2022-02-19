package com.java.strings;

public class CharAtDemo {
    public static void main(String args[]) {
        String st = "Welcome to India";
        char ch1 = st.charAt(0);
        char ch2 = st.charAt(5);
        char ch3 = st.charAt(9);
        char ch4 = st.charAt(14);
        System.out.println("Char at 0 index:" + ch1);
        System.out.println("Char at 5 index:" + ch2);
        System.out.println("Char at 9 index:" + ch3);
        System.out.println("Char at 14 index:" + ch4);
        for (int i = 0; i < st.length(); i++) {
            System.out.print(st.charAt(i));


        }

    }
}
