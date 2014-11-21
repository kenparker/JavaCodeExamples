package com.maggioni.comparator.Example3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysAndCollectionsTest {

    public static void main(String[] args) {
       
        Bier[] biere = {
            new Bier("Würzburger Hofbräu", "Würzburg", 0.5F),
            new Bier("Becks", "Bremen", 0.33F),
            new Bier("Paulaner", "München", 0.5F),
            new Bier("Distelhäuser", "Distelhausen", 0.33F)};
        System.out.println("Unsortiert:");
        System.out.println("-----------");
        print(biere);

        Comparator<Bier> comp = new BierComparator();
        Arrays.sort(biere, comp);
        System.out.println("Sortiert:");
        System.out.println("-----------");
        print(biere);
        
        Comparator<Bier> reverseOrder = Collections.reverseOrder(comp);
        Arrays.sort(biere, reverseOrder);
        System.out.println("Sortiert (reverse order):");
        System.out.println("-----------");
        print(biere);
    }

    private static void print(Bier[] biere) {
        for (Bier bier : biere) {
            System.out.println(bier);
        }
    }
}
