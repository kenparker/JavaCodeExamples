package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_10;

import FunctionalProgrammingInJavaBook_Chapter_3.Effect;
import FunctionalProgrammingInJavaBook_Chapter_3.Executable;
import FunctionalProgrammingInJavaBook_Chapter_3.Function;
import org.junit.Test;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_10.CollectionUtilities.*;

public class PrintWithTwoDecimalsTest {

    Function<Double, Double> add9Percent = x -> x * 1.09;
    Function<Double, Double> addFix = x -> x + 3.50;

    List<Double> prices = list(12.04, 25.2);

    Effect<Double> print2Dec = x -> {
        System.out.printf("%.2f", x);
        System.out.println();
    };

    Function<Double,Executable> print2DecExec = x -> () -> print2Dec.apply(x);

    Function<Executable, Function<Executable, Executable>> compose = x -> y -> () -> {
        x.exec();
        y.exec();
    };



    Executable ez = () -> {};

    @Test
    public void testMap() {

        List<Double> doubles = mapWithFoldLeft(prices, add9Percent.andThen(addFix));

        // composing site effects
        Executable executables = foldLeft(doubles, ez, x -> y -> compose.apply(x).apply(() -> print2Dec.apply(y)));
        // execute site effects in one place
        executables.exec();

    }
}
