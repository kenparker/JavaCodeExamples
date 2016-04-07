package com.maggioni.MostDifficults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingSequenceDemo1 {

    public static List<String> getNameList() {
        String[] sa = {"amy", " audrey", "Adam"};
        List<String> list = Arrays.asList(sa);
        return list;
    }
    public static void main(String[] args) {
        List<String> list = getNameList();
        Comparator c = Collections.reverseOrder();
        Collections.sort(list,c);
        System.out.println(""+list);
    }

}
