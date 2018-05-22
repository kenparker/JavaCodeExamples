package com.maggioni.Function;

import io.vavr.Function1;
import io.vavr.Function2;
import org.junit.Test;

import java.util.function.Function;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class PartialFunctionIterationDemo {

    int total = 0;

    @Test
    public void givenAJava8PartialSum10Function_whenIteratingFrom1To5AndSumming_thenResultIs65() {
        Function<Integer, Function<Integer, Integer>> sum = a -> b -> a + b;
        Function<Integer, Integer> partialSum10 = sum.apply(10);

        total = IntStream.rangeClosed(1, 5).map(i -> partialSum10.apply(i)).sum();

        assertThat(total).isEqualTo(65);
    }

    @Test
    public void givenAVavrPartialSum10Function_whenIteratingFrom1To5AndSumming_thenResultIs65() {
        Function2<Integer, Integer, Integer> sum2 = (a, b) -> a + b;
        Function1<Integer, Integer> partialVavrSum10 = sum2.apply(10);

        total = IntStream.rangeClosed(1, 5).map(i -> partialVavrSum10.apply(i)).sum();

        assertThat(total).isEqualTo(65);
    }
}
