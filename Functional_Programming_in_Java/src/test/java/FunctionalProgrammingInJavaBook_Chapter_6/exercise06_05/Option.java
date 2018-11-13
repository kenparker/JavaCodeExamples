package FunctionalProgrammingInJavaBook_Chapter_6.exercise06_05;

import FunctionalProgrammingInJavaBook_Chapter_3.Function;

import java.util.function.Supplier;

public abstract class Option<A> {

  @SuppressWarnings("rawtypes")
  private static Option none = new None();

  public abstract A getOrThrow();
  public abstract A getOrElse(Supplier<A> defaultValue);
  public abstract <B> Option<B> map(Function<A,B> f);

  private Option() {}

  public <B> Option<B> flatMap(Function<A, Option<B>> f) {
    return map(f).getOrElse(Option::none);
  }
  public Option<A> orElse(Supplier<Option<A>> defaultValue) {
      Option<Option<A>> map = map(x -> this);
      return map.getOrElse(defaultValue);
  }

  private static class None<A> extends Option<A> {

    @Override
    public A getOrThrow() {
      throw new IllegalStateException("getOrThrow called on None");
    }

    @Override
    public A getOrElse(Supplier<A> defaultValue) {
      return defaultValue.get();
    }

    @Override
    public <B> Option<B> map(Function<A, B> f) {
      return none();
    }

    private None() {}

    @Override
    public String toString() {
      return "None";
    }
  }

  private static class Some<A> extends Option<A> {

    private final A value;

    private Some(A a) {
      value = a;
    }

    @Override
    public A getOrThrow() {
      return this.value;
    }

    @Override
    public A getOrElse(Supplier<A> defaultValue) {
      return this.value;
    }

    @Override
    public <B> Option<B> map(Function<A, B> f) {
      return Option.some(f.apply(value));
    }

    @Override
    public String toString() {
      return String.format("Some(%s)", this.value);
    }
}

  public static <A> Option<A> some(A a) {
    return new Some<>(a);
  }

  @SuppressWarnings("unchecked")
  public static <A> Option<A> none() {
    return none;
  }
}
