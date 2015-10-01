package com.maggioni.HashMap.OCP;

import java.util.HashSet;

public class Twist4_5 {

    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("Harry");
        Person p2 = new Person("Shreya");
        Person p3 = new Person("Selvan");
        Person p4 = new Person("Shreya");
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
