package com.maggioni.BuilderPatternInheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    Cat cat;
    Siamese siamese;

    @Test
    public void catCreationWithCat() {
        cat.builder()
                .withName("hdhhd")
                .withNumberOfLegs(25)
                .build();

        cat.builder()
                .withNumberOfLegs(25)
                .withName("ddd")
                .build();
    }

    @Test
    public void catCreationWithSiamese() {
        siamese.builder()
                .withName("hdhhd")
                .withNumberOfLegs(25)
                .build();

        siamese.builder()
                .withNumberOfLegs(25)
                .withName("ddd")
                .build();
    }
}