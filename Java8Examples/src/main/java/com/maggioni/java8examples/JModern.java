package com.maggioni.java8examples;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;

public class JModern {

    public static void main(String[] args) {

        // generate a list of 100 random names
        List<String> students = range(0, 100).mapToObj(i -> randomString(new Random(), 'A', 'Z', 10)).collect(toList());

        // sort names and group by the first letter
        Map<Character, List<String>> directory = students.stream().sorted().collect(groupingBy(name -> name.charAt(0)));

        // print a nicely-formatted student directory
        directory.forEach((letter, names) -> System.out.println(letter + "nt" + names.stream().collect(Collectors.joining("nt"))));
    }

    public static String randomString(Random r, char from, char to, int length) {
        return r.ints(from, to + 1).limit(length).mapToObj(x -> Character.toString((char) x)).collect(Collectors.joining());
    }
}
