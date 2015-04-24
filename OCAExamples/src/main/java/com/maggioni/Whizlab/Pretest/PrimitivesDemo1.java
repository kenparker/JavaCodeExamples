package com.maggioni.Whizlab.Pretest;

/**
 *
 * @author magang
 */
public class PrimitivesDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 2_147_483_647;                 // 4 byte = 32 Bits = 2^31-1 - 10 Stelle
        System.out.println(i);
        int i2 = (int) Math.pow(2, 31) - 1;
        System.out.println(i2);
        i = 0100;
        System.out.println("i=0100 in octal : "+i);  

        long l = 9_223_372_036_854_775_807L;    // 8 byte = 64 Bits = 2^63-1 - 19 Stelle
        System.out.println(l);
        long l1 = (long) Math.pow(2, 63) - 1;
        System.out.println(l1);

        double d = 3.4E+38;                     // 8 byte
        System.out.println(d);
        double d2 = 1.79769131486231570E+308;
        System.out.println(d2);
        double d1 = 1.79769313486231570 * Math.pow(10, 308);
        System.out.printf("Value of double up-to 2 decimals : %.2f", d1);
        System.err.println("");
        System.out.printf("Value of double up-to 2 decimals : %.2f", d);
        System.err.println("");
        System.out.println(Double.MAX_VALUE);
        
        double ohneVorkomma = .10;
        double ohneNachkomma = 12.;

        int ii = 42;
        byte bb = 100;

        ii = bb;            // automatische Casting da ziel variable größer
        bb = (byte) ii;     // casting muss explixit angegeben werden

        byte b = (byte) 200;
        System.out.println(b);
        byte b1 = 100;
        System.out.println(b1);

        short s1 = (short) 33000;
        //short s2 = 33000s;             // Erst in Java 7
        System.out.println(s1);      // –32536

        double d3 = 12. + 15.1;
        double d4 = 12 + 15;        // implizite casting

        // http://www.gutefrage.net/frage/frage-zu-java-programmierung-anfaenger
        // http://openbook.rheinwerk-verlag.de/javainsel9/javainsel_02_003.htm#mje0a1a7aa587e4ef38dc8a8d84cfcd506
        // http://de.wikipedia.org/wiki/Gleitkommazahl
        float f33 = 20000000000F;
        System.out.println("f33 20000000000F        :"+ f33);
        f33+=1;
        System.out.println("f33 20000000000F + 1    :"+ f33);
        System.out.println("f33 is between min and max value :"+ (Float.MIN_VALUE < f33 && Float.MAX_VALUE > f33));
        System.out.println("20000000000F == 20000000000F + 1 is: "+(20000000000F == 20000000000F + 1));
        System.out.println("Float.Min_Value : "+Float.MIN_VALUE);
        System.out.println("Float.Max_Value : "+Float.MAX_VALUE);
        System.out.printf("%.2f",Float.MAX_VALUE);
        System.out.println("");
        System.out.println(20000000000D == 20000000000D + 1);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

    }

}
