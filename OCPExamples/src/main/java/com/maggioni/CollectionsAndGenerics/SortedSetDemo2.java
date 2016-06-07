package com.maggioni.CollectionsAndGenerics;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo2 {

    public static void main(String[] args) {
        String[] arr = {"dfrt", "ascde", "AAA", "Bc", "bc", "bcdd", "zhtgt", "hzhhh", "fffggg", "tut"};
        
        SortedSet<String> s = new TreeSet<>(Arrays.asList(arr));
        System.out.println(" " + s);        // [AAA, Bc, ascde, bc, bcdd, dfrt, fffggg, hzhhh, tut, zhtgt]
        
        System.out.println(" s.first() " + s.first());  // s.first() AAA
        System.out.println(" s.last()  " + s.last());   // s.last()  zhtgt
        SortedSet<String> headSet = s.headSet("bc");    // "bc" is excluded
        System.out.println(" " + headSet);              // [AAA, Bc, ascde]
        SortedSet<String> tailSet = s.tailSet("tut");   // "tut" is included
        System.out.println(" " + tailSet);              // [tut, zhtgt]
        
        // add elements to sortedset
        s.add("aaa");
        System.out.println(" " + s);        // [AAA, Bc, aaa, ascde, bc, bcdd, dfrt, fffggg, hzhhh, tut, zhtgt]
        System.out.println(" " + headSet);              // [AAA, Bc, aaa, ascde]
        System.out.println(" " + tailSet);              // [tut, zhtgt]
        
        SortedSet<String> subSet = s.subSet("bc", "tut"); // "bc" is included , "tut" is excluded
        System.out.println(" " + subSet);       // [bc, bcdd, dfrt, fffggg, hzhhh]
        
        // add an element to headSet
        headSet.add("A1");
        System.out.println(" " + headSet);              // [A1, AAA, Bc, aaa, ascde]
        // runtime error
        headSet.add("bc1");  // java.lang.IllegalArgumentException: key out of range
        
        
    }

}
