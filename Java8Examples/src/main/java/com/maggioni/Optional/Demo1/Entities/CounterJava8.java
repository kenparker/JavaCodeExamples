package com.maggioni.Optional.Demo1.Entities;

import java.util.Optional;

public class CounterJava8 {
    
    Optional<Integer> endValue = Optional.of(10);
    Optional<Integer> currentValue = Optional.of(0);
    
    public CounterJava8() {
    }
    
    public CounterJava8(Integer endValue, Integer currentValue) {
        this.endValue = Optional.of(endValue);
        this.currentValue = Optional.of(currentValue);
    }
    
    public void setValues(Integer endValue, Integer currentValue) {
        this.endValue = Optional.of(endValue);
        this.currentValue = Optional.of(currentValue);
    }
    
    public Integer getCurrentValue() {
        return currentValue.get();
    }
        
    public void increment(Optional<Integer> incrementValue) {
        
        if (currentValue.isPresent() && endValue.isPresent() && incrementValue.isPresent()
                && currentValue.get() < (endValue.get() - incrementValue.get())) {
            currentValue = Optional.of(currentValue.get() + incrementValue.get());
        }
    }
    
}
