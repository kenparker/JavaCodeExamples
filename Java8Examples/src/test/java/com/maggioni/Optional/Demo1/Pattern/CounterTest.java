package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.CounterClassic;
import com.maggioni.Optional.Demo1.Eintities.CounterJava8;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CounterTest {

    CounterClassic counterClassic;
    CounterJava8 counterJava8;

    @Test
    public void currentValue_is_one_increment_is_two_test() {

        final Integer target = (Integer) 3;
        final Integer incrementValue = 2;
        counterClassic = new CounterClassic(20, 1);
        counterClassic.increment(incrementValue);
        assertEquals(target, counterClassic.getCurrentValue());

        counterJava8 = new CounterJava8(20, 1);
        counterJava8.increment(Optional.of(incrementValue));
        assertEquals(target, counterJava8.getCurrentValue());
    }

    @Test
    public void currentValue_plus_value_is_above_endValue_test() {

        final Integer incrementValue = 20;
        final Integer target = (Integer) 1;
        counterClassic = new CounterClassic(incrementValue, 1);
        counterClassic.increment(incrementValue);
        assertEquals(target, counterClassic.getCurrentValue());

        counterJava8 = new CounterJava8(incrementValue, 1);
        counterJava8.increment(Optional.of(incrementValue));
        assertEquals(target, counterJava8.getCurrentValue());
    }

    @Test
    public void currentValue_plus_value_is_below_endValue_test() {

        final Integer target = (Integer) 11;
        final Integer incrementValue = 10;
        counterClassic = new CounterClassic(20, 1);
        counterClassic.increment(incrementValue);
        assertEquals(target, counterClassic.getCurrentValue());

        counterJava8 = new CounterJava8(20, 1);
        counterJava8.increment(Optional.of(incrementValue));
        assertEquals(target, counterJava8.getCurrentValue());
    }

    @Test
    public void currentValue_and_endValue_are_default_test() {

        final Integer target = (Integer) 5;
        final Integer incrementValue = 5;
        counterClassic = new CounterClassic();
        counterClassic.increment(incrementValue);
        assertEquals(target, counterClassic.getCurrentValue());

        counterJava8 = new CounterJava8();
        counterJava8.increment(Optional.of(incrementValue));
        assertEquals(target, counterJava8.getCurrentValue());
    }
    
    
    @Test
    public void currentValue_and_incrementValue_is_Null_test() {

        final Integer target = (Integer) 15;
        final Integer incrementValue = null;
        counterClassic = new CounterClassic(10,15);
        counterClassic.increment(incrementValue);
        assertEquals(target, counterClassic.getCurrentValue());

        counterJava8 = new CounterJava8(10,15);
        counterJava8.increment(Optional.ofNullable(incrementValue));
        assertEquals(target, counterJava8.getCurrentValue());
    }

    @Test
    public void currentValue_is_null_classic_test() {

        final Integer target = null;
        counterClassic = new CounterClassic(20, null);
        counterClassic.increment(10);
        assertEquals(target, counterClassic.getCurrentValue());
    }

    @Test(expected = NullPointerException.class)
    public void currentValue_is_null_Java8_test() {
        counterJava8 = new CounterJava8(Integer.MIN_VALUE, null);
    }

    @Test(expected = NullPointerException.class)
    public void currentValue_and_endValue_are_null_test() {
        counterJava8 = new CounterJava8(null, null);
    }
}
