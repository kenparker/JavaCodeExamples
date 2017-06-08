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
    
    public void increment3(Optional<Integer> incrementValue) {
        
        currentValue = currentValue
                .filter(a -> incrementValue.isPresent()) // the only If-Not-Null pattern
                .filter(currentValue -> currentValue < endValue.get() - incrementValue.get()) // Rejecting-some-values
                .map(currentValue -> currentValue + incrementValue.get()) // do-something
                //.map(a -> Optional.of(a + incrementValue.get())) // do-something
                //.orElse(currentValue)
                ;
    }
    
    public void incrementOldPatternWithJava8(Optional<Integer> incrementValue) {
        
        if (currentValue.isPresent() && endValue.isPresent() && incrementValue.isPresent()
                && currentValue.get() < (endValue.get() - incrementValue.get())) {
            currentValue = Optional.of(currentValue.get() + incrementValue.get());
        }
    }
    
}
