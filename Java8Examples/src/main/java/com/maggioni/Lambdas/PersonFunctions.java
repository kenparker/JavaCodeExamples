package com.maggioni.Lambdas;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonFunctions {

    static Predicate<Optional<Integer>> ageOver65 = age -> age.filter(a -> a > 65).isPresent();

    static Function<List<? extends PersonInterface>, Stream<Optional<Integer>>> streamAges =(List<? extends PersonInterface> persons) -> persons.stream()
                                                                                                             .map(PersonInterface::getAge);

    static Function<Stream<Optional<Integer>>, Boolean> isAgesOver65 = stream -> stream.anyMatch(ageOver65);
    static Function<Stream<Optional<Integer>>, List<Optional<Integer>>> allElementsToList = stream -> stream.collect(Collectors.toList());

}
