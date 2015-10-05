package com.maggioni.InnerClasses.Package1;

public class InnerClassesDemo1 {

    public static void main(String[] args) {
       new InnerClassesDemo1().test();
    }
    
    void test() {
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic1 = oc.new InnerClass();
        ic1.pri("bla bla bla");
        ic1.yFromInner = ic1.yFromInner+" "+ic1.yFromInner;
        ic1.pri("bla bla bla");
        
        OuterClass.InnerClass ic2 = new OuterClass().new InnerClass();
        ic2.priPublic("da da da");
    }

}
