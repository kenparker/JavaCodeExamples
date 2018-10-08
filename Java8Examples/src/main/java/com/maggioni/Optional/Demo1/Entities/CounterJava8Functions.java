package com.maggioni.Optional.Demo1.Entities;

import java.util.Optional;
import java.util.function.Function;

public class CounterJava8Functions {

    static Function<Counter, Function<Integer, Optional<Integer>>> incrementCurrentValue = counter -> inc ->
                     counter.getCurrentValue().map(currentValue -> currentValue + inc)
                            .filter(currentValue -> currentValue < counter.getEndValue().get());


    public static Optional<Counter> increment(Counter counter, Integer incValue) {

        if (incValue == null || counter.counterIsNotOK()) return Optional.empty();
        Optional<Integer> currentValue = CounterJava8Functions.incrementCurrentValue.apply(counter).apply(incValue);
        if (!currentValue.isPresent()) return Optional.empty();
        Counter newCounter = Counter.newBuilder()
                .withCurrentValue(currentValue.get())
                .withEndValue(counter.getEndValue().get())
                .build();
        return Optional.of(newCounter);
    }
}
