package com.maggioni.PartI.Whizlab.Pretest;

public class ArrayDemo1 {

    public static void main(String[] args) {
        short [][] b = new short[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (short[] b1 : b) {
            System.out.println(b1);
            for (short c : b1) {
                System.out.println(""+c);
            }
        }
        
        short [][] big = new short[][] {{1,2,5},{3,4},{1,4}};   // two dimension
        short [][][] big3 = new short[][][] {{{1,2},{3},{3,4}},{{3,4},{3,4}},{{3,4},{3,4}}};
        short b3 = 8;
        short b2 [][][][] = new short[2][3][2][2];  // four dimension
        
        
        
        b2[1][1] = big;     // big is two dimensional
        b2[1][1] = b;       // b is two dimensional
        //b2[1][1] = b2;       // do not compile
        
        int i = 0, j = 0;
        for (short[][][] b21 : b2) {
            System.out.println(" i = " +  i +b2);
            j=0;
            for (short[][] b211 : b21) {
                System.out.println("  j = "+j+b211);
                for (short[] b2111 : b211) {
                    System.out.println("   "+b2111);
                    for (short c : b2111) {
                        System.out.println("    "+c);
                    }
                }
                j++;
            }
            i++;
        }
        
        System.out.println(" b2.length :" +  b2.length);
        
        String[] s = new String[5];
        System.out.println(" s.length :"+s.length);
    }

}
