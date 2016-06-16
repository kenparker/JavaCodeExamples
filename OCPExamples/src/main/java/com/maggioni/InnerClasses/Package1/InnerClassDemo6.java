package com.maggioni.InnerClasses.Package1;

public class InnerClassDemo6 extends OuterClassDemo2{

    public static void main(String[] args) {
        InnerStaticClass1 ic1 = new InnerStaticClass1();
        System.out.println("ic1.innerclassMethod2() " +  ic1.innerclassMethod2()); // 2000
        System.out.println("ic1.innerclassMethod3() " +  ic1.innerclassMethod3()); // 1000
        System.out.println("staticIntValue " +  staticIntValue); // 1000
        System.out.println("ic1.staticIntValue " +  ic1.staticIntValue); // 2000
        System.out.println("InnerStaticClass1.staticIntValue " +  InnerStaticClass1.staticIntValue); // 2000
    }

}
