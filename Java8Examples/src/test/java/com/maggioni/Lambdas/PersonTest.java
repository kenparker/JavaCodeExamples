package com.maggioni.Lambdas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static com.maggioni.Lambdas.PersonInterface.*;
import static org.junit.Assert.*;

public class PersonTest {

    Person person;
    Integer age;
    String name;
    Gender gender;

    @Test
    public void testCreatePerson() {
        age = 25;
        name = "Angelo";
        gender = Gender.MALE;
        person = new Person.Builder().age(age).name(name).gender(gender).build();
        assertFalse(Objects.isNull(person));
        assertEquals(age,person.getAge());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateError() {
        age = null;
        name = "Angelo";
        gender = Gender.MALE;
        person = new Person.Builder().age(age).name(name).gender(gender).build();
    }
}