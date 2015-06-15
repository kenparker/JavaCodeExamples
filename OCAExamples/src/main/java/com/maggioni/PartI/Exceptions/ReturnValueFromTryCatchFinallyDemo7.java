package com.maggioni.PartI.Exceptions;

public class ReturnValueFromTryCatchFinallyDemo7 {

    public static void main(String[] args) {
        System.out.println(methodReturningValue());
    }

    public static int methodReturningValue() {
        int i;
        try {
            // do something
            i = 10;
            return i;           
        } catch (NumberFormatException e)  {
            i = 20;
            return i;
        } finally {
            System.out.println("Finally");
            i = 30;
        }
        //return i; // Return 10
    }
}
