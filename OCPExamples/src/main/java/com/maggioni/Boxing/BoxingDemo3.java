package com.maggioni.Boxing;
/*
| Type    | boxing sequence                     |
| int int    | 1. int int   2. int long 3. long long  4. Integer Integer  5. Number Number  6. int... or long... or Integer... or Number... or Object...
*/
public class BoxingDemo3 {

    public static void main(String[] args) {
        
        int i1 = 10;
        int i2 = 20;
        boxMethod(i2);
        boxMethod(i1,i2);
    }

    static void boxMethod(Object o ) {System.out.println("from Object");}
    static void boxMethod(Object... o ) {System.out.println("from Object...");}
    static void boxMethod(int... o ) {System.out.println("from int...");}
    static void boxMethod(long... o ) {System.out.println("from short...");}
    //static void boxMethod(int o1, int o2 ) {System.out.println("from int o1, int o2");}
    //static void boxMethod(int o1, long o2 ) {System.out.println("from int o1, long o2");}
    static void boxMethod(int o1, Integer o2 ) {System.out.println("from int o1, Integer o2");}
    static void boxMethod(long o1, long o2 ) {System.out.println("from long o1, long o2");}
    static void boxMethod(Integer o1, Integer o2 ) {System.out.println("from Integer o1, Integer o2");}
    static void boxMethod(Integer... o1 ) {System.out.println("from Integer...");}
    static void boxMethod(Number... o1 ) {System.out.println("from Number...");}
    static void boxMethod(Number o1, Number o2 ) {System.out.println("from Number o1, Number o2");}
}
