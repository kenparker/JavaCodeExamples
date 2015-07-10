package com.maggioni.PartI.Casting;
/*
http://openbook.rheinwerk-verlag.de/javainsel9/javainsel_09_002.htm
*/

public class AutoBoxingIntegerDemo1 {

    public static void main(String[] args) {
        int i = 4711;
        Integer j = i; // compiler box Integer.valueOf(i)
        System.out.println(i == j);
        System.out.println(i == j.intValue());
        int k = j;  // compiler box j.intValue();
        Integer j2 = Integer.valueOf(i);
        k = j2.intValue();
        
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println("i1 >= i2 :" + (i1 >= i2)); // compiler does unboxing automatically
        System.out.println("i1 == i2 :" + (i1 == i2)); // compare two objects
        System.out.println("i1.equals(i2) :" + (i1.equals(i2)));
        System.out.println("i1.intValue() == i2.intValue() :" + (i1.intValue() == i2.intValue()));
        
        Integer n1 = new Integer(10);
        Integer n2 = Integer.valueOf(10);
        Integer n3 = 10;
        Integer n4 = 10;
        System.out.println("n1 == n2 : "+  (n1 == n2));
        System.out.println("n3 == n2 : "+  (n3 == n2));
        System.out.println("n1 == n3 : "+  (n1 == n3));
        System.out.println("n3 == n4 : "+  (n4 == n3));
    }

}
