package com.company;

public class Child extends Parent {

    static {
        System.out.println("\tChild. Static block1");

    }

    {
        System.out.println("\tChild. block 1");
    }

    {
        System.out.println("\tChild. block 2");
    }

    public Child() {
        System.out.println("\tChild constructor");
    }

    static {
        System.out.println("\tChild. Static block2");
    }
}
