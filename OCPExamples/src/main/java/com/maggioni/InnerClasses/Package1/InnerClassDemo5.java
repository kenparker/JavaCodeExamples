package com.maggioni.InnerClasses.Package1;

import com.maggioni.InnerClasses.Package1.OuterClassDemo2.InnerStaticClass1;
import com.maggioni.InnerClasses.Package1.OuterClassDemo2.InnerStaticClass2;
import com.maggioni.InnerClasses.Package1.OuterClassDemo2.InnerStaticClass3;

public class InnerClassDemo5 {

    public static void main(String[] args) {
        
        OuterClassDemo2.InnerStaticClass1 o1 = new OuterClassDemo2.InnerStaticClass1();
        System.out.println("o1.innerclassMethod1() : " + o1.innerclassMethod1()); // 100
        System.out.println("o1.staticIntValue  : " + o1.staticIntValue); // 2000
        
        InnerStaticClass1 o2 = new InnerStaticClass1();
        System.out.println("o2.innerclassMethod2() : " + o2.innerclassMethod2()); // 2000
        System.out.println("o2.innerclassMethod3() : " + o2.innerclassMethod3()); // 1000
        
        InnerStaticClass2 o3 = new InnerStaticClass2();
        
        OuterClassDemo2.InnerStaticClass3 o4 = new InnerStaticClass3();
        
        OuterClassDemo2.staticMethod4();
        
    }

}
