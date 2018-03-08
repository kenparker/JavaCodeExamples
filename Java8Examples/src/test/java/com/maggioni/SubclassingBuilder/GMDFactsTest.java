package com.maggioni.SubclassingBuilder;

import org.junit.Test;

import static org.junit.Assert.*;

public class GMDFactsTest {

    @Test
    public void name() {

        new GMDFacts.Builder().GMO(true).calories(20).build();
        new GMDFacts.Builder().calories(20).GMO(true).build();
    }
}