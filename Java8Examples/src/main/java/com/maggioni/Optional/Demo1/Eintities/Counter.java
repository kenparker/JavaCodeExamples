package com.maggioni.Optional.Demo1.Eintities;

import java.util.Optional;

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
    
    public void increment(int value) {
        
        int newCurrentValue = currentValue.get() + value;
        if (newCurrentValue <= endValue.get()) {
            currentValue = Optional.of(newCurrentValue);
        }        
    }
    
}
