package com.maggioni.HaspMap.Programmcreek;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * http://www.programcreek.com/2013/04/frequently-used-methods-of-java-hashmap/
 */
public class SortHashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> countMap = new HashMap<>();
        countMap.put("a", 10);
        countMap.put("b", 20);
        countMap.put("c", 5);

        ValueComparator vc = new ValueComparator(countMap);
        TreeMap<String, Integer> sortedMap = new TreeMap<>(vc);

        sortedMap.putAll(countMap);
        
        printMap(sortedMap);

    }

    public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry) it.next();
            System.out.println(pairs.getKey() + " = " + pairs.getValue());
            
        }
    }
}
