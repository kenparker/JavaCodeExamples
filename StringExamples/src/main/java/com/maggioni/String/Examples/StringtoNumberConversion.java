package com.maggioni.String.Examples;

/**
 *
 * http://javarevisited.blogspot.sg/2011/08/convert-string-to-integer-to-string.html
 */
public class StringtoNumberConversion {

    public static void main(String[] args) {

        int i = Integer.valueOf("00000081");
        System.out.println("The valuue is :" + i);

        i = Integer.parseInt("00000081");
        System.out.println("The valuue is :" + i);

        // will throw NumberFormatException as String is not a number
        String s = "aaaa";
        try {
            i = Integer.parseInt(s);
            System.out.println("The valuue is :" + i);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("The string :" + s + " is not a number");
        }
    }

}
