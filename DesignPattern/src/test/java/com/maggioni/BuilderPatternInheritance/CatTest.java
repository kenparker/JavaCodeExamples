package com.maggioni.BuilderPatternInheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    Cat cat;

    @Test
    public void name() {
        cat.builder()
                .withName("hdhhd")
                .withNumberOfLegs(25)
                .build();

        cat.builder()
                .withNumberOfLegs(25)
                .withName("ddd")
                .build();


    }
}