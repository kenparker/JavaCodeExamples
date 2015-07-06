package com.maggioni.PartI.Whizlab.Pretest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();    // initial capacity is 10
        System.out.println("array size :" + arr.size());
        List li = new ArrayList(2);     // new ArrayList with initial capacity = 2
        List l2 = new ArrayList(li);    // new ArrayList based on the li

        li.add("0000");
        li.add(12);
        li.add(l2);
        li.add("dddd");
        System.out.println(li.size());
    }
}
