import io.vavr.control.Option;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionDemo1 {

    /*
    http://joel-costigliola.github.io/assertj/assertj-core-features-highlight.html#exception-assertion
     */
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void givenAnEmptyOptional_whenGet_thenNoSuchElementExceptionIsThrown() {
        Optional<Object> nullOptional = Optional.empty();
        Throwable thrown = catchThrowable(nullOptional::get);
        assertThat(thrown).isInstanceOf(NoSuchElementException.class);
    }

    @Test
    public void givenNoneOption_whenOptionGet_thenNoSuchElementExceptionIsThrown() {
        Option<Object> noneOption = Option.none();
        Throwable thrown = catchThrowable(noneOption::get);
        assertThat(thrown).isInstanceOf(NoSuchElementException.class);
    }

    @Test
    public void givenNullValue_whenCreateOptionOfAndGet_thenNoSuchElementExceptionIsThrown() {
        Object value = null;
        Option<Object> nullOption = Option.of(value);
        Throwable thrown = catchThrowable(nullOption::get);
        assertThat(thrown).isInstanceOf(NoSuchElementException.class);
    }

    @Test
    public void givenNullValue_whenCreateOptionsomeAndGet_thenNullValue() {
        Object value = null;
        Option<Object> nullOption = Option.some(value);
        Object nullValue = nullOption.get();
        assertThat(nullValue).isEqualTo(value);
    }

    @Test
    public void givenNullValue_whenCreateOptionalOf_thenNullPointerException() {
        Object value = null;
        Throwable throwable = catchThrowable(() -> Optional.of(value));
        assertThat(throwable).isInstanceOf(NullPointerException.class);
    }

    @Test
    public void givenNullValue_whenCreateOptionalOfNullable_thenObjectIsEmpty() {
        Object value = null;
        Optional<Object> nullable = Optional.ofNullable(value);
        assertThat(nullable).isEmpty();
    }

    @Test
    public void givenAnNoneOption_thenTheClassIsInstanceOfOptionNone() {
        Option<Object> none = Option.none();
        assertThat(none).isInstanceOf(Option.None.class);
    }

    @Test
    public void testOptionSome() {
        Option<Object> some = Option.some(null);
        System.out.println(some.isEmpty());;
        assertThat(some).isInstanceOf(Option.Some.class);
    }

    @Test
    public void testOptionInstanceOf() {
        Option<Object> nullOption = Option.of(null);
        assertThat(nullOption).isInstanceOf(Option.None.class);
    }

    @Test
    public void testOptional() {
        Optional<String> someOptional = Optional.of("Hello");
        System.out.println(someOptional.toString());
    }

    @Test
    public void testOption() {
        Option<String> someOption = Option.of("Hello");
        System.out.println(someOption.toString());
        assertThat(someOption).isInstanceOf(Option.Some.class);
        assertThat(someOption.get()).isEqualTo("Hello");
    }
}
