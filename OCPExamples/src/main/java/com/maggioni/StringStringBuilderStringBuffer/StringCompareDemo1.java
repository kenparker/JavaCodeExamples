package com.maggioni.StringStringBuilderStringBuffer;

public class StringCompareDemo1 {

    public static void main(String[] args) {
        String msg1 = "Paul & Harry's new office";
        StringBuilder sb = new StringBuilder("Harry");
        System.out.println(msg1.contains(sb)); // contains() is available only in String
        
        sb = new StringBuilder("this is a StringBuilder");
        msg1 = "String";
        System.out.println(sb.indexOf(msg1)); // there is no contains() in StringBuilder
    }

}
