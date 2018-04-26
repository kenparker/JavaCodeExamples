import io.vavr.CheckedRunnable;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.*;

public class WorkingWithOptionalValuesOrElseDemos extends WorkingWithOptionalValuesBase {

    @Test
    public void givenAnOptionalValue_whenOrElse_thenResultIsValue() {
        assertThat(myOptional.orElse(defaultValue))
                .isEqualTo(value);
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
    public void givenAnOptional_whenOrElseThrow_thenResultIsExceptionOrValue() {
        assertThatCode( () -> emptyOptional.orElseThrow(() -> new NoSuchElementException()))
                .isInstanceOf(NoSuchElementException.class);
        assertThat(catchThrowable(() -> emptyOptional.orElseThrow(() -> new NoSuchElementException())))
                .isInstanceOf(NoSuchElementException.class);
        assertThat(catchThrowable(() -> myOptional.orElseThrow(() -> new NoSuchElementException())))
                .isEqualTo(nullValue)
                .doesNotThrowAnyException();
        assertThat(myOptional.orElseThrow(() -> new NoSuchElementException()))
                 .isEqualTo(value);

        };
    }
