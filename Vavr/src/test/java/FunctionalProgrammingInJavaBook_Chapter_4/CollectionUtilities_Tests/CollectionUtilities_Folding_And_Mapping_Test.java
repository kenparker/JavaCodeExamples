package FunctionalProgrammingInJavaBook_Chapter_4.CollectionUtilities_Tests;

import Entities.Cup;
import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import org.junit.Test;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_4.CollectionUtilities_Tests.CollectionUtilities.*;
import static org.assertj.core.api.Assertions.*;

public class CollectionUtilities_Folding_And_Mapping_Test extends CollectionUtilitiesBaseTest {

    private String identity = "Hello";
    private Function<String,
            Function<Cup, String>> f1 = str -> cup -> "( " + cup.field() + str + ")";
    private Function<Cup,
            Function<String,String>> f2 = cup -> str -> "( " + cup.field() + str + ")";

    @Test
    public void testFoldLeft() {
        System.out.println(cupList);    // [Cup{field=Snake}, Cup{field=Tiger}]
        String s = foldLeftSafe(cupList, identity, f1); // ( Tiger( SnakeHello))
        assertThat(s).isEqualTo("( Tiger( SnakeHello))");
    }

    @Test
    public void testFoldLeftWithReverse() {
        String s = foldLeftSafe(reverse(cupList), identity, f1); // ( Snake( TigerHello))
        assertThat(s).isEqualTo("( Snake( TigerHello))");
    }

    @Test
    public void testFoldRight() {
        System.out.println(cupList);
        String s = foldRightSafe(cupList, identity, f2); // ( Snake( TigerHello ) )
        assertThat(s).isEqualTo("( Snake( TigerHello))");
    }

    private Function<Cup,String> f3 = cup -> "( " + cup.field() + ")";

    @Test
    public void testMapWithFoldLeft() {
        List<String> strings = mapWithFoldLeft(cupList, f3);
        System.out.println(strings); // [( Snake), ( Tiger)]
    }

    @Test
    public void testMapWithFoldRight() {
        List<String> strings = mapWithFoldRight(cupList, f3);
        System.out.println(strings); // [( Snake), ( Tiger)]
    }
}
