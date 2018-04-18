package com.maggioni.Streams;

import com.maggioni.Lambdas.Person;
import com.maggioni.Lambdas.PersonInterface;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class MapAndFlatMapDifference {
    // http://www.baeldung.com/java-difference-map-and-flatmap

    private List<Person> personList1;
    private List<Person> personList2;
    private List<List<Person>> listOfPersons;

    @Before
    public void setUp() throws Exception {
        personList1 = new ArrayList<>();
        personList1.add(new Person.PersonBuilder()
                .age(22)
                .name("Petro")
                .gender(PersonInterface.Gender.MALE)
                .build());
        personList1.add(new Person.PersonBuilder()
                .age(81)
                .name("Sandro")
                .gender(PersonInterface.Gender.MALE)
                .build());
        personList1.add(new Person.PersonBuilder()
                .age(35)
                .name("Paolo")
                .gender(PersonInterface.Gender.MALE)
                .build());
        personList1.add(new Person.PersonBuilder()
                .age(46)
                .name("Sandra")
                .gender(PersonInterface.Gender.FEMALE)
                .build());

        listOfPersons = new ArrayList<>();
        listOfPersons.add(personList1);

        personList2 = new ArrayList<>();
        personList2.add(new Person.PersonBuilder()
                .age(46)
                .name("Jenny")
                .gender(PersonInterface.Gender.FEMALE)
                .build());
        personList2.add(new Person.PersonBuilder()
                .age(58)
                .name("Tom")
                .gender(PersonInterface.Gender.MALE)
                .build());
        personList2.add(new Person.PersonBuilder()
                .age(74)
                .name("Karl")
                .gender(PersonInterface.Gender.MALE)
                .build());
        personList2.add(new Person.PersonBuilder()
                .age(19)
                .name("Helen")
                .gender(PersonInterface.Gender.FEMALE)
                .build());
        personList2.add(new Person.PersonBuilder()
                .age(52)
                .name("Sally")
                .gender(PersonInterface.Gender.FEMALE)
                .build());

        listOfPersons.add(personList2);

    }

    @Test
    public void testOptionalMap() {
        Optional<String> nonEmptyGender = Optional.of("male");
        Optional<String> emptyGender = Optional.empty();

        assertEquals(Optional.of("male"), nonEmptyGender.map(String::toString));
        assertEquals("male", nonEmptyGender.get());
        assertEquals(Optional.empty(), emptyGender.map(String::toString));
    }

    @Test
    public void testOptionalMapAndFlatMap() {
        Function<String, Optional<String>> returnOptional = s -> Optional.of(s);
        String angelo = "Angelo";

        Optional<Optional<String>> optionalStringOptional = Optional.of(angelo)
                                                                    .map(returnOptional);
        assertEquals(Optional.of(Optional.of(angelo)), optionalStringOptional);

        Optional<String> stringOptional = Optional.of(angelo)
                                                  .flatMap(returnOptional);
        assertEquals(Optional.of(angelo), stringOptional);
    }

    /*
    <R> Stream<R>     map(Function<? super T, ? extends R> mapper);
    <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
     */

    @Test
    public void testMapAndFlatMap() {
        Stream<List<Person>> listStream = listOfPersons.stream()
                .map(people -> people);
        listStream
                .forEach(System.out::println);

        Stream<Person> personStream = listOfPersons.stream()
                .flatMap(Collection::stream);
        personStream
                .forEach(System.out::println);
    }

    @Test
    public void testMapWithFunctions() {
        Function<? super List<Person>, ?> iterateOverList = people -> people;
        listOfPersons.stream()
                .map(iterateOverList)
                .forEach(System.out::println);

        Function<? super List<Person>, ?> getSize = people -> people.size();
        listOfPersons.stream()
                .map(getSize)
                .forEach(System.out::println);
    }

    @Test
    public void testFlatMapWithFunctions() {
        Function<? super List<Person>, ? extends Stream<?>> transformList = people -> people.stream();
        listOfPersons.stream()
                .flatMap(transformList)
                .forEach(System.out::println);

        Function<? super List<Person>, ? extends Stream<?>> flatting = people -> people.stream()
                                                                                    .map(person -> person.getName().get().toUpperCase());
        listOfPersons.stream()
                .flatMap(flatting)
                .sorted()
                .forEach(System.out::println);
    }
}
