
package com.maggioni.Collections;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;

/**
 *
 * http://tomjefferys.blogspot.de/2011/09/multimaps-google-guava.html
 */
public class MultiMapDemo1 {

    public static void main(String[] args) {
        Multimap<String, String> myMultimap = ArrayListMultimap.create();

        // Adding some key/value
        myMultimap.put("Fruits", "Bannana");
        myMultimap.put("Fruits", "Apple");
        myMultimap.put("Fruits", "Pear");
        myMultimap.put("Vegetables", "Carrot");

        // Getting the size
        int size = myMultimap.size();
        System.out.println(size);  // 4

        // Getting values
        Collection<String> fruits = myMultimap.get("Fruits");
        System.out.println(fruits); // [Bannana, Apple, Pear]

        Collection<String> vegetables = myMultimap.get("Vegetables");
        System.out.println(vegetables); // [Carrot]

        // Iterating over entire Mutlimap
        System.out.println("Iteration:");
        for (String value : myMultimap.values()) {
            System.out.println(value);
        }
        
        System.out.println("Iteration over Keys:");
        for (String key : myMultimap.keys()) {
            System.out.println(key);;
            
        }
        
        System.out.println("Iteration over KeysSet:");
        for (String key : myMultimap.keySet()) {
            System.out.println(key);;
        }
        
        System.out.println("Iteration over Keys and Values:");
        for (String key : myMultimap.keySet()) {
            System.out.println("key is: "+key);;
            Collection<String> get = myMultimap.get(key);
            for (String get1 : get) {
                System.out.println(get1);
            }
        }

        // Removing a single value
        myMultimap.remove("Fruits", "Pear");
        System.out.println(myMultimap.get("Fruits")); // [Bannana, Pear]

        // Remove all values for a key
        myMultimap.removeAll("Fruits");
        System.out.println(myMultimap.get("Fruits")); // [] (Empty Collection!)
    }
}
