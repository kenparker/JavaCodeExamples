package com.maggioni.UniqueCharacter;

public class UniqueChar2 {

    public static void main(String args[]) {
        String inputstring = "Ab cd";
        System.out.println("String method 2 answer " + inputstring + " " + method2(inputstring));
    }

    public static boolean method2(String input) {
        for (int i = 0; i < input.length(); i++) {
            char charcterofinputstring = input.charAt(i);
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (charcterofinputstring == input.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                return true;
            }
        }
        return false;
    }
}
