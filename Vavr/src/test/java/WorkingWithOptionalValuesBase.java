import io.vavr.control.Option;
import org.junit.Before;

import java.util.Optional;

public class WorkingWithOptionalValuesBase {

    Optional<String> emptyOptional;
    Optional<String> defaultOptional;
    Optional<String> myOptional;
    Optional<String> myNullableOptional;

    Option<String> noneOption;
    Option<String> defaultOption;
    Option<String> myOption;
    Option<String> mySomeOption;
    Option<String> mySomeNullOption;

    String defaultValue = "myDefault";
    String value = "Test Optional and Option";
    String nullValue = null;

    @Before
    public void setUp() {
        emptyOptional = Optional.empty();
        myOptional = Optional.of(value);
        myNullableOptional = Optional.ofNullable(nullValue);
        defaultOptional = Optional.of(defaultValue);

        noneOption = Option.none();
        myOption = Option.of(value);
        mySomeOption = Option.some(value);
        mySomeNullOption = Option.some(nullValue);
        defaultOption = Option.of(defaultValue);
    }
}
