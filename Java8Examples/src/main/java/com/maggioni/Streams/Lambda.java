package com.maggioni.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * http://www.dzone.com/links/r/java_8_streams_explained_in_5_minutes.html
 */
public class Lambda {

    private enum Gender {MALE, FEMALE};
    
    public static class Person {
        
        private final String name;
        private final int  age;
        private final Gender gender;

        public Person(String name, int age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }
                
    }
    
    public static void main(String[] args) {
        
        List persons = new ArrayList<Object>();
        persons.add(new Person("angelo", 50, Lambda.Gender.MALE));
         persons.add(new Person("paolo", 10, Lambda.Gender.MALE));
          persons.add(new Person("giuseppe", 5, Lambda.Gender.MALE));
           persons.add(new Person("andrea", 22, Lambda.Gender.FEMALE));
            persons.add(new Person("guglielmo", 2, Lambda.Gender.FEMALE));
           
            printNames(persons, p -> p. < 18);
            
            printNames(persons, p -> p.getGender() == Gender.MALE);
            
    }
    
    private static void printNames(List persons, Predicate predicate) {
        
        persons.stream()
                .filter(predicate)
                .map(p -> p.getName())
                .sorted()
                .forEach(name -> System.out.println("name"));
               
    }
    
}
