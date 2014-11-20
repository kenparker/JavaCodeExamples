package com.maggioni.comparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * http://www.programcreek.com/2011/12/examples-to-demonstrate-comparable-vs-comparator-in-java/
 */
public class HDTVComparatorExample {

    public static void main(String[] args) {
        HDTV tv1 = new HDTV(60, "Samsung");
        HDTV tv2 = new HDTV(55, "Sony");
        HDTV tv3 = new HDTV(42, "Panasonic");

        ArrayList<HDTV> al = new ArrayList<>();
        al.add(tv3);
        al.add(tv2);
        al.add(tv1);
        
        System.out.println("List unsorted:");
        printHDTV(al);
        
        Collections.sort(al, new HDTVSizeComparator());

        System.out.println("List sorted by Size:");
        printHDTV(al);
        
        Collections.sort(al, new HDTVBrandComparator());
        
        System.out.println("List sorted by Name:");
        printHDTV(al);
        
    }

    private static void printHDTV(ArrayList<HDTV> al) {
        for (HDTV a : al) {
            System.out.println("Size="+a.getSize()+" Brand=" + a.getBrand());
        }
    }

}
