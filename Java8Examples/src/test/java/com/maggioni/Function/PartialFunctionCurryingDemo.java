package com.maggioni.Function;

import io.vavr.Function1;
import io.vavr.Function2;
import io.vavr.Function3;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.*;

public class PartialFunctionCurryingDemo {

    Function<Integer, Function<Integer, Function<Integer, Integer>>> sumTri = a -> b -> c -> a + b + c;
    Function<Integer, Function<Integer, UnaryOperator<Integer>>> sumTriUn = a -> b -> c -> a + b + c;
    BiFunction<Integer, Integer, UnaryOperator<Integer>> sumTriBi = (a, b) -> c -> a + b + c;
    Function<Integer, Function<Integer, Function<Integer, Integer>>> sumTriM = a -> b -> c -> sumTriMethod(a,b,c);
    Function3<Integer, Integer, Integer, Integer> sum3 = (a,b,c) -> a + b + c;

    Integer in1 = 12;
    Integer in2 = 22;
    Integer in3 = 3;
    Integer total = 37;

        Integer sumOfTri;
        Integer sumOf3;
    @Test
    public void givenThreeIntegers_whenSum3Function_thenResultIs37() {
        sumOfTri = sumTri.apply(in1).apply(in2).apply(in3);
        assertThat(sumOfTri)
                .isEqualTo(total);
        sumOfTri = sumTriM.apply(in1).apply(in2).apply(in3);
        assertThat(sumOfTri)
                .isEqualTo(total);
        sumOfTri = sumTriUn.apply(in1).apply(in2).apply(in3);
        assertThat(sumOfTri)
                .isEqualTo(total);
        sumOfTri = sumTriBi.apply(in1, in2).apply(in3);
        assertThat(sumOfTri)
                .isEqualTo(total);
        sumOf3 = sum3.apply(in1, in2, in3);
        assertThat(sumOf3)
                .isEqualTo(total);
    }

    @Test
    public void givenTwoIntegers_whenSum3Function_thenResultIs() {
        Function<Integer, Integer> partSumTri = sumTri.apply(in1).apply(in2);
        Function1<Integer, Integer> partSum3 = sum3.apply(in1, in2);
        assertThat(partSumTri.apply(0))
                .isEqualTo(partSum3.apply(0));

    }

    private Integer sumTriMethod(Integer a, Integer b, Integer c) {
        return a +b + c;
    }
}
