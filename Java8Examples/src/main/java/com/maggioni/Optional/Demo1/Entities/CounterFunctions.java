package com.maggioni.Optional.Demo1.Entities;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CounterFunctions {

    public void incrementOldWay(Counter counter, Integer incValue) {

        Integer newCurrentValue = counter.getCurrentValue().get() + incValue;
        if (newCurrentValue != null && newCurrentValue <= counter.getEndValue().get()) {
            //currentValue = Optional.of(newCurrentValue);
        }
    }
/*
    public void incrementCurrentValueAndCreateNewCounter(Integer value) {

        Optional<Integer> newCurrentValue = calculateNewCurrentValue(currentValue.get(), value);
        final Optional<Integer> filter = newCurrentValue.filter(newCurrentValueIsLessThenEndValue());
        //currentValue = filter
        filter.ifPresent(doSomething());
    }

    private Predicate<Integer> newCurrentValueIsLessThenEndValue() {
        return a -> a <= endValue.get();
    }

    private Optional<Integer> calculateNewCurrentValue(Integer currentValue, Integer value) {
        return Optional.of(currentValue + value);
    }

    private Consumer<Integer> doSomething() {
        return b -> currentValue = Optional.of(b);
    }
*/
}
