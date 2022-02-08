package com.java.inheritance;

import java.lang.*;


class RoseTree {
    public void roseFlower()
    {
        System.out.println("Red Rose Flower");
    }
}

class JasmineTree extends RoseTree {
    public void jasmineFlower () { System.out.println("JasmineTree has White Flower"); }
}

public class Flowers
{
    public static void main(String[] args)
    {
        JasmineTree jt = new JasmineTree();
        jt.jasmineFlower();
        jt.roseFlower();
    }
}

