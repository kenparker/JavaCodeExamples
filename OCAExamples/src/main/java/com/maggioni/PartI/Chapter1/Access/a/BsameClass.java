package com.maggioni.PartI.Chapter1.Access.a;

public class BsameClass extends A{
    
    @Override
    public void ab() {
        
    }
    
    public void cc() {
        System.out.println("say cc");
                
    }
    protected void b(A a) {
        a.a(); // works
        super.a();
        a();
        //super.cc(); do not compile
    }
}
