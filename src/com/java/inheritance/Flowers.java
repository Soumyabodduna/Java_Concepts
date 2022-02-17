package com.java.inheritance;

import java.lang.*;


class RoseTree {
    public void flower()
    {
        System.out.println("Red Rose Flower");
    }
}

class JasmineTree extends RoseTree {
    public void flower ()
    {
        super.flower();
        System.out.println("JasmineTree has White Flower"); }
}

public class Flowers
{
    public static void main(String[] args)
    {
        RoseTree jt = new JasmineTree();
        jt.flower();

    }
}

