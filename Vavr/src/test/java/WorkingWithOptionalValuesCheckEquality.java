import io.vavr.control.Option;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.assertj.core.api.Assertions.assertThat;

public class WorkingWithOptionalValuesCheckEquality extends WorkingWithOptionalValuesBase {

    @Test
    public void givenTwoOptionFromSameValue_whenCheckIfEquals_thenOptionsAreEquals() {
        assertThat(Option.of(value)).isEqualTo(Option.of(value));
    }

    @Test
    public void given_AOptional_when_FilterIsFound_then_returnIsOptional() {
        assertThat(optionalOfValue.filter(value -> value.contains("Optional")))
                .isEqualTo(optionalOfValue);
        assertThat(optionOfValue.filter(value -> value.contains("Optional")))
                .isEqualTo(optionOfValue);
    }

    @Test
    public void given_Optional_when_FilterIsNotFound_then_ReturnIsEmpty() {
        assertThat(optionalOfValue.filter(value -> value.contains("Hello")))
                .isEmpty();
        assertThat(optionOfValue.filter(value -> value.contains("Hello")))
                .isEmpty();
    }

    @Test
    public void given() {
        assertThat(optionalOfValue.ifPresent();)
    }


        @Rule
        public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

        @Test
        public void writesTextToSystemOut() {
            System.out.print("hello world");
            assertThat(systemOutRule.getLog()).isEqualTo("hello world");
        }
}
