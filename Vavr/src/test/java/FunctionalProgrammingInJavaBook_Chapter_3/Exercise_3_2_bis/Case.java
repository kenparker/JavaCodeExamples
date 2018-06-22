package FunctionalProgrammingInJavaBook_Chapter_3.Exercise_3_2_bis;

import FunctionalProgrammingInJavaBook_Chapter_3.Effect;
import io.vavr.Tuple3;

import java.util.function.Supplier;

import static io.vavr.Tuple.of;

public class Case<T>  {

    Tuple3<Supplier<Boolean>, Supplier<Effect<T>>, Supplier<Effect<T>>> supplierEffectEffectTuple3;

    private Case(Supplier<Boolean> booleanSupplier, Supplier<Effect<T>> success, Supplier<Effect<T>> failure) {
        this.supplierEffectEffectTuple3 = of(booleanSupplier,success,failure);
    }

    public static <T> Case<T> mcase(Supplier<Boolean> booleanSupplier, Supplier<Effect<T>> success, Supplier<Effect<T>> failure) {
        return new Case<T>(booleanSupplier, success, failure);
    }

    public static <T> DefaultCase<T> macaseDefault(Supplier<Effect<T>> defaultEffect) {
        return new DefaultCase<>(defaultEffect);
    }

    public static <T> Effect<T> match(DefaultCase<T> defaultCase, Case<T>... matchers) {
        for (Case<T> aCase : matchers) {
            if (aCase.supplierEffectEffectTuple3._1.get()) return aCase.supplierEffectEffectTuple3._2.get();
            else return aCase.supplierEffectEffectTuple3._3.get();
        }
        return defaultCase.supplierEffectEffectTuple3._3.get();
    }

    public static class DefaultCase<T> extends Case<T> {
        private DefaultCase(Supplier<Effect<T>> defaultEffect) {
            super(() -> true, defaultEffect,defaultEffect);
        }
    }

}
