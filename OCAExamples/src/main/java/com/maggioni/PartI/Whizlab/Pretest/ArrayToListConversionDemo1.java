package com.maggioni.PartI.Whizlab.Pretest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConversionDemo1 {

    public static void main(String[] args) {

        // http://www.tutorialspoint.com/java/util/arrays_aslist.htm
        String[] a = new String[]{"abb", "bvf", "ee", "fres"};
        List list1 = Arrays.asList(a);
        System.out.println("the list is :" + list1);
        System.out.println("the list.size() is :" + list1.size());

        System.out.println("");
        int[] intArray = new int[]{15, 24, 1, 2};
        System.out.println("intArray.length : " + intArray.length);
        List<int[]> asList = Arrays.asList(intArray); // conversion from Array to List
        System.out.println("asList size :" + asList.size());

        // http://stackoverflow.com/questions/1073919/how-to-convert-int-into-listinteger-in-java
        int[] intArray2 = new int[]{15, 24, 1, 2};
        List asList2 = Arrays.asList(intArray2);
        System.out.println("asList2 size :" + asList2.size());
        System.out.println("asList2 is :" + asList2.toString());

        // http://javarevisited.blogspot.de/2011/06/converting-array-to-arraylist-in-java.html
        List<String> list2 = new ArrayList(5);
        list2.add("AA");
        list2.add("1222A");
        list2.add("Bcder");
        list2.add("rdftt");
        list2.add("ztgf");
        System.out.println(list2);

        String[] toArray2 = list2.toArray(new String[0]);
        printArray(toArray2);
        String[] toArray22 = list2.toArray(new String[list2.size()]);
        String[] toArray3 = list2.toArray(new String[]{});

    }

    public static void printArray(Object[] array) {
        for (Object array1 : array) {
            System.out.println(array1.toString());
        }
    }
}
