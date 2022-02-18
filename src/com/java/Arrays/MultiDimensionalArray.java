package com.java.Arrays;

public class MultiDimensionalArray {
    public static void main(String args[]) {
        // declaring and initializing 2D array
        int[][][] arr =  { { { 1, 2 }, { 3, 4 } },
                { { 5, 6 }, { 7, 8 } } };

        // printing 2D array
        for (int i = 0; i < 2 ; i++)//it will count the rows
        {
            for (int j = 0; j <2; j++)//it will count the columns
            {
                for (int k = 0; k < 2; k++)//it will count the columns
                {

                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();

            }
            System.out.println();
        }
    }
}


