package com.maggioni.Whizlab.Pretest;

public class ArrayDemo2 {

    public static void main(String[] args) {
        Object c = new long[4];
        //Object[] d = new long[4];  // do not compile
        //long[] d = new long[4];   // compile
        for (long h : (long[])c) {
            System.out.println(h);
        }
        
        Object[] f = new Long[4];
        for (Object f1 : f) {
            System.out.println(f1);
        }
        Object[] e = new String[4];
        for (Object e1 : e) {
            
        }
        Object g = new String[4];
        for (Object e1 : (Object[])g) {
            
        }
    }

}
