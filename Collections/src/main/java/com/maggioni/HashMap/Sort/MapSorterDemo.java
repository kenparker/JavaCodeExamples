package com.maggioni.HashMap.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * http://java67.blogspot.sg/2014/04/how-to-sort-map-in-java-with-example.html
 */
public class MapSorterDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Unsorted Integer to String Map
        Map<Integer, String> idToName = new HashMap<>();
        idToName.put(1001, "Joe");
        idToName.put(1003, "Kevin");
        idToName.put(1002, "Peter");
        idToName.put(1005, "Johnson");
        idToName.put(1004, "Ian");

        System.out.println("unsorted map : " + idToName);

        // Sorting Map by keys
        TreeMap<Integer, String> sorted = new TreeMap<>(idToName);
        System.out.println("sorted map : " + sorted);

        // If you want to process Map in sorted order of keys
        // then you can keep an unsorted Map, but take the
        // keyset and sort them, before processing
        Set<Integer> ids = idToName.keySet();
        System.out.println("unsorted keys of map : " + ids);

        List<Integer> sortedIds = new ArrayList<>(ids);
        Collections.sort(sortedIds);
        System.out.println("sorted keys of map : " + sortedIds);
        
        Comparator comp = Collections.reverseOrder();
        Collections.sort(sortedIds,comp);
        System.out.println("sorted keys of map (descending) : " + sortedIds);
        
    }

}
