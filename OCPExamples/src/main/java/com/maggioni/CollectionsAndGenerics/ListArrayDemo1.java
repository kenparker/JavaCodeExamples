package com.maggioni.CollectionsAndGenerics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListArrayDemo1 {

    public static void main(String[] args) {
        String[]sArr = {"ba", "bc", "a1", "a55", "z1", "tt22"};
        
        List<String> asList = Arrays.asList(sArr);
        System.out.println(" " +  asList); // [ba, bc, a1, a55, z1, tt22]
        
        /*
        sorting the array will sort also the list
        */
        Arrays.sort(sArr);
        System.out.println(" " +  asList); // [a1, a55, ba, bc, tt22, z1]
        
        /*
        changing a element in the array is also changing an element in the list
        */
        sArr[1] = "element changed";
        System.out.println(" " +  asList); // [a1, element changed, ba, bc, tt22, z1]
        
        /*
        sorting the list is also sorting the array
        */
        Collections.sort(asList);
        System.out.println(" " +  asList); // [a1, ba, bc, element changed, tt22, z1]
        for (String arrel : sArr) {
            System.out.println(" " +  arrel);
        }
        
        /*
        removing an element is not possible.
        It compile but runtime error
        */
        String removeElent = asList.remove(1);  // java.lang.UnsupportedOperationException
        
        /*
        adding an element to the List is not working.
        Compile but runtimeerror
        */
        asList.add("new element in teh list"); // java.lang.UnsupportedOperationException
    }

}
