package com.maggioni.HashMap.OCP;

import java.util.HashSet;

public class Twist4_52 {

    public static void main(String[] args) {
        HashSet<Person2> set = new HashSet<>();
        Person2 p1 = new Person2("Harry");
        Person2 p2 = new Person2("Shreya");
        Person2 p3 = new Person2("Selvan");
        Person2 p4 = new Person2("Shreya");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(" p2 == p4 :" + (p2 == p4)); // true
        System.out.println("set size : " + set.size()); // 1
        set.stream()
                .forEach(e -> System.out.println(e));   // "Harry" which is the first element
        set.stream()
                .forEach(System.out::println);
    }

}
