package com.java.inheritance;
class Tenth{
    public void perform()
    {
        System.out.println("Dance");
    }
}
class Ninenth extends Tenth{
    public void perform()
    {
        System.out.println("Sing");
    }
}
class Eigth extends Tenth {
    public void perform()
    {
        System.out.println("Skit");
    }


    public static class AnnualDayFunction {
        public static void main(String args[]) {
            Tenth t = new Tenth();
            Tenth n = new Ninenth();
            Tenth e = new Eigth();
            t.perform();
            n.perform();
            e.perform();

        }
    }
}