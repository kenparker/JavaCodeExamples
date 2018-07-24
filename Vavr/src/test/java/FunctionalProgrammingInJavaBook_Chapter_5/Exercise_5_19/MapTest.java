package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_19;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MapTest {

    List<Integer> integerList = List.list(1,3,7,33);

    Function<Integer,Integer> triple = integer -> integer * 3;
    Function<Integer, String> convert = integer -> Integer.toString(integer);

    @Test
    public void givenAnIntegerList_whenMapTriple_thenListIntegerTriple() {
        List<Integer> integerListTriple = integerList.map(triple);
        assertThat(integerListTriple.toString()).isEqualTo("[3, 9, 21, 99, NIL]");
    }

    @Test
    public void given_when_then() {
        List<String> stringList = integerList.map(convert);
        System.out.println(stringList);
    }
}
