package com.maggioni.BuilderPatternInheritance.demo1;

public class Siamese extends Cat {

    private String breed;

    public Siamese(Integer numberOfLegs, String name, String breed) {
        super(numberOfLegs, name);
        this.breed = breed;
    }

    public static SiameseBuilder builder() {
        return new SiameseBuilder();
    }

    public static class SiameseBuilder extends CatBuilder<SiameseBuilder> {

        private String breed;

        protected SiameseBuilder() {
            super();
        }

        public SiameseBuilder withBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Siamese build() {
            return new Siamese(
                    this.numberOfLegs,
                    this.name,
                    this.breed
            );
        }
    }

    public String getBreed() {
        return breed;
    }
}
