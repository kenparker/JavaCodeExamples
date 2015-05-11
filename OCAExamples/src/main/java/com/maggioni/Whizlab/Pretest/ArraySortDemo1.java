package com.maggioni.Whizlab.Pretest;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortDemo1 {

    public static void main(String[] args) {
        String [] stringArray = {"ab", "aB", "c", "0", "2", "1Ad", "a10"};
        printArray(stringArray);
        
        System.out.println("reversing order");
        Arrays.sort(stringArray, Collections.reverseOrder());
        printArray(stringArray);
    }

    private static void printArray(String[] stringArray) {
        for (String stringArray1 : stringArray) {
            System.out.println(stringArray1);
        }
    }
    
}
