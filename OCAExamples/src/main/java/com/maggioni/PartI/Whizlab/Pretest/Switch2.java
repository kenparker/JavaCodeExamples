package com.maggioni.PartI.Whizlab.Pretest;

public class Switch2 {

    final static int x = 2;
    final static int y = 0;

    public static void main(String[] args) {

        for (int z = 0; z < 4; z++) {
            switch (z) {
                case x:
                    System.out.print("0 ");
                case x - 1:
                    System.out.print("1 ");
                    break;
                case x - 2:
                    System.out.print("2 ");
                default:        // default does not have to be the last
                    System.out.print("def ");
            }
        }
    }

}
