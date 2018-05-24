package com.maggioni.Currying;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class UsingCurryingDemoTest {

    // https://dzone.com/articles/whats-wrong-java-8-currying-vs
    private Integer a = 3;
    private Integer b = 22;

    private List<Integer> list = Arrays.asList(1, 4, 2);

    private List<Integer> result = Arrays.asList(25, 91, 47);

    private UsingCurryingDemo usingCurrying = new UsingCurryingDemo();

    BiConsumer<List<Integer>,List<Integer>> assertResultIsOK = (resultOfCalculate, result) -> assertThat(resultOfCalculate).isEqualTo(result);

    @Test
    public void givenCalculate1_thenResultISOK() {
        List<Integer> resultOfCalculate1 = usingCurrying.calculate1(list.stream(), a, b).collect(Collectors.toList());
        assertResultIsOK.accept(resultOfCalculate1,result);
    }

    @Test
    public void givenCalculate2_thenResultIsOK() {
        List<Integer> resultOfCalculate2 = usingCurrying.calculate2(list.stream(), a, b).collect(Collectors.toList());
        assertResultIsOK.accept(resultOfCalculate2,result);
    }

    @Test
    public void givenCalculate3_thenResultIsOK() {
        List<Integer> resultOfCalculate3 = usingCurrying.calculate3(list.stream(), a, b).collect(Collectors.toList());
        assertResultIsOK.accept(resultOfCalculate3,result);
    }
}