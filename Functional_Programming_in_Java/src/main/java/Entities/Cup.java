package Entities;

import com.google.auto.value.AutoValue;
import org.jetbrains.annotations.Nullable;


@AutoValue
public abstract class Cup {

    public static Cup create(@Nullable String field) {
        return builder()
                .field(field)
                .build();
    }

    @Nullable
    public abstract String field();

    public static Builder builder() {
        return new AutoValue_Cup.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder field(String field);

        public abstract Cup build();
    }
}
