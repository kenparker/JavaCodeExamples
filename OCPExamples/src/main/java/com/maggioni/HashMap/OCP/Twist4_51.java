package com.maggioni.HashMap.OCP;

import java.util.HashSet;

public class Twist4_51 {

    public static void main(String[] args) {
        HashSet<Person1> set = new HashSet<>();
        Person1 p1 = new Person1("Harry");
        Person1 p2 = new Person1("Shreya");
        Person1 p3 = new Person1("Selvan");
        Person1 p4 = new Person1("Shreya");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(" p2 == p4 :" + (p2 == p4));
        System.out.println("set size : " + set.size());
        set.stream()
                .forEach(e -> System.out.println(e));
    }

}
