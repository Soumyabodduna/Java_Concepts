package com.java.exceptionhandling;

public class IndexOutOfBoundExceptionDemo {
    public static void main(String args[]) {
        String st = "Welcome to India";
        try {
            char ch1 = st.charAt(50);
            System.out.println("Char at 50 index:" + ch1);
        }
        catch (IndexOutOfBoundsException e) {
            char ch2 = st.charAt(5);
            char ch3 = st.charAt(9);
            char ch4 = st.charAt(14);
            System.out.println("Char at 5 index:" +ch2);
            System.out.println("Char at 9 index:" +ch3);
            System.out.println("Char at 14 index:" +ch4);


        }
    }
}
