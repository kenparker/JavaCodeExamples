package com.maggioni.HashMap.OCP;

import java.util.HashSet;

public class Twist4_54 {

    public static void main(String[] args) {
        HashSet<Person4> set = new HashSet<>();
        Person4 p1 = new Person4("Harry");
        Person4 p2 = new Person4("Shreya");
        Person4 p3 = new Person4("Selvan");
        Person4 p4 = new Person4("Shreya");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(" p2 == p4 :" + (p2 == p4)); // false
        System.out.println(" (p2.equals(p4) :" + (p2.equals(p4))); // true
        System.out.println("set size : " + set.size()); // 4
        set.stream()
                .forEach(e -> System.out.println(e));   // 
        
        set.stream()
                .forEach(System.out::println);
    }

}
