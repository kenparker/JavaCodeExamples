package com.maggioni.MostDifficults;

import java.util.ArrayList;
import java.util.List;

public class GenericQuestionRealBrainer {

    public static void main(String[] args) {
        option1();
    }

    private static void option1() {
        ArrayList<String> in = new ArrayList();
        List result;
        result = doIt(in);
    }
    private static void option2() {
        List<CharSequence> in = new ArrayList();
        List result;
        result = doIt(in);
    }
    private static void option3() {
        List<CharSequence> in = new ArrayList();
        List<CharSequence> result;
        //result = doIt(in); // do not compile
    }
    private static void option4() {
        List<CharSequence> in = new ArrayList();
        List<? super CharSequence> result;
        result = doIt(in);
    }
    private static void option41() {
        List<CharSequence> in = new ArrayList();
        List<? super String> result;
        result = doIt(in);
    }
    private static void option5() {
        List<CharSequence> in = new ArrayList();
        List<Object> result;
        //result = doIt(in); // do not compile
    }

    public static <E extends CharSequence> List<? super E> doIt(List<E> nums){
        return nums;
    }
}
