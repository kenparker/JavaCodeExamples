package com.maggioni.PartI.Exceptions;

public class NumberFormatExceptionDemo1 {

    public static void main(String[] args) {
        String s = "two";
        TryParseInt(s);
        s = "2";
        TryParseInt(s);
    }

    private static int TryParseInt(String s) {
        int i = 0;
        try {
            i = Integer.parseInt(s);
        } catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
        } finally {
            System.out.println(" i = " +  i);
            return i;
        }

    }

}
