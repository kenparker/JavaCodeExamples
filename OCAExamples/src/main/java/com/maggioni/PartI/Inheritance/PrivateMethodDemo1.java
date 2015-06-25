package com.maggioni.PartI.Inheritance;

class Aaa {
    private int privateInt;
    protected int protectedInt;
    
    private int privMethod() {
        return 11;
    }
    protected int protMethod() {
        return 22;
    }
}
public class PrivateMethodDemo1 extends Aaa{

    public static void main(String[] args) {
        PrivateMethodDemo1 pmd = new PrivateMethodDemo1();
        System.out.println(""+pmd.protectedInt);
        //System.out.println(""+pmd.privateInt); do not compile
        System.out.println(""+pmd.protMethod());
        //System.out.println(""+pmd.privMethod()); do not compile
        
        Aaa aaa = new Aaa();
        int a = aaa.protectedInt;

    }

}
