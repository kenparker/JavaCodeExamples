
package com.maggioni.PartI.Whizlab.Pretest.UsingLoopConstructors;


public class LoopDemo1 {

    public static void main(String[] args) {
        int i = 0;
        System.out.println((i = increment(5)) < 6);
    }
    
    static int increment(int i) {
        return ++i;
    }
}
