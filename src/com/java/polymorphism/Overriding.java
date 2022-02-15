package com.java.polymorphism;
class Vegetable {

    // Method of parent class
    void talk()
    {


        System.out.println("Hi  IAM Vegetables");
    }
}
class Brinjal extends Vegetable{

    // Method
    void talk() { System.out.println("I am Brinjal and my color is Green"); }
}


class Mirchi extends Vegetable {


    void talk()
    {


        System.out.println("I am Mirchi and my color is Red");
    }
}
public class Overriding {
    public static void main(String[] args)
    {

       Vegetable v = new Vegetable();
        Vegetable  b = new Brinjal();
        Vegetable  m = new Mirchi();
        v.talk();


        b.talk();
        m.talk();
    }
}



