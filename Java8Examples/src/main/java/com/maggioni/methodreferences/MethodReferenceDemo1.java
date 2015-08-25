package com.maggioni.methodreferences;

import java.util.Arrays;
import java.util.function.Consumer;

public class MethodReferenceDemo1 {

    public static void main(String[] args) {

        int[] array = {200,14,158,1,5};
        Consumer<int[]> consumer1 = Arrays::sort;
        consumer1.accept(array);
        for (int b : array) {
            System.out.println(b);
        }
        
        Consumer<int[]> consumer2 = a -> Arrays.sort(a);
        consumer2.accept(array);        
        Arrays.stream(array).forEach(System.out::println);
    }

}
