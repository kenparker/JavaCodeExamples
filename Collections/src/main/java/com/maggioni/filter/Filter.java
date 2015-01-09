package com.maggioni.filter;

import java.util.Collection;
import java.util.Iterator;

public class Filter {

    public static <T> void filter(Collection<T> collection, Predicate<T> predicate) {
        if (collection != null && predicate != null) {
            Iterator<T> itr = collection.iterator();
            while (itr.hasNext()) {
                T next = itr.next();
                if (predicate.test(next)) {
                    System.out.println(next);
                }
            }
        }
    }
}
