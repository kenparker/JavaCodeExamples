package FunctionalProgrammingInJavaBook_Chapter_4.CollectionUtilities_Tests;

import Entities.Cup;
import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import org.junit.Test;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_4.CollectionUtilities_Tests.CollectionUtilities.*;
import static org.assertj.core.api.Assertions.*;

public class CollectionUtilitiesTest {


    Cup cup1 = Cup.builder()
            .field("Snake").build();
    Cup cup2 = Cup.builder()
            .field("Tiger").build();
    Cup cup3 = Cup.builder()
            .field("Lion").build();
    Cup cup4 = Cup.builder()
            .field("Giraffe").build();
    Cup cup5 = Cup.builder()
            .field("Giraffe").build();

    List<Cup> cupList = list(cup1, cup2);

    @Test
    public void givenACup_whenAppend_ThenNewListCupAtTheEnd() {
        List<Cup> appendCupList = append(cupList, cup4);
        System.out.println(appendCupList);
        Cup last = last(appendCupList);
        assertThat(cupList).isNotEqualTo(appendCupList);
        assertThat(cup4).isEqualTo(last);
    }

    @Test
    public void givenACup_whenPrepend_theNewListCupInTheFront() {
        List<Cup> prependCupList = prepend(cup4, cupList);
        System.out.println(prependCupList);
        Cup head = head(prependCupList);
        assertThat(cupList).isNotEqualTo(prependCupList);
        assertThat(cup4).isEqualTo(head);
    }

    @Test
    public void givenASeed_whenIterate_thenAListIsCreated() {
        Cup seed = Cup.builder().field("0").build();
        Function<Cup,Cup> f = cup -> Cup.builder().field(String.valueOf(Integer.valueOf(cup.field())+1)).build();
        List<Cup> cupList = iterate(seed, f, 5);
        System.out.println(cupList); // [Cup{field=0}, Cup{field=1}, Cup{field=2}, Cup{field=3}, Cup{field=4}]

        seed = Cup.builder().field("A").build();
        f = cup -> Cup.builder().field(cup.field()+"B").build();
        cupList = iterate(seed,f,6);
        System.out.println(cupList); // [Cup{field=A}, Cup{field=AB}, Cup{field=ABB}, Cup{field=ABBB}, Cup{field=ABBBB}, Cup{field=ABBBBB}]
        assertThat(cupList.get(0)).isEqualTo(seed);
        assertThat(cupList.get(1)).isNotEqualTo(seed);
    }
}