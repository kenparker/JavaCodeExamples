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
        int i = 0;
        System.out.println(" index dd[3] " +  dd[2][0]);
        dd[i+1+1][0] += 1;                                  // the index i+1+1 is calculated only one time
        System.out.println(" index dd[3] " +  dd[2][0]);
        
        System.out.println(" index dd[1] " +  dd[1][0]);
        
        //int a = dd[1L][0];    // do not compile, the index need to be int      
        Integer inte = new Integer(2);
        int a = dd[inte][0];    // compile no problem
        
        int x  = 0;
        int y = 11;
        do{} while(x++>y);  // condition is false (0>11) right at the beginning
                            // x is incremented right after the comparison test
        System.out.println(x);  // Output is 1
        
        Integer uint = new Integer(222);
        System.out.println(uint);
        int[] ni[] = {{},new int[] {}};
        System.out.println(ni[0][0]); // ArrayIndexOutOfBoundsException
    }

}
