package com.maggioni.Optional.Demo1.Entities;

import java.util.Optional;
import java.util.function.Function;

public class CounterJava8Functions {

    static Function<Counter, Function<Integer, Optional<Counter>>> increment = counter -> integer -> increment(counter, integer);

    static Function<Integer, Function<Integer, Function<Integer, Integer>>> calculateCurrentValue = currentV -> endV -> incV ->
            currentV + incV < endV ? currentV + incV : endV;

    public static Optional<Counter> increment(Counter counter, Integer incValue) {

        if (incValue == null || counter.counterIsNotOK())
            return Optional.empty();

        Optional<Integer> newCurrentValue = counter.getCurrentValue()
                .map(currentValue -> calculateCurrentValue.apply(currentValue)
                        .apply(counter.getEndValue().get())
                        .apply(incValue));

        /*
        newCurrentValue = newCurrentValue
                .flatMap(currentValue -> counter.getEndValue()
                                                            .map(endValue -> endValue > currentValue ? endValue : currentValue));
                                                            */
        Counter newCounter = Counter.newBuilder()
                .withCurrentValue(newCurrentValue.get())
                .withEndValue(counter.getEndValue().get())
                .build();
        return Optional.of(newCounter);
    }
}
