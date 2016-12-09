
package com.maggioni.MostMissed.PracticeTestII;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo1 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(-4);
        /*
        the Iterator has a Type
        */
        for (Iterator<Integer> i = list.iterator(); i.hasNext();) {
            Integer next = i.next();
        }
        
        /*
        the keypoint here is that the Iterator do not habe a Type
        so the return value from get() is Object
        */
        for (Iterator i = list.iterator(); i.hasNext();) {
            Object next = i.next();
        }
    }

}
