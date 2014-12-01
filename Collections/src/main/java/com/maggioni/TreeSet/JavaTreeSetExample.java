package com.maggioni.TreeSet;

import com.maggioni.TreeMap.User;
import com.maggioni.TreeMap.UserSalaryComparator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class JavaTreeSetExample {

    public static void main(String[] args) {

        //Putting Custom Objects in Sorted Order
        Set<User> userSet = new TreeSet();
        populateUser(userSet);

        System.out.println("** Users based on first Name **");
        System.out.println(userSet.toString());

        //Iterating over TreeSet using for loop
        System.out.println("** Iterating using for loop **");
        for (User user : userSet) {
            System.out.println(user.getFirstName());
        }

        //Iterating over TreeSet using Iterator
        System.out.println("** Iterating using Iterator **");
        Iterator iterator = userSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set userSetBasedOnSalary = new TreeSet(new UserSalaryComparator());
        populateUser(userSetBasedOnSalary);
        System.out.println("** Users based on salary **");
        System.out.println(userSetBasedOnSalary.toString());
        
        System.out.println("** Users based on FirstName using Comparator **");
        Set userSet1 = new TreeSet(Comparator.comparing(User::getFirstName));
        populateUser(userSet1);
        System.out.println(userSet1.toString());
        
        System.out.println("** Users based on LastName using Comparator reversed **");
        Set userSet2 = new TreeSet(Comparator.comparing(User::getLastName).reversed());
        populateUser(userSet2);
        System.out.println(userSet2.toString());

    }

    private static void populateUser(Set userSet) {
        userSet.add(new User("Anirudh", "Bhatnagar", 100));
        userSet.add(new User("Jack", "Daniel", 150));
        userSet.add(new User("Kate", "Xyz", 120));
        userSet.add(new User("Bosco", "Ceasor", 140));
    }
}
