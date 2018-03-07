package com.maggioni.Lambdas;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonFunctions {

    Predicate<Integer> ageOver65 = age -> age > 65;


    Function<List<PersonInterface>, Boolean> filterPersonsOver65 = (List<PersonInterface> persons) -> persons.stream()
                                                                            .map(PersonInterface::getAge)
                                                                            .anyMatch(ageOver65);

}
