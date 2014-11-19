package com.maggioni.array;

/**
 * http://www.programmersbase.net/Content/Java/Content/Tutorial/Java/Array.htm#0702
 * @author maggioni
 */
public class ArrayCopy {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] copy = {0, 0, 0, 0, 0};

        System.arraycopy(array, 0, copy, 0, 3);

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}
