package com.maggioni.autovaluedemos;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class B extends A {
    abstract String c();

    public static B create(String a, String b, String c) {
        return builder()
                .a(a)
                .b(b)
                .c(c)
                .build();
    }

    public static Builder builder() {
        return new AutoValue_B.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder a(String a);
        public abstract Builder b(String b);
        public abstract Builder c(String c);

        public abstract B build();
    }
}
