package com.maggioni.Function;

import java.util.function.Function;

public class FunctionInObjectsDemo1 {

    public Integer compute(Function<Integer, Integer> function, Integer number) {
        return function.apply(number);
    }

    private Integer invert(Integer value) {
        return -value;
    }

    public Integer invertTheNumber_WithCompute() {
        Integer toInvert = 5;
        Function<Integer, Integer> invertFunction = value -> invert(value);
        return compute(invertFunction,toInvert);
    }

    public Integer invertTheNumber_WithLambda1() {
        Integer toInvert = 5;
        Function<Integer, Integer> invertFunction = value -> -value;
        return compute(invertFunction,toInvert);
    }

    public Integer invertTheNumber_WithLambda2() {
        Integer toInvert = 5;

        return compute(value -> -value,toInvert);
    }

    public Integer invertTheNumber_WithApply() {
        Integer toInvert = 5;
        Function<Integer, Integer> invertFunction = value -> invert(value);
        return invertFunction.apply(toInvert);
    }
}
