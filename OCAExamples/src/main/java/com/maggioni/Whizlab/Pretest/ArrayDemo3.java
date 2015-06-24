package com.maggioni.Whizlab.Pretest;

import java.util.Arrays;

public class ArrayDemo3 {

    static int z;
    static String ss;
    DummyObj fDummyObj = new DummyObj();
    
    public static void main(String[] args) {
        int[] e[] = {{1,2,4},{10,11,12,13}};
        System.out.println("e :" +  e);
        System.out.println("Arrays.toString(e) :" +  Arrays.toString(e[0]));
        System.out.println("e[0] :" +  e[0]);
        int[] a = {1};
        int[] b = {1,2,9};
        int[] c = {1,2,6,4,5};
        e = new int[][] {a,b,c};
        System.out.println(e.length);
        String s = " abc";
        System.out.println(s.length());
        
        String sss = null;
        System.out.println("sss : " +  sss);
        
        int aa=0;
        System.out.println(aa);
        
        System.out.println("z :" +  z);
        System.out.println("ss : " +  ss);
        
        Integer[] oneArray = {1,5,6,80};
        
        new ArrayDemo3().myMeth();
        
        int[] inta = new int[] {1,2,3, new Integer(25)};
        
    }
    
    void myMeth() {
        System.out.println(" " +  fDummyObj.st + " " +  fDummyObj.aa);
        DummyObj do1 = new DummyObj();
        System.out.println("" +  do1.st +  " "+  do1.aa);
        
        
    }

}
