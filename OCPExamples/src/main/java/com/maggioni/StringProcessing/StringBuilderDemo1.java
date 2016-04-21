package com.maggioni.StringProcessing;

public class StringBuilderDemo1 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(8);
        StringBuilder sb3 = new StringBuilder("8");
        StringBuilder sb2 = new StringBuilder("hallo");
        int i = 8;
        // System.out.println(8+sb1);   // do not compile
        System.out.println(8+sb1.toString());   // compile
        System.out.println(8+i+sb1.toString());     // output -> 16
        System.out.println(8+i+sb3.toString());     // output -> 168
        
    }

}
