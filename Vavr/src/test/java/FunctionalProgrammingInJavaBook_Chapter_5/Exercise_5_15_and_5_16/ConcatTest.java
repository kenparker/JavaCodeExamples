package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_15_and_5_16;

import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static FunctionalProgrammingInJavaBook_Chapter_5.Common.List.*;
import static org.assertj.core.api.Assertions.*;

public class ConcatTest {

    List<String> l1 = list("ZZ", "GG", "AA", "BB");
    List<String> l2 = list("Angelo", "Marco", "Valerio", "Beatrice");

    @Test
    public void givenTwoList_whenConcat_thenResult() {
        System.out.println("l1 : " +  l1);
        System.out.println("l2 : " +  l2);
        List<String> concat = concat(l1, l2);
        System.out.println("concat :" + concat);
        assertThat(concat.toString()).isEqualTo("[ZZ, GG, AA, BB, Angelo, Marco, Valerio, Beatrice, NIL]");
    }
}
