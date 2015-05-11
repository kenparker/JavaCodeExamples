package com.maggioni.stringExamples;

public class StringQuestion78 {

    public static void main(String[] args) {
        String a = new String("abc");
        String b = a;
        System.out.println(Integer.toHexString(System.identityHashCode(b)));
        System.out.println(b.hashCode());
        f(b);
        b+="fg";
        System.out.println(a+" "+b);
    }

    private static void f(String b) {
        System.out.println(Integer.toHexString(System.identityHashCode(b)));
        //System.out.println(b.hashCode());
        b+="de";        // new b object is created
        System.out.println(Integer.toHexString(System.identityHashCode(b)));
        b=null;
        System.out.println(Integer.toHexString(System.identityHashCode(b)));
    }
    
}
