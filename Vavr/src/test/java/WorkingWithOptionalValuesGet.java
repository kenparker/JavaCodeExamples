import org.junit.Test;
import java.util.NoSuchElementException;
import static org.assertj.core.api.Assertions.*;
public class WorkingWithOptionalValuesGet extends WorkingWithOptionalValuesBase {

    @Test
    public void givenAnEmptyOptionalValue_whenGet_thenNoSuchElementExceptionIsThrown() {
        assertThat(catchThrowable(optionalEmpty::get))
                .isInstanceOf(NoSuchElementException.class);
        assertThat(catchThrowable(optionalOfNullable::get))
                .isInstanceOf(NoSuchElementException.class);
        assertThat(catchThrowable(optionNone::get))
                .isInstanceOf(NoSuchElementException.class);
        assertThatCode(optionSomeNullValue::get)
                .doesNotThrowAnyException();

    }

    @Test
    public void givenOptionalValues_whenGet_thenReturnIsValue() {
        assertThat(optionalOfValue.get())
                .isEqualTo(value);
        assertThat(optionOfValue.get())
                .isEqualTo(value);
        assertThat(optionSomeValue.get())
                .isEqualTo(value);
        assertThat(optionSomeNullValue.get())
                .isEqualTo(nullValue);
    }
}
