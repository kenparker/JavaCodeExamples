package FunctionalProgrammingInJavaBook_Chapter_5.Exercise_5_15_and_5_16;

import FunctionalProgrammingInJavaBook_Chapter_5.Common.List;
import org.junit.Test;

import static FunctionalProgrammingInJavaBook_Chapter_5.Common.List.*;
import static org.assertj.core.api.Assertions.*;

public class FlattenTest {

    List<String> list1 = list("Hi ", "my ");
    List<String> list2 = list("name ", "is ","Angelo ");
    List<List<String>> list = list(list1,list2);

    List<String> list3 = list("Hi ");
    List<String> list4 = list("my ");
    List<String> list5 = list("name ");
    List<String> list6 = list("is ");
    List<String> list7 = list("Angelo ");
    List<List<String>> list10 = list(list3,list4);
    List<List<String>> list11 = list(list5,list6,list7);
    List<List<List<String>>> listList = list(list10,list11);

    List<Integer> li1 = list(1,3,5,6);
    List<Integer> li2 = list(10,13,40);
    List<List<Integer>> li = list(li1,li2);

    @Test
    public void givenAListOfListOfStrings_whenFlatten_thenResultIsAListWithAllElements() {
        List<String> flatten = flatten(list);
        System.out.println(flatten);
        assertThat(flatten.toString()).isEqualTo("[Hi , my , name , is , Angelo , NIL]");
    }

    @Test
    public void givenAListOfListsOfListsOfString_whenFlattenTwice_thenResultIsAListWithAllElements() {
        List<List<String>> flatten = flatten(listList);
        List<String> stringList = flatten(flatten);
        System.out.println(stringList);
        assertThat(stringList.toString()).isEqualTo("[Hi , my , name , is , Angelo , NIL]");
    }

    @Test
    public void name() {
        List<Integer> flatten = flatten(li);
        System.out.println(flatten);
        assertThat(flatten.toString()).isEqualTo("[1, 3, 5, 6, 10, 13, 40, NIL]");
    }

    @Test
    public void givenAListOfList_whenFoldLeft_thenResultIsEqualToFlatten() {
        List<String> stringList = list.foldLeft(list(), x -> y -> concat(x, y));
        System.out.println(stringList);
        stringList = list.foldRight(list(), x -> y -> concat(x,y));
        System.out.println(stringList);
        assertThat(stringList.toString()).isEqualTo(flatten(list).toString());
    }

}
