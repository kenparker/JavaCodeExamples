package com.maggioni.Predicates;

import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PredicateAndTest {

    Predicate<String> p1 = a -> a.contains("abc");
    Predicate<String> p2 = a -> a.contains("d");

    @Test
    public void testAndTrue(){
        assertTrue(p1.and(p2).test("dderfcabc"));
    }

    @Test
    public void testAndFalse() {
        assertFalse(p1.and(p2).test("fdcbad"));
    }
}
