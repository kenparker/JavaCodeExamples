package com.maggioni.PartI.Access.a;

public class A {

    protected void a() { // the method is visible through the all chain of child classes
        System.out.println("I'm from class A.a()");
    }
    
    protected void ab() {
        System.out.println("I'm from class A.ab()");
    }
    public void aa() {
        System.out.println("I'm from class A.aa()");
    }
}
