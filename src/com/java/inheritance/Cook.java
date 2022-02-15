package com.java.inheritance;
 class Chicken {
//fields
    public int oil;
    public int onion;
    public int chicken;
    public int chilli;
    public int salt;
    public int masala;
    // chicken class has one constructor
    public Chicken(int oil, int onion , int chilli, int salt, int masala) {
        this.oil = oil;
        this.onion = onion;
        this.chilli = chilli;
        this.salt = salt;
        this.masala = masala;

    }
    public void spicyCurry(int increment){
        chilli+=increment;
    }
    public void notspicyCurry(int decrement) {
        chilli += decrement;
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
              Mutton m = new Mutton(1,2,3,1,1,5);
                System.out.println(m.toString());
           }
            }




