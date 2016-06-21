package com.maggioni.AdvancedClassDesign;

public class ProtectedDemo1 {

    public static void main(String[] args) {
        AnonymusDemo1 ad = new AnonymusDemo1();
        AnonymusDemo1.ProtClass pc = ad.new ProtClass();
        System.out.println(" " + pc.s);
        
    }

}
