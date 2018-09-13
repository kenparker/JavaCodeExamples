package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Entities.Counter;
import java.util.Optional;

public class DoSomethingWithCounterIfValueIsPresent {

    private Counter counter;

    public void setCounter(Counter counter) {
        this.counter = counter;
    }
    
    public void doSomethingOldWay() {
        if (counter != null) {
            doSomething();
        }
    }
    
    public void doSomethingJava8() {
        Optional<Counter> counterOfNullable = Optional.ofNullable(counter);
        counterOfNullable.ifPresent(a-> doSomething());
    }

    private void doSomething() {
        //counter.increment(1);
    }    
}
