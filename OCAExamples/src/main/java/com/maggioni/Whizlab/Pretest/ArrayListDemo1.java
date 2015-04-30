package com.maggioni.Whizlab.Pretest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();    // initial capacity is 10
        System.out.println("array size :"+arr.size());
        List li = new ArrayList(2);     // new ArrayList with initial capacity = 2
        List l2 = new ArrayList(li);    // new ArrayList based on the li
        
        // http://www.tutorialspoint.com/java/util/arrays_aslist.htm
        String[] a = new String[] {"abb","bvf","ee","fres"};
        List list1 = Arrays.asList(a);
        System.out.println("the list is :" + list1);
        System.out.println("the list.size() is :"+ list1.size());
        
        System.out.println("");
        int[] intArray = new int[] {15,24,1,2};
        System.out.println("intArray.length : "+intArray.length);
        List<int[]> asList = Arrays.asList(intArray); // conversion from Array to List
        System.out.println("asList size :" + asList.size());
        
        // http://stackoverflow.com/questions/1073919/how-to-convert-int-into-listinteger-in-java
        int[] intArray2 = new int[] {15,24,1,2};
        List asList2 = Arrays.asList(intArray2);
        System.out.println("asList2 size :" + asList2.size());
        System.out.println("asList2 is :" + asList2.toString());
        
        
        // http://javarevisited.blogspot.de/2011/06/converting-array-to-arraylist-in-java.html
        Object[] toArray = asList.toArray();    // conversion from List to Array
        printArray(toArray);
        List[] toArray1 = asList.toArray(new List[]{}); // conversion from List to Array defining Type
        Integer[] toArray2 = asList.toArray(new Integer[0]);
        Integer[] toArray22 = asList.toArray(new Integer[asList.size()]);
        Integer[] toArray3 = asList.toArray(new Integer[]{});
        
        Integer[] integerArray = new Integer[] {15,24,1,2};
        
    }

    public static void printArray(Object[] array) {
        for (Object array1 : array) {
            System.out.println(array1.toString());
        }
    }
}
