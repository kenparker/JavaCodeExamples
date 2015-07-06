package com.maggioni.PartI.Whizlab.PracticeTestIII;

public class ExTest {

    Integer I;
    public static void main(String[] args)  {
        String s;
        try {
            s = new ExTest().I.toString();
        } finally {
            try {
                int i = Integer.parseInt(args[0]);
            } catch (NumberFormatException E) {
                System.out.println("number format");
            } finally {
                System.out.println("Fin2");
            }
            System.out.println("Fin 1");
        }
    }

}
