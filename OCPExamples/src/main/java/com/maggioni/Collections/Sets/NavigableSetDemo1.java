package com.maggioni.Collections.Sets;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(600);
        list.add(456);
        list.add(46);
        list.add(146);
        list.add(461);
        list.add(400);
        list.add(6);
        list.add(6); // not duplicated in TreeSet
        // NavigableSet<String> navSet = new TreeSet<>(list); // do not work NavigableSet<String> not compatible with List<Integer>
        NavigableSet<Integer> navSet = new TreeSet<>(list);
        for (Integer navSet1 : navSet) {
            System.out.println(""+navSet1);
            /* output is: 
            4
            5
            6
            46
            146
            400
            456
            461
            600
            */
        }
        /*
        public E ceiling(E e)
        Description copied from interface: NavigableSet
        Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
        
        public E higher(E e)
        Description copied from interface: NavigableSet
        Returns the least element in this set '''strictly''' greater than the given element, or null if there is no such element.
        */
        System.out.println("navSet.ceiling(50) : "+ navSet.ceiling(50));    // 146
        System.out.println("navSet.higher(50))) : "+ navSet.higher(50));    // 146
        
        System.out.println("navSet.floor(50)) : "+ navSet.floor(50));       // 46
        System.out.println("navSet.lower(50)) : "+ navSet.lower(50));       // 46
        System.out.println("navSet.floor(46)) : "+ navSet.floor(46));       // 46
        System.out.println("navSet.lower(46)) : "+ navSet.lower(46));       // 6
        
        System.out.println("navSet.ceiling(146) : "+ navSet.ceiling(146));  // 146
        System.out.println("navSet.higher(146) : "+ navSet.higher(146));    // 400
        
        System.out.println("navSet.first() : "+ navSet.first());    // 4
        System.out.println("navSet.last() : "+ navSet.last());      // 600
        /*
        gegentailige 
        
        higher() <-> lower()
        cealing() <-> floor()
        */
        
        list.add(5555);
        list.add(44);
        list.add(33);
        for (Integer navSet1 : navSet) {
            System.out.println(""+navSet1);
            /* output is: 
            4
            5
            6
            */
            /*
            new elements not in the NavigableSet
            */
        }
    }

}
