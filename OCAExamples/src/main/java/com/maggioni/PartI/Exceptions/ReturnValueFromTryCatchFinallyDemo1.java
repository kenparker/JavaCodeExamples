package com.maggioni.PartI.Exceptions;

public class ReturnValueFromTryCatchFinallyDemo1 {

    public static void main(String[] args) {
        System.out.println(methodReturningValue());
    }

    public static int methodReturningValue() {
        try {
            // do something
        } catch (Exception e) {
        } finally {
            System.out.println("Finally");
        }
        return 11;
    }
}
