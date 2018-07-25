package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_19_und_5_20;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

public class FilterTest {


    public  Function<String, Function<List<String>,List<String>>> f ;

    @Test
    public void name() {
        String s1 = null;
        List<String> ls = null;
        Function<List<String>, List<String>> apply1 = f.apply(s1);
        List<String> applyls = apply1.apply(ls);
    }
}
