package com.maggioni.CollectionsAndGenerics;

import java.util.Arrays;

public class ArraySortDemo1 {

    String name;

    public ArraySortDemo1(String name) {
        this.name = name;
    }
     
   
    
    public static void main(String[] args) {
        ArraySortDemo1[] a = {new ArraySortDemo1("tabby"), new ArraySortDemo1("pallo"), new ArraySortDemo1("tallo")};
        Arrays.sort(a); // compile but runtime error because Comparable not implemented
    }

}
