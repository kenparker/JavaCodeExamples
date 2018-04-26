import org.junit.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class WorkingWithEmptyOptionalsOrOptionCheckIfPresentDemos extends WorkingWithEmptyOptionalsOrOptionBase {

    @Test
    public void givenAnEmptyOptional_whenTestIsPresent_thenResultIsFalse() {
        assertThat(emptyOptional.isPresent()).isFalse();
    }

    @Test
    public void givenAnNoneOption_whenTestIsEmpty_thenResultIsTrue() {
        assertThat(noneOption.isEmpty()).isTrue();
        assertThat(!noneOption.isDefined()).isTrue();
    }

}
