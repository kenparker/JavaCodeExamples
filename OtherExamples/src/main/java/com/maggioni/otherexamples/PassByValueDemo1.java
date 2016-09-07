package com.maggioni.otherexamples;

public class PassByValueDemo1 {

    public static void main(String[] args) {
        Point p1 = new Point(11, 22);
        testMet1(p1);
        System.out.println(" p1.x : " + p1.x + " p1.y : " +  p1.y); // p1.x : 11 p1.y : 22
        testMet2(p1);
        System.out.println(" p1.x : " + p1.x + " p1.y : " +  p1.y); // p1.x : 22 p1.y : 33
        
        
        String s = "my String";
        testMet3(s);
        System.out.println("s : " +  s); // s : my String
        
        s = new String("my String");
        testMet3(s);
        System.out.println("s : " +  s); // s : my String
        
        int i = 22;
        testMet4(i);
        System.out.println("i : " +  i); // i : 22
        
        Integer integer = 22;
        testMet5(integer);
        System.out.println("integer : " +  integer); // integer : 22
        
        int[] array = new int[] {2,3,4,5};
        testMet6(array);
        System.out.println("array[0] : " +  array[0]); // array[0] : 2222
    }
    
    static void testMet1(Point p2) {
        p2 = new Point(22, 33);
    }
    static void testMet2(Point p2) {
        p2.x = 22;
        p2.y = 33;
    }
    static void testMet3(String s) {
        s = "new String";
    }
    static void testMet4(int i) {
        i = 223;
    }
    static void testMet5(Integer integer) {
        integer++;
    }
    static void testMet6(int[] array) {
        array[0] = 2222;
    }

}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
}
