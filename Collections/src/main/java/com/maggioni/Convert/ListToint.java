package com.maggioni.Convert;

import com.google.common.primitives.Doubles;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

/**
 *
 * http://www.programcreek.com/2013/09/top-10-questions-for-java-collections/
 */
public class ListToint {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(200);
        list.add(25);
        list.add(14);

        // standard conversion
        Object[] toArray = list.toArray();
        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intArray[i] = list.get(i);
        }

        // conversion to Integer using casting
        Integer[] toArray2 = (Integer[]) list.toArray(new Integer[list.size()]);
        System.out.println("Integer[]");
        Arrays.stream(toArray2).forEach((Integer) -> System.out.println(Integer));

        // conversion to int using Streams
        intArray = list.stream().mapToInt(i -> i).toArray();
        System.out.println("int[]");
        Arrays.stream(intArray).forEach((int a) -> System.out.println(a));

        // Using Apache Commons Lang
        System.out.println("using Apache Commons");
        intArray = ArrayUtils.toPrimitive(list.toArray(new Integer[0]));
        Arrays.stream(intArray).forEach((int a) -> System.out.println(a));
        
        System.out.println("using Guava");
        intArray = Ints.toArray(list);
        Arrays.stream(intArray).forEach((int a) -> System.out.println(a));
        
        List<Double> listDouble = new ArrayList<>();
        listDouble.add(12.22);
        listDouble.add(100.1);
        listDouble.add(120.0);
        listDouble.add(1111.222);
        
        //double[] doubleArray = new double[listDouble.size()];
        double[] doubleArray = Doubles.toArray(listDouble);
        Arrays.stream(doubleArray).forEach((double d) -> System.out.println(d));
        
    }

}
