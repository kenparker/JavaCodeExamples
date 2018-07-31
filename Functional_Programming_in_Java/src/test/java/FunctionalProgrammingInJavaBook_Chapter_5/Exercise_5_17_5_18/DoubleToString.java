package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_17_5_18;

import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DoubleToString {

    List<Double> d1 = List.list(12.1, 123.123, 1.45);
    List<String> s1 = List.list("12.1","123.123","1.45");


    public static List<String> doubleToString(List<Double> list) {
        return List.foldRightViaFoldLeft(list, List.list(), doub -> y -> y.cons(Double.toString(doub)));
    }

    @Test
    public void given_when_then() {
        List<String> stringList = doubleToString(d1);
        System.out.println(stringList);
        assertThat(stringList.toString()).isEqualTo(s1.toString());
    }
}
