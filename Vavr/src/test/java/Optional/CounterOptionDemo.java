package Optional;

import io.vavr.Function1;
import io.vavr.Function2;
import io.vavr.Function3;
import io.vavr.control.Option;

import java.util.function.Predicate;

public class CounterOptionDemo {

    private Option<Integer> currentValue;
    private Option<Integer> endValue;
    private Option<Integer> increment;

    CounterOptionDemo(Integer currentValue, Integer endValue, Integer increment) {
        if (currentValue == null || endValue == null || increment == null)
            throw new IllegalArgumentException("Null values passed");
        this.currentValue = Option.of(currentValue);
        this.endValue = Option.of(endValue);
        this.increment = Option.of(increment);
    }

    public Option<Integer> getCurrentValue() {
        return currentValue;
    }

    public Option<Integer> getEndValue() {
        return endValue;
    }

    public Option<Integer> getIncrement() {
        return increment;
    }

    private Integer incr(CounterOptionDemo counter) {
        Integer result = counter.getCurrentValue().get() + counter.getIncrement().get();
        if (result <counter.getIncrement().get()) return result;
        throw new IllegalArgumentException();
    }

    Function1<Option<CounterOptionDemo>, Integer> inc = counterOptionDemo -> {
        counterOptionDemo.map(this::incr)
                .

    }



}
