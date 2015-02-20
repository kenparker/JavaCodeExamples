package com.maggioni.PartI.Chapter1.Access.c;

import com.maggioni.PartI.Chapter1.Access.b.B;

/*
https://javax0.wordpress.com/2014/11/26/some-sentences-about-java/
*/
public class C extends B{

    public static void main(String[] args) {
        new C().c();
    }
    
    protected void c() {
        a(); // the method called is from the superclass B, B.a() is overriding A.a()
        
        aa(); // from the super class A
        
        b();       
    }
    
}
