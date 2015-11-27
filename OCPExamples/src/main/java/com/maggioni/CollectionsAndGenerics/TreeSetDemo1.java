package com.maggioni.CollectionsAndGenerics;

import java.util.TreeSet;

public class TreeSetDemo1 {

    public static void main(String[] args) {
       TreeSet<Number> tree = new TreeSet<Number>();
       tree.add(108);
       tree.add(3.48); // Compile but runtime error, you cannot compare Integer and Double
    }

}
