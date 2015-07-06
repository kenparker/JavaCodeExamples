package com.maggioni.PartI.Whizlab.Pretest;

public class WorkingWithDataTypesDemo2 {

    public static void main(String[] args) {
        String s = "Java";
        s.concat(" is great");
        s = s.concat(" is great!!");
        System.out.println("s = " + s + " s.length() = " + s.length());
        s = s.replace("Java", "avaJ");
        System.out.println("s = " + s + " s.length() = " + s.length());
    }

}
