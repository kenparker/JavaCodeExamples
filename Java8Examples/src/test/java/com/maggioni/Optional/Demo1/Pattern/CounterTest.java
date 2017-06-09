package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.CounterJava7;
import com.maggioni.Optional.Demo1.Eintities.CounterJava8;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Ignore;
import org.junit.Test;

public class CounterTest {

    CounterJava7 counterJava7;
    CounterJava8 counterJava8;

    @Test
    public void currentValue_is_one_increment_is_two_test() {

        final Integer target = (Integer) 3;
        final Integer incrementValue = 2;
        counterJava7 = new CounterJava7(20, 1);
        counterJava7.increment(incrementValue);
        assertEquals(target, counterJava7.getCurrentValue());

        counterJava8 = new CounterJava8(20, 1);
        counterJava8.incrementOldPatternWithJava8(Optional.of(incrementValue));
        assertEquals(target, counterJava8.getCurrentValue());
    }

    @Test  
    public void currentValue_plus_value_is_above_endValue_test() {

        final Integer incrementValue = 20;
        final Integer target = (Integer) 1;
        counterJava7 = new CounterJava7(incrementValue, 1);
        counterJava7.increment(incrementValue);
        assertEquals(target, counterJava7.getCurrentValue());

        counterJava8 = new CounterJava8(incrementValue, 1);
        counterJava8.incrementOldPatternWithJava8(Optional.of(incrementValue));
        assertEquals(target, counterJava8.getCurrentValue());
    }

    @Test 
    public void currentValue_plus_value_is_below_endValue_test() {

        final Integer target = (Integer) 11;
        final Integer incrementValue = 10;
        counterJava7 = new CounterJava7(20, 1);
        counterJava7.increment(incrementValue);
        assertEquals(target, counterJava7.getCurrentValue());

        counterJava8 = new CounterJava8(20, 1);
        counterJava8.incrementOldPatternWithJava8(Optional.of(incrementValue));
        assertEquals(target, counterJava8.getCurrentValue());
    }

    @Test  
    public void currentValue_and_endValue_are_default_test() {

        final Integer target = (Integer) 5;
        final Integer incrementValue = 5;
        counterJava7 = new CounterJava7();
        counterJava7.increment(incrementValue);
        assertEquals(target, counterJava7.getCurrentValue());

        counterJava8 = new CounterJava8();
        counterJava8.incrementOldPatternWithJava8(Optional.of(incrementValue));
        assertEquals(target, counterJava8.getCurrentValue());
    }

    @Test 
    public void currentValue_and_incrementValue_is_Null_test() {

        final Integer target = (Integer) 15;
        final Integer incrementValue = null;
        counterJava7 = new CounterJava7(10, 15);
        counterJava7.increment(incrementValue);
        assertEquals(target, counterJava7.getCurrentValue());

        counterJava8 = new CounterJava8(10, 15);
        counterJava8.incrementOldPatternWithJava8(Optional.ofNullable(incrementValue));
        assertEquals(target, counterJava8.getCurrentValue());
    }

    @Test
    public void currentValue_is_null_test() {
        try {
            counterJava8 = new CounterJava8(Integer.MIN_VALUE, null);
            fail();
        } catch (NullPointerException e) {}

        try {
            counterJava7 = new CounterJava7(Integer.MIN_VALUE, null);
            fail();
        } catch (IllegalArgumentException e) {}
    }

    @Test
    public void currentValue_and_endValue_are_null_test() {
        try {
            counterJava8 = new CounterJava8(null, null);
            fail();
        } catch (NullPointerException e) {}
        try {
            counterJava7 = new CounterJava7(null, null);
            fail();
        } catch (IllegalArgumentException e) {}
    }
}
