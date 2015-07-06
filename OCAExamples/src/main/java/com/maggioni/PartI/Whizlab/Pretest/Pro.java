package com.maggioni.PartI.Whizlab.Pretest;

public class Pro {

    public static void main(String[] args) {
        A2 ab = new B2();
        System.out.println(ab.x);
        System.out.println(ab.j);
        
        System.out.println(A2.z);
        System.out.println(A2.j);
        System.out.println(B2.j);
    }

    
}

class A2 {

    protected int x = 10;
    protected static int z = 20;
    static int j = 21;
}

class B2 extends A2{
    void myM() {
        System.out.println(this.x);
    }
}
