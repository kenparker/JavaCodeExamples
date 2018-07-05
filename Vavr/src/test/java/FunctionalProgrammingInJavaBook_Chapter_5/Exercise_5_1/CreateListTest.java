package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_1;

import Entities.Cup;
import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;


import static FunctionalProgrammingInJavaBook_Chapter_5.Common.List.list;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class CreateListTest {

    private List<Cup> list;
    private Cup cup1 = Cup.builder().field("xdr").build();
    private Cup cup2 = Cup.builder().field("sderft").build();
    private Cup cup3 = Cup.builder().field("hghghtztztzz").build();

    @Test
    public void createAList() {
        list = list(cup1, cup2, cup3);
        System.out.println(list.head() + " " + list.tail());
        list = list.tail();
        System.out.println(list.head() + " " + list.tail());
    }

    @Test
    public void addAnElement() {
        list = list(cup1).cons(cup2);
        assertThat(list.head()).isEqualTo(cup2);
    }

    @Test
    public void addTwoElements() {
        list = list(cup1).cons(cup2).cons(cup3);
        assertThat(list.head()).isEqualTo(cup3);
    }

    @Test
    public void addTwoElementsToAnEmptyList() {
        list = list();
        list = list.cons(cup3).cons(cup2);
        assertThat(list.head()).isEqualTo(cup2);
    }
}