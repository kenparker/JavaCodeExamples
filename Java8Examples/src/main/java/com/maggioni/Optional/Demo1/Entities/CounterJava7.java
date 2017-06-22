package com.maggioni.Optional.Demo1.Entities;

public class CounterJava7 {

    private Integer endValue;
    private Integer currentValue;

    public CounterJava7() {
        this(10, 0);
    }

    public Integer getEndValue() {
        return endValue;
    }

    public Integer getCurrentValue() {
        return currentValue;
    }

    
    public CounterJava7(Integer endValue, Integer currentValue) {
        if (endValue == null | currentValue == null) {
            throw new IllegalArgumentException();
        }
        this.endValue = endValue;
        this.currentValue = currentValue;
    }

    public void increment(Integer incrementValue) {
        if (currentValue != null && endValue != null 
                && incrementValue !=null                        // if-not-equal-null
                && currentValue < (endValue - incrementValue)  // Rejecting-some-values
                ) {
                    currentValue+=incrementValue;             // do-something
                  } 
    }
}
