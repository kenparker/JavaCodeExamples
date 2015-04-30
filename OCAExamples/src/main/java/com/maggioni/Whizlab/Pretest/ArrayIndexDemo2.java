package com.maggioni.Whizlab.Pretest;

public class ArrayIndexDemo2 {

    public static void main(String[] args) {
        int index = 1;

        int[][] dd = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1, 0}};

        System.out.println(dd[index++][index++]);   // output = [1][2] = 4
        
        try {
            System.out.println(dd[4][0]);   // ArrayIndexOutBoundsException
        } catch (Exception e) {
            System.out.println("ArryIndexException");
        }
        
        int x  = 0;
        int y = 11;
        do{} while(x++>y);  // condition is false (0>11) right at the beginning
                            // x is incremented right after the comparison test
        System.out.println(x);  // Output is 1
    }

}
