package com.maggioni.Optional.Demo1.Entities;

import java.util.Optional;

public class Counter {

    private Integer endValue;
    private Integer currentValue;

    private Counter(Builder builder) {
        endValue = builder.endValue;
        currentValue = builder.currentValue;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Optional<Integer> getCurrentValue() {
        return Optional.ofNullable(currentValue);
    }

    public Optional<Integer> getEndValue() {
        return Optional.ofNullable(endValue);
    }

    public boolean counterIsNotOK() {
        return currentValue == null || endValue == null;
    }

    public static final class Builder {
        private Integer endValue;
        private Integer currentValue;

        private Builder() {
        }

        public Builder withEndValue(Integer val) {
            endValue = val;
            return this;
        }

        public Builder withCurrentValue(Integer val) {
            currentValue = val;
            return this;
        }

        public Counter build() {
            return new Counter(this);
        }
    }
}
