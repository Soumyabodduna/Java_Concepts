package com.java.loops;

public class WhileLoop {
    public static void main(String args[])
    {
        int x = 1, sum = 0;

        // Exit when x becomes greater than 4
        while (x <= 50) {
            // summing up x
            sum = sum + x;

            // Increment the value of x for
            // next iteration
            x++;
        }
        System.out.println("Summation: " + sum);
    }
}
