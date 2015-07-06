package com.maggioni.PartI.Whizlab.Pretest.UsingLoopConstructors;

public class SwitchDemo1 {

    public static void main(String[] args) {
        final int b = 11;
        int x = 10;
        final Integer c = new Integer(3);
        switch (x) {
            //case c:
            //    System.out.println("");
            case 10: System.out.println("10");
                    break;
            case b: System.out.println("11"); break;
            // case 10: System.out.println("15"); break; do not compile
        }
        
        Integer integer = new Integer(20);
        
        final int d;
        d = 10;
        switch (integer) {
            //case d:
            case 1:
                System.out.println("");
            case 2:
                System.out.println("");
            case b:
                System.out.println("");
        }
    }

}
