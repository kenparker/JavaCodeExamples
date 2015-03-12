package com.maggioni.PartI.Chapter2.Examples;

public class Knowing {
    static final long tooth = 343L;
    static final long o = 500L;
    static long doIt(long tooth) {
        System.out.print(++tooth+" ");
        return ++tooth;
    }
    static long doAgain(long o) {
        System.out.print(++o+" ");
        return ++o;
    }
    public static void main(String[] args) {
        System.out.print(tooth+" ");
        final long tooth = 340L;
        new Knowing().doIt(tooth);
        System.out.println(tooth);
        doAgain(o);
        System.out.println(o+"");
    }
    
}
