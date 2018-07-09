package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_3_5_4;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static FunctionalProgrammingInJavaBook_Chapter_5.Common.List.*;
import static org.assertj.core.api.Assertions.*;

public class DropTest {

    private List<Integer> list = list(10, 5, 3, 14, 11);
    private Function<Integer, Boolean> f = integer -> integer < 11;

    @Test
    public void givenAList_whenDrop_thenNewList() {
        System.out.println(list); // [10, 5, 3, 14, NIL]

        List<Integer> drop = list.drop(2);
        System.out.println(drop); // [3, 14, NIL]
        assertThat(drop).isNotEqualTo(list);
    }

    @Test
    public void givenAList_whenAddAnElement_thenNewList() {
        List<Integer> integerList = setHead(drop(list, 1), 55);
        System.out.println(integerList); // [55, 3, 14, NIL]
        List<Integer> integerList1 = list.drop(1).setHead(55);
        assertThat(integerList1.toString()).isEqualTo(integerList.toString());
    }

    @Test
    public void name() {
        List<Integer> integerList = list.drop(0).setHead(55);
        System.out.println(integerList);
    }

    @Test
    public void givenAList_whenDropAllElementWhileMin11_then_newListOK() {
        List<Integer> integerList = list.dropWhile(f);
        System.out.println(integerList);
    }

    @Test
    public void givenAnEmptyList_whenDrop_then() {
        List<Integer> dropWhile1 = List.<Integer>list().dropWhile(f);
        assertThat(dropWhile1).isEqualTo(NIL);
        List<Integer> list = list();
        List<Integer> dropWhile2 = list.dropWhile(f);
        assertThat(dropWhile2.isEmpty()).isTrue();
    }
}
