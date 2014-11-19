package com.maggioni.HaspMap.SortByValue;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


/**
 * 
 * http://www.programcreek.com/2013/03/java-sort-map-by-value/
 */
public class SortByValueExample1 {

    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 50);
        map.put("z", 1);
        map.put("t", 100);
        System.out.println("unordered map-"+map);
        
        Map sortedMap = sortByValue(map);
        System.out.println("sorted map-"+sortedMap);
        
    }
    
    public static Map sortByValue(Map unsortedMap) {
    
        ValueComparator vc = new ValueComparator(unsortedMap);
        Map sortedMap = new TreeMap(vc);
        sortedMap.putAll(unsortedMap);
        return sortedMap;
    }
    
}

class ValueComparator implements Comparator {
    
    Map map;
    
    public ValueComparator(Map map) {
        this.map = map;
    }
    
    @Override
    public int compare(Object o1, Object o2) {
       Comparable valueA  = (Comparable) map.get(o1);
       Comparable valueB  = (Comparable) map.get(o2);
       return -valueB.compareTo(valueA);
    }
    
}
