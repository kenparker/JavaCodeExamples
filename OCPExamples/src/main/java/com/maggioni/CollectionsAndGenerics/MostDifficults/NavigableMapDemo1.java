package com.maggioni.CollectionsAndGenerics.MostDifficults;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo1 {

    public static void main(String[] args) {
        NavigableMap<String, String> myMap = new TreeMap<>();
        myMap.put("a", "apple");
        myMap.put("b", "boy");
        myMap.put("c", "cat");
        myMap.put("aa", "apple1");
        myMap.put("bb", "boy1");
        myMap.put("cc", "cat1");
        myMap.put("DD", "cat1");
        myMap.put("1", "cat1");
        System.out.println(myMap.toString());
        
        System.out.println(" myMap size : "+myMap.size());
        // Query and Remove
        myMap.pollLastEntry();  
        myMap.pollFirstEntry();
        
        System.out.println(" myMap size : "+myMap.size());
        
        // new NavigableMap backed from myMap, changes to tailMap are reflected to myMap
        NavigableMap<String, String> tailMap = myMap.tailMap("bb", false);
        System.out.println(" tailMap size : " + tailMap.size());    // 1
        
        // test: add element to myMap
        myMap.put("dd", "dddd");
        System.out.println(" myMap size : "+myMap.size());          // 5
        System.out.println(" tailMap size : " + tailMap.size());    // 2
        
        tailMap.put("bc", "DD");
        System.out.println(" myMap size : "+myMap.size());          // 6
        System.out.println(" tailMap size : " + tailMap.size());    // 3
        
        
        
        
    }

}
