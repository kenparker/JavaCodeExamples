package com.maggioni.comparator;

import java.util.Comparator;

public class HDTVBrandComparator implements Comparator<HDTV> {

    @Override
    public int compare(HDTV o1, HDTV o2) {
        return o1.getBrand().compareTo(o2.getBrand());
        }
    }
