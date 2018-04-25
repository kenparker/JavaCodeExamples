import io.vavr.control.Option;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionDemo1 {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testOptionalNull() {
        Optional<Object> nullOptional = Optional.empty();
        Throwable thrown = catchThrowable(nullOptional::get);
        assertThat(thrown).isInstanceOf(NoSuchElementException.class);
    }

    @Test
    public void testOptionNone1() {
        Option<Object> none = Option.none();
        assertThat(none).isInstanceOf(Option.None.class);
    }

    @Test
    public void testOptionNone2() {
        Option<Object> noneOption = Option.none();
        Throwable thrown = catchThrowable(noneOption::get);
        assertThat(thrown).isInstanceOf(NoSuchElementException.class);
    }

    @Test
    public void testOptionNull() {
        Option<Object> nullOption = Option.of(null);
        Throwable thrown = catchThrowable(nullOption::get);
        assertThat(thrown).isInstanceOf(NoSuchElementException.class);
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
