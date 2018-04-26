import io.vavr.control.Option;
import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class OptionCreateFromNullValueDemo {

    Object value = null;

    @Test
    public void givenNullValue_whenCreateOptionOfAndGet_thenNoSuchElementExceptionIsThrown() {
        Option<Object> nullOption = Option.of(value);
        Throwable thrown = catchThrowable(nullOption::get);
        assertThat(thrown).isInstanceOf(NoSuchElementException.class);
    }

    @Test
    public void givenNullValue_whenCreateOptionsomeAndGet_thenNullValue() {
        Option<Object> nullOption = Option.some(value);
        Object nullValue = nullOption.get();
        assertThat(nullValue).isEqualTo(value);
    }

    @Test
    public void givenNullValue_whenCreateOptionalOf_thenNullPointerException() {
        Throwable throwable = catchThrowable(() -> Optional.of(value));
        assertThat(throwable).isInstanceOf(NullPointerException.class);
    }

    @Test
    public void givenNullValue_whenCreateOptionalOfNullable_thenObjectIsEmpty() {
        Optional<Object> nullable = Optional.ofNullable(value);
        assertThat(nullable).isEmpty();
    }
}
