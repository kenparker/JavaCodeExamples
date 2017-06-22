package com.maggioni.Optional.Demo1.Entities;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Counter {

    private Optional<Integer> endValue;
    private Optional<Integer> currentValue;

    public Counter() {
        this(10, 0);
    }

    public Counter(Integer endValue, Integer currentValue) {
        this.endValue = Optional.of(endValue);
        this.currentValue = Optional.of(currentValue);
    }

    public Integer getCurrentValue() {
        return currentValue.get();
    }

    public void incrementOldWay(Integer value) {

        Integer newCurrentValue = currentValue.get() + value;
        if (newCurrentValue != null && newCurrentValue <= endValue.get()) {
            currentValue = Optional.of(newCurrentValue);
        }
    }
  
    public void increment(Integer value) {

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

}
