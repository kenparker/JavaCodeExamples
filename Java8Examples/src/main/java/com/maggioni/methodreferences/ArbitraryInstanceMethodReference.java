package com.maggioni.methodreferences;


import java.util.Arrays;
import java.util.List;

public class ArbitraryInstanceMethodReference {

    public static void main(String[] args) {
        List<Person> person = Arrays.asList(new Person("Elena"), new Person("Angelo"), new Person("Carla"));
        
        System.out.println("Method reference :");
        person.forEach(Person::printName);
        person.forEach(System.out::println);
        
        System.out.println("Lambda expression :");
        person.forEach(a -> a.printName());
    }

    private static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }
        public void printName() {
            System.out.println("name : " +  name);
        }
    }
}
