package com.maggioni.Function;

import org.junit.Test;

import java.util.function.*;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionCompositionStrategiesDemo1 {

    private Function<Integer, Integer> sum1 = x -> x + 3;
    private Function<Integer, Integer> mult3 = y -> y * 3;
    private Function<Integer, Integer> compose;

    private UnaryOperator<Integer> sum1Unary = x -> x + 3;
    private UnaryOperator<Integer> mult3Unary = y -> y * 3;

    private BinaryOperator<Function<Integer, Integer>> functionBinaryOperator = (sum, mult) -> x -> sum.apply(mult.apply(x));
    private Integer result = 5 * 3 + 3;

    private Supplier assertResultIsOK = () -> assertThat(compose.apply(5)).isEqualTo(result);

    @Test
    public void givenTwoFunctions_whenComposingWithBinaryFunction_thenResultIsOK() {
        compose = functionBinaryOperator.apply(sum1, mult3);

        assertResultIsOK.get();
    }

    @Test
    public void givenTwoFunctions_whenComposingWithCompose_thenResultIsOK() {
        compose = sum1.compose(mult3);

        assertResultIsOK.get();
    }

    @Test
    public void givenTwoUnaryOperators_whenComposingWithBinary_thenResultIsOK() {
        compose = functionBinaryOperator.apply(sum1Unary, mult3Unary);

        assertResultIsOK.get();
    }

    @Test
    public void givenTwoUnaryOperators_whenComposing_thenResultIsOK() {
        compose = sum1Unary.compose(mult3Unary);

        assertResultIsOK.get();
    }
}
