package com.maggioni.PartI.Chapter3.Exercise;

public class ForLoopDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=-2, j=2;
        for (;i++>0;) {
            System.out.println("in the loop"+i);
            i=++i;
            j--;
        }
        System.out.println(i);
    }
    
}
