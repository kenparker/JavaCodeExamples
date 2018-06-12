package FunctionalProgrammingInJavaBook_Chapter_3;

public interface Effect<T> {

    public void apply(T t);

}
