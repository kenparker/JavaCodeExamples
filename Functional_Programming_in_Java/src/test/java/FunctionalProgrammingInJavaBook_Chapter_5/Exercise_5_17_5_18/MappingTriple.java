package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_17_5_18;

import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MappingTriple {

    List<Integer> integerList = List.list(1,3,7,33);
    List<Integer> result = List.list(3,9,21,99);

    public static List<Integer> triple(List<Integer> list) {
        return List.foldRightViaFoldLeft(list,List.list(), h -> t -> t.cons(h * 3));
    }

    @Test
    public void givenAListOfIntegers_whenMultiplyBy3_thenResult() {
        List<Integer> triple = triple(integerList);
        System.out.println(triple);
        assertThat(triple.toString()).isEqualTo(result.toString());
    }
}
