package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_2;

import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static FunctionalProgrammingInJavaBook_Chapter_5.Common.List.list;
import static FunctionalProgrammingInJavaBook_Chapter_5.Common.List.setHead;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;
import static org.assertj.core.api.ThrowableAssert.ThrowingCallable;

public class SetHeadTest {

    private String head = "A";
    private String newHead = "new Head";
    private List<String> listOfStrings = list(head, "Z", "D");

    @Test
    public void givenAList_whenChangeHeadWith_Static_Method_thenNewHeadIsAdded() {
        assertThat(listOfStrings.head()).isEqualTo(head);
        listOfStrings = setHead(listOfStrings, newHead);
        assertThat(listOfStrings.head()).isEqualTo(newHead);
    }

    @Test
    public void givenAList_whenChangeHeadWith_Instance_Method_thenNewHeadIsAdded() {
        listOfStrings = listOfStrings.setHead(newHead);
        assertThat(listOfStrings.head()).isEqualTo(newHead);
    }

    @Test
    public void givenAnEmptyList_whenChangeHead_thenIllegalStateException() {
        ThrowingCallable throwingCallable = () -> list().setHead(newHead);
        assertThatIllegalStateException().isThrownBy(throwingCallable);
    }
}