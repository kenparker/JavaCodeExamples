package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_3_5_4;

import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static FunctionalProgrammingInJavaBook_Chapter_5.Common.List.*;
import static FunctionalProgrammingInJavaBook_Chapter_5.Common.List.list;
import static org.assertj.core.api.Assertions.*;

public class ReverseTest {

    List<String> list1 = list(" ", "T", "h","i","s"," ");

    @Test
    public void givenAList_whenReverse_then() {
        List<String> reverse1 = list1.reverse();
        System.out.println(reverse1);
        List<String> reverse2 = reverse(list1);

        assertThat(reverse1.toString()).isEqualTo(reverse2.toString());
    }

    @Test
    public void givenAList_whenInit_thenTheLastElementIsRemoved() {
        System.out.println(list1);
        List<String> reverse3 = init(list1);
        System.out.println(reverse3);
        assertThat(reverse3.toString()).isEqualTo("[ , T, h, i, s, NIL]");

    }
}
