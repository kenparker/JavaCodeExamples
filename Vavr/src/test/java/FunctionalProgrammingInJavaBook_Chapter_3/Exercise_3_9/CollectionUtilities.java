package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_9;

import FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_8.Fold;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_8.Fold.*;

public class CollectionUtilities {

    public static <T> List<T> list() {
        return Collections.EMPTY_LIST;
    }

    public static <T> List<T> list(T t) {
        return Collections.singletonList(t);
    }

    public static <T> List<T> list(List<T> ts) {
        return Collections.unmodifiableList(new ArrayList<>(ts));
    }

    public static <T> List<T> list(T... t) {
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(t,t.length)));
    }

    private static <T> List<T> copy(List<T> ts) {
        return new ArrayList<>(ts);
    }

    public static <T> T head(List<T> list) {
        if (list.size() == 0) throw new IllegalStateException("head of empty list");
        return list.get(0);
    }

    public static <T> List<T> tail(List<T> list) {
        if (list.size() == 0) throw new IllegalStateException("tail of empty list");
        List<T> worklist = copy(list);
        worklist.remove(0);
        return Collections.unmodifiableList(worklist);
    }

    public static <T> List<T> append(List<T> list, T t) {
        List<T> result = copy(list);
        result.add(t);
        return Collections.unmodifiableList(result);
    }


    public static <T> List<T> prepend(T t, List<T> list) {
        return foldLeft(list,list(t), a -> b -> append(a,b));
    }

    public static <T> List<T> reverse(List<T> list) {
        return foldLeft(list,list(), a -> b -> prepend(b,a));
    }

}
