package com.maggioni.CollectionsAndGenerics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo1 {

    public static void main(String[] args) {
        String[] sa = {"foo", "baR", "baz"};
        List<String> asList = Arrays.asList(sa);
        asList.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
            
        });
        int binarySearch = Collections.binarySearch(asList, "foo");
        System.out.println(""+binarySearch);
        int binarySearch1 = Collections.binarySearch(asList, "bax", co);
        System.out.println(""+binarySearch1);
    }
    
    static Comparator<String> co = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return  o1.compareTo(o2);
        }
    };

}
