package Optional;

import io.vavr.control.Option;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.assertj.core.api.Assertions.assertThat;

public class WorkingWithOptionalValuesOtherDemos extends WorkingWithOptionalValuesBase {

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

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();


    @Test
    public void givenAnOptionalValue_whenValueIsPresent_thenConsumerIsExecuted() {
        optionalOfValue.ifPresent( a -> System.out.println(a));
        assertThat(log.getLog().trim()).isEqualTo(value);
    }

    @Test
    public void when_TextIsWrittenToSystemOut_thenTextIsLoggedInRule() {
        System.out.print("hello world");
        assertThat(log.getLog()).isEqualTo("hello world");
    }

}
