package com.maggioni.Optional.Demo1.Entities;

import java.util.Optional;

public class CounterJava8WithFilterMapAndOrElse extends CounterJava8{
    
    @Override
    public void increment(Optional<Integer> incrementValue) {
        if (endValue.isPresent() && incrementValue.isPresent()) {
            currentValue = 
                    currentValue.filter(a -> (a < (endValue.get() - incrementValue.get())))
                                .map(a -> Optional.of(a + incrementValue.get()))
                                .orElse(currentValue);
        }
    }
}
