package com.maggioni.PartI.Exceptions;

public class ReturnValueFromTryCatchFinallyDemo6 {

    public static void main(String[] args) {
        System.out.println(methodReturningValue());
    }

    public static int methodReturningValue() {
        int i;
        try {
            // do something
            i = 10;
            //throw new NumberFormatException();
            return i;           
        } catch (NumberFormatException e)  {
            i = 20;
            //return i;
        } finally {
            System.out.println("Finally");
            i = 30;
        }
        return i; // Return 10
    }
}
