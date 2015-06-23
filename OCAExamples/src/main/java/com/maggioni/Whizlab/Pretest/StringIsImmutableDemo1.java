package com.maggioni.Whizlab.Pretest;

public class StringIsImmutableDemo1 {

    public static void main(String[] args) {
       String s = "String is immutable";
        logString(s);
        
        s = new String("String object");
        logString(s);
        
        s = new String(new char[] {'a','b'});
        logString(s);
        
    }

    private static void logString(String s) {
        System.out.println("String s = " +  s);
        changeString(s);
        System.out.println("String after change is s = " +  s);
    }
    
    static void changeString(String s) {
        s += "String";
    }

}
