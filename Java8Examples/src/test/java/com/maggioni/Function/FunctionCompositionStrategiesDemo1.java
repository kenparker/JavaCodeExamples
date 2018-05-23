package com.maggioni.Function;

import org.junit.Test;

import java.util.function.*;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionCompositionStrategiesDemo1 {

    private static Integer FIRSTNUMBER = 5;
    private static Integer SECONDNUMBER = 3;

    private UnaryOperator<Integer> sum1 = x -> x + SECONDNUMBER;
    private UnaryOperator<Integer> mult1 = x -> x * SECONDNUMBER;

    private Function<Integer, Integer> sum1Func = x -> sum1.apply(x);
    private Function<Integer, Integer> mult3Func = y -> mult1.apply(y);
    private Function<Integer, Integer> compose;

    private UnaryOperator<Integer> sum1Unary = x -> sum1.apply(x);
    private UnaryOperator<Integer> mult3Unary = y -> mult1.apply(y);

    private BinaryOperator<Function<Integer, Integer>> binaryComposer = (sum, mult) -> x -> sum.apply(mult.apply(x));
    private Integer result = FIRSTNUMBER * SECONDNUMBER + SECONDNUMBER;

    private Supplier assertResultIsOK = () -> assertThat(compose.apply(FIRSTNUMBER)).isEqualTo(result);

    @Test
    public void givenTwoFunctions_whenComposingWithBinaryFunction_thenResultIsOK() {
        compose = binaryComposer.apply(sum1Func, mult3Func);

        assertResultIsOK.get();
    }

    @Test
    public void givenTwoFunctions_whenComposingWithCompose_thenResultIsOK() {
        compose = sum1Func.compose(mult3Func);

        assertResultIsOK.get();
    }

    @Test
    public void givenTwoUnaryOperators_whenComposingWithBinary_thenResultIsOK() {
        compose = binaryComposer.apply(sum1Unary, mult3Unary);

        assertResultIsOK.get();
    }

    @Test
    public void givenTwoUnaryOperators_whenComposing_thenResultIsOK() {
        compose = sum1Unary.compose(mult3Unary);

        assertResultIsOK.get();
    }
}
