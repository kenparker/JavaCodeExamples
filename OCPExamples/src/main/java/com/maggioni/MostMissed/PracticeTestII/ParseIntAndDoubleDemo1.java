package com.maggioni.MostMissed.PracticeTestII;

public class ParseIntAndDoubleDemo1 {

    public static void main(String[] args) {
        System.out.println("Integer.parseInt(\"12345\") " + Integer.parseInt("12345"));
        //System.out.println("Integer.parseInt(\"12345\") " + Integer.parseInt("123.45")); // java.lang.NumberFormatException: For input string: "123.45"
        //System.out.println("Integer.parseInt(\"12345\") " + Integer.parseInt("123,45"));    // java.lang.NumberFormatException: For input string: "123,45"
        //System.out.println("Integer.parseInt(\"12345\") " + Integer.parseInt("a12345"));    // java.lang.NumberFormatException: For input string: "a12345"
        
        System.out.println("Double.parseDouble(\"123458.33\") "+  Double.parseDouble("123458.33"));
        //System.out.println("Double.parseDouble(\"123458.33\") "+  Double.parseDouble("123,458.33"));    // java.lang.NumberFormatException: For input string: "123,458.33"
        //System.out.println("Double.parseDouble(\"123458.33\") "+  Double.parseDouble("123458,33")); // java.lang.NumberFormatException: For input string: "123458,33"
    }

}
