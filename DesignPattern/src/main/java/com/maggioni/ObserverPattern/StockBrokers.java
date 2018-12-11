package com.maggioni.ObserverPattern;


import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;

@AutoValue
public abstract class StockBrokers {
     public abstract ImmutableList<StockBroker> stockBrokers();

    public static Builder builder() {
        return new AutoValue_StockBrokers.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        protected abstract ImmutableList.Builder<StockBroker> stockBrokersBuilder();

        public Builder addStockBroker(StockBroker stockBroker) {
            stockBrokersBuilder().add(stockBroker);
            return this;
        }

        public abstract StockBrokers build();
    }
}
