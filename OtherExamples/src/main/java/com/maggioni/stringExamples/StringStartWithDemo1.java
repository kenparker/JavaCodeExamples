package com.maggioni.stringExamples;

/**
 *
 * @author magang
 */
public class StringStartWithDemo1 {

    public static void main(String[] args) {
        String s = "Hello over there";
        System.out.println(s.contains("over"));
        System.out.println(s.indexOf("over"));
        System.out.println(s.startsWith("Hello"));
    }
    
}
