package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.CounterClassic;
import com.maggioni.Optional.Demo1.Eintities.CounterJava8;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DoSomethingIfPresentPatternTest {

    CounterClassic counterClassic;
    CounterJava8 counterJava8;
    
    @Test
    public void currentValue_is_one_test() {
        
        final Integer target = (Integer) 3;
        counterClassic = new CounterClassic(20, 1);
        counterClassic.increment(2);
        assertEquals(target, counterClassic.getCurrentValue());
        
        counterJava8 = new CounterJava8(20, 1);
        counterJava8.increment(2);
        assertEquals(target, counterJava8.getCurrentValue());
    }
    
    @Test
    public void currentValue_plus_value_is_above_endValue_test() {
        
        final Integer target = (Integer) 1;
        counterClassic = new CounterClassic(20, 1);
        counterClassic.increment(20);
        assertEquals(target, counterClassic.getCurrentValue());
        
        counterJava8 = new CounterJava8(20, 1);
        counterJava8.increment(20);
        assertEquals(target, counterJava8.getCurrentValue());
    }
    
    @Test
    public void currentValue_plus_value_is_below_endValue_test() {
        
        final Integer target = (Integer) 11;
        counterClassic = new CounterClassic(20, 1);
        counterClassic.increment(10);
        assertEquals(target, counterClassic.getCurrentValue());
        
        counterJava8 = new CounterJava8(20, 1);
        counterJava8.increment(10);
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
        counterJava8.increment(incrementValue);
        assertEquals(target, counterJava8.getCurrentValue());
    }
    
      
    @Test
    public void currentValue_is_null_test() {
        
        final Integer target = null;
        counterClassic = new CounterClassic(20,null);
        counterClassic.increment(10);
        assertEquals(target, counterClassic.getCurrentValue());
    }
}
