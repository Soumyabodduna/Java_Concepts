package com.java.loops;

public class Continue {
    public static void main(String args[])
    {
        // For loop for iteration
        for (int i = 0; i <= 15; i++) {

            // Check condition for continue
            if (i == 6 || i == 11) {

                // Using continue statement to skip the
                // execution of loop when i==6 or i==11
                continue;
            }
            // Printing elements to show continue statement
            System.out.print(i + " ");
        }
    }
}
