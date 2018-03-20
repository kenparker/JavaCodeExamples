package com.maggioni.BuilderPatternInheritance;

public class Siamese extends Cat {

    public Siamese(Integer numberOfLegs,String name) {
        super(numberOfLegs, name);
    }

    public static SiameseBuilder builder() {
        return new SiameseBuilder();
    }

    public static class SiameseBuilder extends CatBuilder {

        private String name;

        protected SiameseBuilder() {
            super();
        }

        public SiameseBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public Siamese build() {
            return new Siamese(
                    this.numberOfLegs,
                    this.name
            );
        }
    }
}
