package com.java.exceptionhandling;

import java.io.FileInputStream;

public class FileNotFoundException {
    public static void main(String args[]) {

        //  throws java.io.FileNotFoundException {
        try {

            FileInputStream f =  new FileInputStream("C:/myfile.txt");

            System.out.println("The specified file is not " +
                    "present at the given path");

        } catch (java.io.FileNotFoundException e) {

            System.out.println("The specified file is not " +
                    "present at the given path");
        }
    }
}


