package com.maggioni.Function;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class FunctionComposeDemo1 {

    Function<Integer, Integer> mult = a -> a * 2;
    Function<Integer, Integer> min = a -> a - 2;

    @Test
    public void testCompose() {
        Integer expected = 6;
        Integer compose = mult.compose(min).apply(5);
        assertEquals(expected, compose);
    }

    @Test
    public void testAndThen() {
        Integer expected = 8;
        Integer andThen = mult.andThen(min).apply(5);
        assertEquals(expected,andThen);
    }
}
