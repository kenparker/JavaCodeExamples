package com.maggioni.PartI.Exceptions;

public class ReturnValueFromTryCatchFinallyDemo8 {

    public static void main(String[] args) {
        System.out.println(methodReturningValue());
    }

    public static int methodReturningValue() {
        
        try {
            int i = Integer.parseInt("abc");    // This statement throws NumberFormatException
            return 20;
        } finally {
            System.out.println("Finally");
            return 50; // return discard any unhandled exceptions
        }
    }
}
