package com.maggioni.autovaluedemos;

import com.google.auto.value.AutoValue;

import java.util.Currency;

@AutoValue
public abstract class Money {
    abstract Currency currency();
    abstract long amount();
    public static Money create(Currency currency, long amount) {
        return new AutoValue_Money(currency, amount);
    }
}
