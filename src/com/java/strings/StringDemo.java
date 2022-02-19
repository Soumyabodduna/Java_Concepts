package com.java.strings;

public class StringDemo {
    public static void main(String [] args){
        //creating a string by java string literal
        String str = "Soumya Bodduna";
        //converting char array arraych[] to string str2
        char arraych[] = {'h','i',' ','s','o','u','m','y','a'};//it will combine character to string
        String str1= new String(arraych);//it will allocate space for string and we calling the parameter arraych
        //creating another java string str3 by using new keyword
        String str2= new String("I belongs to Asf");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

    }
}
