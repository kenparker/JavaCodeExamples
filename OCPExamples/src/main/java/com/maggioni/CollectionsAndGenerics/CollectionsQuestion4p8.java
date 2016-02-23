package com.maggioni.CollectionsAndGenerics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionsQuestion4p8 {

    public static void main(String[] args) {
        String myArray[] = {"Harry","paolo","marco","dadda"};
        
        //List<?> myArrayList = new LinkedList<?>(Arrays.asList(myArray)); // do not compile
        List<?> myArrayList1                    = new LinkedList<>(Arrays.asList(myArray));
        List<?> myArrayList11                   = new LinkedList<String>(Arrays.asList(myArray));
        List<?> myArrayList12                   = new LinkedList<Object>(Arrays.asList(myArray));
      //List<?> myArrayList13                   = new LinkedList<Integer>(Arrays.asList(myArray)); // do not compile
        List<? extends String> myArrayList2     = new LinkedList<>(Arrays.asList(myArray));
        List<? extends String> myArrayList21    = new LinkedList<String>(Arrays.asList(myArray));
        List myArrayList4                       = new LinkedList<String>(Arrays.asList(myArray));
        List myArrayList41                      = new LinkedList<Object>(Arrays.asList(myArray));
        List myArrayList3                       = new LinkedList(Arrays.asList(myArray));
        
        
        System.out.println("");
    }

}
