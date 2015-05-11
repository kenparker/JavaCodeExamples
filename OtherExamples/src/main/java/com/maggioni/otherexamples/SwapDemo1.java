package com.maggioni.otherexamples;

// http://www.programcreek.com/2011/08/so-java-passes-object-by-reference-or-by-value/
public class SwapDemo1 {

    public static void main(String[] args) {
        Type t1 = new Type();
        Type t2 = new Type();
        System.out.println("t1 = "+t1);
        System.out.println("t2 = "+t2);
        swap(t1, t2);
        System.out.println("t1 = "+t1);
        System.out.println("t2 = "+t2);
    }
    
    public static void swap(Type t1, Type t2) {
        Type temp = t1;
        System.out.println("t1 in swap = "+t1);
        t1 = t2;
        System.out.println("t1 in swap = "+t1);
        t2 = temp;
    }
}

class Type {
    String type;
}
