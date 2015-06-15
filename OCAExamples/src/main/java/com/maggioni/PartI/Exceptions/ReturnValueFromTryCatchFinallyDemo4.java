package com.maggioni.PartI.Exceptions;

public class ReturnValueFromTryCatchFinallyDemo4 {

    public static void main(String[] args) {
        System.out.println(methodReturningValue());
    }

    public static int methodReturningValue() {
        try {
            // do something
            throw new IllegalArgumentException("Test");
            
        } catch (NumberFormatException e)  {
            System.out.println("NumberFormatException catch");
            return 11;
        } finally {
            // IllegalArgumentException is not catched an NOT PROPAGATED because of return
            System.out.println("Finally");
        }
    }
}
