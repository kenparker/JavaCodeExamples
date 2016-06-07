package com.maggioni.Collections.Sets;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo4 {

    public static void main(String[] args) {
        String[] arr = {"dfrt", "ascde", "AAA", "Bc", "bc", "bcdd", "zhtgt", "hzhhh", "fffggg", "tut"};
        
        NavigableSet<String> s = new TreeSet<>(Arrays.asList(arr));
        System.out.println(" " + s);        // [AAA, Bc, ascde, bc, bcdd, dfrt, fffggg, hzhhh, tut, zhtgt]
        
        System.out.println("s.pollFirst() " +  s.pollFirst());
        System.out.println(" " + s);              // [Bc, ascde, bc, bcdd, dfrt, fffggg, hzhhh, tut, zhtgt]
        NavigableSet<String> descendingSet = s.descendingSet();
        System.out.println(" " + descendingSet);  // [zhtgt, tut, hzhhh, fffggg, dfrt, bcdd, bc, ascde, Bc]
        
    }

}
