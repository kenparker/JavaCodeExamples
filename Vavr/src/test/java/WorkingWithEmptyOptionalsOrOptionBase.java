import io.vavr.control.Option;
import org.junit.Before;

import java.util.Optional;

public class WorkingWithEmptyOptionalsOrOptionBase {

    Optional<Object> emptyOptional;
    Option<Object> noneOption;
    String defaultValue = "myDefault";
    Option<?> defaultOption;

    @Before
    public void setUp() {
        emptyOptional = Optional.empty();
        noneOption = Option.none();
        defaultOption = Option.of(defaultValue);
    }
}
