package com.maggioni.Whizlab.Pretest;

public class ArrayDemo4 {

    public static void main(String[] args) {
        
        System.out.println("args "+  args[0]); // ArrayIndexOutOfBoundException
        Cat[] moreCats = new Cat[25];
        Cat[][] myCats = new Cat[35][];
        
        // myCats = myCats[0]; do not work
        // myCats = myCats[0][0];
        //myCats[1] = myCats[1][2];
        //myCats[0][1] = moreCats;
        myCats[0] = moreCats;
        //myCats[1][1] = moreCats[1]; // NullPointerException
        myCats[1] = new Cat[14];
        myCats[1][1] = moreCats[1]; 
        
    }

}
