package com.maggioni.SelfTest;

interface Gadget {
    void doStuff(); // the method access is default = public for interfaces
}

abstract class Electronic5 {
    void getPower() {
        System.out.println("plug in");
    }
}
public class Tablet extends Electronic5 implements Gadget{

    @Override
    public void doStuff() { // method access can only be public
        System.out.println("show book");
    }
    
    public static void main(String[] args) {
        new Tablet().getPower();
        new Tablet().doStuff();
    }

    
}
