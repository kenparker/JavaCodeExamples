package com.maggioni.Whizlab.Pretest;

import java.util.ArrayList;
import java.util.List;

public class ListIntegerDemo1 {

    // Line 9 works because at compile time the List<Integer> is converted to List
    // so I cannot add any Objects
    // To Present it, Line 11 should be changed to List<Integer> list
    public static void addToList(List list) {list.add("0067");list.add("bb");}
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addToList(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
    
}
