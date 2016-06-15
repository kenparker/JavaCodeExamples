package com.maggioni.Boxing;

/*
http://javabeginners.de/Grundlagen/Datentypen/Boxing_und_Unboxing.php
*/
public class WrapperObjectsComparisonDemo1 {

    public static void main(String[] args) {
        Integer m = 1500;
        Integer n = 1500;
        System.out.println(" equals ? " +  (m == n)); // false
        
        /*
        Byte-Wertebereiches (-128 bis 127) 
        */
        m = 15;
        n = 15;
        System.out.println(" equals ? " +  (m == n)); // true
        
        Integer m2 = new Integer(15);
        Integer m3 = new Integer(15);
        System.out.println(" equals ? " +  (m2 == m3)); // false
        
        Integer m4 = m2;
        Integer m5 = m2;
        System.out.println(" equals ? " +  (m4 == m5)); // true
        
    }

}
