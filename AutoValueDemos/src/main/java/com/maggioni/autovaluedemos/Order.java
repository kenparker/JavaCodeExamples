package com.maggioni.autovaluedemos;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.util.List;
import java.util.Map;

@AutoValue
public abstract class Order {
    public abstract String orderNumber();
    public abstract ImmutableList<OrderLine> details();
    public abstract ImmutableMap<String,String> someMap();

    public static Builder builder() {
        return new AutoValue_Order.Builder();
    }


    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder orderNumber(String orderNumber);

        public abstract Builder details(List<OrderLine> details);

        public abstract Builder someMap(Map<String, String> someMap);

        public abstract Order build();
    }
}
