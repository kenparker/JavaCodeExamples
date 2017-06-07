package com.maggioni.Optional.Demo1.Eintities;

public class CounterClassic {

    private Integer endValue;
    private Integer currentValue;

    public CounterClassic() {
        this(10, 0);
    }

    public Integer getEndValue() {
        return endValue;
    }

    public Integer getCurrentValue() {
        return currentValue;
    }

    
    public CounterClassic(Integer endValue, Integer currentValue) {
        this.endValue = endValue;
        this.currentValue = currentValue;
    }

    public void increment(Integer incrementValue) {
        if (currentValue != null && endValue != null && incrementValue !=null // if-not-equal-null
                && currentValue < (endValue - incrementValue)  // Rejecting-some-values
                ) {
            currentValue+=incrementValue; // do-something
        } 
    }
}
