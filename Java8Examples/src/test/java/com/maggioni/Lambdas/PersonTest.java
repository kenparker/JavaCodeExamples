package com.maggioni.Lambdas;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

import static com.maggioni.Lambdas.PersonInterface.*;
import static org.junit.Assert.*;

public class PersonTest {

    Person person;
    Integer age;
    String name;
    Gender gender;
    List<Person> persons = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        persons.add(new Person.Builder().age(10).name("Angelo").gender(Gender.MALE).build());
        persons.add(new Person.Builder().age(66).name("Marco").gender(Gender.MALE).build());
        persons.add(new Person.Builder().age(77).name("Paolo").gender(Gender.MALE).build());
    }

    @Test
    public void testCreatePerson() {
        age = 25;
        name = "Angelo";
        gender = Gender.MALE;
        person = new Person.Builder().age(age).name(name).gender(gender).build();
        assertFalse(Objects.isNull(person));
        assertEquals(Optional.of(age),person.getAge());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateError() {
        age = null;
        name = "Angelo";
        gender = Gender.MALE;
        person = new Person.Builder().age(age).name(name).gender(gender).build();
    }

    @Test
    public void testStreamOfAges() {
        Stream<Optional<Integer>> stream = PersonFunctions.streamAges.apply(persons);
        assertTrue(stream.anyMatch(age -> age.filter(a -> (a == 10 || a == 66)).isPresent()));
    }

    @Test
    public void testAnyStreamOver65() {
        Stream<Optional<Integer>> streamOfAges = PersonFunctions.streamAges.apply(persons);
        Boolean isOver65 = PersonFunctions.isAnyAgesOver65.apply(streamOfAges);
        assertTrue(isOver65);
    }

    @Test
    public void testAllStreamOver65() {
        Stream<Optional<Integer>> streamOfAges = PersonFunctions.streamAges.apply(persons);
        Boolean isOver65 = PersonFunctions.isAllAgesOver65.apply(streamOfAges);
        assertFalse(isOver65);
    }

    @Test
    public void testStreamToList() {
        Stream<Optional<Integer>> streamOfAges = PersonFunctions.streamAges.apply(persons);
        List<Optional<Integer>> apply = PersonFunctions.allElementsToList.apply(streamOfAges);
        assertTrue(apply.size()==3);
    }
}