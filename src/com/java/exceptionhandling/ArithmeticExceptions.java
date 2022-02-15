package com.java.exceptionhandling;

public class ArithmeticExceptions {
    public static void main(String args[]) {
        int a, b;
        try {
            //this block will contain statements that may raise exceptions

            a = 0;
            b = 25 / a;
            System.out.println(b);

        }
        catch (java.lang.ArithmeticException e) {
                int x = 25;
                int y= 15;
                int z= x-y;

                System.out.println("The value of Z is:" + " "+ z);
        }
        finally //finally block is executed irrespective of exception
        {
            System.out.println("Hi my name is Soumya, I am your Maths Teacher");

        }
    }
}
