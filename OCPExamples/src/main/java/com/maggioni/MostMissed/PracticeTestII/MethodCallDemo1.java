package com.maggioni.MostMissed.PracticeTestII;

public class MethodCallDemo1{

    public static void main(String[] args) {
        
        String s1 = "hello";
        int i1 = 12;
        double d1 = 12;
        acall(s1, i1, d1);  // 1
        
        Integer i2 = 13;
        acall(s1, i2, d1);  // 2
        
    }
    
    
    static void acall(CharSequence c, int i, double d){System.out.println("1");}
    static void acall(CharSequence c, Integer i, double d){System.out.println("2");}
    static void acall(CharSequence c, double i, double d){System.out.println("3");}
   
    static void acall(CharSequence c, Double i, double d){System.out.println("4");}
    static void acall(CharSequence c, Number i, double d){System.out.println("5");}

}
