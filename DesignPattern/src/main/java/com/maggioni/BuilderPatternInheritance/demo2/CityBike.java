package com.maggioni.BuilderPatternInheritance.demo2;

public class CityBike extends Bicycle {

    private final String model;

    private CityBike(Builder<?, ?> builder) {
        super(builder);
        this.model = builder.model;
    }

    public static Builder<?, ?> builder() {
        return new CityBikeBuilder();
    }

    public abstract static class Builder<T extends Bicycle, B extends Builder<T, B>> extends Bicycle.Builder<T, B> {

        private String model;

        protected Builder() {
        }

        public B withModel(String model) {
            this.model = model;
            return self();
        }

    }

    public static class CityBikeBuilder extends Builder<CityBike, CityBikeBuilder> {

        public CityBike build() {
            return new CityBike(this);
        }

        public CityBikeBuilder self() {
            return this;
        }
    }
}
