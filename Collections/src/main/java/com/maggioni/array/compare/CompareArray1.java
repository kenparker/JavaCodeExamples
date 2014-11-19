package com.maggioni.array.compare;

import java.util.Arrays;

/**
 *
 * http://java67.blogspot.de/2014/05/how-to-compare-two-arrays-in-java-string-int-example.html
 */
public class CompareArray1 {

    public static void main(String args[]) {

        compare1();
        compare2();
        compare3();
    }

    public static void compare1() {

        int[] even = {2, 4, 6};
        int[] meEvenToo = {2, 4, 6};
        int[] odd = {3, 7, 5};

        boolean result = Arrays.equals(even, meEvenToo);

        System.out.printf("Comparing two int arrays %s and %s, are they equal? %s %n", Arrays.toString(even), Arrays.toString(meEvenToo), result);

        result = Arrays.equals(even, odd);
        System.out.printf("Comparing two int arrays %s and %s, are they equal? %s %n", Arrays.toString(even), Arrays.toString(odd), result);

    }

    public static void compare2() {
        String[] numbers = {"one", "two"};
        String[] numeric = {"three", "two"};
        String[] digits = {"one", "Two"};

        boolean result = Arrays.equals(numbers, numeric);
        System.out.printf("Comparing two String arrays %s and %s, are they Equal? %s %n ",
                Arrays.toString(numbers), Arrays.toString(numeric), result);

        result = Arrays.equals(numbers, digits);
        System.out.printf("Comparing two unequal String arrays %s and %s, are they same? %s %n",
                Arrays.toString(numbers), Arrays.toString(digits), result);
    }

    public static void compare3() {
        char[][] abcd = {{'A', 'B'}, {'C', 'D'}};
        char[][] efgh = {{'E', 'F'}, {'G', 'H'}};
        char[][] ABCD = {{'A', 'B'}, {'C', 'D'}};

        boolean result = Arrays.equals(abcd, ABCD);
        System.out.printf("Comparing two dimensional arrays %s and %s in Java, Equal? %s %n ",
                Arrays.deepToString(abcd), Arrays.deepToString(ABCD), result);

        result = Arrays.deepEquals(abcd, ABCD); // using equals() will return false
        System.out.printf("Comparing unequal two dimensional char arrays %s and %s in Java, are they same? %s %n",
                Arrays.deepToString(abcd), Arrays.deepToString(ABCD), result);

    }
}
