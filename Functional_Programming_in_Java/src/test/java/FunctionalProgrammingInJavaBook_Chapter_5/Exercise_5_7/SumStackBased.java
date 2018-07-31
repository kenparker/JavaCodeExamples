package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_7;

import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static FunctionalProgrammingInJavaBook_Chapter_5.Common.List.list;
import static org.assertj.core.api.Assertions.assertThat;

public class SumStackBased {

    public static Integer sum(List<Integer> integerList) {
        return integerList.isEmpty()
                ? 0
                : integerList.head() + sum(integerList.tail());
    }

    @Test
    public void givenAIntegerList_whenSum_thenResult() {
        List<Integer> integerList = list(23, 5, 2);
        Integer result = sum(integerList);
        assertThat(result).isEqualTo(30);
    }
}
