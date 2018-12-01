package com.company;

public class SubChild extends Child {
    static {
        System.out.println("\t\tSubChild. Static block1");

    }

    {
        System.out.println("\t\tSubChild. block 1");
    }

    {
        System.out.println("\t\tSubChild. block 2");
    }

    public SubChild() {
        System.out.println("\t\tSubChild constructor");
    }

    static {
        System.out.println("\t\tSubChild. Static block2");
    }
}
