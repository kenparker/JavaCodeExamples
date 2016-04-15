package com.maggioni.MostDifficults;

import com.maggioni.SelfTest.AA;

public class ProtectedMemberDemo1 extends com.maggioni.SelfTest.AA{

    public ProtectedMemberDemo1() {
    }

    public ProtectedMemberDemo1(ProtectedMemberDemo1 p) {
        this.i = p.i;       // ok
    }
    
    /* DO NOT compile, Error: i has a protected access in a
    public void process(AA aa) {
    aa.i = aa.i*2;
    }
    */

    /*
    compile no problem
    */
    public void process(ProtectedMemberDemo1 aa) {
    aa.i = aa.i*2;
    }
    
    public static void main(String[] args) {
        /*
        */
        AA aa = new AA();
        System.out.println(aa.getI()); // print 10
        ProtectedMemberDemo1 p1 = new ProtectedMemberDemo1();
        p1.process(p1);
        System.out.println(p1.getI()); // print 20
        ProtectedMemberDemo1 p2 = new ProtectedMemberDemo1(p1); // i = 20
        p2.process(p2);
        System.out.println(p2.getI()); // print 40
    }

}
