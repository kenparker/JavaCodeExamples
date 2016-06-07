package com.maggioni.CollectionsAndGenerics;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo1 {

    public static void main(String[] args) {
        
        String[] arr = {"dfrt", "ascde", "AAA", "Bc", "bc", "bcdd", "zhtgt", "hzhhh", "fffggg", ""};
        
        SortedSet<String> s = new TreeSet<>(Arrays.asList(arr));
        System.out.println("" +  s);    // [, AAA, Bc, ascde, bc, bcdd, dfrt, fffggg, hzhhh, zhtgt]
        
        // add operations
        s.add("h");
        System.out.println("" +  s);    // [, AAA, Bc, ascde, bc, bcdd, dfrt, fffggg, h, hzhhh, zhtgt]
        
        arr[9] = "new";
        List<String> listOfStrings = Arrays.asList(arr);
        System.out.println(""+ listOfStrings);  // [dfrt, ascde, AAA, Bc, bc, bcdd, zhtgt, hzhhh, fffggg, new]
        // arr[9] = "new" not changed from the SortedSet
        System.out.println("" +  s);            // [, AAA, Bc, ascde, bc, bcdd, dfrt, fffggg, hzhhh, zhtgt]
    }

}
