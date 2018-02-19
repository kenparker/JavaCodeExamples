package com.maggioni.Predicates;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.function.Predicate;

public class PredicateIsEqualTest {

    Predicate<String> p1 = Predicate.isEqual("Hello");

    @Test
    public void test1() {
       assertTrue(p1.test("Hello"));
    }
}
