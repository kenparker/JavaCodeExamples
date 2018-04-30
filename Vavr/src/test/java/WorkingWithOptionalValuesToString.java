import io.vavr.control.Option;
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
        assertThat(optionalEmpty.toString())
                .isEqualTo("Optional.empty");
        assertThat(optionalOfNullable.toString())
                .isEqualTo("Optional.empty");
        assertThat(optionNone.toString())
                .isEqualTo("None");
        assertThat(optionSomeNullValue.toString())
                .isEqualTo("Some(null)");
    }

    @Test
    public void givenAValueWrappedInOption_whenToString_thenValue() {
        assertThat(optionalOfValue.toString())
                .isEqualTo("Optional[" + value + "]");
        assertThat(optionOfValue.toString())
                .isEqualTo("Some(" + value + ")");
        assertThat(optionSomeValue.toString())
                .isEqualTo("Some(" + value + ")");
        assertThat(optionSomeNullValue.toString())
                .isEqualTo("Some(null)");
    }
}
