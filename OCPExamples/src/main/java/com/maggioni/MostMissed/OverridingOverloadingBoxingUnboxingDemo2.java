package com.maggioni.MostMissed;

public class OverridingOverloadingBoxingUnboxingDemo2 {

    void probe(Object x) {
        System.out.println("In Object");
    }

    void probe(Number x) {
        System.out.println("In Number");
    }

    void probe(Integer x) {
        System.out.println("In Integer");
    }

    void probe(Long x) {
        System.out.println("In Long");
    }

    public static void main(String[] args) {
        double d = 10.2;
        OverridingOverloadingBoxingUnboxingDemo2 o = new OverridingOverloadingBoxingUnboxingDemo2();
        o.probe(d); // casted to Double and Double ca be passed to Number
        int[] i = {1,25,36};
        o.probe(i); // casted to Object
        char c = 'v';
        o.probe(c); // casted to Object
        Double double1 = new Double(15.25);
        o.probe(double1); // casted to Number
        
    }

}
