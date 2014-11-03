
package com.maggioni.HaspMap.Programmcreek;

import java.util.HashMap;
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
        
        HashMap<Dog, Integer> hasMap = new HashMap<Dog, Integer>();
        
        Dog d1= new Dog("red");
        Dog d2 = new Dog("black");
        Dog d3 = new Dog("white");
        Dog d4 = new Dog("white");
        
        System.out.println("d3.color == d4.color" +  (d3.color == d4.color));
        
        hasMap.put(d1, 10);
        hasMap.put(d2, 15);
        hasMap.put(d3, 5);
        hasMap.put(d4, 20);
        
        System.out.println("hashmap size" + hasMap.size());
        
        for (Map.Entry<Dog, Integer> entrySet : hasMap.entrySet()) {
            System.out.println("" + entrySet.getKey().toString() + entrySet.getValue());
            
        }
        
    }
    
}
