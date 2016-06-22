package com.maggioni.InnerClasses.Package1;

/*
Anonymous Inner Class Chapter 12
*/
public class NestedClassDemo1 {

    public static void main(String[] args) {
        MyOuter.MyInner2 m1 = new MyOuter().new MyInner2();
        MyOuter m2 = new MyOuter();
        MyOuter.MyInner2 m3 = m2.new MyInner2();
        
        MyOuter.MyInner1 m4 = new MyOuter.MyInner1();
        
    }

   
}

class MyOuter {
    public static class MyInner1 { public void foo() {}}
    public class MyInner2 {public void  foo2() {}}
    
    void doStuff1() {
        MyInner1 m1 = new MyInner1();
        MyInner2 m2 = new MyInner2();
        MyOuter.MyInner1 m3 = new MyOuter.MyInner1();
    }
}
