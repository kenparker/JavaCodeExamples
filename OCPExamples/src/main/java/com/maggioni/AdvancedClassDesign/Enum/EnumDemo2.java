package com.maggioni.AdvancedClassDesign.Enum;

/*
    OCP Objective 2.5
    Page 60
*/
public class EnumDemo2 {

    enum Roman {I, V, X, L, C, M;
    
    }
    public static void main(String[] args) {
        int x = 7;
        int z = 2;
        Roman r = Roman.X;
        Roman[] values = Roman.values();
        for (Roman value : values) {
            System.out.println(value);
        }
        do {            
            
            switch (r) {
                case C: r = Roman.L; break;
                case X: r = Roman.C;
                case L: System.out.println("ordinal "+r.ordinal()); if (r.ordinal() > 2) z+= 5;
                case M: x++;
            }
            z++;
            System.out.println("x = "+ x + "  z =" +z);
        } while (x < 10);
        System.out.println(z);
    }

}
