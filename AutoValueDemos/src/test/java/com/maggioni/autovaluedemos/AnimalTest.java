package com.maggioni.autovaluedemos;

import org.assertj.core.api.ThrowableAssert;
import org.junit.Test;

import java.util.function.Consumer;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.ThrowableAssert.*;

public class AnimalTest {

    private String animalNameDog = "Dog";
    private int dogNumberOfLegs = 4;

    Consumer<Animal> assertAnimalDogIsCreated = dog1 -> {
        assertThat(dog1.name()).isEqualTo(animalNameDog);
        assertThat(dog1.numberOfLegs()).isEqualTo(dogNumberOfLegs);
    };

    @Test
    public void givenDogAttributes_whenCreateMethod_thenAnimalDogIsCreated() {
        Animal dog = Animal.create(animalNameDog, dogNumberOfLegs);

        assertAnimalDogIsCreated.accept(dog);
    }

    @Test
    public void givenTwoAnimalDogs_whenAssertEquals_thenAreEquals() {
        Animal dog1 = Animal.create(animalNameDog, dogNumberOfLegs);
        Animal dog2 = Animal.create(animalNameDog, dogNumberOfLegs);

        assertThat(dog1).isEqualTo(dog2);
    }

    @Test
    public void givenDogAttributes_whenCreateWithBuilder_thenAnimalDogIsCreated() {
        Animal dog = Animal.builder()
                .name(animalNameDog)
                .numberOfLegs(dogNumberOfLegs)
                .build();

        assertAnimalDogIsCreated.accept(dog);
    }

    @Test
    public void givenOnlyDogName_whenDogIsCreated_thenException() {

        ThrowingCallable throwingCallable = () -> Animal.builder()
                .name(animalNameDog)
                .build();
        assertThatCode(throwingCallable).isExactlyInstanceOf(IllegalStateException.class);
    }

    @Test
    public void givenOnlyDogLegs_whenDogIsCreated_thenException() {

        ThrowingCallable throwingCallable = () -> Animal.builder()
                .name(null)
                .build();
        assertThatCode(throwingCallable).isInstanceOf(NullPointerException.class);
    }
}