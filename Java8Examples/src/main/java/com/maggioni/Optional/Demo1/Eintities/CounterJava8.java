package com.maggioni.Optional.Demo1.Eintities;

import java.util.Optional;

public class CounterJava8 {

    private Optional<Integer> endValue;
    private Optional<Integer> currentValue;

    public CounterJava8() {
        this(10, 0);
    }

    public CounterJava8(Integer endValue, Integer currentValue) {
        this.endValue = Optional.of(endValue);
        this.currentValue = Optional.of(currentValue);
    }

    public Integer getCurrentValue() {
        return currentValue.get();
    }

    public void increment(Integer value) {
        
        currentValue = currentValue
                .filter(a -> a < endValue.get() - value)
                .map(a -> Optional.of(a + value))
                .orElse(currentValue);    
    }
    
}
