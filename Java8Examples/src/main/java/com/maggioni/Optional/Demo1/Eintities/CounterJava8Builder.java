package com.maggioni.Optional.Demo1.Eintities;


public class CounterJava8Builder {

    private Integer endValue = 10;
    private Integer currentValue = 0;

    public CounterJava8Builder() {
    }

    public CounterJava8Builder setEndValue(Integer endValue) {
        this.endValue = endValue;
        return this;
    }

    public CounterJava8Builder setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    public CounterJava8 createCounterJava8() {
        return new CounterJava8(endValue, currentValue);
    }
    
}
