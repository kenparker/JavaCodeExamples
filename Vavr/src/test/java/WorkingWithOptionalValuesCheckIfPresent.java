import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WorkingWithOptionalValuesCheckIfPresent extends WorkingWithOptionalValuesBase {

    @Test
    public void givenAnEmptyOptionalValue_whenIsPresent_thenResultIsFalse() {
        assertThat(emptyOptional.isPresent())
                .isFalse();
        assertThat(myNullableOptional.isPresent())
                .isFalse();
        assertThat(!noneOption.isEmpty())
                .isFalse();
    }

    @Test
    public void givenOptionalValues_whenIsPresent_thenResultIsTrue() {
        assertThat(myOptional.isPresent())
                .isTrue();
        assertThat(myOption.isDefined())
                .isTrue();
    }
}
