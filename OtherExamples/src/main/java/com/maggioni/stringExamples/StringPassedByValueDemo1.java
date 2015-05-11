package com.maggioni.stringExamples;

public class StringPassedByValueDemo1 {

    // http://www.programcreek.com/2013/09/string-is-passed-by-reference-in-java/
    // http://www.programcreek.com/2011/08/so-java-passes-object-by-reference-or-by-value/
    public static void main(String[] args) {
        String x = new String("abc");
        change(x);
        System.out.println(x);  // abc
        
        StringBuilder sb1 = new StringBuilder();
        sb1.append("abc");
        changeSB(sb1);
        System.out.println(sb1);    // cd
    }
    
    public static void change(String x) {
        x = "cd";
    }
    
    public static void changeSB(StringBuilder x) {
        x.replace(0, 3, "cd");
    }
}
