
package com.maggioni.HaspMap.Programmcreek;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * http://www.programcreek.com/2013/03/hashmap-vs-treemap-vs-hashtable-vs-linkedhashmap/
 */
class Dog {
    String color;

    public Dog(String c) {
        this.color = c;
    }
    
    public String toString() {
        return color + " dog";
    }
    
    @Override
    public int hashCode() {
        return color.length();
    }
    
    @Override
    public boolean equals(Object o) {
        return ((Dog) o).color == this.color;
    }
            
    
}
public class TestHashMap {

    public static void main(String[] args) {
        
        HashMap<Dog, Integer> hashMap = new HashMap<Dog, Integer>();
        
        Dog d1= new Dog("red");
        Dog d2 = new Dog("black");
        Dog d3 = new Dog("white");
        Dog d4 = new Dog("white");
        
        System.out.println("d3.color == d4.color " +  (d3.color == d4.color));
        
        hashMap.put(d1, 10);
        hashMap.put(d2, 15);
        hashMap.put(d3, 5);
        hashMap.put(d4, 20);
        
        System.out.println("hashmap size " + hashMap.size());
        
        for (Map.Entry<Dog, Integer> entrySet : hashMap.entrySet()) {
            System.out.println("" + entrySet.getKey().toString() + " " + entrySet.getValue());
            
        }
        System.out.println("printMap 1-----------");
        printMap(hashMap);
        System.out.println("printMap 2 -----------");
        printMap(hashMap);
      
    }
    
    public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
             Map.Entry pairs = (Map.Entry) it.next();
             System.out.println(pairs.getKey() + " = " + pairs.getValue());
             
        }
    }
    
}
