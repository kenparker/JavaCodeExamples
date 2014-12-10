
package com.maggioni.ListIterator;

import java.util.ArrayList;

/**
 *
 * http://www.java2s.com/Code/Java/Collections-Data-Structure/Usesetmethodtochangethevalueinanarraylist.htm
 */
public class ListeChangeValueExample {

    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
        nums.clear();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");

        System.out.println(nums);
        nums.set(0, "Uno");
        nums.set(1, "Dos");
        nums.set(2, "Tres");
        System.out.println(nums);
    }

}
