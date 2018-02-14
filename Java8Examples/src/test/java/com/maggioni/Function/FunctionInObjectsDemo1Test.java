package com.maggioni.Function;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.*;

public class FunctionInObjectsDemo1Test {

    FunctionInObjectsDemo1 functionObject = new FunctionInObjectsDemo1();

    @Test
    public void test1() {
        Function<Integer, Integer> fun = x -> x * 2;
        Integer resultOfCompute = functionObject.compute(fun, 3);
        assertEquals((Integer) 6, resultOfCompute);
    }

    @Test
    public void invertTheNumber() {
        Integer expectedNumber = -5;
        Integer invertedNumber1 = functionObject.invertTheNumber_WithCompute();
        Integer invertedNumber2 = functionObject.invertTheNumber_WithApply();
        Integer invertedNumber3 = functionObject.invertTheNumber_WithLambda1();
        Integer invertedNumber4 = functionObject.invertTheNumber_WithLambda2();
        assertEquals(expectedNumber, invertedNumber1);
        assertEquals(expectedNumber, invertedNumber2);
        assertEquals(expectedNumber, invertedNumber3);
        assertEquals(expectedNumber, invertedNumber4);
    }

}