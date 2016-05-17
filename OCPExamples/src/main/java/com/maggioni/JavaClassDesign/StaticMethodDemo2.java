package com.maggioni.JavaClassDesign;

/*
Lessons learned:
    Polymorphic method invocations apply ONLY to instance methods.
    NOT static methods. Not variables.
    Only overridden instance methods are dynamically invoked based on the real object's type.

    Variable and static methods are not overridden, they are shadowed.
    }
*/

public class StaticMethodDemo2 {

    public static void main(String[] args) {
        Car2 c = new Mini2();
        c.m1();                     // polymorphism applies ONLY to instance methods
        System.out.print(" "+c.i1+c.i2); // NOT to static methods and NOT to static AND instance variables -> Print -> 56
        c.m2();     // from Mini2 -> print -> 8
        
        System.out.println("");
        Mini2 m = new Mini2();
        m.m1();
        System.out.print(" "+m.i1+m.i2+"\n"); 
        
    }

}

class Car2 {
    static int i1 = 5;
    int i2 = 6;
    public static void m1() {System.out.println("from static"); System.out.print(i1);}  // print -> 5
    public void m1(String s) {System.out.println("from instance");} // valid
    public void m2() {System.out.println(i2);}
}

class Mini2 extends Car2 {
    static int i1 = 7;
    int i2 = 8;
    public static void m1() {System.out.print(i1);}
    @Override
    public void m2() {System.out.println(i2);}  
}
