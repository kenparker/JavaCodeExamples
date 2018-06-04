package Lifting;

import io.vavr.CheckedFunction2;
import io.vavr.Function2;
import io.vavr.control.Option;
import io.vavr.control.Try;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class LiftingDemo1 {

    private Function2<Integer, Integer, Integer> divideFunc = (a, b) -> a / b;
    private Function2<Integer, Integer, Option<Integer>> safeDivideFunc = Function2.lift(divideFunc);

    private CheckedFunction2<Integer, Integer, Integer> divide2Checked = (a, b) -> a / b;
    private Function2<Integer, Integer, Option<Integer>> safeDivideChecked = CheckedFunction2.lift(divide2Checked);

    @Test
    public void givenAnValueNotAllowed_thenResultIsNone() {
        int t1 = 1;
        int t2 = 0;
        Option<Integer> i1Func = safeDivideFunc.apply(t1, t2);
        Option<Integer> i1Checked = safeDivideChecked.apply(t1, t2);
        assertThat(i1Func).isEqualTo(i1Checked);
        assertThat(i1Func.isEmpty()).isTrue();
        assertThat(i1Func).isInstanceOf(Option.None.class);
    }

    @Test
    public void givenAnValueNotAllowed_thenResultIsSome() {
        int t1 = 5;
        int t2 = 2;
        Option<Integer> i1Func = safeDivideFunc.apply(t1, t2);
        Option<Integer> i1Checked = safeDivideChecked.apply(t1, t2);
        assertThat(i1Func).isEqualTo(i1Checked);
        assertThat(i1Func.isDefined()).isTrue();
        assertThat(i1Func).isInstanceOf(Option.Some.class);
    }

    /*
    public interface CheckedFunction2<T1, T2, R> extends Lambda<R> {
    public interface Function2<T1, T2, R> extends Lambda<R>, BiFunction<T1, T2, R> {

    static <T1, T2, R> Function2<T1, T2, Option<R>> lift(BiFunction<? super T1, ? super T2, ? extends R> partialFunction) {
        return (t1, t2) -> {
            return Try.of(() -> {
                return partialFunction.apply(t1, t2);
            }).toOption();
        };
    }

    static <T1, T2, R> Function2<T1, T2, Option<R>> lift(CheckedFunction2<? super T1, ? super T2, ? extends R> partialFunction) {
        return (t1, t2) -> {
            return Try.of(() -> {
                return partialFunction.apply(t1, t2);
            }).toOption();
        };
    }
     */
}
