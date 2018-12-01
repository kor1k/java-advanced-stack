package com.company;

public class Parent {

    static {
        System.out.println("Parent. Static block1");

    }

    {
        System.out.println("Parent. block 1");
    }

    {
        System.out.println("Parent. block 2");
    }

    public Parent() {
        System.out.println("Parent constructor");
    }

    static {
        System.out.println("Parent. Static block2");
    }
}
