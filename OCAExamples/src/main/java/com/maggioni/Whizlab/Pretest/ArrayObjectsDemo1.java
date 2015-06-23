package com.maggioni.Whizlab.Pretest;

public class ArrayObjectsDemo1 {

    public static void main(String[] args) {
        Animal[] animal = new Animal[25];
        System.out.println("Animal[] "+ animal[1]);
        Animal an = animal[0];
        
        Object obj1 = new int[10];
        System.out.println(""+obj1);
        Object[] obj5 = new Integer[25];
        System.out.println(""+obj5[-1]);// ArrayIndexOutOfBoundException
        System.out.println(""+args[0]); // ArrayIndexOutOfBoundException
        //Object[] obj2 = new int[13];
        Object[] obj3 = new String[-10]; // NegativeArraySizeException
        Object[] obj4 = new Integer[25];
        
        obj3 = obj4;
        obj3 = (Object[])obj1;  // ClassCastException
        obj3 = (Object[])obj5;  // ClassCastException
        
        
    }

}
