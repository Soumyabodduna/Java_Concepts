package com.java.strings;

public class StringConcat {
    public static void main(String args[]) {
        String st = "Welcome";
        st=st.concat(" ");
        st=st.concat("to");
        st=st.concat(" ");
        st=st.concat("India");

        String st1 = "Welcome";
        st1=st1.concat(" ");
        st1= st1.concat("to").concat(" ").concat("Telangana").concat(" ").concat("Soumya");
        System.out.println(st);
        System.out.println(st1);
        System.out.println("Length of st1:"+st1.length());
        System.out.println(st1.contains("Soumya"));
        System.out.println(st1.contains("Sony"));
        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());

    }
}
