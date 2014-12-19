
package com.maggioni.javapractices;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * http://www.javapractices.com/topic/TopicAction.do?Id=88
 */
public class IterateNoIndex {
    
    public static void main(String[] args) {
        IterateNoIndex ii = new IterateNoIndex();
        ii.withoutIndex();
    }

    /**
     * Iterating without an index is more compact and less error prone.
     */
    public void withoutIndex() {

        //for-each loop is usually preferred - no-update
        List<String> trees = Arrays.asList("Maple", "Birch", "Poplar");
        for (String tree : trees) {
            log(tree);
        }

     //Iterators are not as compact as a for-each loop
        //but sometimes you need them: removing/replacing items,
        //and 'parallel' iterations across two data structures
        Iterator<String> iter = trees.iterator();
        while (iter.hasNext()) {   
            log(iter.next());
        }
    }

    /**
     * Iterating with an index is more error prone.
     */
    public void withIndex() {
        //traditional for-loop
        for (int idx = 0; idx < 10; ++idx) {
            log("Iteration..." + idx);
        }
    }

    // PRIVATE
    private void log(String aMessage) {
        System.out.println(aMessage);
    }
}
