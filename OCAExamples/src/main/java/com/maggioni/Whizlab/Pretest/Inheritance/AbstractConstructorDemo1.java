package com.maggioni.Whizlab.Pretest.Inheritance;

public class AbstractConstructorDemo1 {

    public static void main(String[] args) {
            AbstractDemo1 ab = new AbstractDemo1(20) {

                @Override
                void absMethod() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
           
            ab.print();
    }

}
