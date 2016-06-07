package com.maggioni.Collections.Sets;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetDemo2 {

    public static void main(String[] args) {

        NavigableSet<String> nav = new TreeSet();
        nav.add("Angelo");
        nav.add("angelo");
        nav.add("berta");
        nav.add("aangelo");
        nav.add("Zorro");
        nav.add("zorro");
        System.out.println(""+nav); // [Angelo, Zorro, aangelo, angelo, berta, zorro]
        
        /*
        headSet(E toElement)
        Returns a view of the portion of this set whose elements are '''strictly''' less than toElement.
        */
        SortedSet<String> headSet1 = nav.headSet("angelo");
        System.out.println(""+headSet1);                            // [Angelo, Zorro, aangelo]
        SortedSet<String> headSet2 = nav.headSet("angelo",false);
        System.out.println(""+headSet2);                            // [Angelo, Zorro, aangelo]
        SortedSet<String> headSet3 = nav.headSet("angelo",true);
        System.out.println(""+headSet3);                            // [Angelo, Zorro, aangelo, angelo]
        
        /*
        tailSet(E fromElement)
        Returns a view of the portion of this set whose elements are greater than or equal to fromElement.
        */
        SortedSet<String> tailSet1 = nav.tailSet("berta");
        System.out.println(""+tailSet1);                            // [berta, zorro]
        SortedSet<String> tailSet2 = nav.tailSet("berta",true);
        System.out.println(""+tailSet2);                            // [berta, zorro]
        SortedSet<String> tailSet3 = nav.tailSet("berta",false);
        System.out.println(""+tailSet3);                            // [zorro]
        /*
        SortedSet<String> subSet1 = nav.subSet("berta", "angelo"); // Exception in thread "main" java.lang.IllegalArgumentException: fromKey > toKey
        System.out.println(""+subSet1);
         */
        SortedSet<String> subSet2 = nav.subSet("aangelo", "angelo");
        System.out.println(""+subSet2);                             // [aangelo]
        
        SortedSet<String> subSet3 = nav.subSet("aangelo", true, "angelo", false);
        System.out.println(""+subSet3);                             // [aangelo]
        SortedSet<String> subSet4 = nav.subSet("aangelo", true, "angelo", true);
        System.out.println(""+subSet4);                             // [aangelo, angelo]
        
        
    }

}
