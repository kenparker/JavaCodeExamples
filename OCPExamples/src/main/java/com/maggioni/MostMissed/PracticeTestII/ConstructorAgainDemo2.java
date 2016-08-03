package com.maggioni.MostMissed.PracticeTestII;

class P {

    private int a;
    
    P() {
    }

    protected P(int a) {
        this.a = a;
    }
    
    /*
    syncronized not allowed in a constructor
    
    synchronized protected P() {
    }
    */

    /*
    the combination protected and public do not work
    
    protected public P() {
    }
    */
       
}

class Q extends P {

    public Q() {
    }

    public Q(int a) {
        super(a);
    }
    
}
public class ConstructorAgainDemo2 {

    protected ConstructorAgainDemo2() {
        System.out.println("con demo2");
    }

    
    public static void main(String[] args) {
        P p = new P(12);
    }

}
