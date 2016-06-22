package com.maggioni.AdvancedClassDesign.Abstract;

import com.sun.prism.impl.PrismSettings;
import javax.swing.text.StyleConstants;

abstract class Demo2 {
    
    void met1() {};
    abstract void met2();
    static void met3() {System.out.println("I'm from AbstractStatic met3()"); }
    /*
    
    static abstract void met4();
    static final abstract void met6();
    */
    static final void met5() {System.out.println("I'm from AbstractStatic met5()"); }
}

public class AbstractStaticMethodsDemo2 extends Demo2{

    @Override
    void met2() {
        System.out.println("Demo1");
    }
    
    static void met3() {System.out.println("I'm from Demo1 met3()"); }
    static void met3(String s) {System.out.println("I'm from Demo1 met3() " +  s); }
   
    public static void main(String[] args) {
        met3();         // I'm from Demo1 met3()
        Demo2.met3();   // I'm from AbstractStatic met3()
    }
}
