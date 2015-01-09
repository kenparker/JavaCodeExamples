package com.maggioni.filter;

/**
 *
 * http://www.programcreek.com/2013/09/top-10-questions-for-java-collections/
 */
public interface Predicate<T> {
    boolean test(T o);
}
