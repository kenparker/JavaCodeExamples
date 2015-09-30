package com.maggioni.SelfTest;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        
        List<List<Integer>> table = new ArrayList<>(); // ok
        //List<List<Integer>> table = new ArrayList<ArrayList<Integer>>(); // not compile
        
        for (int i = 0; i < 10; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                row.add(i*j);
            }
            table.add(row);
        }
        for (List<Integer> row : table) {
            System.out.println(row);
        }
    }

}
