import org.junit.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class WorkingWithEmptyOptionalsOrOptionGetDemos extends WorkingWithEmptyOptionalsOrOptionBase {

    @Test
    public void givenAnEmptyOptional_whenGet_thenNoSuchElementExceptionIsThrown() {
        Throwable thrown = catchThrowable(emptyOptional::get);
        assertThat(thrown).isInstanceOf(NoSuchElementException.class);
    }

    @Test
    public void givenNoneOption_whenOptionGet_thenNoSuchElementExceptionIsThrown() {
        Throwable thrown = catchThrowable(noneOption::get);
        assertThat(thrown).isInstanceOf(NoSuchElementException.class);
    }
}
