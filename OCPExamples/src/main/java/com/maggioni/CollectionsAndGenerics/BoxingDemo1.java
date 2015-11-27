package com.maggioni.CollectionsAndGenerics;

public class BoxingDemo1 {

    public static void main(String[] args) {
       new BoxingDemo1().go();
    }
    
    int doX(Long x, Long y) {return 1;}
    int doX(long... x) {return 2;}
    int doX(Integer x, Integer y) {return 3;}
    int doX(Number n, Number m) {return 4;}

    void go() {
        short s = 7;
        System.out.print(doX(s, s) +  " "); // box short to Short and then to Number
        System.out.println(doX(7, 7));      // box int to Integer
        
    }
}
