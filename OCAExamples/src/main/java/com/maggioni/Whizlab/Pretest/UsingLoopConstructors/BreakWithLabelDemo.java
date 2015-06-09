package com.maggioni.Whizlab.Pretest.UsingLoopConstructors;

public class BreakWithLabelDemo {

    public static void main(String[] args) {

        int[][] arrayOfInts = {
            {32, 05, 25, 222, 25},
            {12, 55, 639, 1, 45, 36, 369},
            {1, 2, 3, 5, 6, 9, 8}};
        int searchFor = 12;

        int i;
        int j = 0;
        boolean fountIt = false;

        outerFor:
        for (i = 0; i < arrayOfInts.length; i++) {
            innerFor:
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchFor) {
                    fountIt = true;
                    System.out.println("found index :" + i +"," + j);
                    break innerFor;
                    //continue;
                }
                System.out.println("not found index :" + i +"," + j);
            }
        }

        if (fountIt) {
            System.out.println("found " + searchFor + " at " + i + "," + j);
        } else {
            System.out.println(searchFor + "  not in the array");
        }
    }

}
