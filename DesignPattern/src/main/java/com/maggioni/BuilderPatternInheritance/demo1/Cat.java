package com.maggioni.BuilderPatternInheritance.demo1;

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

    public static class CatBuilder<T extends CatBuilder> extends Builder<CatBuilder> {

        protected String name;

        public CatBuilder() {
            super(CatBuilder.class);
        }

        public T withName(String name) {
            this.name = name;
            return (T) this;
        }

        public Cat build() {
            return new Cat(
                    this.numberOfLegs,
                    this.name
            );
        }
    }

    public String getName() {
        return name;
    }
}

