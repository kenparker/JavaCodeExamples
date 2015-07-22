/**
 * Copyright © 2014, Oracle and/or its affiliates. All rights reserved.
 *
 * JDK 8 MOOC Lesson 1 homework
 */
package com.maggioni.MOOC.Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import jdk.nashorn.internal.runtime.regexp.joni.constants.CCVALTYPE;

/**
 * @author Speakjava (simon.ritter@oracle.com)
 */
public class Lesson1 {

    /**
     * Run the exercises to ensure we got the right answers
     */
    public void runExercises() {
        System.out.println("JDK 8 Lambdas and Streams MOOC Lesson 1");
        System.out.println("Running exercise 1 solution...");
        exercise1();
        System.out.println("Running exercise 2 solution...");
        exercise2();
        System.out.println("Running exercise 3 solution...");
        exercise3();
        System.out.println("Running exercise 4 solution...");
        exercise4();
        System.out.println("Running exercise 5 solution...");
        exercise5();
    }

    /**
     * All exercises should be completed using Lambda expressions and the new
     * methods added to JDK 8 where appropriate. There is no need to use an
     * explicit loop in any of the code. Use method references rather than full
     * lambda expressions wherever possible.
     */
    /**
     * Exercise 1
     *
     * Create a string that consists of the first letter of each word in the
     * list of Strings provided.
     */
    private void exercise1() {
        List<String> list = Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        /* YOUR CODE HERE */
        Function<String, String> firstChar = s -> s.substring(0, 1);

        /* first version */
        StringBuilder sb1 = new StringBuilder();
        list.stream()
                .map(firstChar)
                .collect(Collectors.toList())
                .forEach(s -> sb1.append(s));
        System.out.println(" sb1 : " + sb1.toString());

        /* second version */
        StringBuilder sb2 = new StringBuilder();
        list.stream()
                .map(firstChar)
                .collect(Collectors.toList())
                .forEach(sb2::append);
        System.out.println(" sb2 : " + sb2.toString());

        /* third version */
        StringBuilder sb3 = new StringBuilder();
        list.stream()
                .forEach((li) -> {
                    sb3.append(li.substring(0, 1));
                });
        System.out.println(" sb3 : " + sb3.toString());

        /* fourth version */
        StringBuilder sb4 = new StringBuilder();
        list.stream()
                .forEach((String li) -> sb4.append(li.substring(0, 1)));
        System.out.println(" sb4 : " + sb4.toString());

    }

    /**
     * Exercise 2
     *
     * Remove the words that have odd lengths from the list.
     */
    private void exercise2() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        /* YOUR CODE HERE */
        list.removeIf(s -> s.length() % 2 > 0);
        System.out.println("list ex 2 : " +  list);
        
        list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
        /*
        http://howtodoinjava.com/2014/04/04/how-to-use-predicate-in-java-8/
        */
        Predicate<String> oddLenght = s -> s.length() % 2 > 0;
        Predicate<String> evenLenght = s -> s.length() % 2 == 0;
        System.out.println(" ex 2 list filter even :");
        list.stream()
                .filter(evenLenght)
                .forEach(s -> System.out.println(s));
        System.out.println(" ex 2 list filter odd :");
        list.stream()
                .filter(oddLenght)
                .forEach(s -> System.out.println(s));
        
        System.out.println(" ex 2 list filter odd as method :");
        list.stream()
                .filter(oddAsMethod())
                .forEach(s -> System.out.println(s));
        
        Predicate<String> anotherPredicate = new Predicate<String>() {

            @Override
            public boolean test(String t) {
                return t.length() % 2 > 0;
            }
        };
        list.stream()
                .filter(anotherPredicate)
                .forEach(s -> System.out.println(s));
        
        
        
    }
    
    private static Predicate<String> oddAsMethod() {
        return s -> s.length() % 2 > 0;
    }
    
    /*
    http://www.tutego.de/blog/javainsel/2013/05/prdikate-und-java-util-function-predicate/
    */
    private static Predicate<String> isNotOddasMethod() {
        return oddAsMethod().negate();
    }

    /**
     * Exercise 3
     *
     * Replace every word in the list with its upper case equivalent.
     */
    private void exercise3() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        /* YOUR CODE HERE */
        list.forEach(s -> System.out.println(s));
        list.replaceAll(s -> s.toUpperCase());
        list.forEach(s -> System.out.println(s));
        list.replaceAll(String::toLowerCase);
        list.forEach(s -> System.out.println(s));
    }

    /**
     * Exercise 4
     *
     * Convert every key-value pair of the map into a string and append them all
     * into a single string, in iteration order.
     */
    private void exercise4() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);

        /* YOUR CODE HERE */
        StringBuilder sb = new StringBuilder();
        map.forEach((a, b) -> sb.append(a + b));
        System.out.println(" exe 4 : " + sb.toString());

        BiConsumer<String, Integer> biFunc = (a, b) -> {
            sb.append(a + b);
        };

        sb.setLength(0);
        map.forEach(biFunc);
        System.out.println(" exe 4 : " + sb.toString());
    }

    /**
     * Exercise 5
     *
     * Create a new thread that prints the numbers from the list.
     */
    private void exercise5() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /* YOUR CODE HERE */
        new Thread(() -> {
            System.out.println(" mexe 4 1");
            list.forEach(a -> System.out.println(Thread.currentThread().getName() + a));
        }).start();

        Runnable r = () -> {
            System.out.println(" mexe 4 2");
            list.forEach(System.out::println);
        };

        new Thread(r).start();
    }

    /**
     * Main entry point for application
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lesson1 lesson = new Lesson1();
        lesson.runExercises();
    }
}
