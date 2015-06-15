package com.maggioni.PartI.Exceptions;

public class PolymorphicExceptionDemo1 extends Util {

    public static void main(String[] args) {
        Util u = new PolymorphicExceptionDemo1();
        try {
            System.out.println(u.getInt(args[0]));
        } catch (Exception ex) {
            System.out.println("Error");
        }

        String s = null;
        System.out.println(s + "");
    }

    int getInt(String s) {
        return Integer.parseInt(s);
    }

}

class Util {

    int getInt(String x) throws Exception {
        return 7;
    }
}
