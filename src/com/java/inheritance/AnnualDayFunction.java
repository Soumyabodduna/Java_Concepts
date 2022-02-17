package com.java.inheritance;
class Tenth{
    public void dancing()
    {
        System.out.println("Nacho Nacho");
    }
}
class Ninenth extends Tenth{
    public void Singing()
    {
        System.out.println("Bola chudiya");
    }
}
class Eigth extends Ninenth {
    public void drama()
    {
        System.out.println("Doctor and Patient");
    }


    public static class AnnualDayFunction {
        public static void main(String args[]) {

           Eigth c = new Eigth();
           c.dancing();
           c.Singing();
           c.drama();

        }
    }
}