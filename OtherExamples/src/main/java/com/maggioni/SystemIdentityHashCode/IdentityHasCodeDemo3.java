package com.maggioni.SystemIdentityHashCode;

import static java.lang.System.out;

/**
 *
 * http://openbook.rheinwerk-verlag.de/javainsel/javainsel_08_003.html#dodtp4da3dc90-a99b-48ec-b682-bcbbe0b2dcf1
 */
public class IdentityHasCodeDemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] strings = new String[10000];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = Integer.toString(i);
        }

        int cnt = 0;

        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                int id1 = System.identityHashCode(strings[i]);
                int id2 = System.identityHashCode(strings[j]);

                if (id1 == id2) {
                    out.println("Zwei Objekte mit identityHashCode() = " + id1);
                    out.println(" Objekt 1: \"" + strings[i] + "\"");
                    out.println(" Objekt 2: \"" + strings[j] + "\"");
                    out.println(" Object1.hashCode(): " + strings[i].hashCode());
                    out.println(" Object2.hashCode(): " + strings[j].hashCode());
                    out.println(" Object1.equals(Object2): " + strings[i].equals(strings[j]));

                    cnt++;
                }
            }
        }
        System.out.println(cnt + " Objekte mit gleichem identityHashCode() gefunden.");
    }

}
