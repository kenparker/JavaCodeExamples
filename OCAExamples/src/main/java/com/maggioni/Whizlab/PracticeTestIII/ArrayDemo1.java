package com.maggioni.Whizlab.PracticeTestIII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayDemo1 {

    public static void main(String[] args) {
        long[] l1d = {1,2,3};
        Object o = l1d;
        Object o2 = new long[11];
        //Object[] o3 = new long[11];
        Object[] o3 = new Long[11];
        Object[] i1 = new Integer[11];
        //long[] l1d2 = o;
        long[] l1d2 = (long[])o;
        long[] l1d3 = (long[])o2;
        //long[] l1d4 = (long[])o3;
        
        Arrays.asList(new ArrayList());
        List list = new ArrayList();
        Object[] toArray = list.toArray();
        
        int[][][] arr1 = {{{1,3,4,5,6,7}}};
        int[][][] arr2 = {{{1,3,4,5,6,7},{22,44,5,6,6,7,7,}}};
        
    }

}
