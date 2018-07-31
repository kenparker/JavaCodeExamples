package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_19_und_5_20;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FilterTest {


    List<Integer> integerList = List.list(20,4,5,22);

    Function<Integer, Boolean> check = integer ->
            integer > 6;

    @Test
    public void given_when_then() {

        List<Integer> filter = integerList.filter(check);
        List<Integer> filter1 = List.filterViaFlatMap(this.integerList, check);
        System.out.println(filter);
        assertThat(filter.toString()).isEqualTo(filter1.toString());
    }
}
