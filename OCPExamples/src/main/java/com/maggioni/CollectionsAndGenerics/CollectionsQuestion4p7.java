package com.maggioni.CollectionsAndGenerics;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsQuestion4p7 {

    public static void main(String[] args) {
        HashMap props = new HashMap();
        props.put("Harry", "Manth");
        props.put("Pinco", "Pallo");
        props.put("Tutto", "Pinco");
        props.put("Esso", "Ello");
        
        Set keySet = props.keySet();
        //Collections.sort(props); // do not compile, because sort need a List Object
        
        keySet = new TreeSet(keySet);   // works
    }

}
