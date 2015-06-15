package com.maggioni.PartI.Exceptions;

public class IllegalArgumentExceptionDemo1 {

    public static void main(String[] args) {
        
    }

    public static int division(int a, int b) {
        IllegalArgumentException ie;
        if (b==0) {
            ie = new IllegalArgumentException("Division by 0");
            throw ie;
        }
        return a/b;
    }
}
