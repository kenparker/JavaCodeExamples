package FunctionalProgrammingInJavaBook_Chapter_6.exercise06_01;

import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

public class OptionGetOrElseTest {


    List<String> defaultList = List.list("I'm the default");

    private Option<List> checkList(List list) {
        return  list.isEmpty()
                ? Option.none()
                : Option.some(list);
    }

    @Test
    public void givenAEmptyList_whenGetOrElse_thenDefaultValueIsReturned() {
        List<Object> emptyList = List.list();
        Option<List> listOption = checkList(emptyList);
        List orElse = listOption.getOrElse(defaultList);
        assertThat(orElse).isSameAs(defaultList);
    }

    @Test
    public void givenAList_whenGetOrElse_thenReturnIsList() {
        List<String> helloList = List.list("Hello");
        Option<List> listOption = checkList(helloList);
        List orElse = listOption.getOrElse(defaultList);
        assertThat(orElse).isSameAs(helloList);

    }
}