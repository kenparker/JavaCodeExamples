import org.junit.Test;
import java.util.NoSuchElementException;
import static org.assertj.core.api.Assertions.*;
public class WorkingWithOptionalValuesGet extends WorkingWithOptionalValuesBase {

    @Test
    public void givenAnEmptyOptionalValue_whenGet_thenNoSuchElementExceptionIsThrown() {
        assertThat(catchThrowable(emptyOptional::get))
                .isInstanceOf(NoSuchElementException.class);
        assertThat(catchThrowable(myNullableOptional::get))
                .isInstanceOf(NoSuchElementException.class);
        assertThat(catchThrowable(noneOption::get))
                .isInstanceOf(NoSuchElementException.class);
        assertThatCode(mySomeNullOption::get)
                .doesNotThrowAnyException();

    }

    @Test
    public void givenOptionalValues_whenGet_thenReturnIsValue() {
        assertThat(myOptional.get())
                .isEqualTo(value);
        assertThat(myOption.get())
                .isEqualTo(value);
        assertThat(mySomeOption.get())
                .isEqualTo(value);
        assertThat(mySomeNullOption.get())
                .isEqualTo(nullValue);
    }
}
