package com.maggioni.methodreferences;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReference {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 33, 23, 45, 67, 123);
        System.out.println("Method reference");
        myList.forEach(StaticMethodReference::print);
        System.out.println("lambda expression"); 
        myList.forEach(s -> StaticMethodReference.print(s));
        System.out.println("normal"); 
        for (Integer myList1 : myList) {
            StaticMethodReference.print(myList1);
        }
    }
    
    public static void print(Integer num){
        System.out.println("Number :" +  num);
    }
}
