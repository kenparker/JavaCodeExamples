package com.maggioni.PartI.Whizlab.PracticeTestIII;
class Ab {
    static void meth1(){
        System.out.println("AB");
    }
}
class Cd extends Ab {
    protected static void meth1() {
        System.out.println("CD");
    }
}
public class OverridingStaticDemo1 {

    public static void main(String[] args) {
        Ab ab = new Cd();
        ab.meth1(); // output = AB
        Ab.meth1(); // output = AB
        Cd.meth1(); // output = CD
        
        Cd cd = new Cd();
        cd.meth1(); // output CD
        System.out.println();
        //System.out.print(); do not compile
        //System.out.printf(); do not compile
    }

}
