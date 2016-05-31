package com.maggioni.MostMissed;

public class OverridingOverloadingBoxingUnboxingDemo3 {

    void probe(Integer... x) {
        System.out.println("In int");
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
        OverridingOverloadingBoxingUnboxingDemo3 o = new OverridingOverloadingBoxingUnboxingDemo3();
        o.probe(d); // casted to Double and Double ca be passed to Number
        int[] i = {1,25,36};
        //o.probe(i); // do not compile, it is not casted to Integer ...
        char c = 'v';
        //o.probe(c); // do not compile
        Double double1 = new Double(15.25);
        o.probe(double1); // casted to Number
        
    }

}
