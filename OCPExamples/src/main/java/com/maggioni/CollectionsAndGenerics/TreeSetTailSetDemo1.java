package com.maggioni.CollectionsAndGenerics;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTailSetDemo1 {

    public static void main(String[] args) {
        TreeSet<Integer> treeset = new TreeSet<>();
        treeset.add(14);
        boolean add1 = treeset.add(1); // true
        boolean add2 = treeset.add(1); // false
        System.out.println("added ? " + add1 + " " + add2);
        treeset.add(4);
        treeset.add(5);
        treeset.add(45);
        treeset.add(114);
        treeset.add(423);
        System.out.println(" size : " + treeset.size());
        final NavigableSet<Integer> tailSet = treeset.tailSet(5, true); // all element greter then or equal to depending of true/false
        NavigableSet<Integer>       headSet = treeset.headSet(5, true); // all elements less then or equal to depending of true/false
        Integer lower = treeset.lower(4);
        System.out.println(" tailset :" + tailSet);
        System.out.println(" headset :" + headSet);
        System.out.println(" " + lower);
        
        // element added to the backed set is also seen in the tailSet
        treeset.add(500);
        System.out.println(" tailset :" + tailSet);
        
        // will throw "java.lang.IllegalArgumentException: key out of range"
        //tailSet.add(4);
    }

}
