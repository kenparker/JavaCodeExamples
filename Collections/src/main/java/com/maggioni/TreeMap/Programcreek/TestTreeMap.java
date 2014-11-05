package com.maggioni.TreeMap.Programcreek;

import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * http://www.programcreek.com/2013/03/hashmap-vs-treemap-vs-hashtable-vs-linkedhashmap/
 */
class Dog implements Comparable<Dog> {

    String color;
    int size;

    public Dog(String c, int s) {
        this.color = c;
        this.size = s;
    }

    public String toString(){	
		return color + " dog";
	}
    
    @Override
    public int compareTo(Dog o) {
        return o.size - this.size;
    }

}

public class TestTreeMap {

    public static void main(String[] args) {
        Dog d1 = new Dog("red", 30);
        Dog d2 = new Dog("black", 20);
        Dog d3 = new Dog("white", 10);
        Dog d4 = new Dog("white", 10);

        TreeMap<Dog, Integer> treeMap = new TreeMap<Dog, Integer>();
        treeMap.put(d1, 10);
        treeMap.put(d2, 15);
        treeMap.put(d3, 5);
        treeMap.put(d4, 20);

        for (Entry<Dog, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

}
