package com.maggioni.Map.Loop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * http://www.dzone.com/links/r/4_ways_to_loop_over_hashmap_in_java.html
 *
 * @author maggioni
 */
public class HashMapTraverseExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<String, String> loans = new HashMap<String, String>();
        loans.put("home loasn", "citibank");
        loans.put("Personal loan", "Deutsche Bank");

        System.out.println("-----------------------------");
        System.out.println("Iterating or looping map using java5 foreach loop");
        for (String key : loans.keySet()) {

            System.err.println("Key :" + key + " value: " + loans.get(key));

        }

        Set<String> keyset = loans.keySet();
        Iterator<String> keysetIterator = keyset.iterator();
        System.out.println("-----------------------------");
        System.out.println("Iterating or looping map using KeySet Iterator");
        while (keysetIterator.hasNext()) {
            String key = keysetIterator.next();
            System.out.println("Key; " + key + " value: " + loans.get(key));

        }

        System.out.println("-----------------------------");
        System.out.println("Iterating or looping map using entrySet java5 foreach loop");
        Set<Map.Entry<String, String>> entrySet = loans.entrySet();
        for (Entry entry : entrySet) {

            System.out.println("Key; " + entry.getKey() + " value: " + entry.getValue());
        }
        
        System.out.println("-----------------------------");
        System.out.println("Iterating or looping map using entrySet und Iterator");
        Set<Map.Entry<String, String>> entrySet1 = loans.entrySet();
        Iterator<Entry<String, String>> entrySetiterator = entrySet1.iterator();
        while (entrySetiterator.hasNext()) {
            Entry<String, String> entry = entrySetiterator.next();
            System.out.println("Key; " + entry.getKey() + " value: " + entry.getValue());
            
        }
        
    }

}
