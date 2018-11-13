package FunctionalProgrammingInJavaBook_Chapter_6.exercise06_05;

import org.junit.Test;

import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.*;

public class OptionOrElseTest {

    private Supplier runTime = () -> {throw new RuntimeException();};

    @Test
    public void givenASome_whenOrElse_thenResultIsOption() {
        Option<Integer> option = Option.some(2);

        Option result = option.orElse(runTime);
        assertThat(result.toString()).isEqualTo("Some(2)");
    }

    @Test
    public void givenANone_whenOrElse_thenResultIsRunTime() {
        Option<Object> option = Option.none();

        Throwable throwable = catchThrowable(() -> option.orElse(runTime));
        assertThat(throwable).isInstanceOf(RuntimeException.class);
    }
}