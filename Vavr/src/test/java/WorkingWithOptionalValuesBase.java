import io.vavr.control.Option;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.Optional;


public class WorkingWithOptionalValuesBase {

    Optional<String> optionalEmpty;
    Optional<String> optionalOfDefaultValue;
    Optional<String> optionalOfValue;
    Optional<String> optionalOfNullable;

    Option<String> optionNone;
    Option<String> optionOfDefaultValue;
    Option<String> optionOfValue;
    Option<String> optionOfNullValue;
    Option<String> optionSomeValue;
    Option<String> optionSomeNullValue;

    String defaultValue = "myDefault";
    String value = "Test Optional and Option";
    String nullValue = null;

    @Before
    public void setUp() {
        optionalEmpty = Optional.empty();
        optionalOfValue = Optional.of(value);
        optionalOfNullable = Optional.ofNullable(nullValue);
        optionalOfDefaultValue = Optional.of(defaultValue);

        optionNone = Option.none();
        optionOfValue = Option.of(value);
        optionOfNullValue = Option.of(nullValue);
        optionSomeValue = Option.some(value);
        optionSomeNullValue = Option.some(nullValue);
        optionOfDefaultValue = Option.of(defaultValue);
    }

    @Test
    public void givenAnlValue_when_OptionOf_usedForCreation_thenNoException() {
        assertThatCode(() -> {
            Option.of("Hello");
            Option.of(null);
            Option.some("Hello");
            Option.some(null);
        })
                .doesNotThrowAnyException();
    }

    @Test
    public void givenAnValue_when_OptionalOf_usedForCreation_thenExceptionIfNull() {
        assertThatCode(() -> {
            Optional.of("Hello");
        })
                .doesNotThrowAnyException();
        assertThatCode(() -> {
            Optional.of(null);
        })
                .isInstanceOf(Exception.class);
    }

    @Test
    public void givenAnValue_when_OptionalOfNullable_usedForCreation_thenNoException() {
        assertThatCode(() -> {
            Optional.ofNullable("Hello");
            Optional.ofNullable(null);
        })
                .doesNotThrowAnyException();
    }
}
