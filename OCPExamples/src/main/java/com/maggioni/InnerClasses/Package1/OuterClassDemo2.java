package com.maggioni.InnerClasses.Package1;

public class OuterClassDemo2 {
    static int staticIntValue = 1000;
    
    static int staticMethod1() { return 55; }
    static public int staticMethod2() { return 66; }
    static protected int staticMethod3() { return 77; }
    
    static class InnerStaticClass1 {
        static int staticIntValue = 2000;
        int innerclassMethod1() {return 100;}
        int innerclassMethod2() {return this.staticIntValue;}
        int innerclassMethod3() {return OuterClassDemo2.staticIntValue;}
    }
    static public class InnerStaticClass2 {        
        int innerclassMethod2() {return 200;}   
    }
    static protected class InnerStaticClass3 {
        int innerclassMethod2() {return 300;}   
    }
    
    static public void staticMethod4() {
        InnerStaticClass1 ic = new InnerStaticClass1();
        System.out.println("ic.innerclassMethod1() : "+  ic.innerclassMethod1()); // 100
    }
    
}
