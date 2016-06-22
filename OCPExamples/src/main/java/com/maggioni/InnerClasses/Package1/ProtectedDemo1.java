package com.maggioni.InnerClasses.Package1;

import com.maggioni.InnerClasses.Package1.AnonymusDemo2;

public class ProtectedDemo1 {

    public static void main(String[] args) {
        AnonymusDemo2 ad = new AnonymusDemo2();
        AnonymusDemo2.ProtClass pc = ad.new ProtClass();
        System.out.println(" " + pc.s);
        
    }

}
