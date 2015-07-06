package com.maggioni.PartI.Whizlab.Pretest.WorkingWithMethodsAndEncapsulation.first;

/*
http://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
*/
public class MethodParamDemo1 {

    public int howMany(int x, int... x2) {
        return x2.length;
    }

    public static void main(String[] args) {
        MethodParamDemo1 m = new MethodParamDemo1();
        System.out.println(m.howMany(1, 2 , 3));
        System.out.println(m.howMany(1, 2 , 3));
        int[] b = {2,3};
        System.out.println(m.howMany(1, b));
        int[] c = new int[] {1,3,4};
        System.out.println(m.howMany(1, c));
        System.out.println(m.howMany(1, new int[] {1,3,4}));
    }
}
