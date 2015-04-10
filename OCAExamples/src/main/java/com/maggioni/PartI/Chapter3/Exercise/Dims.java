package com.maggioni.PartI.Chapter3.Exercise;

import java.util.ArrayList;

/**
 *
 * @author magang
 */
public class Dims {

    
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        int[] b = a[1];
        Object o1 = a;
        int[][] a2 = (int[][])o1;
        //int[] b2 = (int[])o1; // ClassCastException at runtime
        System.out.println(b[1]);
        
        ArrayList<String> myList = new ArrayList();
        myList.add("aa");
        myList.add(0, "bb");
        System.out.println(myList);
    }
    
}
