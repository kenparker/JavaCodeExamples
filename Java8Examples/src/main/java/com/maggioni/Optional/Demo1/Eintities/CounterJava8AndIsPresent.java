package com.maggioni.Optional.Demo1.Eintities;

import java.util.Optional;

public class CounterJava8AndIsPresent extends CounterJava8{
    @Override
    public void increment(Optional<Integer> incrementValue) {
        if (endValue.isPresent() && incrementValue.isPresent()) {
            
            Optional<Integer> map = currentValue.filter(a -> (a < (endValue.get() - incrementValue.get())))
                    .map(a -> a + incrementValue.get());
            if (map.isPresent()) {
                currentValue = map;
            }            
        }
    }
}
