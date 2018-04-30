import org.junit.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.*;

public class WorkingWithOptionalValuesOrElse extends WorkingWithOptionalValuesBase {

    @Test
    public void givenAnOptionalValue_whenOrElse_thenResultIsValueOrMyOption() {
        assertThat(optionalOfValue.orElse(defaultValue))
                .isEqualTo(value); // optionalOfValue = Optional.of(value)
        assertThat(optionOfValue.orElse(optionOfDefaultValue))
                .isEqualTo(optionOfValue);
    }

    @Test
    public void givenAnEmptyOptionalValue_whenOrElse_thenResultIsElseValue() {
        assertThat(optionalEmpty.orElse(defaultValue))
                .isEqualTo(defaultValue);             // T orElse(T other)
        assertThat(optionalOfNullable.orElse(defaultValue))
                .isEqualTo(defaultValue);
        assertThat(optionNone.orElse(optionOfDefaultValue))
                .isEqualTo(optionOfDefaultValue);          // Option<T> orElse(Option<? extends T> other)
        assertThat(optionNone.orElse(() -> optionOfDefaultValue))
                .isEqualTo(optionOfDefaultValue);          // Option<T> orElse(Supplier<? extends Option<? extends T>> supplier)
    }

    @Test
    public void givenAnEmptyOptional_whenOrElseGet_thenResultIsDefaultValue() {
        assertThat(optionalEmpty.orElseGet(() -> defaultValue))
                .isEqualTo(defaultValue);               // T orElseGet(Supplier<? extends T> other)
        assertThat(optionNone.getOrElse(defaultValue))
                .isEqualTo(defaultValue);               // T getOrElse(T other)
    }

    @Test
    public void givenAnOptionalValue_when_orElseGet_thenResultIsValue() {
        assertThat(optionalOfValue.orElseGet(() -> defaultValue))
                .isEqualTo(value);
        assertThat(optionOfValue.getOrElse(defaultValue))
                .isEqualTo(value);
    }


    @Test
    public void givenAnEmptyOptional_whenOrElseThrow_thenResultIsException() {
        assertThatCode(() -> optionalEmpty.orElseThrow(() -> new NoSuchElementException()))
                .isInstanceOf(NoSuchElementException.class);
        assertThat(catchThrowable(() -> optionalEmpty.orElseThrow(() -> new NoSuchElementException())))
                .isInstanceOf(NoSuchElementException.class);
    }

    @Test
    public void givenAnOptional_whenOrElseThrow_thenResultIsValue() {
        assertThat(optionalOfValue.orElseThrow(() -> new NoSuchElementException()))
                .isEqualTo(value);
        assertThat(catchThrowable(() -> optionalOfValue.orElseThrow(() -> new NoSuchElementException())))
                .doesNotThrowAnyException();
    }
}
