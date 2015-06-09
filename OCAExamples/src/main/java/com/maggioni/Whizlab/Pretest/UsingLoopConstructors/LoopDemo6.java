package com.maggioni.Whizlab.Pretest.UsingLoopConstructors;

public class LoopDemo6 {

    public static void main(String[] args) {
       int arr[][] = {{3,2,1},{5,4,2},{0,8}};
       
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (x==1) continue;
                if (x==2 && y == 1) break;
                System.out.println(arr[x][y]);
            }
        }
    }

}
