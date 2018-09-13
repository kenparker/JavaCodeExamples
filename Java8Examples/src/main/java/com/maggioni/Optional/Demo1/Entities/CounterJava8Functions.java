package com.maggioni.Optional.Demo1.Entities;

import java.util.Optional;
import java.util.function.Function;

public class CounterJava8Functions {

    static Function<Counter, Function<Integer, Optional<Counter>>> increment = counter -> integer -> increment(counter, integer);

    static Function<Integer, Function<Integer, Function<Integer, Integer>>> calculateCurrentValue = currentV -> endV -> incV ->
    {
        Integer newCurrentValue = currentV + incV;
        return newCurrentValue < endV ? newCurrentValue : endV;
    };

    public static Optional<Counter> increment(Counter counter, Integer incValue) {

        if (incValue == null || counter.counterIsNotOK())
            return Optional.empty();

        Integer newCurrentValue = calculateCurrentValue.apply(counter.getCurrentValue().get())
                .apply(counter.getEndValue().get())
                .apply(incValue);

        Counter newCounter = Counter.newBuilder()
                .withCurrentValue(newCurrentValue)
                .withEndValue(counter.getEndValue().get())
                .build();
        return Optional.of(newCounter);
    }
}
