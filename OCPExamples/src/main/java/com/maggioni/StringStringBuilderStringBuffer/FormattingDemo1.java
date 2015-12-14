package com.maggioni.StringStringBuilderStringBuffer;

public class FormattingDemo1 {

    public static void main(String[] args) {
        String name ="hello";
        Integer i = null;
        Boolean b = true;
        System.out.printf(" name %b, age %b, boolean %b \n", name, i,b);
        name = null;
        i = 10;
        System.out.printf(" name %b, age %b, boolean %b \n", name, i,b);
        
    }

}
