
package com.maggioni.methodreferences;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ParticularInstanceMethodReference {
    public static void main(String[] args) {
        
        List<Integer> myList = Arrays.asList(2,55,3,1,78,55);
        MyComparator myComparator = new MyComparator();
        System.out.println("Method reference :");
        Collections.sort(myList, myComparator::compare);
        myList.forEach(System.out::println);
        System.out.println("Lamda expression :");
        Collections.sort(myList, (a,b) -> myComparator.compare(a, b));
        myList.forEach(System.out::println);
        
    }
    
    private static class MyComparator {
        public Integer compare(Integer a, Integer b){
            return a.compareTo(b);
        }
    }
}
