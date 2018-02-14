package com.maggioni.Function;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionInObjectsDemo2Test {

    FunctionInObjectsDemo2 fun = new FunctionInObjectsDemo2();

    @Test
    public void test1() {
        Integer expected = 4;
        Integer result = fun.calc.apply(2);
        assertEquals(expected, result);
    }

}