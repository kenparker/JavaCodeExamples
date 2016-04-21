package com.maggioni.MostMissed;

public class AbstractClassesDemo1 {

    public static void main(String[] args) {
        
    }

}
abstract class X { // it is not enough to put "abstract" here bcause m1() need also to be declared "abstract"
    abstract public void m1();
    // public void m1(); do not compile
}

abstract class Y {
    public final void m1() {} // fine
}