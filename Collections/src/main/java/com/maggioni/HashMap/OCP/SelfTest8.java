package com.maggioni.HashMap.OCP;

import java.util.ArrayList;
import java.util.List;

public class SelfTest8 {

    public static <E extends Number> List<E> process(List<E> nums) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = null;
        List<Integer> output = null;
        output = process(input);
    }

}
