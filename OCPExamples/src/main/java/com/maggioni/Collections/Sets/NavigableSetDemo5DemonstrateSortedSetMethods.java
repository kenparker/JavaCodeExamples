package com.maggioni.Collections.Sets;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetDemo5DemonstrateSortedSetMethods {

    public static void main(String[] args) {
        
        Integer[] arr = {5,10,15,20,200,350};
        
        NavigableSet<Integer> navset = new TreeSet<>(Arrays.asList(arr));
        
        SortedSet<Integer> headSet1 = navset.headSet(16);   // the returnvalue can be only SortedSet
        NavigableSet<Integer> headSet2 = navset.headSet(16,true);
        
        /*
        the least element higher or equal then . . . 
        */
        System.out.println(" " +  headSet2);
        System.out.println(" ceiling :");
        System.out.println(" " + headSet2.ceiling(4));      // 5
        System.out.println(" " + headSet2.ceiling(5));      // 5
        System.out.println(" " + headSet2.ceiling(14));     // 15
        System.out.println(" " + headSet2.ceiling(15));     // 15
        System.out.println(" " + headSet2.ceiling(16));     // null
        System.out.println(" " + headSet2.ceiling(headSet2.first()));     // 5
        System.out.println(" " + headSet2.ceiling(headSet2.last()));     // 15
        
        /*
        the least element strichtly higher then . . .
        */
        System.out.println(" higher :");
        System.out.println(" " + headSet2.higher(4));      // 5
        System.out.println(" " + headSet2.higher(5));      // 10
        System.out.println(" " + headSet2.higher(14));     // 15
        System.out.println(" " + headSet2.higher(15));     // null
        System.out.println(" " + headSet2.higher(16));     // null
        System.out.println(" " + headSet2.higher(headSet2.first()));     // 10
        System.out.println(" " + headSet2.higher(headSet2.last()));     // null
        
        /*
        the greatest element lower or equal then . . . 
        */
        System.out.println(" floor :");
        System.out.println(" " + headSet2.floor(4));      // null
        System.out.println(" " + headSet2.floor(5));      // 5
        System.out.println(" " + headSet2.floor(14));     // 10
        System.out.println(" " + headSet2.floor(15));     // 15
        System.out.println(" " + headSet2.floor(16));     // 15
        System.out.println(" " + headSet2.floor(headSet2.first()));     // 5
        System.out.println(" " + headSet2.floor(headSet2.last()));     // 15
        
        /*
        the greatest element lower then . . . 
        */
        System.out.println(" lower :");
        System.out.println(" " + headSet2.lower(4));      // null
        System.out.println(" " + headSet2.lower(5));      // null
        System.out.println(" " + headSet2.lower(14));     // 10
        System.out.println(" " + headSet2.lower(15));     // 10
        System.out.println(" " + headSet2.lower(16));     // 15
        System.out.println(" " + headSet2.lower(headSet2.first()));     // null
        System.out.println(" " + headSet2.lower(headSet2.last()));     // 10
    }

}
