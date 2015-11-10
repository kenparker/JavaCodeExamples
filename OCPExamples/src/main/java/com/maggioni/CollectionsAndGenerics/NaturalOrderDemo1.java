package com.maggioni.CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NaturalOrderDemo1 {

    public static void main(String[] args) {
        
        List<String> li = new ArrayList<>();
        li.add("1");
        li.add("a1§");
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
    }

}
