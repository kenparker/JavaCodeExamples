package com.maggioni.autovaluedemos;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Mammal {
    abstract String group();
    abstract String type();
    abstract Animal animal();

    public static Mammal create(String group, String type, Animal animal) {
        return builder()
                .group(group)
                .type(type)
                .animal(animal)
                .build();
    }

    public static Builder builder() {
        return new AutoValue_Mammal.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder group(String group);

        public abstract Builder type(String type);

        public abstract Builder animal(Animal animal);

        public abstract Mammal build();
    }
}
