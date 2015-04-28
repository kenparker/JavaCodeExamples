
package com.maggioni.PartI.Chapter6.Exercise;

public class LabeledForLoopDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Hello");
                continue outer; // the innerloop is terminated and control ist to the outer loop (J=0)
                // break outer; // the inner and outerloop is terminated
            }
            System.out.println("Good-Bye");
        }
    }

}
