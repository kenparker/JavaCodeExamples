package com.maggioni.PartI.Whizlab.Pretest.CreatingAndUsingArrays;

/**
 *
 * @author magang
 */
public class MyArrayDemo1 {

    public static void main(String[] args) {
        
        int i = 3;
        int[] arr = new int[i++];
        System.out.println(arr.length); // output = 3
        System.out.println(i);  // 4
        
        i = 3;
        arr = new int[++i];
        System.out.println(arr.length); // output = 4
        System.out.println(i);  // 4
        
    }
    
}
