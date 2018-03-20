package com.maggioni.BuilderPatternInheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    private final Integer numberOfLegs25 = 25;
    private final String ddd = "ddd";
    private final String hdhhd = "hdhhd";

    private Cat cat;
    private Siamese siamese;
    private Animal animal;

    @Test
    public void catCreationWithCatSequence1() {
        cat = cat.builder()
                .withName(hdhhd)
                .withNumberOfLegs(numberOfLegs25)
                .build();

        testCatCreationFields(cat);
    }

    @Test
    public void catCreationWithCatSequence2() {
        cat = cat.builder()
                .withNumberOfLegs(numberOfLegs25)
                .withName(hdhhd)
                .build();

        testCatCreationFields(cat);
    }

    private void testCatCreationFields(Cat cat) {
        assertEquals(hdhhd, cat.getName());
        assertEquals(numberOfLegs25, cat.getNumberOfLegs());

        animal = cat;
        assertEquals(numberOfLegs25, animal.getNumberOfLegs());
    }

    @Test
    public void catCreationWithSiamese() {
        cat  = siamese.builder()
                .withName(hdhhd)
                .withNumberOfLegs(numberOfLegs25)
                .build();

        testCatCreationFields(cat);

        siamese = (Siamese) siamese.builder()
                .withBreed("original")
                .withNumberOfLegs(numberOfLegs25)
                .withName(ddd)
                .build();
        testCatCreationFields(cat);
    }
}