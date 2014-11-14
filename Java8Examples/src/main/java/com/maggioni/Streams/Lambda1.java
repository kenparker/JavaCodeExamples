
package com.maggioni.Streams;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
       
        private static class Person {         
            private final String name;           
            public Person(String name) {
                this.name = name;
            }      
            public String getName() {
                return name;
            }
        }
       
       
        public static void main(String[] args) {
           
            List<Person> persons = new ArrayList<>();
            persons.add(new Person("Albert"));
            persons.add(new Person("Ben"));
            persons.add(new Person("ACharlote"));
            persons.add(new Person("Dean"));
            persons.add(new Person("Elaine"));
           
            persons.stream()
                    .filter((Person p) -> p.getName().startsWith("A"))
                    .map(p -> p.getName())
                    .sorted()
                    .forEach(name -> System.out.println(name));     
        }
       
    }

