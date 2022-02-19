package com.java.polymorphism;

   public  class Overloading {
        public static  int sum(int x, int y)
        {
            return (x + y);
        }

        // Overloaded sum(). This sum takes three int parameters
        public static  int sum(int x, int y, int z)
        {
            return (x + y + z);
        }

        // Overloaded sum(). This sum takes two double parameters
        public static  double sum(double x, double y)
        {
            return (x + y);
        }
        // Main driver method
        public static void main(String[] args) {
            Overloading s = new Overloading();
             System.out.println(s.sum(10, 20));
             System.out.println(s.sum(10, 20, 30));
             System.out.println(s.sum(10.5, 20.5));
        }

    }


