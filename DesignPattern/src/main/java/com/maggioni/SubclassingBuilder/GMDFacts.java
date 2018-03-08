package com.maggioni.SubclassingBuilder;

public class GMDFacts extends NutritionFacts{
    private final boolean hasGMO;

    public static class Builder extends NutritionFacts.Builder<Builder> {

        private boolean hasGMO = false;

        public Builder() {}

        public Builder GMO(boolean val) {
            hasGMO = val;
            return this;
        }

        public GMDFacts build() { return new GMDFacts(this); }
    }

    protected GMDFacts(Builder builder) {
        super(builder);
        hasGMO = builder.hasGMO;
    }
}
