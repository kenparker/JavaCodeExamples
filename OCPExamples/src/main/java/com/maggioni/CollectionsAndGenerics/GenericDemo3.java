package com.maggioni.CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericDemo3 {

    public static void main(String[] args) {
        ff1(new ArrayList<String>());
        ff5(new ArrayList<String>());
    }
    public static <T> List<T> ff1(List<T> input){
        List<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0,t);
        }
        return output;
    }
    public static <T> List<T> ff2(List<? extends T> input){
        List<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0,t);
        }
        return output;
    }
    public static <T> List<? extends T> ff3(List<T> input){
        List<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0,t);
        }
        return output;
    }
    public static <T> List<? super T> ff4(List<T> input){
        List<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0,t);
        }
        return output;
    }
    public static <T> List<?> ff5(List<T> input){
        List<T> output = new LinkedList<>();
        for (T t : input) {
            output.add(0,t);
        }
        return output;
    }
    
}
