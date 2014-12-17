package com.maggioni.comparator.Example1;

import java.util.Comparator;

public class HDTVSizeComparator implements Comparator<HDTV> {

    @Override
    public int compare(HDTV o1, HDTV o2) {
        int o1Size = o1.getSize();
        int o2Size = o2.getSize();
        if (o1Size > o2Size) {
            return 1;
        } else if (o1Size < o2Size) {
            return -1;
        } else {
            return 0;
        }
    }

}
