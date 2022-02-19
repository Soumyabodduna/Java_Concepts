package com.java.exceptionhandling;
import java.io.*;
class Example {
    void myMethod(int num)throws IOException, ClassNotFoundException{
        if(num==1)
            throw new IOException("IOException Occurred");
        else
            throw new ClassNotFoundException("ClassNotFoundException");
    }
}

public class ThrowExample {
    public static void main(String args[]){
        try{
            Example obj=new Example();
            obj.myMethod(2);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }




}
