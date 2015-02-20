package com.maggioni.PartI.Chapter1.Access.a;

public class BsameClass extends A{
    
    protected void b(A a) {
        a.a(); // works
        super.a();
        a();
    }
}
