package com.maggioni.StringStringBuilderStringBuffer;

import java.util.StringTokenizer;

public class FormattingDemo4 {

    public static void main(String[] args) {
        System.out.printf("%s %b %d \n",new StringBuilder("Hello"), "false", 123456); // %s call the toString() method
        System.out.format("%s %b %d \n",new StringBuilder("Hello"), "false", 123456); // toString() return a String Object
        System.out.format("%s %b %d \n",new StringTokenizer("Hello"), "false", 123456); // toString() return something like java.util.StringTokenizer@14991ad
        System.out.printf("%s %b %d \n",new String("Hello"), "false", 123456);
        System.out.printf("%s %b %d \n",("Hello"), "false", 123456);
    }

}
