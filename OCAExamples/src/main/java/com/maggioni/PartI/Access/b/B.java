package com.maggioni.PartI.Access.b;

import com.maggioni.PartI.Access.a.A;

public class B extends A{
    protected void b() {
        System.out.println("super");
        super.a();
        a();
        System.out.println("this");
        this.a();
    }
    
    @Override
    protected void a() {
        System.out.println("I'm from class B");
    }
    
    protected void c(A a) {
        //a.a(); // does not work
    }
}
