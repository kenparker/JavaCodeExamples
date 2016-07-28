package com.maggioni.MostMissed.PracticeTestII;
class Parent{}
class DerivedOne extends Parent{}
class DerivedTwo extends Parent{}
public class SiblingObjectCastingDemo1 {

    public static void main(String[] args) {
        Parent p = new Parent();
        DerivedOne d1 = new DerivedOne();
        DerivedTwo d2 = new DerivedTwo();
        // d1 = (DerivedTwo)d2; do not compile
        
        Parent d3 = new DerivedOne();
        Parent d4 = new DerivedTwo();
        
        //d3 = (DerivedOne) d4; // Exception in thread "main" java.lang.ClassCastException:
        d4 = (DerivedOne) d3; 
        //d4 = (DerivedTwo) d3; // Exception in thread "main" java.lang.ClassCastException:
    }

}
