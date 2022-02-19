package com.java.inheritance;

import org.w3c.dom.ls.LSOutput;

// base class
 class Chicken {
//fields
    public int oil;
    public int onion;
    private int chicken;
    public int chilli;
    public int salt;
    public int masala;
    // chicken class has two constructor

    public Chicken(int chicken) {
        this.chicken = chicken;
    }

    public Chicken(int oil, int onion, int chilli, int salt, int masala) {
        this.oil = oil;
        this.onion = onion;
        this.chilli = chilli;
        this.salt = salt;
        this.masala = masala;
    }
    //methods
    public void spicyCurry(int increment)
    {
        chilli+=increment;
    }
    public void notspicyCurry(int decrement)
    {
        chilli -= decrement;
    }
    //toString() method to print info of chicken

    @Override
    public String toString() {
        return  (
                "oil=" + oil +
                ", onion=" + onion +
                ", chilli=" + chilli +
                ", salt=" + salt +

                ", masala=" + masala + ","
                );
    }
}
 class Mutton extends Chicken {
    // the Mutton subclass adds one more field
    public int mutton;
    // the Mutton subclass has one constructor
    public Mutton(int oil, int onion, int chilli, int salt, int masala, int addmutton) {
        // invoking base-class(chicken) constructor
        super(oil, onion, chilli, salt, masala);
        mutton = addmutton;
    }



    @Override
    public String toString() {
        return (super.toString()+
                " mutton=" + mutton
                );
    }
}

public class Cook {

           public static void main (String args[]){
              //when an object of Mutton class is created,
               // a copy of all methods and fields of the superclass acquire memory in this object.
               // That is why by using the object of the subclass
               // we can also access the members of a superclass.
               //only the object of the subclass is created, not the superclass.
              Mutton m = new Mutton(5,2,10,5,1,5);

              m.spicyCurry(1);
              m.notspicyCurry(0);
                System.out.println("child method is "+m.toString());
           }
            }




