package com.maggioni.Function;

import java.util.function.Function;

public class FunctionDemo1 {


    Function<Integer, Integer> doSomeComplicatedStuff = x -> {
        Integer y;
        y = x + 1;
        y = y * x;
        return y;
    };

    Function<Integer, String>  veryComplicatedFunction = FunctionDemo1::veryComplicated;

    public static String veryComplicated(Integer x) {
        return String.valueOf(x + 2 + 4);
    }

    // add1 demos
    Function<Integer, Integer> add1_1 = x -> x + 1;

    Function<Integer, Function<Integer, Integer>> makeAdder1_1 = x -> y -> x + y;
    Function<Integer, Integer> add1_2 = makeAdder1_1.apply(1);

    public static Function<Integer, Integer> makeAdder2(Integer x) {
        return y -> x + y;
    }
    Function<Integer, Function<Integer, Integer>> makeAdder1_2 = FunctionDemo1::makeAdder2;
    Function<Integer, Integer> add1_3 = makeAdder1_2.apply(1);

}
