package com.maggioni.PartI.Whizlab.PracticeTestIII;

public class StringStringBuilderDemo1 {

    public static void main(String[] args) {
        String s = "ABc";
        StringBuilder sb = new StringBuilder("cde");
        s.length();
        sb.length();
        s.concat("ddd");
        s.replace("B", "C");
        sb.replace(2, 3, "d");
        s.substring(1);
        sb.substring(1);
        s.indexOf("A");
        sb.indexOf("A");
        s.toLowerCase();
        s.charAt(1);
        sb.charAt(1);
    }

}
