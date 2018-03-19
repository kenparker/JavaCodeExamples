package com.maggioni.BuilderPatternInheritance;

public class Cat extends Animal {

     private final String name;

    public Cat(
             Integer numberOfLegs,
             String name) {
        super(numberOfLegs);
        this.name = name;
    }

    public static CatBuilder builder() {
        return new CatBuilder();
    }

    public static class CatBuilder extends Builder<CatBuilder> {

        private String name;

        public CatBuilder() {
            super(CatBuilder.class);
        }

        public CatBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public Cat build() {
            return new Cat(
                    this.numberOfLegs,
                    this.name
            );
        }
    }
}

