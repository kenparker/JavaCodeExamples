package com.maggioni.PartI.Whizlab.Pretest.UsingLoopConstructors;

public class LoopDemo7 {

    public static void main(String[] args) {
        boolean flag = false;
        int x = 0;
        do {
            x++;
        } while (flag = !flag);
        System.out.println(x);

        /* following statement do not compile
         while (false) {            
            
         }
         */
        /*
         for (int a = 30;;) {    // never ending loop
         System.out.println("a :" + a);
         }
         */
        for (; flag = !flag;) {

            /* never ending
             x = 0;
             for (; ;x++ ) {
            
             }
             */
            /* do not compile becaise i is not initialized
             for (int i; i < 10;) {
             i++;
             }
             */
            x = 10;
            for (; x < 10; x++) {
                System.out.println("loop");
            }
            System.out.println("x : " +  x);
            
            /* never ending loop
            int bang = 1;
            do {
                while (bang < 1) {
                    System.out.println("sss");
                }
            } while (bang >= 1);
                    */
        }

    }
}
