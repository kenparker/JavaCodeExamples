package com.maggioni.comparator.Example3;

import java.util.Comparator;

public class BierComparator implements Comparator<Bier> {

    @Override
    public int compare(Bier b1, Bier b2) {

        if (b1.getInhalt() == b2.getInhalt()) {
            if (b1.getHerkunft().compareTo(b2.getHerkunft()) == 0) {
                return b1.getName().compareTo(b2.getName());
            } else {
                return b1.getHerkunft().compareTo(b2.getHerkunft());
            }
        } else if (b1.getInhalt() > b2.getInhalt()) {
            return -1;
        } else {
            return 1;
        }
    }
}
