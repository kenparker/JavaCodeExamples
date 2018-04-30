import io.vavr.control.Option;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThatCode;


public class WorkingWithOptionalValuesCreateAnOptionalObject {

    @Test
    public void givenAlValue_when_OptionOf_usedForCreation_thenNoException() {
        assertThatCode(() -> {
            Option.of("Hello");
            Option.of(null);
            Option.none();
            Option.some("Hello");
            Option.some(null);
        })
                .doesNotThrowAnyException();
    }

    @Test
    public void givenAValue_when_OptionalOf_usedForCreation_thenExceptionIfNull() {
        assertThatCode(() -> {
            Optional.of("Hello");
        })
                .doesNotThrowAnyException();
        assertThatCode(() -> {
            Optional.of(null);
        })
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    public void givenAValue_when_OptionalOfNullable_usedForCreation_thenNoException() {
        assertThatCode(() -> {
            Optional.ofNullable("Hello");
            Optional.ofNullable(null);
        })
                .doesNotThrowAnyException();
    }
}
