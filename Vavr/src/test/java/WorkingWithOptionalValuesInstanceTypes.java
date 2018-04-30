import io.vavr.control.Option;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WorkingWithOptionalValuesInstanceTypes extends WorkingWithOptionalValuesBase {

    @Test
    public void givenNone_whenAn_OptionNone_IsCreated_thenInstanceIsOf_TypeNone() {
        assertThat(optionNone).isInstanceOf(Option.None.class);
    }

    @Test
    public void givenANullValue_when_OptionSome_IsCreated_thenInstanceIsOf_TypeSomeAndIsNotEmpty() {
        assertThat(optionSomeNullValue.isDefined()).isTrue();
        assertThat(optionSomeNullValue.isEmpty()).isFalse();
        assertThat(optionSomeNullValue).isInstanceOf(Option.Some.class);
    }

    @Test
    public void givenANullValue_when_OptionOf_IsCreated_thenInstanceIsOf_TypeNoneAndIsEmpty() {
        assertThat(optionOfNullValue.isEmpty()).isTrue();
        assertThat(optionOfNullValue.isDefined()).isFalse();
        assertThat(optionOfNullValue).isInstanceOf(Option.None.class);
    }

    @Test
    public void givenAValue_wenn_OptionOf_Iscreated_thenInstanceIsOf_TypeSome() {
        assertThat(optionOfValue.isDefined()).isTrue();
        assertThat(optionOfValue).isInstanceOf(Option.Some.class);
    }
}
