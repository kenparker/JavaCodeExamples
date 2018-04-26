import org.junit.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;

public class WorkingWithEmptyOptionalsOrOptionOrElseDemos extends WorkingWithEmptyOptionalsOrOptionBase{

    @Test
    public void givenAnEmptyOptional_whenOrElse_thenResultIsElseValue() {
        assertThat(emptyOptional.orElse(defaultValue)).isEqualTo(defaultValue);
    }

    @Test
    public void givenAnEmptyOptional_whenOrElseGet_thenResultIsDefaultValue() {
        assertThat(emptyOptional.orElseGet(() -> defaultValue)).isEqualTo(defaultValue);
    }

    @Test(expected = NoSuchElementException.class)
    public void givenAnEmptyOptional_whenOrElseThrow_thenResultIsException() {
        emptyOptional.orElseThrow(() -> new NoSuchElementException());
    }

    @Test
    public void givenAnNoneOption_whenOrElse_thenResultIsElseOptionValue() {
        assertThat(noneOption.orElse(defaultOption)).isEqualTo(defaultOption);
    }

    @Test
    public void givenAnNoneOption_whenOrElseSupplier_thenResultIsElseOptionValue() {
        assertThat(noneOption.orElse(() -> defaultOption)).isEqualTo(defaultOption);
    }

    @Test
    public void givenAnNoneOption_whenGetOrElse_thenResultIsElseValue() {
        assertThat(noneOption.getOrElse(defaultValue)).isEqualTo(defaultValue);
    }
}
