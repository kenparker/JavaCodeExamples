package com.maggioni.PartI.Exceptions;

public class FruitDemo1 {

    static int xx;
    static {
        xx = 10/0;  // Throw at runtime ExceptionInInitializerError
        System.out.println("xx :" + xx);
    }
    
    public FruitDemo1() {
        this("Mango");
    }
    public FruitDemo1(String name) {
       // this();       // do not compile - recursive constructor error
    }
    public static void main(String[] args) {
       
        FruitDemo1 f = new FruitDemo1();
        System.out.println("xx :" + xx);
    }

}
