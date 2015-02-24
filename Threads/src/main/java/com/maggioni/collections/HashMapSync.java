package com.maggioni.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * http://java67.blogspot.de/2015/02/how-to-synchronize-hashmap-in-java-with.html
 */
public class HashMapSync {
    public static void main(String[] args) {
        Map<String, String> currencies = new HashMap();
        
        currencies.put("USA", "USD");
        currencies.put("England", "GBP");
        currencies.put("Canada", "CAD");
        currencies.put("Europe", "€");
        
        // Synchronizing Map
        currencies = Collections.synchronizedMap(currencies);
        
        // It can be outside synchronized block
        Set<String> keySet = currencies.keySet();
        
        // synchronize on HashMap not on KeySet
        synchronized(currencies) {
            Iterator<String> iterator = keySet.iterator(); // It must be in synchronized Block
            while (iterator.hasNext()) {
                String next = iterator.next();
                
            }
        }
        
    }
    
}
