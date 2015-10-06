package com.maggioni.InnerClasses.Package2;

import com.maggioni.InnerClasses.Package1.OuterClass;

public class InnerClassDemo4 extends OuterClass{

    public static void main(String[] args) {
        
    }

    void doThis() {
        OuterClass oc = new OuterClass();
        super.proteMemb();
        super.p = "p";
    }
}
