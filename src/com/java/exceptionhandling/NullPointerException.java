package com.java.exceptionhandling;

public class NullPointerException {
    public static void main(String[] args) {
        try {
            String st = null;
            System.out.println(st.length());
        }
        catch (java.lang.NullPointerException e){
            System.out.println("Hii Soumya");
        }

    }
}
