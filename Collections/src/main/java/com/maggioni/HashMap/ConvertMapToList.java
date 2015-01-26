package com.maggioni.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 *
 * http://java67.blogspot.de/2015/01/how-to-convert-map-to-list-in-java.html
 */
public class ConvertMapToList {

    public static void main(String... args) {
        HashMap<String, Integer> schoolAgeCriteria = new HashMap<>();

        // preparing HashMap with Keys and Value
        schoolAgeCriteria.put("Nursury age criteria", 3);
        schoolAgeCriteria.put("Kindergarten1 age criteria", 4);
        schoolAgeCriteria.put("Kindergarten2 age criteria", 5);
        schoolAgeCriteria.put("PrimarySchool age criteria", 6);

        System.out.println("Size of schoolagecriteria map :" + schoolAgeCriteria.size());

        // 1st example: Converting HashMap Keys to Arraylist
        Set<String> keySet = schoolAgeCriteria.keySet();
        List<String> schoolKeyList = new ArrayList<>(keySet);
        System.out.println("Size of Key List from Map :" + schoolKeyList.size());
        
        System.out.println("");
        schoolKeyList.stream()
                .map((String key) -> key)
                .forEach(key -> System.out.println(key));
        
        System.out.println("");
        // noch kurzer
        schoolKeyList.stream()
                .forEach(String -> System.err.println(String));
        
        System.out.println("");
        // sort scheint nicht zu funktionieren
        schoolKeyList.stream()
                .forEachOrdered(String -> System.out.println(String));
        
        // 2nd Example: Converting HashMap Values
        Collection<Integer> values = schoolAgeCriteria.values();
        List<Integer> schoolValueList = new ArrayList<>(values);
        
        System.out.println("Print values from List :");
        schoolValueList.stream()
                .forEach((Integer) -> System.err.println(Integer));
        
        
        // 3rd Example: Converting using EntrySet
        Set<Entry<String, Integer>> entrySet = schoolAgeCriteria.entrySet();     
        List<Entry<String, Integer>> schoolAgeCriteriaList= new ArrayList<>(entrySet);
        
        schoolAgeCriteriaList.stream()
                .map((Entry<String, Integer> y) -> y)
                .forEach(y -> System.out.println("Key :" +  y.getKey() + " Value :" + y.getValue()));
        
        schoolAgeCriteriaList.stream()
                .forEach((Entry<String, Integer> y) -> System.out.println("Key :" +  y.getKey() + " Value :" + y.getValue()));
        
        
        Iterator<Entry<String, Integer>> it = schoolAgeCriteriaList.iterator();    
        while (it.hasNext()) {
            Entry<String, Integer> entry = it.next();
            System.out.println("Entry from converted list : " + entry);
        }
  
    }

}
