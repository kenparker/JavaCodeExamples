package com.maggioni.PartI.Whizlab.PracticeTestIII;

public class Pro {

    public static void main(String[] args) {
        int[]a = {3,2,1,0};
        int y = a.length;
        int x = y -1;
        while (y>0) {            
            System.out.print(a[--y]);
        }
    }

}
