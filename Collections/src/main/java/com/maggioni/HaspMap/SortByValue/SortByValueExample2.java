package com.maggioni.HaspMap.SortByValue;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * http://www.programcreek.com/2013/03/java-sort-map-by-value/
 */
public class SortByValueExample2 {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 50);
        map.put("z", 1);
        map.put("t", 100);
        System.out.println("unordered map-" + map);

        Map sortedMap = sortByValue(map);
        System.out.println("sorted map-" + sortedMap);

    }

    public static Map sortByValue(Map unsortedMap) {

        List list = new LinkedList(unsortedMap.entrySet());

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        Map sortedMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

}
