package Optional;

import io.vavr.control.Option;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThatCode;


public class WorkingWithOptionalValuesCreateAnOptionalObject {

    @Test
    public void givenAValue_when_CreateAnOptional_thenIsOK() {
            Optional.of("Hello");
            Optional.ofNullable("Hello");
            Option.of("Hello");
            Option.some("Hello");
    }

    @Test
    public void givenNull_when_OptionalOf_usedForCreation_thenExceptionIfNull() {
        assertThatCode(() -> {
            Optional.of(null);
        })
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    public void givenNull_when_OptionalOfNullable_usedForCreation_thenIsOK() {
        assertThatCode(() -> {
            Optional.ofNullable(null);
        })
                .doesNotThrowAnyException();
    }

    @Test
    public void givenNull_when_OptionOf_usedForCreation_thenIsOK() {
        assertThatCode(() -> {
            Option.of(null);
            Option.none();
            Option.some(null);
        })
                .doesNotThrowAnyException();
    }

}
