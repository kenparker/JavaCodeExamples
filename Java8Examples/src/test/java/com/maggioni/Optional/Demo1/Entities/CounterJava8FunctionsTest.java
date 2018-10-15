package com.maggioni.Optional.Demo1.Entities;

import org.assertj.core.api.Condition;
import org.junit.Test;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.*;

public class CounterJava8FunctionsTest {

    Condition<Optional<Counter>> currentValueIsOK = new Condition<Optional<Counter>>() {
        @Override
        public boolean matches(Optional<Counter> optionalCounter) {
            Predicate<Counter> currentValueOk = counter1 -> counter1.getCurrentValue().get() == 23;
            return optionalCounter.filter(currentValueOk).isPresent();
        }

        ;
    };

    Counter counter = Counter.newBuilder()
            .withEndValue(200)
            .withCurrentValue(10)
            .build();
    Function<Integer, Optional<Counter>> partial = CounterJava8Functions.incrementCurrentValueAndCreateNewCounter.apply(counter);

    @Test
    public void givenAnEmptyCounter_whenIncrement_thenResultIsEmptyCounter() {
        Counter counter = Counter.newBuilder().build();
        Optional<Counter> newCounter = CounterJava8Functions.incrementCurrentValueAndCreateNewCounter.apply(counter).apply(10);
        assertThat(newCounter).isEmpty();
    }

    @Test
    public void givenAValidCounter_whenIncrement_thenNewCounterIsCreatedAndResultIsCorrect() {
        Optional<Counter> newCounter = partial.apply(13);
        assertThat(newCounter).isNotEmpty()
                .is(currentValueIsOK);
    }

    @Test
    public void givenAValidCounter_whenIncrementGreaterThenEndValue_thenResultIsEmptyCounter() {
        Optional<Counter> newCounter = partial.apply(250);
        assertThat(newCounter).isEmpty();
    }
}