import io.vavr.control.Option;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionDemo1 {


    @Test
    public void givenTwoOptionFromSameValue_whenCheckIfEquals_thenOptionsAreEquals() {
        Assert.assertEquals(Option.of("myValue"),Option.of("myValue"));
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
