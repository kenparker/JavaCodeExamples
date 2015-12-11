package com.maggioni.StringStringBuilderStringBuffer;

import java.util.Arrays;

public class SearchSplittDemo1 {

    public static void main(String[] args) {
       String sequence = "paint-the-cup-cop-an-cup";
       //                 0123456789012345678901234567890
       //                           1         2         3
        String[] split = sequence.split("c.p");
        Arrays.stream(split).forEach(System.out::println);
        split = sequence.split("\\w");
        System.out.println("word char split : "+sequence);
        printArray(split);
        String sequence2 = "th1-cup";
        split = sequence2.split("\\w[-]");
        System.out.println("word char split : "+sequence2);
        printArray(split);
    }

    private static void printArray(String[] split) {
        for (int i = 0; i < split.length; i++) {
            System.out.println("index : "+i+" value : "+split[i]+" length : "+split[i].length());
        }
    }

}
