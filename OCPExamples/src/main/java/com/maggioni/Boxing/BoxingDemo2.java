package com.maggioni.Boxing;

/*
boxing test

| Type    | boxing sequence                     |
| char    | 1. char     2. int    3. long
| byte    | 1. byte     2. short  3. int     4. long    5. Byte    6. Number
| short   | 1. short    2. int    3. long    2. float  3. double    4. Short   5. Number
| int     | 1. int      2. long   3. float   4. double  5. Integer 6. Number
| long    | 1. long     2. float  3. double  4. Long    5. Number
| Byte    | 1. Byte     2. Number 3. byte    4. short   5. int     6. long
| Short   | 1. Short    2. Number 3. short   4. int     5. long
| Integer | 1. Integer  2. Number 3. int     4. long
| Long    | 1. Long     2. Number 3. long
*/
public class BoxingDemo2 {

    public static void main(String[] args) {
        BoxingDemo2 b = new BoxingDemo2();
        
        long l = 12345;
        //b.boxMethod1(l); // do not compile
        
        b.boxMethod4(l);    // boxing sequence 1. long, 2. Long 3. Number
        b.boxMethod5(l); // ??
        
        
        int i = 12345;
        b.boxMethod2(i); // from long
        b.boxMethod2(l); // from long
        b.boxMethod5(i); // boxMethod 5 - from float
        
        b.boxMethod4(i); //  boxing sequence: 1. int 2. long 3. Integer 4. Number
        
        Integer integer = 12345;
        b.boxMethod1(integer); // from int
        b.boxMethod2(integer); // from Number
        
        b.boxMethod2(integer); // from Number
        b.boxMethod3(integer); // from Number
        
        b.boxMethod5(integer); // 1. Integer 2. Number 3. int 4. long
       
        double d1 = 1234.56;
        Double d2 = 1234.56;
        b.boxMethod3(d1); // from Number
        b.boxMethod3(d2); // from Number
        
        Number n = 12345;
        b.boxMethod5(n); // boxMethod 5 - from Number
        
        short s = 12345;
        b.boxMethod5(s);
        
        Short s1 = 12345;
        b.boxMethod5(s1);
        
        byte by = 123;
        b.boxMethod5(by);
        
        Byte by2 = by;
        b.boxMethod5(by2);
        
        char c = 'a';
        b.boxMethod5(c);
        
        
        
    }
    
    void boxMethod1(int i) {System.out.println("from int");}
    //void boxMethod2(long l) {System.out.println("boxMethod2 - from long");}
    void boxMethod2(Long l) {System.out.println("boxMethod2 - from Long");}
    void boxMethod2(Number l) {System.out.println("boxMethod2 - from Number");}
    
    void boxMethod3(int i) {System.out.println("from int");}
    void boxMethod3(long l) {System.out.println("from long");}
    void boxMethod3(Number l) {System.out.println("from Number");}
    
    //void boxMethod4(long l) {System.out.println("boxMethod 4 - from long");}
    void boxMethod4(int l) {System.out.println("boxMethod 4 - from int");}
    void boxMethod4(Integer i) {System.out.println("boxMethod 4 - from Integer");}
    void boxMethod4(Long i) {System.out.println("boxMethod 4 - from Long");}
    void boxMethod4(Number i) {System.out.println("boxMethod 4 - from Number");}
    
    void boxMethod5(short i) {System.out.println("boxMethod 5 - from short");}
    void boxMethod5(char i) {System.out.println("boxMethod 5 - from char");}
    //void boxMethod5(int i) {System.out.println("boxMethod 5 - from int");}
    //void boxMethod5(long i) {System.out.println("boxMethod 5 - from long");}
    void boxMethod5(Long i) {System.out.println("boxMethod 5 - from Long");}
    void boxMethod5(Short i) {System.out.println("boxMethod 5 - from Short");}
    void boxMethod5(double i) {System.out.println("boxMethod 5 - from double");}
    void boxMethod5(float i) {System.out.println("boxMethod 5 - from float");}
    void boxMethod5(Integer i) {System.out.println("boxMethod 5 - from Integer");}
    void boxMethod5(Number i) {System.out.println("boxMethod 5 - from Number");}
}
