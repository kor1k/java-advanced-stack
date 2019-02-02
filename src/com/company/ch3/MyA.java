package com.company.ch3;

public class MyA {

    public  MyA(){
        this("100");
        System.out.println("\tEND Default (100) parameter");
    }
    public MyA(int type){
        System.out.println("\t\tEND integer parameter");
    }

    public MyA(String name) {
//        System.out.println("END string parameter");
        this(Integer.parseInt(name));
        
        System.out.println("\t\t\tEND string parameter");
    }
}
