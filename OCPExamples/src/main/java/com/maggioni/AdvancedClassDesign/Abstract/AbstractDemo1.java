package com.maggioni.AdvancedClassDesign.Abstract;

abstract class B {
    void m1() {System.out.println("b-m1 ");}
    abstract  void m2();

    public B() {
        System.out.println("B ");}
}

abstract class D {
    void m1() {}
}

class C extends B {

    void m1() {System.out.println("c-m1 ");}
    @Override
    void m2() {
    }
    void go() {
        super.m1();
    }

    public C() {
        System.out.println("C ");}
    
    
}
public class AbstractDemo1 {

    public static void main(String[] args) {
        new C().go();   // B C b-m1
        new C().m1();   // B C c-m1
        new C().m2();   // B C
        /*
        anonymus class of an abstract class
        */
        B b = new B() {
            
            @Override
                    void m2() {
                        System.out.println("");
                    }
        };
        
        D d = new D() {
            {System.out.println("D ");}
        };
    }

}
