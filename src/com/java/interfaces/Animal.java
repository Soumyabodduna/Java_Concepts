package com.java.interfaces;
 interface Cat {
    void feelingHungry(int a);
    void huntRat(int a);
    void notHungry(int a);

}
 class Dog implements Cat {
    int hunt;
    int eat;
    @Override
    public void feelingHungry(int huntAndEat) {

        eat = huntAndEat;
    }

    @Override
    public void huntRat(int increment) {

        hunt = hunt + increment;
    }

    // to decrease speed
    @Override
    public void notHungry(int decrement) {

        hunt = hunt - decrement;
    }

    public void printStatus() {
        System.out.println("hunt: " + hunt
                + " eat: " + eat);
    }
}

public class Animal {

       public static void main(String[] args) {
           Dog dog = new Dog();

           dog.feelingHungry(2);
           dog.huntRat(2);
           dog.notHungry(0);
           System.out.println("If Hungry:");
           dog.printStatus();
       }}
    // creating instance of the bike.

