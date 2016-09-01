package com.maggioni.java67;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCreatedFromArrayDemo1 {

    public static void main(String[] args) {

        String[] java = {"Java","is","really","cool"};
        
        List<String> coolList1 = new ArrayList<>(Arrays.asList(java));
        List<String> coolList2 = Arrays.asList("Java","is","really","cool");
        
        System.out.println("coolList1 before adding a element : " +  coolList1.size());
        coolList1.add("language");
        System.out.println("coolList1 after adding a elemet : " +  coolList1);
        System.out.println("initial arrayList is not changed " +  java.length);
        System.out.println("coolList1 size reflect the added element : " +  coolList1.size());
    }

}
