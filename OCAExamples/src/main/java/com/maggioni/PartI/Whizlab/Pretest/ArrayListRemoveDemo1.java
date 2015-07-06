package com.maggioni.PartI.Whizlab.Pretest;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveDemo1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(1);
        System.out.println("list : "+ list);
        list.remove(1);
        System.out.println("list : "+ list);
        
        
    }

}
