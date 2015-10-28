package com.maggioni.JavaClassDesign;

public class HashCodeEqualsDemo1 {

    public static void main(String[] args) {
        int x = 0;
        X x1 = new X("A", "B");
        X x2 = new X("C", "B");
        X x3 = new X("AAAA", "BBBBB");
        X x4 = new X("AAAA", "B");
        X x5 = new X("A", "B");
        X x6 = new X("A", "B");
        X x7 = new X("A", "B");
        X x8 = new X("A", "B");
        
        /*
        the contract is:
            if two objects are equals() then the hashCode() must be equal
            if two objects are not equal, it is not required, that the hascode is not equal
            if two objects hashCode() is not equal, then the equals() must also not be equal
            if two objects hashCode() is equal, the the equals() may or may not be equal
        */
        
        System.out.println("test x1 abd x2 : "+( 
                (x1.hashCode() != x2.hashCode()) && (!x1.equals(x2))) );
        System.out.println("test x2 abd x4 : "+( 
                (!x3.equals(x4) && ((x3.hashCode() == x4.hashCode()) || (x3.hashCode() != x4.hashCode()) ) )) );
        if (x1.hashCode() != x2.hashCode()) x = x + 1;
        
        
        System.out.println("x = "+x);
        
        
    }

}
