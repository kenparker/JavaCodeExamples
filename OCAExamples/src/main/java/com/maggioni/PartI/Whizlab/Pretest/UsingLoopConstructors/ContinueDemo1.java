package com.maggioni.PartI.Whizlab.Pretest.UsingLoopConstructors;

public class ContinueDemo1 {

    public static void main(String[] args) {
        
        outer2:
        for (int i = 0; i < 10; i++) {
            
        }
        outer:
        for (int i = 0; i < 10; i++) {
            inner:
            for (int j = 0; j < 10; j++) {
                System.out.println(" i: "+ i + " j:"+j);
                if (j == 5) {
                    continue outer;
                }
            }
        }
    }

}
