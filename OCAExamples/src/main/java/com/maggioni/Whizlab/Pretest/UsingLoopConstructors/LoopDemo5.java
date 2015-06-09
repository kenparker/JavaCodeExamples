package com.maggioni.Whizlab.Pretest.UsingLoopConstructors;

public class LoopDemo5 {

    public static void main(String[] args) {
       int arr[][] = {
           {3,2,1},
           {5,4,2},
           {0,8,7}
       };
       
       outer: for (int x = 0, k = 0, y = 4; x < 3; x++,System.out.println("x = "+x)) {
           k = 0;
           inner: while (true) {               
               System.out.println("arr = "+arr[x][k++]);
               if(k==3) break inner;
           }
       }
    }

}
