package com.maggioni.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class ConstructorMethodReference {

    public static void main(String[] args) {
        final List<Integer> list = Arrays.asList(3,5,11,2,3,44);
        System.out.println("Method reference :");
        copyElements(list, ArrayList<Integer>::new);
        System.out.println("Lambda reference :");
        copyElements(list, () -> new ArrayList<Integer>());
        
    }
    
    private static void copyElements(final List<Integer> list, final Supplier<Collection<Integer>> targetCollection) {
        
        list.forEach(targetCollection.get()::add);
        targetCollection.get().forEach(System.out::println);
    }

}
