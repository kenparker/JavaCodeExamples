package com.maggioni.filter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * http://www.programcreek.com/2013/09/top-10-questions-for-java-collections/
 */
public class ListFilterDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(58);
        list.add(1);
        list.add(99);
        list.add(58225);

        Filter.filter(list, new Predicate<Integer>() {
            @Override
            public boolean test(Integer o) {
                return o < 98;
            }
        });

        Filter.filter(list, (Integer) -> Integer < 98);

    }

}
