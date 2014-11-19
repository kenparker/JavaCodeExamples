package com.maggioni.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * programcreek.com
 */
public class ArraySearchDemo {

    public static void main(String[] args) {

        System.out.println("---- array Search using a small array -----");
        String[] arr = new String[]{"CD", "AB", "A", "ZT", "EF"};
        compareSearch(arr);

        System.out.println("---- array Search using an 1K array -----");
        String[] arr2 = new String[1000];
        Random s = new Random();
        for (int i = 0; i < 1000; i++) {
            arr2[i] = String.valueOf(s.nextInt());

        }
        compareSearch(arr2);
    }

    private static void compareSearch(String[] arr) {
        // use List
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            useList(arr, "A");
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("useList :" + duration / 100000);

        //use set
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            useSet(arr, "A");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useSet :" + duration / 100000);

        //use loop
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            useLoop(arr, "A");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useLoop :" + duration / 100000);

        //use binarySearch
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            useArrayBinarySearch(arr, "A");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("useBinarySearch :" + duration / 100000);
    }

    private static boolean useList(String[] arr, String a) {

        return Arrays.asList(arr).contains(a);
    }

    private static boolean useSet(String[] arr, String a) {

        HashSet<String> set = new HashSet<String>(Arrays.asList(arr));
        return set.contains(a);
    }

    private static boolean useLoop(String[] arr, String a) {
        for (String s : arr) {
            if (s.equals(a)) {
                return true;
            }
        }
        return false;
    }

    private static boolean useArrayBinarySearch(String[] arr, String a) {

        int binarySearch = Arrays.binarySearch(arr, a);
        if (binarySearch > 0) {
            return true;
        } else {
            return false;
        }
    }

}
