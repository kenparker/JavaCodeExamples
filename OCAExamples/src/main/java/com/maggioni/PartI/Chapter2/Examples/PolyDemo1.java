package com.maggioni.PartI.Chapter2.Examples;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public class PolyDemo1 {

    public static void main(String[] args) {
        List li = new ArrayList();
        ArrayList al = new ArrayList();
        
        // all below is ok
        Object ob = li;
        Collection co = li;
        List lli = li;
        
        // all below is possible 
        Object aob = al;
        ArrayList aal = al;
        AbstractList aaAbstractList = al;
        List aaList = al;
        RandomAccess ard = al;
        Cloneable cl =  al;
        Serializable asr = al;
        
        
    }
    
}
