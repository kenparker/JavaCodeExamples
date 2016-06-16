package com.maggioni.InnerClasses.Package1;

public class InnerClassesDemo1 {

    public static void main(String[] args) {
       new InnerClassesDemo1().test();
    }
    
    void test() {
        OuterClassDemo1 oc = new OuterClassDemo1();
        OuterClassDemo1.ProtectedInnerClass ic1 = oc.new ProtectedInnerClass();
        ic1.pri("come va?    bla bla bla");
        
        System.out.println("");
        System.out.println("");
        ic1.yFromInner = ic1.yFromInner+" "+ic1.yFromInner+" "+ic1.zFromInner;
        ic1.pri("bla bla bla");
        ic1.priPublic("bla bla bla");
        
        System.out.println("");
        OuterClassDemo1.ProtectedInnerClass ic2 = new OuterClassDemo1().new ProtectedInnerClass();
        ic2.priPublic("da da da");
    }

}
