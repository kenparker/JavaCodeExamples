package com.maggioni.Currying;

import java.util.function.Function;
import java.util.stream.Stream;


public class UsingCurryingDemo {

    Function<Integer, Function<Integer, Function<Integer, Integer>>> functionInFunctionInFunction = x -> y -> t ->  y * t + x;
    F3 functionF3 = x -> y -> t -> x + y * t;

    public Stream<Integer> calculate1(Stream<Integer> stream, Integer a, Integer b) {
        return stream.map(functionInFunctionInFunction.apply(a).apply(b));
    }

    public Stream<Integer> calculate2(Stream<Integer> stream, Integer a, Integer b) {
        return stream.map(functionF3.apply(a).apply(b));
    }

    public Function<Integer, Integer> calculation(Integer a, Integer b) {
        return functionInFunctionInFunction.apply(a).apply(b);
    }

    public Stream<Integer> calculate3(Stream<Integer> stream, Integer a, Integer b) {
        return stream.map(calculation(a, b));
    }
}

interface F3 extends Function<Integer, Function<Integer, Function<Integer, Integer>>> {

}
