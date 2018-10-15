package com.maggioni.Optional.Demo1.Entities;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class CounterJava8Functions {

    public static Predicate<Counter> counterIsOK = counter -> counter.getEndValue().isPresent() && counter.getCurrentValue().isPresent();

    public static Function<Counter, Function<Integer, Optional<Integer>>> incrementCurrentValue = counter -> inc -> {
        if (inc == null || !counterIsOK.test(counter)) return Optional.empty();
        return counter.getCurrentValue().map(currentValue -> currentValue + inc)
                .filter(currentValue -> currentValue < counter.getEndValue().get());
    };

    public static Function<Counter, Function<Integer, Optional<Counter>>> incrementCurrentValueAndCreateNewCounter = counter -> incValue -> {
        Optional<Integer> currentValue = incrementCurrentValue.apply(counter).apply(incValue);
        if (!currentValue.isPresent()) return Optional.empty();
        Counter newCounter = Counter.newBuilder()
                .withCurrentValue(currentValue.get())
                .withEndValue(counter.getEndValue().get())
                .build();
        return Optional.of(newCounter);
    };

}
