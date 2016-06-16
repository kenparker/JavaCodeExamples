package com.maggioni.InnerClasses.Package2;

import com.maggioni.InnerClasses.Package1.OuterClassDemo1;

public class InnerClassDemo4 extends OuterClassDemo1{

    public static void main(String[] args) {
        
    }

    void doThis() {
        OuterClassDemo1 oc = new OuterClassDemo1();
        super.proteMemb();
        super.p = "p";
    }
}
