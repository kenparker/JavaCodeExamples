package com.maggioni.AdvancedClassDesign;

public class OverloadingQ22 {
    
    void method1() {}
    /*
    overloading a method required a different parameter list
    olerloading cannot be done only changing the return type
    
    int method1() {}
    public void method1() {}
    */
    /*
    following overloading is correct
    */
    String method1(String s) { return "hello";}
    /*
    also an incorrect overloading:
    
    public String method1(String s) { return "hello";}
    */
    
    CharSequence method2(String s) {return "hello";}
    /*  
    String method2(String s) {return "hello";}
    */
    
    String method2(String... s) {return "hello";}
    public String method2(String s1, String s2) {return "hello";}
    Integer method2(String s1, Integer s2) {return s2;}
   
}
