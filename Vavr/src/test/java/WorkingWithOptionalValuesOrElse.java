import io.vavr.CheckedRunnable;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.*;

public class WorkingWithOptionalValuesOrElse extends WorkingWithOptionalValuesBase {

    @Test
    public void givenAnOptionalValue_whenOrElse_thenResultIsValueOrMyOption() {
        assertThat(myOptional.orElse(defaultValue))
                .isEqualTo(value); // myOptional = Optional.of(value)
        assertThat(myOption.orElse(defaultOption))
                .isEqualTo(myOption);
    }

    @Test
    public void givenAnEmptyOptionalValue_whenOrElse_thenResultIsElseValue() {
        assertThat(emptyOptional.orElse(defaultValue))
                .isEqualTo(defaultValue);             // T orElse(T other)
        assertThat(myNullableOptional.orElse(defaultValue))
                .isEqualTo(defaultValue);
        assertThat(noneOption.orElse(defaultOption))
                .isEqualTo(defaultOption);          // Option<T> orElse(Option<? extends T> other)
        assertThat(noneOption.orElse(() -> defaultOption))
                .isEqualTo(defaultOption);          // Option<T> orElse(Supplier<? extends Option<? extends T>> supplier)
    }

    @Test
    public void givenAnEmptyOptional_whenOrElseGet_thenResultIsDefaultValue() {
        assertThat(emptyOptional.orElseGet(() -> defaultValue))
                .isEqualTo(defaultValue);               // T orElseGet(Supplier<? extends T> other)
        assertThat(noneOption.getOrElse(defaultValue))
                .isEqualTo(defaultValue);               // T getOrElse(T other)
    }

    @Test
    public void givenAnEmptyOptional_whenOrElseThrow_thenResultIsException() {
        assertThatCode(() -> emptyOptional.orElseThrow(() -> new NoSuchElementException()))
                .isInstanceOf(NoSuchElementException.class);
        assertThat(catchThrowable(() -> emptyOptional.orElseThrow(() -> new NoSuchElementException())))
                .isInstanceOf(NoSuchElementException.class);
    }

    @Test
    public void givenAnOptional_whenOrElseThrow_thenResultIsValue() {
        assertThat(myOptional.orElseThrow(() -> new NoSuchElementException()))
                .isEqualTo(value);
        assertThat(catchThrowable(() -> myOptional.orElseThrow(() -> new NoSuchElementException())))
                .doesNotThrowAnyException();
    }
}
