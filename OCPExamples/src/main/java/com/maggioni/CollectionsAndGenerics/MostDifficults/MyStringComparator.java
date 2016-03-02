package com.maggioni.CollectionsAndGenerics.MostDifficults;

import java.util.Arrays;
import java.util.Comparator;

/*
 classified as Easy but I got it wrong :-(
 */
public class MyStringComparator implements Comparator {

    static String[] sa = {"aaaa", "bbb", "a"};

    public static void main(String[] args) {
        printArray();
        System.out.println("Arrays.binarySearch(sa, \"cc\", new MyStringComparator()) "+ Arrays.binarySearch(sa, "cc", new MyStringComparator()));
        
        Arrays.sort(sa);
        printArray();
        System.out.println("Arrays.binarySearch(sa, \"cc\", new MyStringComparator()) "+ Arrays.binarySearch(sa, "cc", new MyStringComparator()));
        
        Arrays.sort(sa, new MyStringComparator());
        printArray();
             
        Arrays.sort(sa, new MyStringComparator().reversed());
        printArray();
    }

    private static void printArray() {
        System.out.println("\nprint Array:");
        for (String s : sa) {
            System.out.println(s);        
        }
    }

    @Override
    public int compare(Object o1, Object o2) {
        int s1 = ((String) o1).length();
        int s2 = ((String) o2).length();
        return s1 - s2;
    }

}
