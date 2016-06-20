package com.maggioni.InnerClasses.Package1;

class A { void m() {System.out.println("outer");}}

public class InnerClassDemo9 {

    public static void main(String[] args) {
     
        new InnerClassDemo9().go();
    }

    void go() {
        new A().m();        // middle
        class A {void m() {System.out.println("inner");}}
    }
    class A {void m() {System.out.println("middle");}}
}
