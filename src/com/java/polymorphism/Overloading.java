package com.java.polymorphism;


class Arithimatic {
    // Method with 2 integer parameters
    static int Multiply(int a, int b)
    {
        // Returns product of integer numbers
        return a * b;
    }

    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b)
    {

        // Returns product of double numbers
        return a * b;
    }
}

// Class 2
// Main class
public class Overloading {
        // Main driver method
        public static void main(String[] args)
        {

            // Calling method by passing
            // input as in arguments
            System.out.println(Arithimatic.Multiply(9, 7));
            System.out.println(Arithimatic.Multiply(4, 9));
        }
    }

