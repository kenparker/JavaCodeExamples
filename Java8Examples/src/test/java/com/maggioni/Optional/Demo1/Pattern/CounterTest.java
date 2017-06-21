package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.CounterJava7;
import com.maggioni.Optional.Demo1.Eintities.CounterJava8;
import com.maggioni.Optional.Demo1.Eintities.CounterJava8AndIsPresent;
import com.maggioni.Optional.Demo1.Eintities.CounterJava8WithFilterAndMap;
import com.maggioni.Optional.Demo1.Eintities.CounterJava8WithFilterMapAndOrElse;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Ignore;
import org.junit.Test;

public class CounterTest {

    private CounterJava7 counterJava7;
    private CounterJava8 counterJava8 = new CounterJava8WithFilterAndMap();
    
    private Integer target;
    private Integer incrementValue;

    @Test
    public void currentValue_is_one_increment_is_two_test() {

        target = (Integer) 3;
        incrementValue = 2;
        counterJava7 = new CounterJava7(20, 1);
        counterJava7.increment(incrementValue);
        assertEquals(target, counterJava7.getCurrentValue());

        counterJava8.setValues(20, 1);
        counterJava8.increment(Optional.of(incrementValue));
        assertEquals(target, counterJava8.getCurrentValue());
    }

    @Test  
    public void currentValue_plus_incrementValue_is_above_endValue_test() {

        target = (Integer) 1;
        incrementValue = 20;
        counterJava7 = new CounterJava7(20, 1);
        counterJava7.increment(incrementValue);
        assertEquals(target, counterJava7.getCurrentValue());

        counterJava8.setValues(20, 1);
        counterJava8.increment(Optional.of(incrementValue));
        assertEquals(target, counterJava8.getCurrentValue());
    }

    @Test
    public void currentValue_plus_incrementValue_is_below_endValue_test() {

        target = (Integer) 11;
        incrementValue = 10;
        counterJava7 = new CounterJava7(20, 1);
        counterJava7.increment(incrementValue);
        assertEquals(target, counterJava7.getCurrentValue());

        counterJava8.setValues(20, 1);
        counterJava8.increment(Optional.of(incrementValue));
        assertEquals(target, counterJava8.getCurrentValue());
    }

    @Test  
    public void currentValue_and_endValue_are_default_test() {

        target = (Integer) 5;
        incrementValue = 5;
        counterJava7 = new CounterJava7();
        counterJava7.increment(incrementValue);
        assertEquals(target, counterJava7.getCurrentValue());

        counterJava8.setValues(10, 0);
        counterJava8.increment(Optional.of(incrementValue));
        assertEquals(target, counterJava8.getCurrentValue());
    }

    @Test 
    public void incrementValue_is_Null_test() {

        target = (Integer) 15;
        incrementValue = null;
        counterJava7 = new CounterJava7(10, 15);
        counterJava7.increment(incrementValue);
        assertEquals(target, counterJava7.getCurrentValue());

        counterJava8.setValues(10, 15);
        counterJava8.increment(Optional.ofNullable(incrementValue));
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
