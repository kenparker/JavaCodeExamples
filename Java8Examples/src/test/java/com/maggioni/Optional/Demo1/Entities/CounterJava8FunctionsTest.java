package com.maggioni.Optional.Demo1.Entities;

import org.assertj.core.api.Condition;
import org.junit.Test;

import java.util.Optional;
import java.util.function.Predicate;

import  static org.assertj.core.api.Assertions.*;

public class CounterJava8FunctionsTest {

    Condition<Optional<Counter>> currentValueIsOK = new Condition<Optional<Counter>>() {
        @Override
        public boolean matches(Optional<Counter> optionalCounter) {
            Predicate<Counter> currentValueOk = counter1 -> counter1.getCurrentValue().get() == 22;
            return optionalCounter.filter(currentValueOk).isPresent();
        };
    };

    @Test
    public void givenAnEmptyCounter_whenIncrement_thenResultIsEmptyCounter() {
        Counter counter = Counter.newBuilder().build();
        Optional<Counter> newCounter = CounterJava8Functions.increment(counter, 10);
        assertThat(newCounter).isEmpty();
    }

    @Test
    public void givenAValidCounter_whenIncrement_thenNewCounterIsCreatedAndResultIsCorrect() {
        Counter counter = Counter.newBuilder()
                .withEndValue(200)
                .withCurrentValue(10)
                .build();
        Optional<Counter> newCounter = CounterJava8Functions.increment(counter, 12);
        assertThat(newCounter).isNotEmpty()
                .is(currentValueIsOK);


    }
}