package com.maggioni.Collections.Sets;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetDemo3 {

    public static void main(String[] args) {
        String[] arr = {"dfrt", "ascde", "AAA", "Bc", "bc", "bcdd", "zhtgt", "hzhhh", "fffggg", "tut"};
        
        NavigableSet<String> s = new TreeSet<>(Arrays.asList(arr));
        System.out.println(" " + s);        // [AAA, Bc, ascde, bc, bcdd, dfrt, fffggg, hzhhh, tut, zhtgt]
        
        System.out.println(" s.first() " + s.first());  // s.first() AAA
        System.out.println(" s.last()  " + s.last());   // s.last()  zhtgt
        SortedSet<String> headSet1 = s.headSet("bc");    // "bc" is excluded
        // the headSet(x,y) method is not available in SortedSet
        NavigableSet<String> headSet2 = s.headSet("bc", true); // "bc" is INCLUDED
        System.out.println(" " + headSet1);              // [AAA, Bc, ascde]
        System.out.println(" " + headSet2);              // [AAA, Bc, ascde, bc]
        SortedSet<String> tailSet = s.tailSet("tut");   // "tut" is included
        System.out.println(" " + tailSet);              // [tut, zhtgt]
        
        // add elements to sortedset
        s.add("aaa");
        System.out.println(" " + s);        // [AAA, Bc, aaa, ascde, bc, bcdd, dfrt, fffggg, hzhhh, tut, zhtgt]
        System.out.println(" " + headSet1);              // [AAA, Bc, aaa, ascde]
        System.out.println(" " + tailSet);              // [tut, zhtgt]
        
        SortedSet<String> subSet1 = s.subSet("bc", "tut"); // "bc" is included , "tut" is excluded
        NavigableSet<String> subSet2 = s.subSet("bc", true, "tut", true);
        System.out.println(" " + subSet1);       // [bc, bcdd, dfrt, fffggg, hzhhh]
        System.out.println(" " + subSet2);       // [bc, bcdd, dfrt, fffggg, hzhhh, tut]
    }

}
