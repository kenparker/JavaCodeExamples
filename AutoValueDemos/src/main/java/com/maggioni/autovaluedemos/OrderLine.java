package com.maggioni.autovaluedemos;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class OrderLine {
    public abstract Integer line();
    public abstract String article();

    public static OrderLine create(Integer line, String article) {
        return builder()
                .line(line)
                .article(article)
                .build();
    }

    public static Builder builder() {
        return new AutoValue_OrderLine.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder line(Integer line);

        public abstract Builder article(String article);

        public abstract OrderLine build();
    }
}
