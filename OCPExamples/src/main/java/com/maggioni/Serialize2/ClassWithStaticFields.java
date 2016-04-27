package com.maggioni.Serialize2;


import java.io.Serializable;

class ClassWithStaticFields implements Serializable {

    private static final long serialVersionUID = 22;
    
    static String s = "Hello";
    String s2;
    String s3 = "aaa";
    String s4 = "new String";
    String s5 = "new String5";
    static String s6;
    String s7 = "string7";
    static int i = 20;
    double d = 123.00;
    transient int t1 = 123;
    transient static int t2 = 123123;
    
    static {
        s6 = "initialization block staticffff";
    }

}
