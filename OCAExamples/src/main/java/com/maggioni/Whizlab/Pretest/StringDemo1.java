package com.maggioni.Whizlab.Pretest;

public class StringDemo1 {

    public static void main(String[] args) {
       String s1 = "abc";
       String s2 = "abcd";
        System.out.println(" : " +  (s1 == null ? s2 == null : s1.equals(s2)));
        boolean c = s1.equals(s2);
        
        System.out.println(" exp : " +  ( s1 =="abc" ? (s2 == "abcd" ? "b" : "c") : "a"));
        
        String replace = s1.replace('a', 'c');
        System.out.println(""+replace);
        replace = s1.replace("bc", "de");
        System.out.println(""+replace);
        
    }

}
