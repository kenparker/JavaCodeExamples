import io.vavr.control.Option;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class WorkingWithOptionalValuesCheckEquality extends WorkingWithOptionalValuesBase {

    @Test
    public void givenTwoOptionFromSameValue_whenCheckIfEquals_thenOptionsAreEquals() {
        assertThat(Option.of(value)).isEqualTo(Option.of(value));
    }
}
