package com.maggioni.Predicates;

import org.junit.Test;

import static org.junit.Assert.*;

public class PredicateDemo1Test {

    PredicateDemo1 predicate = new PredicateDemo1();

    @Test
    public void testNull() {
        String emptyString= null;
        assertTrue(predicate.isNull.test(emptyString));
        assertTrue(predicate.nonNull.negate().test(emptyString));
        assertFalse(predicate.nonNull.test(emptyString));

        assertTrue(predicate.objects.isNull(emptyString));
    }

    public void test1() {

    }
}