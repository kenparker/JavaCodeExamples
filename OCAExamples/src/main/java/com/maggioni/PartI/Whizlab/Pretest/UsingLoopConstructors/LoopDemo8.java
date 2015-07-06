package com.maggioni.PartI.Whizlab.Pretest.UsingLoopConstructors;

public class LoopDemo8 {

    public static void main(String[] args) {
        int i = -2,j = 2;
        do {            
            i = ++i;
            j--;
        } while (i++>0);
        System.out.println(i);
        
        /* unreacheble statement
        for (; false; ) {
            
        }
                */
        
        for (;true;) {
            break;  // without this statement there will be a compile error
        }
        System.out.println("out of loop");
    }

}
