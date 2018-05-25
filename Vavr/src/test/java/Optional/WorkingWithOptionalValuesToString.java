package Optional;

import io.vavr.control.Option;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class WorkingWithOptionalValuesToString extends WorkingWithOptionalValuesBase {

    @Test
    public void givenAnNullValue_NotWrappedInOptional_whenToString_thenException() {
        assertThatCode(() -> nullValue.toString())
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    public void givenANullValueWrappedInOptional_whenToString_thenNoException() {
        Assertions.assertThat(optionalEmpty.toString())
                .isEqualTo("Optional.empty");
        Assertions.assertThat(optionalOfNullable.toString())
                .isEqualTo("Optional.empty");
        Assertions.assertThat(optionNone.toString())
                .isEqualTo("None");
        Assertions.assertThat(optionSomeNullValue.toString())
                .isEqualTo("Some(null)");
    }

    @Test
    public void givenAValueWrappedInOption_whenToString_thenValue() {
        Assertions.assertThat(optionalOfValue.toString())
                .isEqualTo("Optional[" + value + "]");
        Assertions.assertThat(optionOfValue.toString())
                .isEqualTo("Some(" + value + ")");
        Assertions.assertThat(optionSomeValue.toString())
                .isEqualTo("Some(" + value + ")");
        Assertions.assertThat(optionSomeNullValue.toString())
                .isEqualTo("Some(null)");
    }
}
