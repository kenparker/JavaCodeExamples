package com.maggioni.Lambdas;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonFunctions {

    static Predicate<Integer> ageOver65 = age -> age > 65;

    static Function<List<? extends PersonInterface>, Stream<Integer>> streamAges =(List<? extends PersonInterface> persons) -> persons.stream()
                                                                                                             .map(PersonInterface::getAge);

    static Function<Stream<Integer>, Boolean> isAgesOver65 = stream -> stream.anyMatch(ageOver65);
    static Function<Stream<Integer>, List<Integer>> allElementsToList = stream -> stream.collect(Collectors.toList());

   static Function<List<? extends PersonInterface>, Boolean> sss = persons -> {
       Stream<Integer> integerStream = persons.stream().map(PersonInterface::getAge);
       return integerStream.anyMatch(ageOver65);
   };

}
