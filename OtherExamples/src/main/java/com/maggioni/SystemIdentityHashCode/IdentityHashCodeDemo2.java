package com.maggioni.SystemIdentityHashCode;

// http://openbook.rheinwerk-verlag.de/javainsel/javainsel_08_003.html#dodtp4da3dc90-a99b-48ec-b682-bcbbe0b2dcf1
public class IdentityHashCodeDemo2 {

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        System.out.println(System.identityHashCode(sb1)
                + " " + sb1.hashCode()); // z.  B. 7439041 7439041
        System.out.println(System.identityHashCode(sb2)
                + " " + sb2.hashCode()); // z.  B. 4152583 4152583
    }

}
