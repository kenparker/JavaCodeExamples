package com.maggioni.CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NaturalOrderDemo1 {

    public static void main(String[] args) {
        
        List<String> li = new ArrayList<>();
        li.add("1");
        li.add("a1§");
        li.add("A1$");
        li.add("a1$");
        li.add("a1&");
        li.add("a1%");
        li.add("azc");
        li.add("a100");
        li.add("a1.");
        li.add("abc");
        li.add("a1c");
        li.add("a2");
        li.add("a1");
        li.add("a1 ");
        li.add("a1+");
        li.add("a1'");
        Collections.sort(li);
        System.out.println(li);
        
        Comparator<Object> reverseOrder = Collections.reverseOrder();
        Collections.sort(li, reverseOrder);
        System.out.println(li);
        
        li.clear();
        li.add(" x");
        li.add("xx");
        li.add("Xx");
        System.out.println(li); // not sorted
        Collections.sort(li);
        System.out.println(li); // sorted in natural-order
        Collections.sort(li,reverseOrder);
        System.out.println(li); // sorted in inverse-order
        
        
    }

}
