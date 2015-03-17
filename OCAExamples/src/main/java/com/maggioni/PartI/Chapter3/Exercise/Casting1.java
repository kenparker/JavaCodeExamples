package com.maggioni.PartI.Chapter3.Exercise;

import java.text.DecimalFormat;

public class Casting1 {
    public static void main(String[] args) {
        float   f = 999_234.56F;
        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.println("float is: " + df.format(f));
        System.out.println("float is: " + String.format("%.2f", f));
        short   s = (short) f;
        System.out.println("short is : " + s);
        int     i = (int) f;
        System.out.println("int is :" + i);
        double  d = f;
        System.out.println("double is :" + d);
        System.out.println("double is :" + df.format(d));
        byte    b = (byte) f;
        System.out.println("byte is: " + b);
        
        byte    bb = (byte)128;
        System.out.println("byte : " + bb);
        
        Long lo1 = new Long(33);
        Long lo2 = new Long(22);
        System.out.println(lo1+" "+lo2);
        lo2 = lo1;
        System.out.println(lo1+" "+lo2);
        lo1 = (long) 1;
        System.out.println(lo1+" "+lo2);
    }
    
}
