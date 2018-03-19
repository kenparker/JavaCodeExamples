package com.maggioni.BuilderPatternInheritance;

public class Animal {

    private final Integer numberOfLegs;

    public Animal(Integer numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public static Builder<?> builder() {
        return new AnimalBuilder();
    }

    protected static class Builder<T> {

        protected final Class<T> builderClass;
        protected Integer numberOfLegs;

        protected Builder(Class<T> builderClass) {
            this.builderClass = builderClass;
        }

        public T withNumberOfLegs(Integer numberOfLegs) {
            this.numberOfLegs = numberOfLegs;
            return builderClass.cast(this);
        }

        public Animal build() {
            return new Animal(numberOfLegs);
        }
    }

    public static class AnimalBuilder extends Builder<AnimalBuilder> {

        protected AnimalBuilder() {
            super(AnimalBuilder.class);
        }
    }
}
