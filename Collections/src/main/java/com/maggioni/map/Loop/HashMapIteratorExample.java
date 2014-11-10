package com.maggioni.Map.Loop;

import static java.lang.ProcessBuilder.Redirect.to;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import static java.util.stream.Stream.iterate;
import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

/**
 *
 * http://java67.blogspot.de/2013/08/best-way-to-iterate-over-each-entry-in.html
 */
public class HashMapIteratorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initializing HashMap with some key values
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Core Java");
        map.put(2, "Java SE");
        map.put(3, "Java ME");
        map.put(4, "Java EE");
        map.put(5, "Java FX");

        // Iterate over HashMap using foreach loop
        System.out.println("Java 1.5 foreach loop provides most elegant way to iterate over HashMap in Java");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf("Key : %s and Value: %s %n", entry.getKey(),
                    entry.getValue());
        }

        // Better way to loop over HashMap, if you want to remove entry
        System.out.println("Use Iterator and while loop, if you want to remove entries from HashMap during iteration");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.printf("Key : %s and Value: %s %n", entry.getKey(),
                    entry.getValue());
            iterator.remove(); // right way to remove entries from Map, 
            // avoids ConcurrentModificationException
        }
    }

}
