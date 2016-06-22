package com.maggioni.InnerClasses.Package1;

class StaticNestedClassDemo1 {

    static class StaticNested1 {}
    public static class StaticNested2{
        void nestedMethod1() {System.out.println("I'm from method nestedMethod1()");}
        static void nestedMethod2() {System.out.println("I'm from method nestedMethod2()");}
        class Inner1 { void inner1Meth1() {System.out.println("I'm from Inner 1 ");}}
        public class Inner2 {void inner1Meth1() {System.out.println("I'm from Inner 2 ");}}
        static class StaticInner3 {}
    }
    static void staticMethod2() {
        class Inner4 {}
        /*
        no static methods allowed
        static void nestedMethod2() {System.out.println("I'm from method nestedMethod2()");} 
        */
    }
}

public class StaticNestedClassDemo11 {
    public static void main(String[] args) {
        StaticNestedClassDemo1.StaticNested2 s = new StaticNestedClassDemo1.StaticNested2();
        s.nestedMethod1();
        s.nestedMethod2();
        //StaticNestedClassDemo1.StaticNested2.nestedMethod1();
        StaticNestedClassDemo1.StaticNested2.nestedMethod2();
        StaticNestedClassDemo1.StaticNested2.Inner2 inner2 = new StaticNestedClassDemo1.StaticNested2().new Inner2();
        StaticNestedClassDemo1.StaticNested2.StaticInner3 staticInner3 = new StaticNestedClassDemo1.StaticNested2.StaticInner3();

    }
}
