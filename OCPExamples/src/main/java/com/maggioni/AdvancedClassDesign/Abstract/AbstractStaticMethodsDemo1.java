package com.maggioni.AdvancedClassDesign.Abstract;

public abstract class AbstractStaticMethodsDemo1 {
    
    void met1() {};
    abstract void met2();
    static void met3() {System.out.println("I'm from AbstractStatic met3()"); }
    /*
    
    static abstract void met4();
    static final abstract void met6();
    */
    static final void met5() {System.out.println("I'm from AbstractStatic met5()"); }
    public static void main(String[] args) {
        met3();         // I'm from AbstractStatic met3()
        Demo1.met3();   // I'm from Demo1 met3()
    }
}

class Demo1 extends AbstractStaticMethodsDemo1{

    @Override
    void met2() {
        System.out.println("Demo1");
    }
    
    static void met3() {System.out.println("I'm from Demo1 met3()"); }
   
}
