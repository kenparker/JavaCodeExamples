import io.vavr.control.Option;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WorkingWithOptionalValuesInstanceTypes extends WorkingWithOptionalValuesBase {

    @Test
    public void givenNone_whenAn_OptionNone_IsCreated_thenInstanceIsOf_TypeNone() {
        assertThat(noneOption).isInstanceOf(Option.None.class);
    }

    @Test
    public void givenANullValue_when_OptionSome_IsCreated_thenInstanceIsOf_TypeSomeAndIsNotEmpty() {
        assertThat(mySomeNullOption.isDefined()).isTrue();
        assertThat(mySomeNullOption.isEmpty()).isFalse();
        assertThat(mySomeNullOption).isInstanceOf(Option.Some.class);
    }

    @Test
    public void givenANullValue_when_OptionOf_IsCreated_thenInstanceIsOf_TypeNoneAndIsEmpty() {
        Option<Object> nullOption = Option.of(null);
        assertThat(nullOption.isEmpty()).isTrue();
        assertThat(nullOption.isDefined()).isFalse();
        assertThat(nullOption).isInstanceOf(Option.None.class);
    }

    @Test
    public void givenAValue_wenn_OptionOf_Iscreated_thenInstanceIsOf_TypeSome() {
        Option<String> someOption = Option.of(value);
        assertThat(someOption).isInstanceOf(Option.Some.class);
    }
}
