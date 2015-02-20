package com.maggioni.PartI.Chapter1.Access.b;

import com.maggioni.PartI.Chapter1.Access.a.A;

public class B extends A{
    protected void b() {
        System.out.println("super");
        super.a(); // from A.a()
        a(); // from B.a() because pverridden
        ab(); // from A.ab() not overridden
        System.out.println("this");
        this.a(); // from B
        this.ab(); // from A
    }
    
    @Override // overrides A.a()
    protected void a() {
        System.out.println("I'm from class B");
    }
    
    protected void c(A a) {
        //a.a(); // does not work because class A.a() is protected
        a.aa(); // works because A.aa() is public
    }
}
