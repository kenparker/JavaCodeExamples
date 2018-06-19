package FunctionalProgrammingInJavaBook_Chapter_4.Listung_4_1;

import org.junit.Test;

import static FunctionalProgrammingInJavaBook_Chapter_4.Listung_4_1.Add.add;

public class AddTest {


    @Test
    public void test2() {
        TailCall<Integer> tailCall = add(3, 100000000);
        while (tailCall.isSuspend()) {
            tailCall.resume();
        }
        System.out.println(tailCall.eval());
    }

    @Test
    public void name() {

        // 3 + 4

        TailCall.Suspend<Integer> integerSuspend1 = new TailCall.Suspend<>(() -> add(4, 3));
        System.out.println("Is suspend ? " + integerSuspend1.isSuspend());
        TailCall<Integer> resume1 = integerSuspend1.resume();
        System.out.println("Is suspend ? " + resume1.isSuspend());
        TailCall.Suspend<Integer> integerSuspend2 = new TailCall.Suspend<>(() -> add(5, 2));
        integerSuspend2.resume();
        TailCall.Suspend<Integer> integerSuspend3 = new TailCall.Suspend<>(() -> add(6, 1));
        integerSuspend3.resume();
        TailCall.Suspend<Integer> integerSuspend4 = new TailCall.Suspend<>(() -> add(7, 0));
    }
}