package com.maggioni.Optional.Demo1.Pattern;

import com.maggioni.Optional.Demo1.Eintities.Counter;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*http://www.btaz.com/java/junit-4-error-reference-to-assertequals-is-ambiguous/*/

public class DoSomethingWithCounterIfValueIsPresentTest {
   
    private DoSomethingWithCounterIfValueIsPresent doSomethingWithCounter = new DoSomethingWithCounterIfValueIsPresent();;
    private Counter counter;
    

    @Test
    public void Counter_is_Null_test() {
        
        setupCounterNull();       
        doSomethingWithCounter.doSomethingJava8();
        Assert.assertNull(this.counter);
        
        setupCounterNull();
        doSomethingWithCounter.doSomethingOldWay();
        Assert.assertNull(this.counter);
    }

    private void setupCounterNull() {
        Counter counter = null;
        doSomethingWithCounter.setCounter(counter);
    }
    
    @Test
    public void Counter_is_Default_test() {
        
        setupCounterDefault();
        doSomethingWithCounter.doSomethingJava8();       
        assertEquals((Integer) 1, counter.getCurrentValue());
        
        setupCounterDefault();
        doSomethingWithCounter.doSomethingOldWay();
        assertEquals((Integer) 1, counter.getCurrentValue());
    }

    private void setupCounterDefault() {
        counter = new Counter();
        doSomethingWithCounter.setCounter(counter);
    }
    
    @Test
    public void Counter_currentValue_is_10_test() {
        
        setupCounterCurrentValueIs10();
        doSomethingWithCounter.doSomethingJava8();
        assertEquals((Integer) 11, counter.getCurrentValue());
        
        setupCounterCurrentValueIs10();
        doSomethingWithCounter.doSomethingOldWay();
        assertEquals((Integer) 11, counter.getCurrentValue());
    }

    private void setupCounterCurrentValueIs10() {
        counter =  new Counter(20,10);
        doSomethingWithCounter.setCounter(counter);
    }
    
    
    @Test
    public void Counter_endValue_is_20_test() {
        
        setupCounterEndValueIs20();
        doSomethingWithCounter.doSomethingJava8();
        assertEquals((Integer) 25, counter.getCurrentValue());
        
        setupCounterEndValueIs20();
        doSomethingWithCounter.doSomethingOldWay();
        assertEquals((Integer) 25, counter.getCurrentValue());
    }
    
    private void setupCounterEndValueIs20() {
        counter =  new Counter(20,25);
        doSomethingWithCounter.setCounter(counter);
    }
}
