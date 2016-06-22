package com.maggioni.InnerClasses.Package1;

public class InnerClassDemo12 {
    void aMethod() {
        class Inner {
            protected Inner() {}
            /*
            static final variable ok
            */
            final static String name = "eJava";
            final private void Inner() {}
            InnerClassDemo12 ic = new InnerClassDemo12();
            Inner i = new Inner();
            /*
            no static method available
            not even final
            final static void print() {}
            static void print() {}
            */
        }
    }
}
