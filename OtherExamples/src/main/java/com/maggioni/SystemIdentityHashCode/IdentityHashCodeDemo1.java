package com.maggioni.SystemIdentityHashCode;

import java.awt.Point;

// http://openbook.rheinwerk-verlag.de/javainsel/javainsel_08_003.html#dodtp4da3dc90-a99b-48ec-b682-bcbbe0b2dcf1
public class IdentityHashCodeDemo1 {

    public static void main(String[] args) {
        Point p = new Point(0, 0);
        Point q = new Point(0, 0);
        System.out.println(System.identityHashCode(p)); // z.  B. 16032330
        System.out.println(System.identityHashCode(q)); // z.  B. 13288040
        System.out.println(p.hashCode());               // 0
        System.out.println(q.hashCode());
    }

}
