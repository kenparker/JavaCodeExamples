package com.maggioni.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * http://examples.javacodegeeks.com/core-java/util/treemap/java-util-treemap-example/
 */
public class JavaTreeMapExample {

    public static void main(String[] args) {

        //Natural ordering of User
        Map<User, String> userMap = new TreeMap();
        populateUserMap(userMap);

        System.out.println(userMap.toString());

        diplayMap(userMap);
        
        
        //Ordering based on Comparator on salary

        Map userSalaryMap = new TreeMap(new UserSalaryComparator());
        populateUserMap(userSalaryMap);
        System.out.println(" *** BASED ON SALARY ***");
        diplayMap(userSalaryMap);

    }

    private static void diplayMap(Map userMap) {
        Set<User> keySet = userMap.keySet();
        for (User user : keySet) {
            System.out.println(user.toString());
        }
    }

    private static void populateUserMap(Map userMap) {
        userMap.put(new User("XYZ", "WER", 22), "My Name3");
        userMap.put(new User("SSS", "TER", 1), "My Name4");
        userMap.put(new User("Ani", "Bha", 12), "My Name1");
        userMap.put(new User("Cal", "YYY", 15), "My Name2");

    }

}
