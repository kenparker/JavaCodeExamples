package com.maggioni.autovaluedemos;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Animal {
    public abstract String name();
    public abstract int numberOfLegs();

    public static Animal create(String name, int numberOfLegs) {
        return builder()
                .name(name)
                .numberOfLegs(numberOfLegs)
                .build();
    }

    public static Builder builder() {
        return new AutoValue_Animal.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder name(String name);

        public abstract Builder numberOfLegs(int numberOfLegs);

        public abstract Animal build();
    }
}
