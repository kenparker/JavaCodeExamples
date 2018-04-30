import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WorkingWithOptionalValuesCheckIfPresent extends WorkingWithOptionalValuesBase {

    @Test
    public void givenAnEmptyOptionalValue_whenIsPresent_thenResultIsFalse() {
        assertThat(optionalEmpty.isPresent())
                .isFalse();
        assertThat(optionalOfNullable.isPresent())
                .isFalse();
        assertThat(!optionNone.isEmpty())
                .isFalse();
    }

    @Test
    public void givenOptionalValues_whenIsPresent_thenResultIsTrue() {
        assertThat(optionalOfValue.isPresent())
                .isTrue();
        assertThat(optionOfValue.isDefined())
                .isTrue();
    }
}
