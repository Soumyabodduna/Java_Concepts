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

    void talk()

    {
        super.talk();//super keyword call the super class method
        System.out.println("I am Brinjal and my color is Green");
    }
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


        Vegetable b = new Brinjal();//it will overide the parent class method
        Vegetable m = new Mirchi();


        b.talk();
        m.talk();
    }
}



